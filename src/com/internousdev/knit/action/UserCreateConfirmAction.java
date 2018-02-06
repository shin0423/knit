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

	private String telNumber;

	private String userAddress;


	public Map<String,Object> session;

	private String errorMessage;

	public String execute(){
		String result = SUCCESS;

		if(userId.equals("")){
			setErrorMessage("ユーザーIDを入力してください。");
			result = ERROR;
		}else if(userId.length()<1 || userId.length()>8){
			setErrorMessage("ユーザーIDは1文字以上8文字以下で入力してください。");
			result = ERROR;
		}else if(!userId.matches("^[a-zA-Z0-9]+$")){
			setErrorMessage("ユーザーIDは半角英数字で入力してください。");
			result = ERROR;
		}else{
			session.put("userId", userId);
		}

		if(password.equals("")){
			setErrorMessage("パスワードを入力してください。");
			result = ERROR;
		}else if(password.length()<1 || password.length()>16){
			setErrorMessage("パスワードは1文字以上16文字以下で入力してください。");
			result = ERROR;
		}else if(!password.matches("^[a-zA-Z0-9]+$")){
			setErrorMessage("パスワードは半角英数字で入力してください。");
			result = ERROR;
		}else{
			session.put("password",password);
		}

		if(familyName.equals("")){
			setErrorMessage("姓を入力してください。");
			result = ERROR;
		}else if(familyName.length()<1 || familyName.length()>16){
			setErrorMessage("姓は1文字以上16文字以下で入力してください。");
			result = ERROR;
		}else if(!familyName.matches("^[a-zA-Zぁ-ゞ一-龠々ァ-ヶ]+$")){
			setErrorMessage("姓は半角英語、漢字、カタカナ及びひらがなで入力してください。");
			result = ERROR;
		}else{
			session.put("familyName", familyName);
		}

		if(firstName.equals("")){
			setErrorMessage("名を入力してください。");
			result = ERROR;
		}else if(firstName.length()<1 || firstName.length()>16){
			setErrorMessage("名は1文字以上16文字以下で入力してください。");
			result = ERROR;
		}else if(!firstName.matches("^[a-zA-Zぁ-ゞ一-龠々ァ-ヶ]+$")){
			setErrorMessage("名は半角英語、漢字、カタカナ及びひらがなで入力してください。");
			result = ERROR;
		}else{
			session.put("firstName", firstName);
		}

		if(familyNameKana.equals("")){
			setErrorMessage("姓ふりがなを入力してください。");
			result = ERROR;
		}else if(familyNameKana.length()<1 || familyNameKana.length()>16){
			setErrorMessage("姓ふりがなは1文字以上16文字以下で入力してください。");
			result = ERROR;
		}else if(!familyNameKana.matches("^[ぁ-ん]+$")){
			setErrorMessage("姓ふりがなはひらがなで入力してください。");
			result = ERROR;
		}else{
			session.put("familyNameKana", familyNameKana);
		}

		if(firstNameKana.equals("")){
			setErrorMessage("名ふりがなを入力してください。");
			result = ERROR;
		}else if(firstNameKana.length()<1 || firstNameKana.length()>16){
			setErrorMessage("名ふりがなは1文字以上16文字以下で入力してください。");
			result = ERROR;
		}else if(!firstNameKana.matches("^[ぁ-ん]+$")){
			setErrorMessage("名ふりがなはひらがなで入力してください。");
			result = ERROR;
		}else{
			session.put("firstNameKana", firstNameKana);
		}

		if(!(sex.equals(""))){
			session.put("sex", sex);
		}else{
			setErrorMessage("性別を入力してください。");
			result = ERROR;
		}

		if(email.equals("")){
			setErrorMessage("メールアドレスを入力してください。");
			result = ERROR;
		}else if(email.length()<14 || email.length()>32){
			setErrorMessage("メールアドレスは14文字以上32文字以下で入力してください。");
			result = ERROR;
		}else if(!email.matches("^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$")){
			setErrorMessage("メールアドレスは半角英数字及び半角記号で入力してください。");
			result = ERROR;
		}else{
			session.put("email", email);
		}


		 if(0<telNumber.length() && telNumber.length()<11 || telNumber.length()>13){
			setErrorMessage("電話番号は11文字以上13文字以下で入力してください。");
			result = ERROR;
		}else if(!telNumber.matches("^[0-9]+$")){
			setErrorMessage("電話番号は半角数字で入力してください。");
			result = ERROR;
		}else if(!(telNumber.equals(""))){
			session.put("telNumber", telNumber);
		}

		if(0<userAddress.length() && userAddress.length()<15 || userAddress.length()>50){
			setErrorMessage("住所は15文字以上50文字以下で入力してください。");
			result = ERROR;
		}else if(!userAddress.matches("^[a-zA-Z0-9ァ-ヴぁ-ん一-龠々!-~]+$")) {
		    setErrorMessage("住所は半角英数字、漢字、カタカナ及び半角記号で入力してください。");
			result = ERROR;
		}else if(!(userAddress.equals(""))){
				session.put("userAddress", userAddress);
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

	public String getErrorMessage(){
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage){
		this.errorMessage = errorMessage;
	}
}
