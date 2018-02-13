package com.internousdev.knit.action;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.knit.dao.PurchaseCancelDAO;
import com.internousdev.knit.dto.PurchaseHistoryDTO;
import com.internousdev.knit.util.DateUtil;
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

	String loginFlg = session.get("loginFlg").toString();

	String userId =session.get("userId").toString();

    String result = SUCCESS;

	if (!loginFlg.equals("true")) {
		return ERROR;
	}

	//キャンセル可能な商品が０でないときに以下の処理を実行します
	else if(!cancelList.equals(null)){

	/**
	 * 2つの日付の差分時間数を算出するプログラムです。
	 * @param args
	 */


	//userIdに紐づいたsend_flgが0の商品を検索します
	cancelList = purchaseCancelDAO.getPurchaseHistory(userId);


	System.out.println("List = "+ cancelList);

	for (int i = 0; i < cancelList.size(); i++) {
		System.out.println(cancelList.get(i).getRegistDate());
	}

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    SimpleDateFormat SDF = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    Date dateTo = null;
    Date dateFrom = null;
    DateUtil dateUtil = new DateUtil();

    // 日付を作成します。



    for (int i = 0; i < cancelList.size(); i++){
    try {
        dateFrom = sdf.parse(cancelList.get(i).getRegistDate());
        dateTo = SDF.parse(dateUtil.getDate());
    } catch (ParseException e) {
        e.printStackTrace();
    }

    // 日付をlong値に変換します。
    long dateTimeTo = dateTo.getTime();
    long dateTimeFrom = dateFrom.getTime();

    // 差分の時間数を算出します。
    long dayDiff = ( dateTimeTo - dateTimeFrom  ) / (1000 * 60 * 60);

    System.out.println( "注文日時(FROM) : " + sdf.format(dateFrom) );
    System.out.println( "現在日時(TO) : " + sdf.format(dateTo) );
    System.out.println( "差分時間数 : " + dayDiff );

    //差分時間数が6時間(今はテスト用に即座に変更する)より大きいときにsend_flgを0から2(発送待機から発送済み状態へ)にします。

    if(dayDiff >= 6){
    	purchaseCancelDAO.sendFlgChange(userId);
    }
    }

    //購入キャンセル可能商品履歴表示メソッド

		cancelList = purchaseCancelDAO.getPurchaseHistory(userId);
		System.out.println("List = "+ cancelList);

		Iterator<PurchaseHistoryDTO> iterator = cancelList.iterator();

		if(!(iterator.hasNext())){
		cancelList = null;


		}return result;
	}
	//キャンセル可能な商品が0のときに以下の処理を実行します
	else if(cancelList.equals(null)){
	}return result;

	}




	//ゲッタセッタ
	public void setSession(Map<String, Object> session) {
		this.session = session;
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
	public ArrayList<PurchaseHistoryDTO> getCancelList() {
		return cancelList;
	}
	public void setCancelList(ArrayList<PurchaseHistoryDTO> cancelList) {
		this.cancelList = cancelList;
	}


}
