package com.internousdev.knit.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.knit.util.IdCheck;
import com.opensymphony.xwork2.ActionSupport;

public class GoPurchaseHistoryAction extends ActionSupport implements SessionAware {


	public Map<String,Object> session;



	public String execute()throws SQLException{

		//ログインしてなければログインに飛ばす
		//それ以外は購入履歴画面へ
		if(session.containsKey("userId")){
			IdCheck idCheck = new IdCheck();
			if(idCheck.checkUser(session.get("userId").toString())){
				return "errorPage";
			}
		}
		String loginFlg = session.get("loginFlg").toString();

		String result = SUCCESS;

		if (!loginFlg.equals("true")) {
			return ERROR;
		}else{
			return result;}
		}


	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
	}