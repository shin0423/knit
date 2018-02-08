package com.internousdev.knit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.knit.dto.CartDTO;
import com.internousdev.knit.util.DBConnector;
import com.opensymphony.xwork2.ActionSupport;


public class CartDAO extends ActionSupport{


	DBConnector db=new DBConnector();
	Connection con=null;

	/**
	 * ログインユーザーが商品をカートに入れる
	 */
	public int putItemIntoCart(String userId,int itemId,int itemCount,int price)throws SQLException{
		System.out.println("putItemIntoCart");
		int count=0;

		System.out.println(userId);
		System.out.println("itemId");
		System.out.println("itemCount");

		String sql="INSERT INTO cart_info(user_id,temp_user_id,item_id,item_count,price,regist_data)"
				+"VALUES(?,?,?,?,?,NOW())";

		try {
			con=db.getConnection();
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, userId);
			ps.setString(2, userId);
			ps.setInt(3, itemId);
			ps.setInt(4, itemCount);
			ps.setInt(5, price);
			count=ps.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			con.close();
		}
		return count;
	}

	/**
	 * ゲストユーザーが商品をカートに入れる
	 */

	public int putItemIntoCartOfGuestUser(String tempUserId,int itemId,int price,int itemCount)throws SQLException{
		System.out.println("putItemIntoCartOfGuestUser");
		int count=0;

		String sql="INSERT INTO cart_info(user_id,temp_user_id,item_id,item_count,price,regist_date)"
				+"VALUES(?,?,?,?,?,NOW())";

		try {
			con=db.getConnection();
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, tempUserId);
			ps.setString(2, tempUserId);
			ps.setInt(3, itemId);
			ps.setInt(4, itemCount);
			ps.setInt(5, price);
			count=ps.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			con.close();
		}
		return count;
	}
	/**
	 * ログインユーザーのカート情報引き出し
	 */

	public ArrayList<CartDTO> showUserCartList(String userId) throws SQLException{
		System.out.println("showUserCartList");
		ArrayList<CartDTO> cartList=new ArrayList<>();

//		String sql="SELECT cart_info.item_id,ii.item_name,ii.item_name_kana,ii.image_file_path,ii.price,ii.release_company,ii.release_date,cart_info.item_count "
//				+"FROM cart_info LEFT JOIN item_info ii ON cart_info.item_id = ii.item_id "
//				+"WHERE user_id=?";

		String sql="SELECT cart_info.item_id as item_id,ii.item_name as item_name,ii.item_name_kana as item_name_kana, ii.image_file_path as image_file_path,ii.price as price,ii.release_company as release_company,ii.release_date as release_date, cart_info.item_count as item_count FROM cart_info LEFT JOIN item_info ii ON cart_info.item_id = ii.item_id where user_id = ?";

		try {
			con=db.getConnection();
			PreparedStatement ps=con.prepareStatement(sql);
			System.out.println("USERID : " + userId);
			System.out.println("SQL : " + sql);
			ps.setString(1, userId);
			ResultSet rs=ps.executeQuery();

			while(rs.next()) {
				CartDTO dto=new CartDTO();
				dto.setItemId(rs.getInt("item_id"));
				dto.setItemName(rs.getString("item_name"));
				dto.setItemNameKana(rs.getString("item_name_kana"));
				dto.setImageFilePath(rs.getString("image_file_path"));
				dto.setPrice(rs.getInt("price"));
				dto.setReleaseCompany(rs.getString("release_company"));
				dto.setReleaseDate(rs.getString("release_date"));
				dto.setItemCount(rs.getInt("item_count"));
				cartList.add(dto);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			con.close();
		}
		return cartList;
	}

	/**
	 * ゲストユーザーのカート情報を引き出す
	 */

	public ArrayList<CartDTO> showTempUserCartList(String tempUserId)throws SQLException{
		System.out.println("showTempUserCartList");
		ArrayList<CartDTO> cartList=new ArrayList<>();

		String sql="SELECT cart_info.item_id,cart_info.item_count,ii.item_name,ii.item_name_kana,ii.image_file_name,ii.price,ii.release_company,ii.release_date"
				+"FROM cart_info LEFT JOIN item_info as ii ON cart_info.item_id=ii.item_id"
				+"WHERE temp_user_id=?";

		try {
			con=db.getConnection();
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, tempUserId);
			ResultSet rs=ps.executeQuery();

			while(rs.next()) {
				CartDTO dto=new CartDTO();
				dto.setItemId(rs.getInt("item_id"));
				dto.setItemCount(rs.getInt("item_count"));
				dto.setItemName(rs.getString("item_name"));
				dto.setItemNameKana(rs.getString("item_name_kana"));
				dto.setImageFilePath(rs.getString("image_file_path"));
				dto.setPrice(rs.getInt("price"));
				dto.setReleaseCompany(rs.getString("release_company"));
				dto.setReleaseDate(rs.getString("release_date"));
				cartList.add(dto);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			con.close();
		}
		return cartList;
	}

	/**
	 * ログインユーザーのカート情報を取得
	 */

	public ArrayList<CartDTO>  aquireUserCartInfo(String userId)throws SQLException{
		System.out.println("aquireUserCartInfo");
		Connection con=db.getConnection();
		ArrayList<CartDTO> cartList=new ArrayList<>();

		String sql="SELECT*FROM cart_info WHERE user_id=?";

		try {
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, userId);
			ResultSet rs=ps.executeQuery();

			while(rs.next()) {
				CartDTO dto=new CartDTO();
				dto.setItemId(rs.getInt("item_id"));
				dto.setItemCount(rs.getInt("item_count"));
				cartList.add(dto);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		try {
			con.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return cartList;
	}

	/**
	 * ログイン時、カートに目標の商品が入っているか確認
	 */

	public boolean isAlreadyIntoCart(String userId,int itemId)throws SQLException{
		System.out.println("isAlreadyIntoCart");
		boolean result=false;

		String sql="SELECT*FROM cart_info WHERE user_id=? AND item_id=?";

		try {
			con=db.getConnection();
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, userId);
			ps.setInt(2, itemId);

			ResultSet rs=ps.executeQuery();

			if(rs.next()) {
				result=true;
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			con.close();
		}
		return result;
	}

	/**
	 * ゲストユーザー時、カートに目標の商品が入っているか確認
	 */

	public boolean isAlreadyIntoTempCart(String tempUserId,int itemId)throws SQLException{
		System.out.println("isAlreadyIntoTempCart");
		boolean result=false;

		String sql="SELECT*FROM cart_info WHERE temp_user_id=? AND item_id=?";

		try {
			con=db.getConnection();
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, tempUserId);
			ps.setInt(2, itemId);

			ResultSet rs=ps.executeQuery();

			if(rs.next()) {
				result=true;
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			con.close();
		}
		return result;
	}

	/**
	 * ログインユーザーのカート内商品の購入予定個数を変更
	 */

	public int updateUsersCount(int itemCount,String userId,String itemId)throws SQLException{
		System.out.println("updateUsersCount");
		int count=0;

		String sql="UPDATE cart_info SET item_count=item_count+" +itemCount
			+"WHERE user_id=? AND item_id=?";

		try {
			con=db.getConnection();
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1, itemCount);
			ps.setString(2, userId);
			ps.setString(3, itemId);
			count=ps.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			con.close();
		}
		return count;
	}

	/**
	 * ゲストユーザーのカート内商品の購入予定個数を変更
	 */

	public int updateTempUsersCount(int itemCount,String tempUserId)throws SQLException{
		System.out.println("updateTempUsersCount");
		int count=0;

		String sql="UPDATE cart into SET count=? WHERE temp_user_id=?";

		try {
			con=db.getConnection();
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1, itemCount);
			ps.setString(2, tempUserId);
			count=ps.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			con.close();
		}
		return count;
	}

	public int updateItemCount(String userId,int itemId,int itemCount,int price)throws SQLException{
		System.out.println("updateItemCount");
		int count=0;

		System.out.println(userId);
		System.out.println(itemId);
		System.out.println(itemCount);

		String sql="UPDATE cart_info SET item_count=item_count +" +itemCount
				+"WHERE user_id=? AND item_id=?";

		try {
			con=db.getConnection();
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, userId);
			ps.setInt(2, itemId);
			count=ps.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			con.close();
		}
		return count;
	}

	/**
	 * ログインをした際にカート内のユーザー情報を引き継ぎ
	 */
	public void changeUserId(String tempUserId,String userId)throws SQLException{
		System.out.println("changeUserId");

		String sql="UPDATE cart_info SET user_id=?,temp_user_id=? where temp_user_id=?";

		try {
			con=db.getConnection();
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, userId);
			ps.setString(2, userId);
			ps.setString(3, tempUserId);
			ps.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			con.close();
		}
	}
	/**
	 * 在庫を更新するメソッド
	 */
	public void changeItemStock(int itemStock,int itemId)throws SQLException{
		System.out.println("Stockを変更");

		String sql="UPDATE item_info SET stock=stock-? WHERE item_id=?";

		try {
			con=db.getConnection();
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1, itemStock);
			ps.setInt(2, itemId);
			ps.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			con.close();
		}
	}

	/**
	 * 在庫を更新するメソッド
	 */
	public void changeItemStockId(int itemStock,int itemId,String userId)throws SQLException{
		System.out.println("Stockを変更");

		String sql="UPDATE cart_info SET item_count=item_count+? WHERE item_id=? AND user_id=?";

		try {
			con=db.getConnection();
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1, itemStock);
			ps.setInt(2, itemId);
			ps.setString(3, userId);
			ps.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * カート内の商品を１つずつ削除
	 */

	public void deleteSeparete(String userId,Integer integer) {
		String sql="DELETE FROM cart_info WHERE user_id=? AND item_id=?";

		try {
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, userId);
			ps.setLong(2, integer);
			ps.executeUpdate();

		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * カート情報の削除
	 * @param userId
	 * @throws SQLException
	 */
	public void deleteCartInfo(String userId) throws SQLException {
		String sql="DELETE FROM cart_info WHERE user_id=?";
		try {
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, userId);
			ps.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			con.close();
		}
	}
}
