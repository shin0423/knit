package com.internousdev.knit.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.knit.dao.UserCreateCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class UserCreateCompleteAction extends ActionSupport implements SessionAware{

	private String userId;
	private String password;
	private String familyName;
	private String firstName;
	private String familyNameKana;
	private String firstNameKana;
	private int sex;
	private String email;
	private String telNumber;
	private String userAddress;
	private String token;

	public Map<String,Object> session;

	public String execute() throws SQLException{
		if(!(token.equals(session.get("token").toString()))){
			return "errorPage";
		}
		String result = ERROR;
		//入力された値の確認
		System.out.println(userId);
		System.out.println(password);
		System.out.println(familyName);
		System.out.println(firstName);
		System.out.println(familyNameKana);
		System.out.println(firstNameKana);
		System.out.println(sex);
		System.out.println(email);
		System.out.println(telNumber);
		System.out.println(userAddress);


		int count1 = 0;
		int count2 = 0;
		UserCreateCompleteDAO dao = new UserCreateCompleteDAO();

		//ユーザー情報の登録
		count1 = dao.createUser1(session.get("createUserId").toString(),
				session.get("createPassword").toString(),
				session.get("createFamilyName").toString(),
				session.get("createFirstName").toString(),
				session.get("createFamilyNameKana").toString(),
				session.get("createFirstNameKana").toString(),
				Integer.parseInt(session.get("createSex").toString()),
				session.get("createEmail").toString()

				);

		if(count1 >0){
			count2 = dao.createUser2(session.get("createUserId").toString(),
				session.get("createFamilyName").toString(),
				session.get("createFirstName").toString(),
				session.get("createFamilyNameKana").toString(),
				session.get("createFirstNameKana").toString(),
				session.get("createEmail").toString(),
				session.get("createTelNumber").toString(),
				session.get("createUserAddress").toString()
				);
		}

		if(count2 >0){
			result=SUCCESS;
		}
		return result ;
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

	public String getFamilyNameKana(){
		return familyNameKana;
	}

	public void setFamilyNameKana(String familyNameKana){
		this.familyNameKana = familyNameKana;
	}

	public String getFirstNameKana(){
		return firstNameKana;
	}

	public void setFirstNameKana(String firstNameKana){
		this.firstNameKana = firstNameKana;
	}

	public int getSex(){
		return sex;
	}

	public void setSex(int sex){
		this.sex = sex;
	}

	public String getEmail(){
		return email;
	}

	public void setEmail(String email){
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

	@Override
	public void setSession(Map<String,Object> session){
		this.session = session;
	}
}
