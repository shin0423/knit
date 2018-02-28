package com.internousdev.knit.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.knit.dao.PurchaseCancelCompleteDAO;
import com.internousdev.knit.util.IdCheck;
import com.opensymphony.xwork2.ActionSupport;



public class PurchaseCancelCompleteAction extends ActionSupport implements  SessionAware{

	public Map<String,Object> session;

	private PurchaseCancelCompleteDAO purchaseCancelCompleteDAO = new PurchaseCancelCompleteDAO();

	private int itemId;

	private String orderNum;

	public String execute()throws SQLException{
		if(session.containsKey("userId")){
			IdCheck idCheck = new IdCheck();
			if(idCheck.checkUser(session.get("userId").toString())){
				return "errorPage";
			}
		}
		//ログインしていないユーザーをログイン画面へ飛ばす

		boolean loginFlg = session.containsKey("loginFlg");


		if (!loginFlg) {
			return ERROR;
		}

	//購入キャンセル機能メソッド

	String result = SUCCESS;

	String userId =session.get("userId").toString();

	purchaseCancelCompleteDAO.cancelPart(userId, itemId, orderNum);


	return result;

	}




	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public String getOrderNum(){
		return orderNum;
	}
	public void setOrderNum(String orderNum){
		this.orderNum = orderNum;
	}


	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}


}