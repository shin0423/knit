package com.internousdev.knit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.knit.dto.BuyItemDTO;
import com.internousdev.knit.util.DBConnector;

public class BuyItemInfoDAO {


	public BuyItemDTO selectBuyItemInfo(String item_id) throws SQLException{
		String sql="SELECT * FROM item_info WHERE item_id=?";
		DBConnector dbConnector=new DBConnector();
		BuyItemDTO buyItemDTO = new BuyItemDTO();
		Connection connection = dbConnector.getConnection();


		try{
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1,item_id);
			ResultSet resultSet=preparedStatement.executeQuery();

			if(resultSet.next()){
				buyItemDTO.setItemId(resultSet.getInt("item_id"));
				buyItemDTO.setItemName(resultSet.getString("item_name"));
				buyItemDTO.setItemNameKana(resultSet.getString("item_name_kana"));
				buyItemDTO.setItemDescription(resultSet.getString("item_description"));
				buyItemDTO.setCategoryId(resultSet.getInt("category_id"));
				buyItemDTO.setPrice(resultSet.getInt("price"));
				buyItemDTO.setItemStock(resultSet.getInt("item_stock"));
				buyItemDTO.setItemImagePath(resultSet.getString("image_file_path"));
				buyItemDTO.setItemImageName(resultSet.getString("image_file_name"));
				buyItemDTO.setReleaseCompany(resultSet.getString("release_company"));
				buyItemDTO.setReleaseDate(resultSet.getString("release_date"));
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			connection.close();
		}
		return buyItemDTO;
	}

	public List<BuyItemDTO> categoryItemSelect(int category_id,int item_id) throws SQLException{
		String sql="SELECT * FROM item_info WHERE category_id=? AND item_id NOT IN('"+item_id+"') ORDER BY RAND() LIMIT 3";
		DBConnector dbConnector=new DBConnector();
		List<BuyItemDTO> categoryItemList = new ArrayList<>();
		Connection connection = dbConnector.getConnection();
		try{
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1,category_id);
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()){
				BuyItemDTO buyItemDTO = new BuyItemDTO();
				buyItemDTO.setItemImagePath(resultSet.getString("image_file_path"));
				buyItemDTO.setItemName(resultSet.getString("item_name"));
				buyItemDTO.setItemId(resultSet.getInt("item_id"));
				categoryItemList.add(buyItemDTO);
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}finally{
			connection.close();
		}
		return categoryItemList;
	}

	public List<BuyItemDTO> itemCheck() throws SQLException{
		String sql="SELECT * FROM item_info";
		DBConnector dbConnector=new DBConnector();
		List<BuyItemDTO> ItemCheckList = new ArrayList<>();
		Connection connection = dbConnector.getConnection();
		try{
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()){
				BuyItemDTO dto = new BuyItemDTO();
				dto.setItemId(resultSet.getInt("item_id"));
				ItemCheckList.add(dto);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			connection.close();
		}
		return ItemCheckList;

	}

}
