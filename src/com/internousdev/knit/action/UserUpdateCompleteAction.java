package com.internousdev.knit.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.knit.dao.UserUpdateCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class UserUpdateCompleteAction extends ActionSupport implements SessionAware{
	private String newPassword;
	private String newEmail;
	private UserUpdateCompleteDAO userUpdateCompleteDAO = new UserUpdateCompleteDAO();

	public Map<String,Object> session;

	public String execute() throws SQLException{
		String result=ERROR;

		if ( !session.containsKey("newEmail")) {
			userUpdateCompleteDAO.userUpdate1( newPassword, session.get("userId").toString() );
			System.out.println("newPasswordTest:"+session.get("newPassword").toString());
			System.out.println("newPasswordTest:"+newPassword);
			result = SUCCESS;
		} else if ( !session.containsKey("newPassword")) {
			userUpdateCompleteDAO.userUpdate2( session.get("newEmail").toString(), session.get("userId").toString() );
			System.out.println("newEmailTest:"+session.get("newEmail").toString());
			System.out.println("newEmailTest:"+newEmail);
			result = SUCCESS;
		} else {
			userUpdateCompleteDAO.userUpdate3( session.get("newEmail").toString(),  session.get("newPassword").toString(), session.get("userId").toString());
			System.out.println("newEmailTest:"+session.get("newEmail").toString());
			System.out.println("newPasswordTest:"+newEmail);
			System.out.println("newPasswordTest:"+session.get("newPassword").toString());
			System.out.println("newPasswordTest:"+newPassword);
			result = SUCCESS;
		}

		return result;
}
//セッターゲッターの設定

	public String getNewPassword() {
		return newPassword;
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}

	public String getnewEmail() {
		return newEmail;
	}
	public void setnewEmail(String newEmail) {
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
