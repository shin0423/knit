package com.internousdev.knit.dao;

import com.internousdev.knit.util.DBConnector;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.List;
//
//import com.internousdev.knit.dto.CartInfoDTO;
//import com.internousdev.knit.util.DBConnector;

public class PurchaseCompleteDAO {

	private DBConnector db = new DBConnector();
	private Connection con =db.getConnection();

	/**
	 * カートテーブルを購入履歴に登録するメソッド
	 * 
	 * 1.カートテーブルを取得
	 * 2.購入履歴に登録
	 * @param userId
	 * @return cartList 
	 * 				  
	 */

	public ArrayList<CartInfoDTO> getCartInfo(String userId) throws SQLException {
		ArrayList<CartInfoDTO> cartList = new ArrayList<CartInfoDTO>();

		String sql = "SELECT * FROM cart_info where user_id=?";

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, userId);
			ResultSet rs = ps.executeQuery();

			while(rs.next()){
				CartInfoDTO dto = new CartInfoDTO();
				dto.setUserId(rs.getString("user_id"));
				dto.setItemId(rs.getInt("item_id"));
				dto.setItemCount(rs.getInt("item_count"));
				dto.setPrice(rs.getInt("price"));
				dto.setUpdateDate(rs.getDate("update_date"));
				dto.setRegistDate(rs.getDate("regist_date"));

				//コンソールに処理を表示
				System.out.println("------getCartInfo");
				System.out.println(dto.getUserId());
				System.out.println(dto.getItemId());
				System.out.println(dto.getItemCount());
				System.out.println(dto.getPrice());
				System.out.println(dto.getUpdateDate());
				System.out.println(dto.getRegistDate());
				System.out.println("------------------");
				//

				cartList.add(dto);

			}

		}catch(SQLException e){
			e.printStackTrace();

		}finally{
			con.close();

		}
		return cartList;

	}

	/**
	 * 購入情報を購入履歴に保存
	 *
	 * @param cartList
	 * @return ret
	 */

	public int setPurchaseHistory(List<CartInfoDTO> cartList) throws SQLException{

		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		String sql = null;

		/*--------------------------------------------------
		 * int型でActionからcartListを引数で受け取る
		 * 変数名retの初期値を0(未処理なら0のまま)
		 --------------------------------------------------------*/

		int ret = 0;

		/*----------------------------------------------------------------------------------
		 * for文でcartListを回し、カート情報の件数分検索をかける→件数処理がretに入る
		 ---------------------------------------------------------------------------------*/

		try{
			for (int i = 0; i <cartList.size(); i++){
				sql = "INSERT INTO purchase_history_info(user_id, price, item_id, item_count, update_date, regist_date) VALUES(?, ?, ?, ?, NOW(), NOW())";
				PreparedStatement ps = con.prepareStatement(sql);

				ps.setString(1, cartList.get(i).getUserId());
				ps.setInt(2, cartList.get(i).getPrice());
				ps.setInt(3, cartList.get(i).getItemId());
				ps.setInt(4, cartList.get(i).getItemCount());

				/*コンソールに処理を表示------------------------------*/
				System.out.println("------------setPurchaseHistory");
				System.out.println(cartList.get(i).getUserId());
				System.out.println(cartList.get(i).getPrice());
				System.out.println(cartList.get(i).getItemId());
				System.out.println(cartList.get(i).getItemCount());
				System.out.println("---------------------");
				/*----------------------------------------------------*/

				/*------------------------------------------------------
				 *  += 以上が実行されるたびに足す処理
				 -----------------------------------------------------*/

				ret += ps.executeUpdate();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			con.close();
		}
		return ret;
	}
}

