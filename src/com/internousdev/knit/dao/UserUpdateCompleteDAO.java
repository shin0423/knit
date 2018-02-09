package com.internousdev.knit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.knit.util.DBConnector;
import com.internousdev.knit.util.DateUtil;

public class UserUpdateCompleteDAO {
	private DBConnector dbConnector = new DBConnector();

	private Connection connection = dbConnector.getConnection();

	private DateUtil dateUtil = new DateUtil();

	public void userUpdate(String newPassword,String userId) throws SQLException{
		String sql = "UPDATE user_info SET password = ?, update_date = ? WHERE user_id = ? ";
		try{
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1,newPassword);
			preparedStatement.setString(2,dateUtil.getDate());
			preparedStatement.setString(3,userId);

			preparedStatement.execute();
		} catch (Exception e){
			e.printStackTrace();
		}finally{
			connection.close();
		}
	}

	public void userUpdate(String telNumber,String userAddress,String userId) throws SQLException{
		String sql = "UPDATE distination_info SET tel_number = ?,user_address = ?,update_date = ? WHERE user_id = ?";
		try{
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1,telNumber);
			preparedStatement.setString(2,userAddress);
			preparedStatement.setString(3,dateUtil.getDate());
			preparedStatement.setString(4,userId);

			preparedStatement.execute();
		} catch(Exception e){
			e.printStackTrace();;
		}finally{
			connection.close();
		}
	}
}
