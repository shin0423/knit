package com.internousdev.knit.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.knit.dao.UserUpdateCompleteDAO;
import com.internousdev.knit.util.IdCheck;
import com.opensymphony.xwork2.ActionSupport;

public class UserUpdateCompleteAction extends ActionSupport implements SessionAware{
	private String userId;
	private String newPassword;
	private String newEmail;
	private UserUpdateCompleteDAO userUpdateCompleteDAO = new UserUpdateCompleteDAO();

	public Map<String,Object> session;

	public String execute() throws SQLException{
		//不正な書き換えがあった場合の確認
		if(session.containsKey("userId")){
			IdCheck idCheck = new IdCheck();
			if(idCheck.checkUser(session.get("userId").toString())){
				return "errorPage";
			}
		}
		String result=ERROR;

		if ( newEmail == null) {
			userUpdateCompleteDAO.userUpdate1( newPassword, session.get("userId").toString() );
			session.remove("newPassword");
			result = SUCCESS;
		} else if ( newPassword == null) {
			userUpdateCompleteDAO.userUpdate2( newEmail, session.get("userId").toString() );
			session.remove("newEmail");
			result = SUCCESS;
		} else {
			userUpdateCompleteDAO.userUpdate3( newEmail,  newPassword, session.get("userId").toString());
			session.remove("newEmail");
			session.remove("newPassword");
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
