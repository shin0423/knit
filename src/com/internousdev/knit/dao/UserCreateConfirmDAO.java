package com.internousdev.knit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.internousdev.knit.dto.UserUpdateDTO;
import com.internousdev.knit.util.DBConnector;

public class UserCreateConfirmDAO{
	private DBConnector dbConnector = new DBConnector();
	private Connection connection = dbConnector.getConnection();
	UserUpdateDTO userUpdateDTO = new UserUpdateDTO();
	public boolean getUserId(String userId){
		//ユーザーIDの取得
		String sql = "SELECT user_id FROM user_info where user_id=?";
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

}
