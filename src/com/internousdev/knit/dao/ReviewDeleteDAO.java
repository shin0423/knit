package com.internousdev.knit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.knit.util.DBConnector;

public class ReviewDeleteDAO {

	private DBConnector dbConnector = new DBConnector();
	private Connection connection = dbConnector.getConnection();

	public void reviewDelete(String userId, int itemId) throws SQLException {
		String sql = "DELETE FROM review_transaction WHERE user_id = ? AND item_id = ?";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, userId);
			preparedStatement.setInt(2, itemId);
			int count = preparedStatement.executeUpdate();

			System.out.println(itemId);

			if (count > 0) {
				System.out.println(count + "件削除成功");
			} else {
				System.out.println("削除失敗");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			connection.close();
		}
	}
}
