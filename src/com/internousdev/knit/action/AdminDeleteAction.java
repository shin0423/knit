package com.internousdev.knit.action;


import java.sql.SQLException;

import com.internousdev.knit.dao.AdmiDAO;
import com.opensymphony.xwork2.ActionSupport;


public class AdminDeleteAction extends ActionSupport{
	private String itemId;
	private String result;
	private AdmiDAO admiDAO=new AdmiDAO();

	public String execute() throws SQLException{
		int res=admiDAO.deleteAdminItemInfo(itemId);

		if(res>0){
			result=SUCCESS;
		}else if(res==0){
			result=ERROR;

		}
		return result;
	}

	public String getItemId(){
		return itemId;
	}

	public void setItemId(String itemId){
		this.itemId=itemId;
	}

}
