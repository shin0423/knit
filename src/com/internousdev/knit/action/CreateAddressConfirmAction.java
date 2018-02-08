package com.internousdev.knit.action;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.knit.util.InputChecker;
import com.opensymphony.xwork2.ActionSupport;

public class CreateAddressConfirmAction extends ActionSupport implements SessionAware{

	private String familyName;
	private String firstName;
	private String familyNameKana;
	private String firstNameKana;
	private String email;
	private String telNumber;
	private String userAddress;
	private ArrayList<String> errMsgList = new ArrayList<>();

	private Map<String,Object> session;

	public String execute(){
		String result = SUCCESS;

		//  確認用プログラム

		System.out.println("CreateAddressConfirmAction--------------------");
		System.out.println(familyName);
		System.out.println(firstName);
		System.out.println(familyNameKana);
		System.out.println(firstNameKana);
		System.out.println(email);
		System.out.println(telNumber);
		System.out.println(userAddress);
		System.out.println("------------------------------------------");

		InputChecker i = new InputChecker();

		if(!i.familyNameChk(familyName).equals("OK")){
			errMsgList.add(i.familyNameChk(familyName));
			result = ERROR;
		}
		if(!i.firstNameChk(firstName).equals("OK")){
			errMsgList.add(i.firstNameChk(firstName));
			result = ERROR;
		}
		if(!i.familyNameKanaChk(familyNameKana).equals("OK")){
			errMsgList.add(i.familyNameKanaChk(familyNameKana));
			result = ERROR;
		}
		if(!i.firstNameKanaChk(firstNameKana).equals("OK")){
			errMsgList.add(i.firstNameKanaChk(firstNameKana));
			result = ERROR;
		}
		if(!i.emailChk(email).equals("OK")){
			errMsgList.add(i.emailChk(email));
			result = ERROR;
		}
		if(!i.telNumberChk(telNumber).equals("OK")){
			errMsgList.add(i.telNumberChk(telNumber));
			result = ERROR;
		}
		if(!i.userAddressChk(userAddress).equals("OK")){
			errMsgList.add(i.userAddressChk(userAddress));
			result = ERROR;
		}
		System.out.println("結果----->>>>"+result);
		return result;
	}

	public String getFamilyName() {
		return familyName;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public ArrayList<String> getErrMsgList() {
		return errMsgList;
	}

	public void setErrMsgList(ArrayList<String> errMsgList) {
		this.errMsgList = errMsgList;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}




}
