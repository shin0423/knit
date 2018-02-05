package com.internousdev.knit.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

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

	/*
	private String telNumber;

	private String userAddress;
	 */

	public Map<String,Object> session;

	private String errorMassage;

	public String execute(){
		String result = SUCCESS;

		if(!(userId.equals(""))){
			session.put("userId", userId);
		}else if(userId.equals("")){
			setErrorMassage("ユーザーIDを入力してください。");
			result = ERROR;
		}else if(userId.length()<1 || userId.length()>8){
			setErrorMassage("ユーザーIDは1文字以上8文字以下で入力してください。");
			result = ERROR;
		}else if(userId.matches("^[a-zA-Z0-9]+$")){
			setErrorMassage("ユーザーIDは半角英数字で入力してください。");
			result = ERROR;
		}

		if(!(password.equals(""))){
			session.put("password",password);
		}else if(password.equals("")){
			setErrorMassage("パスワードを入力してください。");
			result = ERROR;
		}else if(password.length()<1 || password.length()>16){
			setErrorMassage("パスワードは1文字以上16文字以下で入力してください。");
			result = ERROR;
		}else if(password.matches("^[a-zA-Z0-9]+$")){
			setErrorMassage("パスワードは半角英数字で入力してください。");
			result = ERROR;
		}

		if(!(familyName.equals(""))){
			session.put("familyName", familyName);
		}else if(familyName.equals("")){
			setErrorMassage("姓を入力してください。");
			result = ERROR;
		}else if(familyName.length()<1 || familyName.length()>16){
			setErrorMassage("姓は1文字以上16文字以下で入力してください。");
			result = ERROR;
		}else if(familyName.matches("^[a-zA-Zぁ-ゞ一-龠々ァ-ヶ]+$")){
			setErrorMassage("姓は半角英語、漢字、カタカナ及びひらがなで入力してください。");
			result = ERROR;
		}

		if(!(firstName.equals(""))){
			session.put("firstName", firstName);
		}else if(firstName.equals("")){
			setErrorMassage("名を入力してください。");
			result = ERROR;
		}else if(firstName.length()<1 || firstName.length()>16){
			setErrorMassage("名は1文字以上16文字以下で入力してください。");
			result = ERROR;
		}else if(firstName.matches("^[a-zA-Zぁ-ゞ一-龠々ァ-ヶ]+$")){
			setErrorMassage("名は半角英語、漢字、カタカナ及びひらがなで入力してください。");
			result = ERROR;
		}

		if(!(familyNameKana.equals(""))){
			session.put("familyNameKana", familyNameKana);
		}else if(familyNameKana.equals("")){
			setErrorMassage("姓ふりがなを入力してください。");
			result = ERROR;
		}else if(familyNameKana.length()<1 || familyNameKana.length()>16){
			setErrorMassage("姓ふりがなは1文字以上16文字以下で入力してください。");
			result = ERROR;
		}else if(familyNameKana.matches("^[ぁ-ん]+$")){
			setErrorMassage("姓ふりがなはひらがなで入力してください。");
			result = ERROR;
		}

		if(!(firstNameKana.equals(""))){
			session.put("firstNameKana", firstNameKana);
		}else if(firstNameKana.equals("")){
			setErrorMassage("名ふりがなを入力してください。");
			result = ERROR;
		}else if(firstNameKana.length()<1 || firstNameKana.length()>16){
			setErrorMassage("名ふりがなは1文字以上16文字以下で入力してください。");
			result = ERROR;
		}else if(firstNameKana.matches("^[ぁ-ん]+$")){
			setErrorMassage("名ふりがなはひらがなで入力してください。");
			result = ERROR;
		}

		if(!(sex.equals(""))){
			session.put("sex", sex);
		}else{
			setErrorMassage("性別を入力してください。");
			result = ERROR;
		}

		if(!(email.equals(""))){
			session.put("email", email);
		}else if(email.equals("")){
			setErrorMassage("メールアドレスを入力してください。");
			result = ERROR;
		}else if(email.length()<14 || email.length()>32){
			setErrorMassage("メールアドレスは14文字以上32文字以下で入力してください。");
			result = ERROR;
		}else if(email.matches("^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$")){
			setErrorMassage("メールアドレスは半角英数字及び半角記号で入力してください。");
			result = ERROR;
		}

		/*
		 if(!(telNumber.equals(""))){
			session.put("telNumber", telNumber);
		}
		if(!(userAddress.equals(""))){
				session.put("userAddress", userAddress);
		}
		*/
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

	public String getFamilyNameKana(){
		return familyNameKana;
	}

	public void setFamilyNamaKana(String familyNameKana){
		this.familyNameKana = familyNameKana;
	}

	public String getFirstNamaKana(){
		return firstNameKana;
	}

	public void setFristNameKana(String firstNameKana){
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
/*
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
*/
	@Override
	public void setSession(Map<String,Object> session){
		this.session=session;
	}

	public String getErrorMassage(){
		return errorMassage;
	}

	public void setErrorMassage(String errorMassage){
		this.errorMassage = errorMassage;
	}
}
