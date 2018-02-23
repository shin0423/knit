
	package com.internousdev.knit.util;

	import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.knit.dao.CheckUserDAO;
import com.opensymphony.xwork2.ActionSupport;

	public class IdCheck extends ActionSupport implements SessionAware{
		public Map<String,Object> session;
//ゆーざーIDが存在する場合falseない場合はtrueをかえす
		public boolean checkUser(String userId) throws SQLException{
				CheckUserDAO dao = new CheckUserDAO();
				boolean result = false;
				if(!(dao.checkUserID(userId))){
					result = true;
				}
				return result;
			}




		public void setSession(Map<String,Object> session){
			this.session=session;
		}
	}


