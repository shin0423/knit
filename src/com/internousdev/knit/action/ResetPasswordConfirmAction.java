package com.internousdev.knit.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.knit.dao.ResetPasswordDAO;
import com.opensymphony.xwork2.ActionSupport;

public class ResetPasswordConfirmAction extends ActionSupport implements SessionAware{
	//ログインID
	private String userId;

	//新規パスワード
	private String newPassword;

	//確認パスワード
	private String conPassword;

	//パスワード再設定のエラーメッセージを格納
	public String passwordErrorMessage;

	private String hideUserId;
	private String hideNewLoginPassword;

	//DAOのインスタンス化
	private ResetPasswordDAO resetPasswordDAO = new ResetPasswordDAO();

	//ログインIDと新規パスワードを格納
	public Map<String,Object> session;

	public String execute(){

		//一致するIDがDBにあるか
		if(!resetPasswordDAO.getUserId(userId)){
			passwordErrorMessage = "入力されたIDが異なります。";
			return ERROR;
		}

		//パスワードが適切なものかどうか
		if(newPassword.equals("")){
			passwordErrorMessage="パスワードを入力してください。";
			return ERROR;
		}else if(newPassword.length() < 4 || newPassword.length() > 16){
			passwordErrorMessage="パスワードは4文字以上16文字以下で入力してください。";
			return ERROR;
		}else if(!newPassword.matches("^[a-zA-Z0-9]+$")){
			passwordErrorMessage="パスワードは半角英数字で入力してください。";
			return ERROR;
		}

		/*String result = "OK";
		if(newPassword.equals("")){
			result="パスワードを入力してください。";

		}else if(newPassword.length() <4 || newPassword.length() > 16){
			result="パスワードは4文字以上16文字以下で入力してください。";

		}else if(!newPassword.matches("^[a-zA-Z0-9]+$")){
			result = "パスワードは半角英数字で入力してください。";

		return result;

		}*/

		//新規パスワードと確認パスワードを比較
		if(newPassword.equals(conPassword)){

			/*
			 * sessionに一部隠したIDとloginPasswordを保存
			 * resetPasswordDAO.hideString(加工する文字列、抽出文字の開始位置、抽出文字の終了位置)
			 * 先頭二文字を残し、*に差し替える
			 */

			hideUserId = resetPasswordDAO.hideString(userId,0,2);
			hideNewLoginPassword = resetPasswordDAO.hideString(newPassword,0,2);

			return SUCCESS;
		}else {
			passwordErrorMessage = "入力された確認パスワードが異なります。";
			return ERROR;
		}

		}

	//ログインIDのゲッターセッター
	public String getUserId(){
		return userId;
	}
	public void setUserId(String userId){
		this.userId=userId;
	}

	//新規パスワードのゲッターセッター
	public String getNewPassword(){
		return newPassword;
	}
	public  void setNewPassword(String newPassword){
		this.newPassword=newPassword;
	}

	//確認パスワードのゲッターセッター
	public String getConPassword(){
		return conPassword;
	}
	public void setConPassword(String conPassword){
		this.conPassword = conPassword;
	}

	@Override
	public void setSession(Map<String,Object>session){
		this.session = session;
	}
	public String getHideUserId(){
		return hideUserId;
	}
	public void setHideUserId(String hideUserId){
		this.hideUserId = hideUserId;
	}

	public String getHideNewLoginPassword(){
		return hideNewLoginPassword;
	}
	public void setHideNewLoginPassword(String hideNewLoginPassword){
		this.hideNewLoginPassword = hideNewLoginPassword;
	}
}

