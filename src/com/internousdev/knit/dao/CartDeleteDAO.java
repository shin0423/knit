package com.internousdev.knit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.knit.util.DBConnector;

public class CartDeleteDAO {




	/**
	 * カート情報を全て削除
	 */

	public void deleteCartInfo(String userId) {
		DBConnector db=new DBConnector();
		Connection con=db.getConnection();
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
	public int deleteSeparate(String userId, String itemId) {
		DBConnector db=new DBConnector();
		Connection con=db.getConnection();
		String sql = "DELETE FROM cart_info WHERE user_id = ? AND item_id=?";
		int count = 0;
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, userId);
			ps.setString(2, itemId);

			count = ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();

		}
		try {
			con.close();

		} catch (SQLException e) {
			e.printStackTrace();

		}
		return count;
	}
}
