package com.internousdev.knit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.internousdev.knit.dto.SettlementConfirmDTO;
import com.internousdev.knit.util.DBConnector;;

public class SettlementConfirmDAO {

	private DBConnector db = new DBConnector();
	private Connection con = db.getConnection();


	//宛先情報の取得
	public ArrayList<SettlementConfirmDTO> getDestinationInfo(String userId) {

		ArrayList<SettlementConfirmDTO> destinationList = new ArrayList<SettlementConfirmDTO>();
		String sql = ""
				+ "SELECT id, user_id,family_name,first_name,family_name_kana,first_name_kana,email,tel_number,user_address "
				+ "FROM destination_info "
				+ "where user_id = ?";


		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, userId);

			ResultSet resultSet = ps.executeQuery();

			while(resultSet.next()) {
				SettlementConfirmDTO settlementConfirmDTO = new SettlementConfirmDTO();

				if ((resultSet.getString("tel_number").equals("未入力"))||((resultSet.getString("user_address").equals("未入力")))) {

				}else{
				settlementConfirmDTO.setId(resultSet.getInt("id"));
				settlementConfirmDTO.setUserId(resultSet.getString("user_id"));
				settlementConfirmDTO.setFamilyName(resultSet.getString("family_name"));
				settlementConfirmDTO.setFirstName(resultSet.getString("first_name"));
				settlementConfirmDTO.setFamilyNameKana(resultSet.getString("family_name_kana"));
				settlementConfirmDTO.setFirstNameKana(resultSet.getString("first_name_kana"));
				settlementConfirmDTO.setEmail(resultSet.getString("email"));
				settlementConfirmDTO.setTelNumber(resultSet.getString("tel_number"));
				settlementConfirmDTO.setUserAddress(resultSet.getString("user_address"));
				destinationList.add(settlementConfirmDTO);
			}


			}

		} catch(Exception e) {
			e.printStackTrace();
		}

		return destinationList;
	}



//	//在庫情報取得
//	public int getCount(int itemId){
//		int count = 0;
//		String sql="SELECT count FROM item_info where item_id=?";
//		try{
//			PreparedStatement preparedStatement=con.prepareStatement(sql);
//			preparedStatement.setInt(1, itemId);
//			ResultSet resultSet=preparedStatement.executeQuery();
//			if(resultSet.next()){
//				count=resultSet.getInt("count");
//			}
//		}catch(SQLException e){
//			e.printStackTrace();
//		}
//		return count;
//	}
//
//	//カート内商品購入個数変更
//	public void updateBuyCount(String userId,int itemId,int count){
//		String sql="UPDATE cart_info SET item_count=? WHERE user_id=? AND item_id=?";
//		try {
//			PreparedStatement preparedStatement = con.prepareStatement(sql);
//			preparedStatement.setInt(1, count);
//			preparedStatement.setString(2, userId);
//			preparedStatement.setInt(3, itemId);
//			preparedStatement.executeUpdate();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//	}
//
//	//カートテーブル合計金額変更
//	public void updateTotalPrice(String userId,int itemId,int count, int price){
//		String sql="UPDATE cart_info SET total_price=? WHERE user_id=? AND product_id=?";
//		try {
//			PreparedStatement preparedStatement = con.prepareStatement(sql);
//			preparedStatement.setInt(1, count*price);
//			preparedStatement.setString(2, userId);
//			preparedStatement.setInt(3, itemId);
//			preparedStatement.executeUpdate();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//	}
//
//	//非ログインカート内商品購入個数変更
//	public void noLoginUpdateBuyCount(String tempUserId,int itemId,int count){
//		String sql="UPDATE cart_info SET item_count=? WHERE temp_user_id=? AND item_id=?";
//		try {
//			PreparedStatement preparedStatement = con.prepareStatement(sql);
//			preparedStatement.setInt(1, count);
//			preparedStatement.setString(2, tempUserId);
//			preparedStatement.setInt(3, itemId);
//			preparedStatement.executeUpdate();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//	}
//
//	//非ログインカートテーブル合計金額変更
//	public void noLoginUpdateTotalPrice(String tempUserId,int itemId,int count, int price){
//		String sql="UPDATE cart_info SET total_price=? WHERE temp_user_id=? AND item_id=?";
//		try {
//			PreparedStatement preparedStatement = con.prepareStatement(sql);
//			preparedStatement.setInt(1, count*price);
//			preparedStatement.setString(2, tempUserId);
//			preparedStatement.setInt(3, itemId);
//			preparedStatement.executeUpdate();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//	}

}