package com.internousdev.knit.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.knit.dao.CheckUserDAO;
import com.opensymphony.xwork2.ActionSupport;

public class UserIdCheckAction extends ActionSupport implements SessionAware{
	public Map<String,Object> session;
	String userId;

	public String execute() throws SQLException{
		if(session.containsKey("userId")){
			userId =session.get("userId").toString();
			CheckUserDAO dao = new CheckUserDAO();
			if(!(dao.checkUserID(userId))){
				session.remove("userId");
				session.put("loginFlg", false);
			}
		}

		return SUCCESS;
	}

	public void setSession(Map<String,Object> session){
		this.session=session;
	}
}
