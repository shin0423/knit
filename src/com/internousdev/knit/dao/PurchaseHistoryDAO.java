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


public class PurchaseHistoryDAO {


	//購入履歴表示メソッド[status:0で表示,1で表示無効]

public ArrayList<PurchaseHistoryDTO> getPurchaseHistory(String userId ,int status, int XXX) throws SQLException{

	DBConnector db = new DBConnector();
	Connection con = db.getConnection();
	ArrayList<PurchaseHistoryDTO> purchaseHistoryDTOList = new ArrayList<PurchaseHistoryDTO>();

	String sql = "SELECT ubit.id ,"
			+ "iit.item_name,"
			+ "iit.item_name_kana"
			+ "iit.image_file_name"
			+ "ubit.price,"
			+ "ubit.item_count,"
			+ "ubit.regist_date,"
			+ "ubit.order_num"
			+ "FROM purchase_history_info as ubit"
			+ "LEFT JOIN item_info as iit"
			+ "ON ubit.purchase_history_info_id = iit.id"
			+ "WHERE ubit.user_id = ? "
			+ "AND ubit.status = ? "
			+ "AND ubit.XXX= ?"
			+ "ORDER BY regist_date DESC";

	try{
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1,userId);
		ps.setInt(2,status);
		ps.setInt(3,XXX);

		ResultSet rs = ps.executeQuery();
		while(rs.next()){
			PurchaseHistoryDTO dto = new PurchaseHistoryDTO();
			dto.setId(rs.getInt("id"));
			dto.setItemName(rs.getString("item_name"));
			dto.setItemNameKana(rs.getString("item_name_kana"));
			dto.setImageFileName(rs.getString("image_file_name"));
			dto.setPrice(rs.getInt("price"));
			dto.setItemCount(rs.getInt("item_count"));
			dto.setRegistDate(rs.getString("regist_date"));
			dto.setOrderNum(rs.getString("oreder_num"));
			dto.setStatus(rs.getInt("status"));
			dto.setXXX(rs.getInt("XXX"));

			purchaseHistoryDTOList.add(dto);

		}
	}catch(Exception e){
		e.printStackTrace();
	}finally{
		con.close();
	}return purchaseHistoryDTOList;
}

	//購入履歴削除メソッド(全件削除)[status:0で表示,1で表示無効]

public int deleateAll(String userId) throws SQLException{
	DBConnector db = new DBConnector();
	Connection con = db.getConnection();
	String sql = "UPDATE FROM purchase_history_info "
				+ "SET status = 1"
				+ "WHERE status = 0"
				+ "AND user_id = ?";

	int resultda = 0;
	try{
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, userId);


		resultda = ps.executeUpdate();
		System.out.println(resultda);

		con.close();
	}catch(SQLException e){
		e.printStackTrace();
	}
	return resultda;
}

//購入履歴削除メソッド(個別削除)[status:0で表示,1で表示無効]

public int deleatePart(String userId,int itemId) throws SQLException{
	DBConnector db = new DBConnector();
	Connection con = db.getConnection();
	String sql = "UPDATE FROM purchase_history_info"
				+ "SET status = 1"
				+ "WHERE status = 0 "
				+ "AND user_id = ?"
				+ "AND item_id = ?";

	int resultdp = 0;

	try{
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1,userId);
		ps.setInt(2,itemId);

		resultdp = ps.executeUpdate();
		System.out.println(resultdp);


	}catch(SQLException e){
		e.printStackTrace();
	}finally{
		con.close();
		}

	return resultdp;
}


	//購入キャンセルメソッド(個別キャンセル)[XXX:0で発送待機、1で発送キャンセル、2で発送開始]

public int cancelPart(String userId,int itemId,String orderNum) throws SQLException{
	DBConnector db = new DBConnector();
	Connection con = db.getConnection();
	String sql = "UPDATE FROM purchase_history_info"
				+ "SET XXX = 1"
				+ "WHERE XXX = 0"
				+ "AND user_id = ?"
				+ "AND item_id = ?"
				+ "AND order_num = ?";

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
