package com.internousdev.knit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.knit.dto.UserUpdateDTO;
import com.internousdev.knit.util.DBConnector;
import com.opensymphony.xwork2.ActionSupport;

public class UserUpdateConfirmDAO extends ActionSupport implements SessionAware{
	private DBConnector dbConnector = new DBConnector();
	private Connection connection = dbConnector.getConnection();
	public Map<String,Object> session;
	UserUpdateDTO userUpdateDTO = new UserUpdateDTO();

	public boolean getPassword(String password){
		//パスワードの取得
		String sql = "SELECT * FROM user_info where password=?";
//パスワードの確認
		try{
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, password);

			ResultSet rs = ps.executeQuery();
			if(rs.next()){
				userUpdateDTO.setPassword(rs.getString("password"));
				return true;
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}

	public Map<String,Object> getSession(){
		return session;
	}

	@Override
	public void setSession(Map<String,Object>session){
		this.session=session;
	}
}
