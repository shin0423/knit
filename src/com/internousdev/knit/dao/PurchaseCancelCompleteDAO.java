package com.internousdev.knit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.knit.util.DBConnector;

//購入履歴表示
//購入履歴削除
//購入キャンセル機能


public class PurchaseCancelCompleteDAO {

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
