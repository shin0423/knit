package com.internousdev.knit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.knit.dto.ReviewDTO;
import com.internousdev.knit.util.DBConnector;
import com.internousdev.knit.util.DateUtil;

public class ReviewDAO {

	/**
	 * 商品を購入したことあるか確認
	 * @param itemId
	 * @return
	 * @throws SQLException
	 */
	public boolean confirmPurchaseItemHistory(String userId, int itemId) throws SQLException {
		boolean result = false;
		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();

		String sql = "SELECT * FROM purchase_history_info WHERE user_id = ? AND item_id = ?";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, userId);
			preparedStatement.setInt(2, itemId);
			ResultSet resultSet = preparedStatement.executeQuery();

			if(resultSet.next()) {
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
	 * レビューコメント追加
	 * @param userId
	 * @param itemId
	 * @param review
	 * @param reviewBody
	 * @throws SQLException
	 */
	public void completeReview(String userId, int itemId, int review, String reviewBody) throws SQLException {
		DateUtil dateUtil = new DateUtil();
		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();

		String sql = "INSERT INTO review_transaction (user_id, item_id, review, review_body, insert_date) VALUES (?, ?, ?, ?, ?)";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, userId);
			preparedStatement.setInt(2, itemId);
			preparedStatement.setInt(3, review);
			preparedStatement.setString(4, reviewBody);
			preparedStatement.setString(5, dateUtil.getDate());
			int count = preparedStatement.executeUpdate();

			if (count > 0) {
				System.out.println(count + "件レビュー追加完了");
			} else {
				System.out.println("レビュー失敗");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			connection.close();
		}
	}

	public List<ReviewDTO> selectReviewAll(String item_id) throws SQLException{
		List<ReviewDTO> reviewList = new ArrayList<>();
		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();
		String sql="SELECT * FROM review_tranasaction rt JOIN user_info ui ON rt.user_id = ui.user_id WHERE item_id=?";

		try{
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1,item_id);
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()){
				ReviewDTO reviewDTO = new ReviewDTO();
				reviewDTO.setFirstName(resultSet.getString("first_name"));
				reviewDTO.setReview(resultSet.getInt("review"));
				reviewDTO.setReviewBody(resultSet.getString("review_body"));
				reviewDTO.setInsertDate(resultSet.getString("insert_date"));
				reviewList.add(reviewDTO);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			connection.close();
		}
		return reviewList;
	}
}
