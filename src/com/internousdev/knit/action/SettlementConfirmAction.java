package com.internousdev.knit.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.knit.dao.CartDeleteDAO;
import com.internousdev.knit.dao.PurchaseCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class SettlementConfirmAction extends ActionSupport implements SessionAware {

	// userId格納
	private String userId;
	// cartInfoDTO格納List
	private ArrayList<CartInfoDTO> cartList = new ArrayList<CartInfoDTO>();
	// session情報格納
	public Map<String,Object> session;
	//カートの合計金額
	private int totalPrice = 0;

	public String execute() throws SQLException {

		String result = ERROR;

		//カート情報取得（List型で受け取る)

		PurchaseCompleteDAO purchaseCompleteDAO = new PurchaseCompleteDAO();
		if (session.containsKey("userId")){
			cartList = purchaseCompleteDAO.getCartInfo(session.get("userId").toString());

			/*-----------------------------------------------------------
				カート情報なしの場合
			 ----------------------------------------------------------*/

			if (cartList.size() == 0) {
				return "other";
			}

			
			/*-----------------------------------------------------------
				2.購入履歴に登録
			 ----------------------------------------------------------*/

			int i = purchaseCompleteDAO.setPurchaseHistory(cartList);
			System.out.println(cartList);

			/*-----------------------------------------------------------
				カート情報ありの場合(listの数と処理件数と同じ場合)
			 ----------------------------------------------------------*/

			if(cartList.size() == i ){

				/*------------------------------------------------------------
					3.カートテーブル情報を削除
				 -----------------------------------------------------------*/

				CartDeleteDAO delete = new CartDeleteDAO();
				delete.deleteCartInfo(session.get("userId").toString());
				result = SUCCESS;
			}

		}
		totalPrice=calcTotalPrice(cartList);
		return result;
	}

	/**
	 * ユーザーIDを取得するメソッド
	 *
	 * @return userId
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * ユーザーIDを格納するメソッド
	 *
	 * @param userId
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * ユーザーcartListを取得するメソッド
	 *
	 * @return cartList
	 */
	public ArrayList<CartInfoDTO> getCartList() {
		return cartList;
	}

	/**
	 * ユーザーcartListを取得するメソッド
	 *
	 * @return cartList
	 */
	public void setCartList(ArrayList<CartInfoDTO> cartList) {
		this.cartList = cartList;
	}

	/**
	 * セッション情報を取得するメソッド
	 *
	 * @return session
	 */
	public Map<String, Object> getSession() {
		return session;
	}

	/**
	 * セッション情報を格納するメソッド
	 *
	 * @param session
	 */
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	/**
	 * 合計金額を計算するメソッド
	 */
	public int calcTotalPrice(ArrayList<CartInfoDTO> cartList){
		int totalPrice = 0;
		for (CartInfoDTO dto : cartList){
			totalPrice += dto.getPrice() * dto.getItemCount();
			System.out.println("合計" + totalPrice + "円");
		}
		return totalPrice;
	}

	public int getTotalPrice(){
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice){
		this.totalPrice = totalPrice;
	}

}
