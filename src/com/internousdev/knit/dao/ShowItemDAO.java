package com.internousdev.knit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.knit.dto.BuyItemDTO;
import com.internousdev.knit.util.DBConnector;

public class ShowItemDAO {

	//作成者 小池

	//コネクタ準備
	private DBConnector dbConnector = new DBConnector();

	private List<BuyItemDTO> buyItemList = new ArrayList<>();



	public List<BuyItemDTO> ShowItem(){


		Connection connection = dbConnector.getConnection();

		//SQL文
		String sql ="SELECT item_id, item_name, item_name_kana, item_description, category_id, price, item_stock, image_file_path, image_file_name, release_company, release_date FROM item_info";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			//MySQLにsql文を送り値を受け取る
			ResultSet resultSet = preparedStatement.executeQuery();

			//MySQLから受け取った値をBuyItemDTOに入れる
			while (resultSet.next()) {
				BuyItemDTO buyItemDTO = new BuyItemDTO();
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
				buyItemList.add(buyItemDTO);

			}
		} catch (SQLException e) {

			e.printStackTrace();
		}

		return buyItemList;

	}
}
