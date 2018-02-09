package com.internousdev.knit.action;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.knit.dao.UserUpdateConfirmDAO;
import com.internousdev.knit.util.InputChecker;
import com.opensymphony.xwork2.ActionSupport;

public class UserUpdateConfirmAction extends ActionSupport implements SessionAware{
	private String userId;

	private String newPassword;

	private String conPassword;

	private String telNumber;

	private String userAddress;

	private UserUpdateConfirmDAO userUpdateConfirmDAO = new UserUpdateConfirmDAO();

	public Map<String,Object> session;

	private ArrayList<String> errMsgList = new ArrayList<>();

	private String errorMessage;

	public String execute(){
		if(!userUpdateConfirmDAO.getUserId(userId)){
			setErrorMessage("入力されたIDが異なります。");
			return ERROR;
		}else{
			session.put("userId", userId);
		}

		String result = SUCCESS;

		InputChecker i = new InputChecker();

		if(newPassword.equals("")){
			setErrorMessage("パスワードを入力してください。");
			result = ERROR;
		}else if(newPassword.length()<1 || newPassword.length()>16){
			setErrorMessage("パスワードは1文字以上16文字以下で入力してください。");
			result = ERROR;
		}else if(!newPassword.matches("^[a-zA-Z0-9]+$")){
			setErrorMessage("パスワードは半角英数字で入力してください。");
			result = ERROR;
		}else{
			session.put("newPassword", newPassword);
		}

		if(!(newPassword.equals(conPassword))){
			setErrorMessage("入力された確認パスワードが異なります。");
			return ERROR;
		}

		if(!i.telNumberChk(telNumber).equals("OK")){
			errMsgList.add(i.telNumberChk(telNumber));
			result = ERROR;
		}else{
			session.put("telNumber", telNumber);
		}
		if(!i.userAddressChk(userAddress).equals("OK")){
			errMsgList.add(i.userAddressChk(userAddress));
			result = ERROR;
		}else{
			session.put("userAddress",userAddress);
		}

		return result;
	}

	public ArrayList<String> getErrMsgList() {
		return errMsgList;
	}

	public void setErrMsgList(ArrayList<String> errMsgList) {
		this.errMsgList = errMsgList;
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
