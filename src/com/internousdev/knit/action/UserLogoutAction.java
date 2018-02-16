package com.internousdev.knit.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class UserLogoutAction extends ActionSupport implements SessionAware{
	public Map<String,Object> session;
	public String execute(){

		if(session.containsKey("saveId")) {
			String saveId=session.get("saveId").toString();
			session.clear();
			session.put("saveId", saveId);
		} else {
			session.clear();
		}

		return SUCCESS;
	}
	public void setSession(Map<String,Object> session) {
		this.session=session;
	}

}
