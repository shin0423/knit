package com.internousdev.knit.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class UserUpdateAction extends ActionSupport implements SessionAware{
	public Map<String ,Object> session;

	public String execute(){
		String result = "login";
		if(session.containsKey("user_id")){
			result = SUCCESS;
		}else{
			result = ERROR;
		}
		return result;
	}
	public void setSession(Map<String,Object>session){
		this.session = session;
	}
}
