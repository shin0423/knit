package com.internousdev.knit.action;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.knit.dao.MyPageDAO;
import com.internousdev.knit.dto.MyPageDTO;
import com.opensymphony.xwork2.ActionSupport;

public class MyPageAction extends ActionSupport implements SessionAware {
	
	private String userId;
	
	private Map<String, Object> session;
	
	private ArrayList<MyPageDTO> myPageList = new ArrayList<MyPageDTO>();
			
	private String message;
	
	public String execute() {
		
		if(!(session.containsKey("userId"))) {
			
			setMessage("このサービスをご利用になるにはログインして下さい。");
		}
		String result = ERROR;
		
		if (session.containsKey("userId")) {
			
			userId = session.get("userId").toString();
			
			MyPageDAO dao = new MyPageDAO();
			
			myPageList = dao.getUserInfo(userId);
			
			if (myPageList.size() > 0) {
				 
				result = SUCCESS;
			}
		}
		return result;
	}
	
	public Map<String, Object> getSession() {
		return session;
	}
	
	public void setSession1(Map<String, Object> session) {	
		this.session = session;
	}
	
	public String getUserId() {
		return userId;
	}
	
	public ArrayList<MyPageDTO> getMyPageList() {
		return myPageList;
	}
	
	public void setMyPageList(ArrayList<MyPageDTO> myPageList) {
		this.myPageList = myPageList;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public void setSession(Map<String, Object> arg0) {
		this.session = arg0;
	}
	
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
}
