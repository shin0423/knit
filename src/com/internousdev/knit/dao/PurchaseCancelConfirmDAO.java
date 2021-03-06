package com.internousdev.knit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.knit.dto.PurchaseHistoryDTO;
import com.internousdev.knit.util.DBConnector;

//購入キャンセル機能


public class PurchaseCancelConfirmDAO {

	//キャンセルしようとしている購入履歴単体を表示するメソッド[send_flg: 0で発送待機、1で発送キャンセル、2で発送済]

	public ArrayList<PurchaseHistoryDTO> getPurchaseHistory(String userId , String orderNum, int itemId) throws SQLException{

		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		ArrayList<PurchaseHistoryDTO> purchaseCancelConfirmDTOList = new ArrayList<PurchaseHistoryDTO>();

		String sql = "SELECT ubit.id , "
				+ "iit.item_name, "
				+ "iit.item_name_kana, "
				+ "iit.image_file_path, "
				+ "iit.release_company, "
				+ "iit.release_date, "
				+ "ubit.price, "
				+ "ubit.item_count, "
				+ "ubit.regist_date "
				+ "FROM purchase_history_info as ubit "
				+ "LEFT JOIN item_info as iit "
				+ "ON ubit.item_id = iit.item_id "
				+ "WHERE ubit.send_flg = 0 "
				+ "AND ubit.user_id = ? "
				+ "AND ubit.order_num = ? "
				+ "AND ubit.item_id = ? "
				+ "ORDER BY regist_date DESC ";

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1,userId);
			ps.setString(2,orderNum);
			ps.setInt(3,itemId);

			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
				dto.setId(rs.getInt("id"));
				dto.setItemName(rs.getString("item_name"));
				dto.setItemNameKana(rs.getString("item_name_kana"));
				dto.setImageFilePath(rs.getString("image_file_path"));
				dto.setPrice(rs.getInt("price"));
				dto.setItemCount(rs.getInt("item_count"));
				dto.setRegistDate(rs.getString("regist_date"));
				dto.setReleaseCompany(rs.getString("release_company"));
				dto.setReleaseDate(rs.getDate("release_date"));
				dto.setTotalPrice((rs.getInt("item_count")) * (rs.getInt("price")));
				dto.setUserId(userId);
				dto.setOrderNum(orderNum);
				dto.setItemId(itemId);
				purchaseCancelConfirmDTOList.add(dto);

			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			con.close();
		}return purchaseCancelConfirmDTOList;
	}

}
