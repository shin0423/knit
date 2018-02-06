package com.internousdev.knit.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.knit.util.DBConnector;


public class AdmiDAO {
	private DBConnector dbConnector=new DBConnector();
	private Connection connection=dbConnector.getConnection();

	public int insertAdminItemInfo(String itemId,String itemName,String itemNameKana,String itemDescription,String categoryId,String releaseCompany) throws SQLException{
		String sql="INSERT INTO item_info (item_id,item_name,item_name_kana,item_description,category_id,release_company) VALUE(?,?,?,?,?,?)";
		int test=0;
		try{
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1,itemId);
			preparedStatement.setString(2,itemName);
			preparedStatement.setString(3,itemNameKana);
			preparedStatement.setString(4,itemDescription);
			preparedStatement.setString(5,categoryId);
			preparedStatement.setString(6,releaseCompany);

			test=preparedStatement.executeUpdate();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			connection.close();
		}
		return test;
	}


	public void insertAdminItemCount(int totalStock,String itemId) throws SQLException{
		String sql="UPDATE item_info set item_stock=? WHERE item_id=?";
		try{
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1,totalStock);
			preparedStatement.setString(2, itemId);

			preparedStatement.execute();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			connection.close();
		}
	}


	public int  deleteAdminItemInfo(String itemId) throws SQLException{
		String sql="DELETE FROM item_info WHERE item_id=?";
		int result=0;
		try{
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1,itemId);

			result=preparedStatement.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			connection.close();
		}
		return result;
	}
}
