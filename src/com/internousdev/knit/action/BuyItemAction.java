package com.internousdev.knit.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.knit.dao.BuyItemDAO;
import com.internousdev.knit.dto.BuyItemDTO;
import com.opensymphony.xwork2.ActionSupport;

public class BuyItemAction extends ActionSupport implements SessionAware{
	private String searchWord; //ユーザーが入力した検索ワード
	private BuyItemDAO buyItemDAO=new BuyItemDAO();//検索用DAO
	private List<BuyItemDTO> buyItemAfterSearchList = new ArrayList<>();
	public Map<String,Object> session;

	public String execute() throws SQLException{
		String[] splitedWord = searchWord.split(" ", 0);
		String wordForSearch="";
		String count=String.valueOf(splitedWord.length);
		for(int i = 0;splitedWord.length>i;i++){
			if(count.equals(String.valueOf(1+i))){
				wordForSearch=wordForSearch+"item_name LIKE '%"+splitedWord[i]+"%'";
			}else{

			wordForSearch=wordForSearch+"item_name LIKE '%"+splitedWord[i]+"%' AND ";
			}
		}
	buyItemAfterSearchList=buyItemDAO.selectItem(wordForSearch);
	return SUCCESS;

	}


	public void setSession(Map<String,Object> session){
		this.session=session;

	}


	public List<BuyItemDTO> getBuyItemAfterSearchList() {
		return buyItemAfterSearchList;
	}


	public void setBuyItemAfterSearchList(List<BuyItemDTO> buyItemAfterSearchList) {
		this.buyItemAfterSearchList = buyItemAfterSearchList;
	}
}
