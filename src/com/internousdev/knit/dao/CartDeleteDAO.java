package com.internousdev.knit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.knit.util.DBConnector;

public class CartDeleteDAO {

	private DBConnector db=new DBConnector();
	private Connection con=db.getConnection();


	/**
	 * カート情報を全て削除
	 */

	public void deleteCartInfo(String userId) {

		String sql="DELETE FROM cart_info WHERE user_id=?";

		try {
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, userId);
			ps.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		try {
			con.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * カート内の商品を１つずつ削除
	 */
	public void deleteSeparate(String userId, String itemId) {
		String sql = "DELETE FROM cart_info WHERE user_id = ? AND item_id=?";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, userId);
			ps.setString(2, itemId);

			ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();

		}
		try {
			con.close();

		} catch (SQLException e) {
			e.printStackTrace();

		}
	}
}
