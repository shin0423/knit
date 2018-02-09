package com.internousdev.knit.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.knit.dao.UserUpdateCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class UserUpdateCompleteAction extends ActionSupport implements SessionAware{
	private String userId;
	private String newPassword;
	private String telNumber;
	private String userAddress;

	public Map<String,Object> session;
	private UserUpdateCompleteDAO userUpdateCompleteDAO = new UserUpdateCompleteDAO();

	public String execute() throws SQLException{
		userUpdateCompleteDAO.userUpdate(session.get("newPassword").toString(),
				session.get("userId").toString()
				);
		String result=SUCCESS;
		return result;
	}

	public String execute2() throws SQLException{
		userUpdateCompleteDAO.userUpdate(session.get("telNumber").toString(),
				session.get("userAddress").toString(),
				session.get("userId").toString()
				);
		String result=SUCCESS;
		return result;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getNewPassword() {
		return newPassword;
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}

	public String getTelNumber() {
		return telNumber;
	}

	public void setTelNumber(String telNumber) {
		this.telNumber = telNumber;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	@Override
	public void setSession(Map<String,Object> session){
		this.session = session;
	}
}
