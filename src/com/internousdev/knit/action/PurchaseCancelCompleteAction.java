package com.internousdev.knit.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.knit.dao.PurchaseCancelCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;



public class PurchaseCancelCompleteAction extends ActionSupport implements  SessionAware{

	public Map<String,Object> session;

	private PurchaseCancelCompleteDAO purchaseCancelCompleteDAO = new PurchaseCancelCompleteDAO();

	private int itemId;

	private String orderNum;

	public String execute()throws SQLException{

	String loginFlg = session.get("loginFlg").toString();

	if (!loginFlg.equals("true")) {
		return ERROR;
	}

	//購入キャンセル機能メソッド

	String result = SUCCESS;

	String userId =session.get("userId").toString();

	System.out.println(userId);
	System.out.println("アイテムID" + itemId);
	System.out.println("注文番号" + orderNum);

		int cancel = purchaseCancelCompleteDAO.cancelPart(userId, itemId, orderNum);
		System.out.println(cancel);

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