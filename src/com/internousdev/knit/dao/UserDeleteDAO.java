package com.internousdev.knit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.knit.util.DBConnector;

public class UserDeleteDAO {

	private DBConnector dbConnector=new DBConnector();
	private Connection connection = dbConnector.getConnection();

	//ユーザー情報テーブルからユーザー情報を削除
	public int deleteUserInfo(String user_id){
		String sql="DELETE FROM user_info WHERE user_id = ?";
		int result = 0;
		try{
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1,user_id);
			result = preparedStatement.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return result;
	}
	//ユーザーの住所情報を削除
	public int deleteUserDestinationInfo(String user_id){
		String sql="DELETE FROM destination_info WHERE user_id=?";
		int result = 0;
		try{
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1,user_id);
			result = preparedStatement.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return result;
	}

	//ユーザーのカート情報を削除
	public int deleteUserCartInfo(String user_id){
		String sql = "DELETE FROM cart_info WHERE user_id=?";
		int result = 0;
		try{
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1,user_id);
			result = preparedStatement.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return result;
	}
	//ユーザが書き込んだレビュー情報を削除
	public int deleteReviewInfo(String user_id){
		String sql="DELETE FROM review_transaction WHERE user_id=?";
		int result = 0;
		try{
			PreparedStatement preparedStatement =connection.prepareStatement(sql);
			preparedStatement.setString(1,user_id);
			result = preparedStatement.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return result;
		}
	//ユーザーが購入した商品の履歴を削除
	public int deletePurchaseHistory(String user_id){
		String sql="DELETE FROM purchase_history_info WHERE user_id=?";
		int result=0;
		try{
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1,user_id);
			result = preparedStatement.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return result;
	}
}
