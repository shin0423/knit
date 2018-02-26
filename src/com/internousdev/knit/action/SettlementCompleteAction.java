package com.internousdev.knit.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.knit.dao.CartDAO;
import com.internousdev.knit.dao.CartDeleteDAO;
import com.internousdev.knit.dao.LoginDAO;
import com.internousdev.knit.dao.SettlementCompleteDAO;
import com.internousdev.knit.dao.SettlementConfirmDAO;
import com.internousdev.knit.dto.CartDTO;
import com.internousdev.knit.dto.SettlementConfirmDTO;
import com.internousdev.knit.util.IdCheck;
import com.internousdev.knit.util.ItemIdChecker;
import com.opensymphony.xwork2.ActionSupport;

public class SettlementCompleteAction extends ActionSupport implements SessionAware{
	private int totalPrice;
	private Map<String,Object> session;
	private ArrayList<CartDTO> cartInfoList = new ArrayList<CartDTO>();
	public ArrayList<SettlementConfirmDTO> destinationList = new ArrayList<SettlementConfirmDTO>();
	private SettlementConfirmDAO settlementConfirmDAO = new SettlementConfirmDAO();
	private SettlementCompleteDAO settlementCompleteDAO = new SettlementCompleteDAO();
	private boolean buyCountErrorFlg=false;
	private ArrayList<CartDTO> buyCountErrorList = new ArrayList<CartDTO>();

	private ArrayList<CartDTO> cartList=new ArrayList<>();

	private ArrayList<CartDTO> miniCartList=new ArrayList<CartDTO>();

	private String token;

	private String errorMsg;

	LoginDAO loginDAO = new LoginDAO();

	CartDAO cartDAO = new CartDAO();

	//決済処理

	@SuppressWarnings("static-access")
	public String execute() throws SQLException{
		if(session.containsKey("userId")){
			IdCheck idCheck = new IdCheck();
			if(idCheck.checkUser(session.get("userId").toString())){
				return "errorPage";
			}
		}

		if(!(token.equals(session.get("token").toString()))){
			return "errorPage";
		}
		RandomStringUtils rndStr = new RandomStringUtils();
		token = rndStr.randomAlphabetic(10);
		System.out.println("トークン値"+token);
		setToken(token);
		session.put("token", token);

		if (!(session.containsKey("userId"))){
			return "loginError";
		}

		String	result=ERROR;

		destinationList = settlementConfirmDAO.getDestinationInfo(session.get("userId").toString());


		//if (!loginDAO.getExistUserId(session.get("userId").toString())) {

		//return "errorPage";

		//	}

		cartList = cartDAO.showUserCartList(session.get("userId").toString());


		if (cartList.isEmpty()) {
			System.out.println("不正操作は許さない");
			return "errorPage";
		}

		//カート情報の読み込み
		cartInfoList=cartDAO.showUserCartList(session.get("userId").toString());

		int idNum;
		ArrayList<String> existList = new ArrayList<String>();
		for (idNum = 0; idNum < cartInfoList.size(); idNum++) {
			ItemIdChecker itemIdChecker = new ItemIdChecker();
			boolean exist = itemIdChecker.itemIdChecker(String.valueOf(cartInfoList.get(idNum).getItemId()));
			System.out.println("購入商品が存在するか : " + exist);
			System.out.println("存在した商品ID : " + cartInfoList.get(idNum).getItemId());

			existList.add(String.valueOf(exist));
		}
		System.out.println("existList check : " + existList);

		if (existList.contains("false")) {
			System.out.println("existList.contains check : " + existList.contains("false"));

			for (int i = 0; i < cartList.size(); i++) {
				if (cartList.get(i).getItemName() == null) {
					CartDeleteDAO cartDeleteDAO = new CartDeleteDAO();
					String itemId = String.valueOf(cartList.get(i).getItemId());
					System.out.println("かーとりすとちぇっく"+cartList.get(i).getItemName());
					cartDeleteDAO.deleteSeparate(session.get("userId").toString(), itemId);
				}
			}
			cartList = cartDAO.showUserCartList(session.get("userId").toString());
			for (int i =0; i < cartList.size(); i++) {
				System.out.println("カートリストチェック"+cartList);
			}
			setCartList(cartList);
			session.put("miniCartList", cartList);

			CartAction cartAction = new CartAction();
			totalPrice = cartAction.calcTotalPrice(cartList);
			errorMsg="削除されたアイテムがあります。";
			result = "cart";
		} else {
			//カートリストの数だけfor 購入履歴テーブルに登録 在庫数変動
			int i = settlementCompleteDAO.setPurchaseHistory(cartInfoList, session.get("userId").toString());
			System.out.println("購入履歴に入れた数"+i);


			//購入したユーザーのカート情報を消去
			cartDAO.deleteCartInfo(session.get("userId").toString());

			session.remove("miniCartList");

			session.put("miniCartList", miniCartList);

			result=SUCCESS;
		}


		return result;
	}



	public int getTotalPrice() {
		return totalPrice;
	}



	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}



	public Map<String,Object> getSession(){
		return session;
	}
	public void setSession(Map<String,Object> session){
		this.session=session;
	}


	public boolean isBuyCountErrorFlg() {
		return buyCountErrorFlg;
	}


	public void setBuyCountErrorFlg(boolean buyCountErrorFlg) {
		this.buyCountErrorFlg = buyCountErrorFlg;
	}


	public ArrayList<CartDTO> getCartInfoList() {
		return cartInfoList;
	}


	public void setCartInfoList(ArrayList<CartDTO> cartInfoList) {
		this.cartInfoList = cartInfoList;
	}


	public ArrayList<CartDTO> getBuyCountErrorList() {
		return buyCountErrorList;
	}


	public void setBuyCountErrorList(ArrayList<CartDTO> buyCountErrorList) {
		this.buyCountErrorList = buyCountErrorList;
	}



	public ArrayList<SettlementConfirmDTO> getDestinationList() {
		return destinationList;
	}



	public void setDestinationList(ArrayList<SettlementConfirmDTO> destinationList) {
		this.destinationList = destinationList;
	}



	public String getToken() {
		return token;
	}



	public void setToken(String token) {
		this.token = token;
	}



	public ArrayList<CartDTO> getCartList() {
		return cartList;
	}



	public void setCartList(ArrayList<CartDTO> cartList) {
		this.cartList = cartList;
	}



	public String getErrorMsg() {
		return errorMsg;
	}



	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}







}