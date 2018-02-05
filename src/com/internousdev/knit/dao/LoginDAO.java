package com.internousdev.knit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.knit.dto.LoginDTO;
import com.internousdev.knit.util.DBConnector;

public class LoginDAO {

	private LoginDTO loginDTO = new LoginDTO();

	/**
	 *
	 * ユーザー情報取得
	 *
	 */
	public LoginDTO getUserInfo(String userId, String password) throws SQLException {
		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();

		String sql = "SELECT * FROM user_info WHERE user_id = ? AND password = ?";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, userId);
			preparedStatement.setString(2, password);
			ResultSet resultSet = preparedStatement.executeQuery();

			if(resultSet.next()) {
				loginDTO.setUserId(resultSet.getString("user_id"));
				loginDTO.setPassword(resultSet.getString("password"));
				loginDTO.setFamilyName(resultSet.getString("family_name"));
				loginDTO.setFirstName(resultSet.getString("first_name"));
				loginDTO.setFamilyNameKana(resultSet.getString("family_name_kana"));
				loginDTO.setFirstName(resultSet.getString("first_name_kana"));
				loginDTO.setEmail(resultSet.getString("email"));
				loginDTO.setAdminFlg(resultSet.getString("admin_flg"));

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			connection.close();
		}
		return loginDTO;
	}

	/**
	 *
	 * ログイン状況確認
	 *
	 */
	public boolean login(LoginDTO loginDTO) throws SQLException {
		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();
		boolean result = false;
		int updateCount = 0;

		String sql = "UPDATE user_info SET logined = 1 WHERE user_id = ?";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, loginDTO.getUserId());

			updateCount = preparedStatement.executeUpdate();

			if (updateCount > 0) {
				System.out.println("ログイン完了");
				result = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			connection.close();
		}

		return result;
	}

	/**
	 *
	 * ID存在確認
	 *
	 */

	public boolean getExistUserId (String userId) throws SQLException {
		boolean result = false;
		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();

		String sql = "SELECT * FROM user_info WHERE user_id = ?";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, userId);
			ResultSet resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) {
				result = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			connection.close();
		}

		return result;
	}
}
