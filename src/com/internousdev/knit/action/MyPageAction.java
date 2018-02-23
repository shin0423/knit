package com.internousdev.knit.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.knit.dao.MyPageDAO;
import com.internousdev.knit.dto.MyPageDTO;
import com.internousdev.knit.util.IdCheck;
import com.opensymphony.xwork2.ActionSupport;

public class MyPageAction extends ActionSupport implements SessionAware {

	/**
	 * ログイン状態確認
	 * 未ログインならhome画面へ返す。
	 * ログイン状態ならuserId取得。
	 * */

	//userId格納
	private String userId;

	//session情報格納
	private Map<String, Object> session;

	//ログイン情報格納
	private ArrayList<MyPageDTO> myPageList = new ArrayList<MyPageDTO>();

	//エラーメッセージ
	private String message;

	public String execute() throws SQLException {
		if(session.containsKey("userId")){
			IdCheck idCheck = new IdCheck();
			if(idCheck.checkUser(session.get("userId").toString())){
				return "errorPage";
			}
		}

		if(!(session.containsKey("userId"))) {

			setMessage("このサービスをご利用になるにはログインして下さい。");
		}
		String result = ERROR;

		if (session.containsKey("userId")) {

			userId = session.get("userId").toString();


			MyPageDAO dao = new MyPageDAO();

			myPageList = dao.getUserInfo(userId);

			if (myPageList.size() > 0) {

				result = SUCCESS;
			}
		}
		return result;
	}

	//session情報を取得するメソッド
	public Map<String, Object> getSession() {
		return session;
	}

	//session情報を格納するメソッド
	public void setSession1(Map<String, Object> session) {
		this.session = session;
	}
	/**
	 * ユーザー情報を取得するメソッド
	 * userIdを取得するメソッド
	*/
	public String getUserId() {
		return userId;
	}

	public ArrayList<MyPageDTO> getMyPageList() {
		return myPageList;
	}

	public void setMyPageList(ArrayList<MyPageDTO> myPageList) {
		this.myPageList = myPageList;
	}

	//userIdを格納するメソッド
	public void setUserId(String userId) {
		this.userId = userId;
	}

	//セッション情報を格納するメソッド
	public void setSession(Map<String, Object> arg0) {
		this.session = arg0;
	}

	//エラーメッセージを取得するメソッド
	public String getMessage() {
		return message;
	}

	//エラーメッセージを格納するメソッド
	public void setMessage(String message) {
		this.message = message;
	}

}
