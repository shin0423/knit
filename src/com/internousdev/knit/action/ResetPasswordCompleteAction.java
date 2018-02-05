package com.internousdev.knit.action;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.knit.dao.ResetPasswordDAO;
import com.opensymphony.xwork2.ActionSupport;


public class ResetPasswordCompleteAction extends ActionSupport implements SessionAware{
	//ログインID
	private String userId;

	//新規パスワード
	private String newPassword;

	//ログインIDと新規パスワードを格納
	public Map<String,Object> session;

	//パスワード更新に使うDAOをインスタンス化
	private ResetPasswordDAO resetPasswordDAO = new ResetPasswordDAO();

	public String execute(){
		String result = "login";
		if(userId != null){
			//DBのパスワードを新規パスワードに更新
			resetPasswordDAO.resetPassword(newPassword, userId);
			result = SUCCESS;
		}else{
			result = ERROR;
		}
		return result;
	}
	//セッション
	public Map<String,Object> getSession(){
		return session;
	}
	@Override
	public void setSession(Map<String,Object> session){
		this.session = session;
	}
	public String getUserId(){
		return userId;
	}
	public void setUserId(String userId){
		this.userId=userId;
	}
	public String getNewPassword(){
		return newPassword;
	}
	public void setNewPassword(String newPassword){
		this.newPassword=newPassword;
	}

}
