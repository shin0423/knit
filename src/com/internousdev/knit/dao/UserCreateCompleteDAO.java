package com.internousdev.knit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.knit.util.DBConnector;
import com.internousdev.knit.util.DateUtil;

public class UserCreateCompleteDAO {
	private DBConnector dbConnector = new DBConnector();

	private Connection connection = dbConnector.getConnection();

	private DateUtil dateUtil = new DateUtil();

	public void cerateUser(String userId,String password,String familyName,String firstName,String familyNameKana,String firstNameKana,int sex,String email) throws SQLException{
		String sql = "INSERT INTO user_info (user_id,password,family_name,first_name,family_name_kana,first_name_kana,sex,email) VALUES(?,?,?,?,?,?,?,?)";
		try{
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1,userId);
			preparedStatement.setString(2,password);
			preparedStatement.setString(3,familyName);
			preparedStatement.setString(4,firstName);
			preparedStatement.setString(5,familyNameKana);
			preparedStatement.setString(6,firstNameKana);
			preparedStatement.setInt(7,sex);
			preparedStatement.setString(8,email);
			preparedStatement.setString(9,dateUtil.getDate());

			preparedStatement.execute();
		} catch (Exception e){
			e.printStackTrace();
		}finally{
			connection.close();
		}
	}

	public void cerateUser(String userId, String familyName,String firstName,String familyNameKana,String firstNameKana,String email,String telNumber,String userAddress) throws SQLException{
		String sql="INSERT INTO distination_info (user_id,family_name,first_name,family_name_kana,first_name_kana,email,tel_number,user_address) VALUES(?,?,?,?,?,?,?,?)";
		try{
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1,userId);
			preparedStatement.setString(2,familyName);
			preparedStatement.setString(3,firstName);
			preparedStatement.setString(4,familyNameKana);
			preparedStatement.setString(5,firstNameKana);
			preparedStatement.setString(6,email);
			preparedStatement.setString(7,telNumber);
			preparedStatement.setString(8,userAddress);
			preparedStatement.setString(9,dateUtil.getDate());

			preparedStatement.execute();
		} catch (Exception e){
			e.printStackTrace();
		}finally{
			connection.close();
		}
	}
}
