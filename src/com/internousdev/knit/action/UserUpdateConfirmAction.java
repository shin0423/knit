package com.internousdev.knit.action;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.knit.dao.UserUpdateConfirmDAO;
import com.internousdev.knit.util.InputChecker;
import com.opensymphony.xwork2.ActionSupport;

public class UserUpdateConfirmAction extends ActionSupport implements SessionAware{

	public Map<String, Object> getSession() {
		return session;
	}

	private String password;

	private String newPassword;

	private String conPassword;

	private String newEmail;

	private UserUpdateConfirmDAO userUpdateConfirmDAO = new UserUpdateConfirmDAO();

	public Map<String,Object> session;

	private ArrayList<String> errMsgList = new ArrayList<>();

	private String errorMessage;

	public String execute(){
		//入力情報の確認と登録
		String result = SUCCESS;

		InputChecker i = new InputChecker();
		if(!(newPassword.equals("")) && !(conPassword.equals(""))) {
			if(!(userUpdateConfirmDAO.getPassword(password))){
				setErrorMessage("入力されたパスワードが異なります。");
				result = ERROR;
			} else if(newPassword.length()<1 || newPassword.length()>16){
				setErrorMessage("パスワードは1文字以上16文字以下で入力してください。");
				result = ERROR;
			}else if(!newPassword.matches("^[a-zA-Z0-9]+$")){
				setErrorMessage("パスワードは半角英数字で入力してください。");
				result = ERROR;
			}else{
				session.put("newPassword", newPassword);
				System.out.println(session.get("newPassword").toString());
			}
			if(!(newPassword.equals(conPassword))){
				setErrorMessage("入力された確認パスワードが異なります。");
				return ERROR;
			}
		}
		if (newEmail != null) {
			if(!i.emailChk(newEmail).equals("OK")){
				errMsgList.add(i.emailChk(newEmail));
				result = ERROR;
			}else{
				session.put("newEmail", newEmail);
				System.out.println(session.get("newEmail").toString());
			}
		}

		return result;
	}
//ゲッターセッターの設定
	public ArrayList<String> getErrMsgList() {
		return errMsgList;
	}

	public void setErrMsgList(ArrayList<String> errMsgList) {
		this.errMsgList = errMsgList;
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNewPassword() {
		return newPassword;
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}

	public String getConPassword() {
		return conPassword;
	}

	public void setConPassword(String conPassword) {
		this.conPassword = conPassword;
	}

	public String getNewEmail() {
		return newEmail;
	}
	public void setNewEmail(String newEmail) {
		this.newEmail = newEmail;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	@Override
	public void setSession(Map<String,Object> session){
		this.session=session;
	}
}
