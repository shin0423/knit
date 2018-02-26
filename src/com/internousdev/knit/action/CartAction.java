package com.internousdev.knit.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.knit.dao.CartDAO;
import com.internousdev.knit.dto.CartDTO;
import com.internousdev.knit.util.IdCheck;
import com.opensymphony.xwork2.ActionSupport;

public class CartAction extends ActionSupport implements SessionAware{
	private String errorMessage;
	Map<String,Object> session;
	ArrayList<CartDTO> cartList=new ArrayList<CartDTO>();
	int totalPrice;

	private String token;


	public String execute()throws SQLException{
		System.out.println(errorMessage);
		if(session.containsKey("userId")){
			IdCheck idCheck = new IdCheck();
			if(idCheck.checkUser(session.get("userId").toString())){
				return "errorPage";
			}
		}


		List<String> deleteCartList = new ArrayList<>();
		CartDAO dao=new CartDAO();
		int j = 0;



		//loginFlgがあるか

		if(!(boolean) session.get("loginFlg")) {
			session.put("loginFlg", false);
			System.out.println("TESSSST");
		}
		if((boolean) session.get("loginFlg")) {
				cartList=dao.showUserCartList(session.get("userId").toString());
				for(int i = 0 ;cartList.size() > i ; i++){
				try{
					if(cartList.get(i).getItemName().equals(null)){
						String name=cartList.get(i).getItemName();
						System.out.println(name);
					}

					}catch(NullPointerException e){
					cartList.get(i).setItemName("noName");
					System.out.println("やったよ！");
					e.printStackTrace();
					}
				}
				for (int i = 0;cartList.size() >i ;i++){
					if((cartList.get(i).getItemName()).equals("noName") ){

						deleteCartList.add(j,String.valueOf(cartList.get(i).getItemId()));
						j++;
					}
				}
				if(! deleteCartList.isEmpty()){
					for(int i = 0;deleteCartList.size() > i ;i++){
					dao.deleteSeparete(session.get("userId").toString(),Integer.parseInt(deleteCartList.get(i)));
					}
				}


				dao.changeUserId(session.get("tempUserId").toString(),session.get("userId").toString());
				cartList.clear();
				cartList=dao.showUserCartList(session.get("userId").toString());

				for(int i=0; i < cartList.size();i++) {
					System.out.println("-------------------------");
					System.out.println(cartList.get(i).getItemId());
					System.out.println(cartList.get(i).getItemName());
					System.out.println(cartList.get(i).getItemNameKana());
					System.out.println(cartList.get(i).getImageFilePath());
					System.out.println(cartList.get(i).getPrice());
					System.out.println(cartList.get(i).getReleaseCompany());
					System.out.println(cartList.get(i).getReleaseDate());
					System.out.println(cartList.get(i).getItemCount());
					System.out.println("------------------");
				}


		}else {
				System.out.println("やったよ");

				for(int i = 0 ;cartList.size() > i ; i++){
					try{
						cartList.get(i).getItemName();
						}catch(NullPointerException e){
						cartList.get(i).setItemName("noName");
						}
					}

				for (int i = 0;cartList.size() >i ;i++){
					if(cartList.get(i).getItemName().equals("noName") ){

						deleteCartList.add(j,String.valueOf(cartList.get(i).getItemId()));
						j++;
					}
				}
				if(! deleteCartList.isEmpty()){
					for(int i = 0;deleteCartList.size() > i ;i++){
					dao.deleteSeparete(session.get("tempUserId").toString(),Integer.parseInt(deleteCartList.get(i)));
					}
				}

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
				totalPrice += dto.getPrice()*dto.getItemCount();
				System.out.println("合計" + totalPrice + "円");
			}
			return totalPrice;
		}
		public String getToken() {
			return token;
		}
		public void setToken(String token) {
			this.token = token;
		}
		public String getErrorMessage() {
			return errorMessage;
		}
		public void setErrorMessage(String errorMessage) {
			this.errorMessage = errorMessage;
		}


}