package com.internousdev.knit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.knit.dto.UserUpdateDTO;
import com.internousdev.knit.util.DBConnector;
import com.opensymphony.xwork2.ActionSupport;

public class UserCreateConfirmDAO extends ActionSupport implements SessionAware{
	private DBConnector dbConnector = new DBConnector();
	private Connection connection = dbConnector.getConnection();
	public Map<String,Object> session;
	UserUpdateDTO userUpdateDTO = new UserUpdateDTO();
	public boolean getUserId(String userId){
		//ユーザーIDの取得
		String sql = "SELECT * FROM user_info where user_id=?";
        //ユーザーIDの確認
		try{
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, userId);

			ResultSet rs = ps.executeQuery();
			if(rs.next()){
				userUpdateDTO.setUserId(rs.getString("user_id"));
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
