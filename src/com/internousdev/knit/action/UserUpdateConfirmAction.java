package com.internousdev.knit.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.knit.dao.UserUpdateConfirmDAO;
import com.opensymphony.xwork2.ActionSupport;

public class UserUpdateConfirmAction extends ActionSupport implements SessionAware{
	private String userId;

	private String newPassword;

	private String conPassword;

	private String telNumber;

	private String userAddress;

	private UserUpdateConfirmDAO userUpdateConfirmDAO = new UserUpdateConfirmDAO();

	public Map<String,Object> session;

	private String errorMessage;

	public String execute(){
		if(!userUpdateConfirmDAO.getUserId(userId)){
			setErrorMessage("入力されたIDが異なります。");
			return ERROR;
		}

		String result = SUCCESS;

		if(newPassword.equals("")){
			setErrorMessage("パスワードを入力してください。");
			result = ERROR;
		}else if(newPassword.length()<1 || newPassword.length()>16){
			setErrorMessage("パスワードは1文字以上16文字以下で入力してください。");
			result = ERROR;
		}else if(!newPassword.matches("^[a-zA-Z0-9]+$")){
			setErrorMessage("パスワードは半角英数字で入力してください。");
			result = ERROR;
		}

		if(!(newPassword.equals(conPassword))){
			setErrorMessage("入力された確認パスワードが異なります。");
			return ERROR;
		}

		if(0<telNumber.length() && telNumber.length()<11 || telNumber.length()>13){
			setErrorMessage("電話番号は11文字以上13文字以下で入力してください。");
			result = ERROR;
		}else if(!telNumber.matches("^[0-9]+$")){
			setErrorMessage("電話番号は半角数字で入力してください。");
			result = ERROR;
		}

		if(0<userAddress.length() && userAddress.length()<15 || userAddress.length()>50){
			setErrorMessage("住所は15文字以上50文字以下で入力してください。");
			result = ERROR;
		}else if(!userAddress.matches("^[a-zA-Z0-9ァ-ヴぁ-ん一-龠々!-~]+$")) {
		    setErrorMessage("住所は半角英数字、漢字、カタカナ及び半角記号で入力してください。");
			result = ERROR;
		}

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

	public String getConPassword() {
		return conPassword;
	}

	public void setConPassword(String conPassword) {
		this.conPassword = conPassword;
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
