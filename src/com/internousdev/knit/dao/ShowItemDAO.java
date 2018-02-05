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


	//コネクタ準備
	private DBConnector dbConnector = new DBConnector();

	private List<BuyItemDTO> buyItemList = new ArrayList<>();

	public List<BuyItemDTO> ShowItem(){


		Connection connection = dbConnector.getConnection();

		String sql ="SELECT * FROM `item_info";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			ResultSet resultSet = preparedStatement.executeQuery();

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

				System.out.println("--------MySQLから値を受け取れてるか確認------");
				System.out.println(buyItemDTO.getItemId());
				System.out.println(buyItemDTO.getItemName());
				System.out.println(buyItemDTO.getItemNameKana());
				System.out.println(buyItemDTO.getItemDescription());
				System.out.println(buyItemDTO.getCategoryId());
				System.out.println(buyItemDTO.getPrice());
				System.out.println(buyItemDTO.getItemStock());
				System.out.println(buyItemDTO.getItemImagePath());
				System.out.println(buyItemDTO.getItemImageName());
				System.out.println(buyItemDTO.getReleaseCompany());
				System.out.println(buyItemDTO.getReleaseCompany());
				System.out.println("------------------確認終了-------------------");
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}

		return buyItemList;

	}
}
