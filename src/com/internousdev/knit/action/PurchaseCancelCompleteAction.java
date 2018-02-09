package com.internousdev.knit.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.knit.dao.PurchaseCancelCompleteDAO;
import com.internousdev.knit.dto.PurchaseHistoryDTO;
import com.opensymphony.xwork2.ActionSupport;



public class PurchaseCancelCompleteAction extends ActionSupport implements  SessionAware{

	public Map<String,Object> session;

	private PurchaseCancelCompleteDAO purchaseCancelCompleteDAO = new PurchaseCancelCompleteDAO();

	private PurchaseHistoryDTO purchaseHistoryDTO = new PurchaseHistoryDTO();

	public ArrayList<PurchaseHistoryDTO> historyList = new ArrayList<PurchaseHistoryDTO>();

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

		purchaseCancelCompleteDAO.cancelPart(userId, itemId, orderNum);

		return result;

	}




	@Override
	public void setSession(Map<String, Object> arg0) {
		// TODO 自動生成されたメソッド・スタブ

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




	public ArrayList<PurchaseHistoryDTO> getHistoryList() {
		return historyList;
	}




	public void setHistoryList(ArrayList<PurchaseHistoryDTO> historyList) {
		this.historyList = historyList;
	}




	public PurchaseHistoryDTO getPurchaseHistoryDTO() {
		return purchaseHistoryDTO;
	}




	public void setPurchaseHistoryDTO(PurchaseHistoryDTO purchaseHistoryDTO) {
		this.purchaseHistoryDTO = purchaseHistoryDTO;
	}


}