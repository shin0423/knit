package com.internousdev.knit.action;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.knit.dao.PurchaseCancelConfirmDAO;
import com.internousdev.knit.dao.PurchaseCancelDAO;
import com.internousdev.knit.dto.PurchaseHistoryDTO;
import com.internousdev.knit.util.DateUtil;
import com.opensymphony.xwork2.ActionSupport;



public class PurchaseCancelConfirmAction extends ActionSupport implements  SessionAware{

	public Map<String,Object> session;

	private PurchaseCancelConfirmDAO purchaseCancelConfirmDAO = new PurchaseCancelConfirmDAO();

	private PurchaseCancelDAO purchaseCancelDAO = new PurchaseCancelDAO();

	public ArrayList<PurchaseHistoryDTO> cancelConfirmList = new ArrayList<PurchaseHistoryDTO>();

	private String orderNum;

	private int itemId;

	public String execute()throws SQLException{

	String loginFlg = session.get("loginFlg").toString();

	if (!loginFlg.equals("true")) {
		return ERROR;


	}


	//セッションからuserIdを取得
	String userId =session.get("userId").toString();

	/**
	 * 注文日と現在時間の差分時間数を算出、send_Flgを０(発送待機)から２(発送済)へ切り替えるメソッドです。
	 * purchaseCancelDAO.sendFlgChangeを流用します。
	 * @param args
	 */


	//userIdに紐づいたsend_flgが0の商品を検索します
		cancelConfirmList = purchaseCancelDAO.getPurchaseHistory(userId);


		System.out.println("List = "+ cancelConfirmList);

		for (int i = 0; i < cancelConfirmList.size(); i++) {
			System.out.println(cancelConfirmList.get(i).getRegistDate());
		}

	    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	    SimpleDateFormat SDF = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	    Date dateTo = null;
	    Date dateFrom = null;
	    DateUtil dateUtil = new DateUtil();

	    // 日付を作成します。



	    for (int i = 0; i < cancelConfirmList.size(); i++){
	    try {
	        dateFrom = sdf.parse(cancelConfirmList.get(i).getRegistDate());
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

	    //差分時間数が6時間より大きいときにsend_flgを0から2(発送待機から発送済み状態へ)にします。

	    if(dayDiff >= 6){
	    	purchaseCancelDAO.sendFlgChange(userId);
	    }
    }

	//購入キャンセルボタンが押下された商品を表示するメソッド


	String result = SUCCESS;

		System.out.println(orderNum);
		System.out.println(itemId);
		System.out.println(userId);

		cancelConfirmList = purchaseCancelConfirmDAO.getPurchaseHistory(userId,orderNum,itemId);
		System.out.println("List = "+ cancelConfirmList);

		Iterator<PurchaseHistoryDTO> iterator = cancelConfirmList.iterator();

		if(!(iterator.hasNext())){
		cancelConfirmList = null;
		}
		return result;
	}



	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}


	public String getOrderNum() {
		return orderNum;
	}

	public void setOrderNum(String orderNum) {
		this.orderNum = orderNum;
	}
}