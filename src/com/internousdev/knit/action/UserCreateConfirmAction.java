package com.internousdev.knit.action;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.knit.util.InputChecker;
import com.opensymphony.xwork2.ActionSupport;

public class UserCreateConfirmAction extends ActionSupport implements SessionAware{

	private String userId;

	private String password;

	private String familyName;

	private String firstName;

	private String familyNameKana;

	private String firstNameKana;

	private String sex;

	private String email;

	private String telNumber;

	private String userAddress;

	private ArrayList<String> errMsgList = new ArrayList<>();


	public Map<String,Object> session;


	public String execute(){
		String result = SUCCESS;

		InputChecker i = new InputChecker();

		if(!i.userIdChk(userId).equals("OK")){
			errMsgList.add(i.userIdChk(userId));
			result = ERROR;
		}else{
			session.put("createUserId", userId);
		}

		if(!i.passwordChk(password).equals("OK")){
			errMsgList.add(i.passwordChk(password));
			result = ERROR;
		}else{
			session.put("createPassword", password);
		}


		if(!i.familyNameChk(familyName).equals("OK")){
			errMsgList.add(i.familyNameChk(familyName));
			result = ERROR;
		}else{
			session.put("createFamilyName", familyName);
		}
		if(!i.firstNameChk(firstName).equals("OK")){
			errMsgList.add(i.firstNameChk(firstName));
			result = ERROR;
		}else{
			session.put("createFirstName", firstName);
		}
		if(!i.familyNameKanaChk(familyNameKana).equals("OK")){
			errMsgList.add(i.familyNameKanaChk(familyNameKana));
			result = ERROR;
		}else{
			session.put("createFamilyNameKana", familyNameKana);
		}
		if(!i.firstNameKanaChk(firstNameKana).equals("OK")){
			errMsgList.add(i.firstNameKanaChk(firstNameKana));
			result = ERROR;
		}else{
			session.put("createFirstNameKana", firstNameKana);
		}
		if(!i.emailChk(email).equals("OK")){
			errMsgList.add(i.emailChk(email));
			result = ERROR;
		}else{
			session.put("createEmail", email);
		}

		if(!(sex.equals(""))){
			session.put("createSex", sex);
		}

		if(!(telNumber.equals(""))){
			session.put("createTelNumber", telNumber);
		}

		if(!(userAddress.equals(""))){
			session.put("createUserAddtress",userAddress);
		}
		return result;
	}

	public String getUserId(){
		return userId;
	}

	public void setUserId(String userId){
		this.userId = userId;
	}

	public String getPassword(){
		return password;
	}

	public void setPassword(String password){
		this.password = password;
	}

	public String getFamilyName(){
		return familyName;
	}

	public void setFamilyName(String familyName){
		this.familyName = familyName;
	}

	public String getFirstName(){
		return firstName;
	}

	public void setFirstName(String firstName){
		this.firstName = firstName;
	}

	public String getFamilyNameKana() {
		return familyNameKana;
	}

	public void setFamilyNameKana(String familyNameKana) {
		this.familyNameKana = familyNameKana;
	}

	public String getFirstNameKana() {
		return firstNameKana;
	}

	public void setFirstNameKana(String firstNameKana) {
		this.firstNameKana = firstNameKana;
	}

	public String getSex(){
		return sex;
	}

	public void setSex(String sex){
		this.sex = sex;
	}

	public String getEmail(){
		return email;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public String getTelNumber(){
		return telNumber;
	}

	public void setTelNumber(String telNumber){
		this.telNumber = telNumber;
	}

	public String getUserAddress(){
		return userAddress;
	}

	public void setUserAddress(String userAddress){
		this.userAddress = userAddress;
	}

	@Override
	public void setSession(Map<String,Object> session){
		this.session=session;
	}

	public ArrayList<String> getErrMsgList() {
		return errMsgList;
	}

	public void setErrMsgList(ArrayList<String> errMsgList) {
		this.errMsgList = errMsgList;
	}


}
