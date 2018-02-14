package com.internousdev.knit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.knit.dto.CategoryDTO;
import com.internousdev.knit.util.DBConnector;

public class CategoryDAO {
	private List<CategoryDTO> categoryList= new ArrayList<>();
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

	public int insertCategoryName(String categoryName) throws SQLException{

		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();

		String sql="INSERT INTO m_category (categoryName) VALUES(?)";
		int res=0;
		try{
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
		}


	}
}
