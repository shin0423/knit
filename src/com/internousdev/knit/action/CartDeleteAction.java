package com.internousdev.knit.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.knit.dao.CartDAO;
import com.internousdev.knit.dao.CartDeleteDAO;
import com.internousdev.knit.dto.CartDTO;
import com.opensymphony.xwork2.ActionSupport;

public class CartDeleteAction extends ActionSupport implements SessionAware{


	private String userId;
	private int itemId;

	private Map<String,Object> session;

	private ArrayList<CartDTO> cartList=new ArrayList<CartDTO>();
	int totalPrice;

	/**
	 * カート情報を削除する
	 */

	public String execute() throws SQLException {
		String result = ERROR;
		CartDAO dao = new CartDAO();
		CartDeleteDAO deletedao = new CartDeleteDAO();

		if (!(session.containsKey("userId"))) {
			deletedao.deleteSeparate(session.get("tempUserId").toString(), String.valueOf(itemId));
			cartList = dao.showUserCartList(session.get("tempUserId").toString());
		} else {

			userId = session.get("userId").toString();
			deletedao.deleteSeparate(userId, String.valueOf(itemId));
			cartList = dao.showUserCartList(session.get("userId").toString());
		}

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

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId=itemId;
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

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

}
