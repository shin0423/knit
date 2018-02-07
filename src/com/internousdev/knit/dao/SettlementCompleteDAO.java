package com.internousdev.knit.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.knit.dto.CartDTO;
import com.internousdev.knit.dto.SettlementConfirmDTO;
import com.opensymphony.xwork2.ActionSupport;

public class SettlementCompleteAction extends ActionSupport implements SessionAware{

	private Map<String,Object> session;
	private ArrayList<CartDTO> cartInfoList = new ArrayList<CartDTO>();
	public ArrayList<SettlementConfirmDTO> destinationList = new ArrayList<SettlementConfirmDTO>();
	private SettlementConfirmDAO settlementConfirmDAO = new SettlementConfirmDAO();
	private SettlementCompleteDAO settlementCompleteDAO = new SettlementCompleteDAO();
	private boolean buyCountErrorFlg=false;
	private ArrayList<CartDTO> buyCountErrorList = new ArrayList<CartDTO>();

	CartDAO cartDAO = new CartDAO();

//決済処理

	public String execute() throws SQLException{

		if (!(session.containsKey("userId"))){
			return "loginError";
		}

		String	result=ERROR;

		destinationList = settlementConfirmDAO.getDestinationInfo(session.get("userId").toString());
		if(destinationList.size()!=0){

			result = SUCCESS;

			//カート情報読み込み
			cartInfoList=cartDAO.showUserCartList(session.get("userId").toString());

			//カートリストの数だけfor 購入履歴テーブルに登録 在庫数変動
			int i = settlementCompleteDAO.setPurchaseHistory(cartInfoList);
			System.out.println("購入履歴に入れた数"+i);

			}
			//購入したユーザーのカート情報を消去
			cartDAO.deleteCartInfo(session.get("userId").toString());

			return result;
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
}