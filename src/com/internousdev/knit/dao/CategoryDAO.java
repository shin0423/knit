package com.internousdev.knit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.knit.dto.CategoryDTO;
import com.internousdev.knit.util.DBConnector;
import com.internousdev.knit.util.DateUtil;

public class CategoryDAO {
	private List<CategoryDTO> categoryList= new ArrayList<>();
	private DateUtil dateUtil = new DateUtil();

	public List<CategoryDTO> getCategoryList() throws SQLException{

		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();

		String sql = "SELECT * FROM m_category";
		try{
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()){
				CategoryDTO categoryDTO = new CategoryDTO();
				categoryDTO.setId(resultSet.getString("id"));
				categoryDTO.setCategoryId(resultSet.getString("category_id"));
				categoryDTO.setCategoryName(resultSet.getString("category_name"));
				categoryDTO.setCategoryDescription(resultSet.getString("category_description"));
				categoryList.add(categoryDTO);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			connection.close();
		}
		return categoryList;
	}

	public void insertCategoryName(String categoryId,String categoryName,String categoryDescription) throws SQLException{

		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();

		String sql="INSERT INTO m_category (category_id,category_name,category_description,insert_date) VALUES(?,?,?,?)";
		try{
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1,categoryId);
			preparedStatement.setString(2, categoryName);
			preparedStatement.setString(3,categoryDescription);
			preparedStatement.setString(4, dateUtil.getDate());

			preparedStatement.execute();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			connection.close();
		}


	}

	public int deleteCategory(String categoryId) throws SQLException{
		DBConnector dbConnector=new DBConnector();
		Connection connection=dbConnector.getConnection();

		String sql="DELETE FROM m_category WHERE category_id=?";
		int res=0;
		try{
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1,categoryId);
			res=preparedStatement.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			connection.close();
		}
		return res;
	}
}
