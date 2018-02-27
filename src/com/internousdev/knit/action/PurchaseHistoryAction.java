package com.internousdev.knit.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.knit.dao.PurchaseHistoryDAO;
import com.internousdev.knit.dto.PurchaseHistoryDTO;
import com.internousdev.knit.util.IdCheck;
import com.opensymphony.xwork2.ActionSupport;

//マイページよりボタン押下で遷移


public class PurchaseHistoryAction extends ActionSupport implements  SessionAware{

	public Map<String,Object> session;

	private PurchaseHistoryDAO purchaseHistoryDAO = new PurchaseHistoryDAO();

	public ArrayList<PurchaseHistoryDTO> historyList = new ArrayList<PurchaseHistoryDTO>();

	private String itemId;

	private String deleteFlg;

	private String orderNum;


	public String execute()throws SQLException{
		if(session.containsKey("userId")){
			IdCheck idCheck = new IdCheck();
			if(idCheck.checkUser(session.get("userId").toString())){
				return "errorPage";
			}
		}


		//ログインしてなければログインに飛ばす

		boolean loginFlg = session.containsKey("loginFlg");


		if (!loginFlg) {
			return ERROR;
		}


		String userId =session.get("userId").toString();
		historyList = purchaseHistoryDAO.getPurchaseHistory(userId);

		//購入履歴表示メソッド

		if(deleteFlg == null){
		historyList = purchaseHistoryDAO.getPurchaseHistory(userId);

			//imageFilePathがとれているかどうかの確認


		Iterator<PurchaseHistoryDTO> iterator = historyList.iterator();


		if(!(iterator.hasNext())){
		historyList = null;
		}
		}

		//購入履歴削除機能メソッド(全件削除)

		else if(deleteFlg.equals("1")){

			String user_id = session.get("userId").toString();
			historyList = purchaseHistoryDAO.getPurchaseHistory(userId);

			int res = purchaseHistoryDAO.deleteAll(user_id);

			if(res > 0){
				historyList = purchaseHistoryDAO.getPurchaseHistory(userId);
				Iterator<PurchaseHistoryDTO> iterator = historyList.iterator();

				if(!(iterator.hasNext())){
				historyList = null;}

				String result = SUCCESS;
				return result;

			}
			else if(res == 0){
				Iterator<PurchaseHistoryDTO> iterator = historyList.iterator();
				historyList = purchaseHistoryDAO.getPurchaseHistory(userId);

				if(!(iterator.hasNext())){
				historyList = null;}
				String result = SUCCESS;
				return result;
			}

		}

		//購入履歴削除機能メソッド(個別削除)

		else if(deleteFlg.equals("2")){



			String user_id = session.get("userId").toString();

			purchaseHistoryDAO.deletePart(user_id,Integer.parseInt(itemId), orderNum);

			historyList = purchaseHistoryDAO.getPurchaseHistory(userId);

		Iterator<PurchaseHistoryDTO> iterator = historyList.iterator();

		if(!(iterator.hasNext())){
		historyList = null;
		}
		}
		String result = SUCCESS;

		historyList = purchaseHistoryDAO.getPurchaseHistory(userId);
		Iterator<PurchaseHistoryDTO> iterator = historyList.iterator();

		if(!(iterator.hasNext())){
		historyList = null;}

		return result;

		}


	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public ArrayList<PurchaseHistoryDTO> getHistoryList() {
		return historyList;
	}

	public void setHistoryList(ArrayList<PurchaseHistoryDTO> historyList) {
		this.historyList = historyList;
	}

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getDeleteFlg() {
		return deleteFlg;
	}

	public void setDeleteFlg(String deleteFlg) {
		this.deleteFlg = deleteFlg;
	}

	public String getOrderNum() {
		return orderNum;
	}

	public void setOrderNum(String orderNum) {
		this.orderNum = orderNum;
	}

}
