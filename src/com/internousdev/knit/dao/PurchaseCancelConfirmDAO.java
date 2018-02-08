package com.internousdev.knit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.knit.dto.PurchaseHistoryDTO;
import com.internousdev.knit.util.DBConnector;

//購入履歴表示
//購入履歴削除
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
			+ "ubit.price, "
			+ "ubit.item_count, "
			+ "ubit.regist_date "
			+ "FROM purchase_history_info as ubit "
			+ "LEFT JOIN item_info as iit "
			+ "ON ubit.item_id = iit.item_id "
			+ "WHERE ubit.send_flg = 0 "
			+ "AND ubit.user_id = ? "
			+ "AND ubit.order_num = ? "
			+ "AND ubit.item_id = ?"
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
			dto.setimageFilePath(rs.getString("image_file_name"));
			dto.setPrice(rs.getInt("price"));
			dto.setItemCount(rs.getInt("item_count"));
			dto.setRegistDate(rs.getString("regist_date"));
			dto.setOrderNum(rs.getString("order_num"));
			dto.setStatus(rs.getInt("status"));
			dto.setsendFlg(rs.getInt("sendFlg"));

			purchaseCancelConfirmDTOList.add(dto);

		}
	}catch(Exception e){
		e.printStackTrace();
	}finally{
		con.close();
	}return purchaseCancelConfirmDTOList;
}


	//購入キャンセルメソッド(個別キャンセル)[sendFlg:0で発送待機、1で発送キャンセル、2で発送開始]

public int cancelPart(String userId,int itemId,String orderNum) throws SQLException{
	DBConnector db = new DBConnector();
	Connection con = db.getConnection();
	String sql = "UPDATE SET ubit.send_flg = 1, "
				+ "iit.item_stock = iit.item_count + ubit.item_stock "
				+ "FROM purchase_history_info as ubit "
				+ "LEFT JOIN item_info as iit "
				+ "ON ubit.item_id = iit.item_id "
				+ "WHERE send_flg = 0 "
				+ "AND user_id = ? "
				+ "AND item_id = ? "
				+ "AND order_num = ? ";

	int resultcp = 0;

	try{
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1,userId);
		ps.setInt(2,itemId);
		ps.setString(3,orderNum);

		resultcp = ps.executeUpdate();
		System.out.println(resultcp);

	}catch(SQLException e){
		e.printStackTrace();
	}finally{
		con.close();
	}
	return resultcp;
}

}