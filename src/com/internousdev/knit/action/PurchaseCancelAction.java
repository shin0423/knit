package com.internousdev.knit.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.knit.dao.PurchaseCancelDAO;
import com.internousdev.knit.dto.PurchaseHistoryDTO;
import com.opensymphony.xwork2.ActionSupport;



public class PurchaseCancelAction extends ActionSupport implements  SessionAware{

	public Map<String,Object> session;

	private PurchaseCancelDAO purchaseCancelDAO = new PurchaseCancelDAO();

	public ArrayList<PurchaseHistoryDTO> cancelList = new ArrayList<PurchaseHistoryDTO>();

	private String registDate;

	private String imageFilePath;

	private String itemNameKana;

	private int count;

	private String releasecompany;

	private String orderNum;

	private int itemId;

	public String execute()throws SQLException{

		//ログインしていないユーザーをログイン画面へ飛ばす

	String logind = session.get("logind").toString();

	if (!logind.equals("1")) {
		return ERROR;
	}
	String result = SUCCESS;


	//購入キャンセル可能商品履歴表示メソッド

	String userId =session.get("userId").toString();


		cancelList = purchaseCancelDAO.getPurchaseHistory(userId);
		System.out.println("List = "+ cancelList);

		Iterator<PurchaseHistoryDTO> iterator = cancelList.iterator();

		if(!(iterator.hasNext())){
		cancelList = null;

		}
		return result;


	}
	@Override
	public void setSession(Map<String, Object> arg0) {
		// TODO 自動生成されたメソッド・スタブ

	}
	public String getOrderNum() {
		return orderNum;
	}
	public void setOrderNum(String orderNum) {
		this.orderNum = orderNum;
	}
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getRegistDate() {
		return registDate;
	}
	public void setRegistDate(String registDate) {
		this.registDate = registDate;
	}
	public String getImageFilePath() {
		return imageFilePath;
	}
	public void setImageFilePath(String imageFilePath) {
		this.imageFilePath = imageFilePath;
	}
	public String getItemNameKana() {
		return itemNameKana;
	}
	public void setItemNameKana(String itemNameKana) {
		this.itemNameKana = itemNameKana;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String getReleasecompany() {
		return releasecompany;
	}
	public void setReleasecompany(String releasecompany) {
		this.releasecompany = releasecompany;
	}


}
