package com.internousdev.knit.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.knit.dao.PurchaseHistoryDAO;
import com.internousdev.knit.dto.PurchaseHistoryDTO;
import com.opensymphony.xwork2.ActionSupport;

//マイページよりボタン押下で遷移





public class PurchaseHistoryAction extends ActionSupport implements  SessionAware{

	public Map<String,Object> session;

	private PurchaseHistoryDAO purchaseHistoryDAO = new PurchaseHistoryDAO();

	public ArrayList<PurchaseHistoryDTO> historyList = new ArrayList<PurchaseHistoryDTO>();



	private String itemId;

	private String deleteFlg;

	private String message;




	public String execute()throws SQLException{
		System.out.println("きたよー");

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
			for (int i = 0; i < historyList.size(); i++) {
				System.out.println(historyList.get(i).getImageFilePath());

			}
			for (int i = 0; i < historyList.size(); i++) {
				System.out.println("合計金額" + (historyList.get(i).getItemCount() * historyList.get(i).getPrice()));

			};


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
			System.out.println("削除候補件数：" + res);
			if(res > 0){
				System.out.println("削除した");
				setMessage("注文履歴をすべて削除しました");
				historyList = purchaseHistoryDAO.getPurchaseHistory(userId);
				Iterator<PurchaseHistoryDTO> iterator = historyList.iterator();

				if(!(iterator.hasNext())){
				historyList = null;}

				String result = SUCCESS;
				return result;

			}
			else if(res == 0){
				System.out.println("削除失敗");
				//setMessage("商品の削除に失敗しました。");
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

			System.out.println("ID:"+itemId);

			String user_id = session.get("userId").toString();

			purchaseHistoryDAO.deletePart(user_id,Integer.parseInt(itemId));

			historyList = purchaseHistoryDAO.getPurchaseHistory(userId);

			//imageFilePathがとれているかどうかの確認
			for (int i = 0; i < historyList.size(); i++) {
				System.out.println(historyList.get(i).getImageFilePath());
			}


		Iterator<PurchaseHistoryDTO> iterator = historyList.iterator();

		if(!(iterator.hasNext())){
		historyList = null;
		}
		}
		String result = SUCCESS;
		System.out.println("きたよー");

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


	public PurchaseHistoryDAO getPurchaseHistoryDAO() {
		return purchaseHistoryDAO;
	}


	public void setPurchaseHistoryDAO(PurchaseHistoryDAO purchaseHistoryDAO) {
		this.purchaseHistoryDAO = purchaseHistoryDAO;
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


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}




}
