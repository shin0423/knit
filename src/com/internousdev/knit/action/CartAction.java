package com.internousdev.knit.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;


import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.knit.dao.CartDAO;
import com.internousdev.knit.dto.CartDTO;
import com.opensymphony.xwork2.ActionSupport;

public class CartAction extends ActionSupport implements SessionAware{

	Map<String,Object> session;
	ArrayList<CartDTO> cartList=new ArrayList<>();
	int totalPrice;

	public String execute()throws SQLException{

		CartDAO dao=new CartDAO();

		//loginFlgがあるか

		if(!(boolean) session.get("loginFlg")) {
			session.put("loginFlg", false);
			System.out.println("TESSSST");
		}if((boolean) session.get("loginFlg")) {
			if((boolean) session.get("loginFlg")) {
				dao.changeUserId(session.get("tempUserId").toString(),session.get("userId").toString());
				cartList=dao.showUserCartList(session.get("userId").toString());
			}else {
				cartList=dao.showTempUserCartList(session.get("tempUserId").toString());
			}

			//合計金額の計算
			totalPrice=calcTotalPrice(cartList);
			return SUCCESS;
		}

		public Map<String,Object> getSession(){
			return session;
		}

		public void setSession(Map<String,Object> session) {
			this.session=session;
		}

		public ArrayList<CartDTO> getCartList(){
			return cartList;
		}

		public void setCartList(ArrayList<CartDTO> cartList) {
			this.cartList=cartList;
		}

		public int getTotalPrice() {
			return totalPrice;
		}

		public void set(int totalPrice) {
			this.totalPrice=totalPrice;
		}

		/**
		 * 合計金額を計算するメソッド
		 */
		public int calcTotalPrice(ArrayList<CartDTO> cartList) {
			int totalPrice=0;
			for(CartDTO dto:cartList) {
				totalPrice = dto.getPrice()*dto.getItemCount();
				System.out.println("合計" + totalPrice + "円");
			}
			return totalPrice;
		}

	}
