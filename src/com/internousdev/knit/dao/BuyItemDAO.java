package com.internousdev.knit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.knit.dto.BuyItemDTO;
import com.internousdev.knit.util.DBConnector;

public class BuyItemDAO {
	private DBConnector dbConnector = new DBConnector();
	private List<BuyItemDTO> buyItemList = new ArrayList<>();

	public List<BuyItemDTO> selectItem(String searchWord) throws SQLException{
		Connection connection = dbConnector.getConnection();
		String sql="SELECT * FROM item_info WHERE "+searchWord;
		try{
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		ResultSet resultSet= preparedStatement.executeQuery();
		while(resultSet.next()){
			BuyItemDTO buyItemDTO = new BuyItemDTO();
			buyItemDTO.setItemId(resultSet.getInt("item_id"));
			buyItemDTO.setItemName(resultSet.getString("item_name"));
			buyItemDTO.setItemDescription(resultSet.getString("item_description"));
			buyItemDTO.setCategoryId(resultSet.getInt("category_id"));
			buyItemDTO.setPrice(resultSet.getInt("price"));
			buyItemDTO.setItemStock(resultSet.getInt("item_stock"));
			buyItemDTO.setItemImagePath(resultSet.getString("image_file_path"));
			buyItemDTO.setItemImageName(resultSet.getString("image_file_name"));
			buyItemDTO.setReleaseCompany(resultSet.getString("release_company"));
			buyItemDTO.setReleaseDate(resultSet.getString("release_date"));
			buyItemList.add(buyItemDTO);

		}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			connection.close();
		}
		return buyItemList;
	}

}