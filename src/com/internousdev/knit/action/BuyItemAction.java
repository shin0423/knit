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
	private String searchWord;
	private BuyItemDAO buyItemDAO=new BuyItemDAO();
	private List<BuyItemDTO> buyItemAfterSearchList = new ArrayList<>();
	public Map<String,Object> session;

	public String execute() throws SQLException{
		String[] splitedWord = searchWord.split(" ", 0);
		String wordForSearch="";
		for(int i = 0;splitedWord.length>i;i++){
			if(wordForSearch.length() > i+1){
				wordForSearch=wordForSearch+"item_name LIKE '%"+splitedWord[i]+"%' ";
			}else{
			wordForSearch=wordForSearch+"item_name LIKE '%"+splitedWord[i]+"%' AND ";
			}
		}
	buyItemAfterSearchList=buyItemDAO.selectItem(wordForSearch);
	session.put("buyItemAfterSearchList",buyItemAfterSearchList);
	return SUCCESS;

	}


	public void setSession(Map<String,Object> session){
		this.session=session;
	}
}
