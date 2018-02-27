package com.internousdev.knit.action;

import java.util.ArrayList;
import java.util.Map;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.knit.dao.UserCreateConfirmDAO;
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

	private String errorMessage;

	private String token;

	private ArrayList<String> errMsgList = new ArrayList<>();

	private UserCreateConfirmDAO userCreateConfirmDAO = new UserCreateConfirmDAO();

	public Map<String,Object> session;

//ユーザー情報が条件に合うかの確認と登録
	@SuppressWarnings("static-access")
	public String execute(){
		if(userCreateConfirmDAO.getUserId(userId)){
			setErrorMessage("入力されたIDがすでに使われています。");
			return ERROR;
		}

		//ランダム文字列を作るためにインスタンス化
		RandomStringUtils rndStr = new RandomStringUtils();
		token = rndStr.randomAlphabetic(10);
		System.out.println("トークン値"+token);
		setToken(token);
		session.put("token", token);
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

		if (!telNumber.equals("") ||!userAddress.equals("")) {

			if (!(telNumber.equals("")) &&(!userAddress.equals(""))){

			}else {
				errMsgList.add("電話番号と住所どちらも入力するか、どちらも未入力にしてください");
				return ERROR;
			}
		}

		if(!i.emailChk(email).equals("OK")){
			errMsgList.add(i.emailChk(email));
			result = ERROR;
		}else{
			session.put("createEmail", email);
		}

		if(!i.sexChk(sex).equals("OK")){
			errMsgList.add(i.sexChk(sex));
			result = ERROR;
		}else{
			session.put("createSex", sex);
		}

		if(!i.telNumber1Chk(telNumber).equals("OK")){
			errMsgList.add(i.telNumber1Chk(telNumber));
			result = ERROR;
		}else if(!(telNumber.equals(""))){
			session.put("createTelNumber", telNumber);
		}else{
			telNumber="未入力";
			session.put("createTelNumber", telNumber);
		}

		if(!i.userAddress1Chk(userAddress).equals("OK")){
			errMsgList.add(i.userAddress1Chk(userAddress));
			result = ERROR;
		}else if(!(userAddress.equals(""))){
			session.put("createUserAddress",userAddress);
		}else{
			userAddress="未入力";
			session.put("createUserAddress",userAddress);
		}

		return result;
	}

//セッターゲッターの設定
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

	public ArrayList<String> getErrMsgList() {
		return errMsgList;
	}

	public void setErrMsgList(ArrayList<String> errMsgList) {
		this.errMsgList = errMsgList;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

}
