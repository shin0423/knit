package com.internousdev.knit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.knit.util.DBConnector;
import com.internousdev.knit.util.DateUtil;

public class AdmiDAO {
	private DBConnector dbConnector = new DBConnector();
	private Connection connection = dbConnector.getConnection();
	private DateUtil dateUtil = new DateUtil();

	//商品情報の追加
	public int insertAdminItemInfo(String itemId, String itemName, String itemNameKana, String itemDescription,
			String categoryId, String price, String releaseCompany, String itemStock) throws SQLException {
		Connection connection = dbConnector.getConnection();
		String sql = "INSERT INTO item_info (item_id,item_name,item_name_kana,item_description,category_id,price,release_company,item_stock,release_date,status,regist_date,update_date) VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
		int res = 0;
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, itemId);
			preparedStatement.setString(2, itemName);
			preparedStatement.setString(3, itemNameKana);
			preparedStatement.setString(4, itemDescription);
			preparedStatement.setString(5, categoryId);
			preparedStatement.setString(6, price);
			preparedStatement.setString(7, releaseCompany);
			preparedStatement.setString(8, itemStock);
			preparedStatement.setString(9, dateUtil.getDate());
			preparedStatement.setString(10, "1");
			preparedStatement.setString(11, dateUtil.getDate());
			preparedStatement.setString(12, dateUtil.getDate());
			res = preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			connection.close();
		}
		return res;
	}

	//商品在庫の追加
	public int insertAdminItemCount(int totalStock, String itemId) throws SQLException {
		String sql = "UPDATE item_info set item_stock=?,update_date=? WHERE item_id=?";
		int res = 0;
		String totalStock1 = String.valueOf(totalStock);
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			System.out.println(totalStock);
			preparedStatement.setString(1, totalStock1);
			preparedStatement.setString(2, dateUtil.getDate());
			preparedStatement.setString(3, itemId);
			System.out.println("YES");
			res = preparedStatement.executeUpdate();
			System.out.println(res);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			connection.close();
		}
		return res;
	}

	//商品の削除
	public int deleteAdminItemInfo(String itemId) throws SQLException {
		String sql = "DELETE FROM item_info WHERE item_id=?";
		int res = 0;
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, itemId);
			res = preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			connection.close();
		}
		return res;
	}
}
