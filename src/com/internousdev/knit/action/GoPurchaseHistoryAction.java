package com.internousdev.knit.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class GoPurchaseHistoryAction extends ActionSupport implements SessionAware {


	public Map<String,Object> session;



	public String execute()throws SQLException{

		//ログインしてなければログインに飛ばす
		//それ以外は購入履歴画面へ

		String loginFlg = session.get("loginFlg").toString();

		String result = SUCCESS;

		if (!loginFlg.equals("true")) {
			return ERROR;
		}else{
			return result;}
		}


	@Override
	public void setSession(Map<String, Object> arg0) {
		// TODO 自動生成されたメソッド・スタブ
	}
	}