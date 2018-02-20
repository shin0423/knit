package com.internousdev.knit.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.knit.dao.UserUpdateCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class UserUpdateCompleteAction extends ActionSupport implements SessionAware{
	private String userId;
	private String newPassword;
	private String newEmail;
	private UserUpdateCompleteDAO userUpdateCompleteDAO = new UserUpdateCompleteDAO();

	public Map<String,Object> session;

	public String execute() throws SQLException{
		String result=ERROR;

		if ( newEmail == null) {
			userUpdateCompleteDAO.userUpdate1( newPassword, session.get("userId").toString() );
			System.out.println("newPasswordTest:"+session.get("newPassword").toString());
			System.out.println("newPasswordTest:"+newPassword);
			result = SUCCESS;
		} else if ( newPassword == null) {
			userUpdateCompleteDAO.userUpdate2( newEmail, session.get("userId").toString() );
			System.out.println(session.get("userId").toString());
			System.out.println("newEmailTest:"+session.get("newEmail").toString());
			System.out.println("newEmailTest:"+newEmail);
			result = SUCCESS;
		} else {
			userUpdateCompleteDAO.userUpdate3( newEmail,  newPassword, session.get("userId").toString());
			System.out.println("newEmailTest:"+session.get("newEmail").toString());
			System.out.println("newPasswordTest:"+newEmail);
			System.out.println("newPasswordTest:"+session.get("newPassword").toString());
			System.out.println("newPasswordTest:"+newPassword);
			result = SUCCESS;
		}

		return result;
}
//セッターゲッターの設定

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

	public String getNewEmail() {
		return newEmail;
	}

	public void setNewEmail(String newEmail) {
		this.newEmail = newEmail;
	}

	public Map<String, Object> getSession() {
		return session;
	}
	@Override
	public void setSession(Map<String,Object> session){
		this.session = session;
	}
}
