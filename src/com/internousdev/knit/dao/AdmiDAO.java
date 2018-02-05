package com.internousdev.knit.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.knit.util.DBConnector;


public class AdmiDAO {
	private DBConnector dbConnector=new DBConnector();
	private Connection connection=dbConnector.getConnection();

	public void insertAdminItemInfo(String productId,String productName,String productNameKana,String productDescription,String categoryId,String imageFilePath,String imageFileName,String releaseCompany) throws SQLException{
		String sql="INSERT INTO product_info (product_id,product_name,product_name_kana,product_description,category_id,image_file_path,image_file_name,release_company VALUE(?,?,?,?,?,?,?,?)";
		try{
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1,productId);
			preparedStatement.setString(2,productName);
			preparedStatement.setString(3,productNameKana);
			preparedStatement.setString(4,productDescription);
			preparedStatement.setString(5,categoryId);
			preparedStatement.setString(6,imageFilePath);
			preparedStatement.setString(7,imageFileName);
			preparedStatement.setString(8,releaseCompany);

			preparedStatement.execute();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			connection.close();
		}
	}


	public void insertAdminItemCount(int productStock,String productId) throws SQLException{
		String sql="UPDATE product_info set product_stock=? WHERE product_id=?";
		try{
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1,productStock);
			preparedStatement.setString(2, productId);

			preparedStatement.execute();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			connection.close();
		}
	}


	public void  deleteAdminItemInfo(String productId) throws SQLException{
		try{
			String sql="DELETE FROM product_info WHERE product_id=?";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1,productId);

			preparedStatement.execute();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			connection.close();
	}
	}
}
