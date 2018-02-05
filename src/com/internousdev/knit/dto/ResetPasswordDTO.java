package com.internousdev.knit.dto;

public class ResetPasswordDTO {
	//ログインID
	private String userId;

	//新規パスワード
	private String newPassword;

	//確認パスワード
	private String conPassword;

	//hideログインID
	private String hideUserId;

	//hide確認パスワード
	private String hideNewLoginPassword;

	//ログインIDのゲッターセッター
	public String getLoginId(){
		return userId;
	}
	public void setLoginId(String userId){
		this.userId=userId;
	}

	//新規パスワードのゲッターセッター
	public String getNewPassword(){
		return newPassword;
	}
	public void setNewPassword(String newPassword){
		this.newPassword=newPassword;
	}

	//確認パスワードのゲッターセッター
	public String getConPassword(){
		return conPassword;
	}
	public void setConPassword(String conPassword){
		this.conPassword=conPassword;
	}

	//hideログインIDのゲッターセッター
	public String getHideUserId(){
		return hideUserId;
	}
	public void setHideUserId(String hideUserId){
		this.hideUserId=hideUserId;
	}

	//hide確認パスワードのゲッターセッター
	public String getHideNewLoginPassword(){
		return hideNewLoginPassword;
	}
	public void setHideNewLoginPassword(String hideNewLoginPassword){
		this.hideNewLoginPassword=hideNewLoginPassword;
	}

}
