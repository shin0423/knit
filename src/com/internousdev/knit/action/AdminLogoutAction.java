package com.internousdev.knit.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class AdminLogoutAction extends ActionSupport implements SessionAware {
	public  Map<String,Object> session;

	public String execute(){
		session.put("loginFlg", false);
		return SUCCESS;
	}

	public Map<String,Object> getSession(){
		return session;
	}

	@Override
	public void setSession(Map<String,Object> session){
		this.session=session;
	}

}
