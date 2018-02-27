package com.internousdev.knit.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.knit.dao.CartDAO;
import com.internousdev.knit.dao.CartDeleteDAO;
import com.internousdev.knit.dto.CartDTO;
import com.internousdev.knit.util.IdCheck;
import com.opensymphony.xwork2.ActionSupport;

public class CartDeleteAction extends ActionSupport implements SessionAware{


	private String userId;
	private String itemId;
	private Collection<String> checkList;
	private String errorMsg;
	private String token;

	private Map<String,Object> session;

	private ArrayList<CartDTO> cartList=new ArrayList<CartDTO>();
	private ArrayList<CartDTO> miniCartList=new ArrayList<CartDTO>();
	private int totalPrice;

	//↓ミニカート用 小池
	private int allTotalPrice;

	private String itemName;

	/**
	 * カート情報を削除する
	 */

	@SuppressWarnings("static-access")
	public String execute() throws SQLException {
		if(session.containsKey("userId")){
			IdCheck idCheck = new IdCheck();
			if(idCheck.checkUser(session.get("userId").toString())){
				return "errorPage";
			}
		}
		CartDAO dao = new CartDAO();
		String result = ERROR;
		RandomStringUtils rndStr = new RandomStringUtils();
		token = rndStr.randomAlphabetic(10);
		setToken(token);
		session.put("token", token);


		try{
			if(checkList.equals(null)){
				String name=checkList.toString();
				System.out.println(name);
				getAllTotalPrice();
			}

		}catch(NullPointerException e){
			errorMsg= "アイテムが選択されていません";
			e.printStackTrace();
			if (!(session.containsKey("userId"))) {
				cartList = dao.showUserCartList(session.get("tempUserId").toString());
				getAllTotalPrice();
				return ERROR;
			}else {
				cartList = dao.showUserCartList(session.get("userId").toString());
				getAllTotalPrice();
				return ERROR;
			}
		}

		CartDeleteDAO deletedao = new CartDeleteDAO();
		if((checkList).toString().equals("[false]")){
			if (!(session.containsKey("userId"))) {
				cartList = dao.showUserCartList(session.get("tempUserId").toString());
				getAllTotalPrice();
				errorMsg= "アイテムが選択されていません";
				return ERROR;

			}else {
				cartList = dao.showUserCartList(session.get("userId").toString());
				getAllTotalPrice();
				errorMsg= "アイテムが選択されていません";
				return ERROR;
			}
		}
		int count=0;
		if (checkList != null && checkList.size() != 0) {
			for(String check : checkList) {
				System.out.println(check + "<---- いまここ()");

				if (!(session.containsKey("userId"))) {
					CartDTO cartDTO = new CartDTO();
					cartDTO = deletedao.getItemInfo(session.get("tempUserId").toString(), check);
					int itemStock = 0;
					itemStock = cartDTO.getItemCount();
					deletedao.returnItem(itemStock, check);

					System.out.println("TEMPUSERID : " + session.get("tempUserId").toString());
					count += deletedao.deleteSeparate(session.get("tempUserId").toString(), check);
					cartList = dao.showUserCartList(session.get("tempUserId").toString());
					getAllTotalPrice();

				} else {
					CartDTO cartDTO = new CartDTO();
					cartDTO = deletedao.getItemInfo(session.get("userId").toString(), check);
					int itemStock = 0;
					itemStock = cartDTO.getItemCount();
					deletedao.returnItem(itemStock, check);

					userId = session.get("userId").toString();
					System.out.println("USERID : " + session.get("userId").toString());
					count += deletedao.deleteSeparate(userId, check);
					cartList = dao.showUserCartList(session.get("userId").toString());
					getAllTotalPrice();

				}
			}
			System.out.println("削除された件数：" + count);
		} else {
			errorMsg= "削除するアイテムがありません";
		}

		if (!(session.containsKey("userId"))) {
			 miniCartList = dao.TempUserMiniCart(session.get("tempUserId").toString());

			 session.put("miniCartList", miniCartList);
			 getAllTotalPrice();
		} else {
			miniCartList = dao.UserMiniCart(session.get("userId").toString());
			session.put("miniCartList", miniCartList);
			getAllTotalPrice();
		}

		result = SUCCESS;

		return result;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public void getAllTotalPrice() throws SQLException {
		ArrayList<CartDTO> cartList = new ArrayList<CartDTO>();
		CartDAO dao = new CartDAO();
		allTotalPrice = 0;
		totalPrice = 0;

		if (!(session.containsKey("userId"))) {
			cartList = dao.showUserCartList(session.get("tempUserId").toString());
			allTotalPrice = calcTotalPrice(cartList);
			totalPrice = allTotalPrice;

			session.put("allTotalPrice", allTotalPrice);

		}else {
			cartList = dao.showUserCartList(session.get("userId").toString());
			allTotalPrice = calcTotalPrice(cartList);
			totalPrice = allTotalPrice;

			session.put("allTotalPrice", allTotalPrice);
		}
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId=userId;
	}


	public Map<String,Object>getSession(){
		return session;
	}

	public void setSession(Map<String,Object>session) {
		this.session=session;
	}
	public ArrayList<CartDTO>getCartList(){
		return cartList;
	}

	public void setCartList(ArrayList<CartDTO> cartList) {
		this.cartList=cartList;
	}
	public int calcTotalPrice(ArrayList<CartDTO> cartList) {
		int totalPrice = 0;
		for (CartDTO dto : cartList) {
			totalPrice += dto.getPrice() * dto.getItemCount();
			System.out.println("合計" + totalPrice + "円");
		}
		return totalPrice;
	}

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public Collection<String> getCheckList() {
		return checkList;
	}

	public void setCheckList(Collection<String> checkList) {
		this.checkList = checkList;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

}
