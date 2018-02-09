package com.internousdev.knit.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.knit.dao.CartDAO;
import com.internousdev.knit.dao.CartDeleteDAO;
import com.internousdev.knit.dto.CartDTO;
import com.opensymphony.xwork2.ActionSupport;

public class CartDeleteAction extends ActionSupport implements SessionAware{


	private String userId;
	private String itemId;
	private Collection<String> checkList;

	private Map<String,Object> session;

	private ArrayList<CartDTO> cartList=new ArrayList<CartDTO>();
	int totalPrice;


//	private int itemCount;
	private String itemName;
//	private String itemNameKana;
//	private String imageFilePath;
//	private int price;
//	private String releaseCompany;




	/**
	 * カート情報を削除する
	 */

	public String execute() throws SQLException {
		String result = ERROR;
		System.out.println("ITEMID : " + itemId);
		System.out.println("CHECKLIST : " + checkList);

//		System.out.println(itemName);
//		System.out.println(itemNameKana);
//		System.out.println(imageFilePath);
//		System.out.println(price);
//		System.out.println(releaseCompany);



		CartDAO dao = new CartDAO();
		CartDeleteDAO deletedao = new CartDeleteDAO();

		int count=0;
		for(String check : checkList) {
			System.out.println(check + "<---- いまここ()");

			if (!(session.containsKey("userId"))) {
				System.out.println("TEMPUSERID : " + session.get("tempUserId").toString());
				count += deletedao.deleteSeparate(session.get("tempUserId").toString(), check);
				cartList = dao.showUserCartList(session.get("tempUserId").toString());
			} else {

				userId = session.get("userId").toString();
				System.out.println("USERID : " + session.get("userId").toString());
				count += deletedao.deleteSeparate(userId, check);
				cartList = dao.showUserCartList(session.get("userId").toString());
			}
		}
		System.out.println("削除された件数：" + count);

		totalPrice = calcTotalPrice(cartList);

		result = SUCCESS;

		return result;
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












}
