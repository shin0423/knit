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

	private PurchaseHistoryDTO purchaseHistoryDTO = new PurchaseHistoryDTO();

	public ArrayList<PurchaseHistoryDTO> historyList = new ArrayList<PurchaseHistoryDTO>();

	private String registDate;

	private String imageFilePath;

	private String itemNameKana;

	private int count;

	private String releasecompany;

	private String orderNum;

	private int itemId;

	private String deleteFlg;

	private String message;


	public String execute()throws SQLException{

		//ログインしてなければログインに飛ばす

		String loginFlg = session.get("loginFlg").toString();

		if (!loginFlg.equals("true")) {
			return ERROR;
		}

		/**
		 * 2つの日付の差分時間数を算出するプログラムです。
		 * @param args
		 */





		String result = SUCCESS;

		String userId =session.get("userId").toString();


		//購入履歴表示メソッド

		if(deleteFlg == null){




		historyList = purchaseHistoryDAO.getPurchaseHistory(userId);
		System.out.println("List = "+ historyList);

		Iterator<PurchaseHistoryDTO> iterator = historyList.iterator();

		if(!(iterator.hasNext())){
		historyList = null;
		}
		}

		//購入履歴削除機能メソッド(全件削除)

		else if(deleteFlg.equals(1)){

			deleteAll();

		}

		//購入履歴削除機能メソッド(個別削除)

		else if(deleteFlg.equals(2)){

			System.out.println("ID:"+itemId);
			deletePart();
		}


		return result;

		}

	public String getMessage(){
		return message;
	}
	public void setMessage(String message){
		this.message = message;
	}

	public void deleteAll() throws SQLException{
		String user_id = session.get("userId").toString();

		int res = purchaseHistoryDAO.deleteAll(user_id);
		System.out.println("削除候補件数：" + res);
		if(res > 0){
			System.out.println("削除した");
			historyList = null;
			setMessage("注文履歴をすべて削除しました");

		}else if(res == 0){
			System.out.println("削除失敗");
			//setMessage("商品の削除に失敗しました。");
		}
	}


	public void deletePart() throws SQLException{

			String user_id = session.get("userId").toString();

			purchaseHistoryDAO.deletePart(user_id,itemId);

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

	public String getimageFilePath() {
		return imageFilePath;
	}

	public void setimageFilePath(String imageFilePath) {
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

	public String getRegistDate() {
		return registDate;
	}

	public void setRegistDate(String registDate) {
		this.registDate = registDate;
	}
}
