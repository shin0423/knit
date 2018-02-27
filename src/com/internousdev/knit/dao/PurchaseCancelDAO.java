package com.internousdev.knit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.knit.dto.PurchaseHistoryDTO;
import com.internousdev.knit.util.DBConnector;

//購入キャンセル機能


public class PurchaseCancelDAO {


	//キャンセル可能な購入履歴表示メソッド[status:0で非表示,1で表示]

public ArrayList<PurchaseHistoryDTO> getPurchaseHistory(String userId) throws SQLException{

	DBConnector db = new DBConnector();
	Connection con = db.getConnection();
	ArrayList<PurchaseHistoryDTO> purchaseCancelDTOList = new ArrayList<PurchaseHistoryDTO>();

	String sql = "SELECT ubit.item_id, "
			+ "iit.item_name, "
			+ "iit.item_name_kana, "
			+ "iit.image_file_path, "
			+ "iit.release_company, "
			+ "iit.release_date, "
			+ "ubit.price, "
			+ "ubit.item_count, "
			+ "ubit.regist_date, "
			+ "ubit.order_num "
			+ "FROM purchase_history_info as ubit "
			+ "LEFT JOIN item_info as iit "
			+ "ON ubit.item_id = iit.item_id "
			+ "WHERE ubit.send_flg = 0 "
			+ "AND ubit.user_id = ? "
			+ "ORDER BY regist_date DESC ";

	try{
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1,userId);

		ResultSet rs = ps.executeQuery();
		while(rs.next()){
			if (!(rs.getString("item_name") == null)) {

			PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
			dto.setItemId(rs.getInt("item_id"));
			dto.setItemName(rs.getString("item_name"));
			dto.setItemNameKana(rs.getString("item_name_kana"));
			dto.setImageFilePath(rs.getString("image_file_path"));
			dto.setPrice(rs.getInt("price"));
			dto.setItemCount(rs.getInt("item_count"));
			dto.setRegistDate(rs.getString("regist_date"));
			dto.setOrderNum(rs.getString("order_num"));
			dto.setReleaseCompany(rs.getString("release_company"));
			dto.setReleaseDate(rs.getDate("release_date"));
			dto.setTotalPrice((rs.getInt("item_count")) * (rs.getInt("price")));

			purchaseCancelDTOList.add(dto);
			}
		}
	}catch(Exception e){
		e.printStackTrace();
	}finally{
		con.close();
	}return purchaseCancelDTOList;
}
	//購入キャンセルメソッド(個別キャンセル)[sendFlg:0で発送待機、1で発送キャンセル、2で発送開始]

public int cancelPart(String userId,int itemId,String orderNum) throws SQLException{
	DBConnector db = new DBConnector();
	Connection con = db.getConnection();
	String sql = "UPDATE purchase_history_info as ubit "
			+ "LEFT JOIN item_info as iit "
			+ "ON ubit.item_id = iit.item_id "
			+ "SET ubit.send_flg = 1, "
			+ "iit.item_stock = ubit.item_count + iit.item_stock "
			+ "WHERE ubit.send_flg = 0 "
			+ "AND ubit.user_id = ? "
			+ "AND iit.item_id = ? "
			+ "AND ubit.order_num = ? ";

	int resultcp = 0;

	try{
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1,userId);
		ps.setInt(2,itemId);
		ps.setString(3,orderNum);

		resultcp = ps.executeUpdate();

	}catch(SQLException e){
		e.printStackTrace();
	}finally{
		con.close();
	}
	return resultcp;
}

//商品発送状態切り替えメソッド send_flgを0から2(発送待機から発送済み状態へ)にします。

public int sendFlgChange(String userId) throws SQLException{
	DBConnector db = new DBConnector();
	Connection con = db.getConnection();
	String sql = "UPDATE purchase_history_info "
				+ "SET send_flg = 2 "
				+ "WHERE send_flg = 0 "
				+ "AND user_id = ? ";

	int resultsp = 0;

	try{
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1,userId);

		resultsp = ps.executeUpdate();

	}catch(SQLException e){
		e.printStackTrace();
	}finally{
		con.close();
	}
	return resultsp;
}

}
