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

	private String message;

	private int id;


	public String execute()throws SQLException{

		//ログインしてなければログインに飛ばす
		if (!session.containsKey("userId")) {
			return ERROR;
		}

		String result = SUCCESS;

		String userId = (String) session.get("userId");

		int status = purchaseHistoryDTO.getStatus();

		int XXX = purchaseHistoryDTO.getXXX();

		if(status == 0){

			historyList = purchaseHistoryDAO.getPurchaseHistory(userId, status, XXX);
			System.out.println("List = "+ historyList);

			Iterator<PurchaseHistoryDTO> iterator = historyList.iterator();

			if(!(iterator.hasNext())){
				historyList = null;
			}

		}else if(status == 1){
		}

		}
}
