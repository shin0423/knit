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
		int count=0;

		String sql="INSERT INTO cart_info(user_id,temp_user_id,item_id,item_count,price,regist_date)"
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
		ArrayList<CartDTO> cartList=new ArrayList<>();

		String sql="SELECT cart_info.item_id as item_id,ii.item_name as item_name,ii.item_name_kana as item_name_kana, ii.image_file_path as image_file_path,ii.price as price,ii.release_company as release_company,ii.release_date as release_date, cart_info.item_count as item_count FROM cart_info LEFT JOIN item_info ii ON cart_info.item_id = ii.item_id where user_id = ?";

		try {
			con=db.getConnection();
			PreparedStatement ps=con.prepareStatement(sql);
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
				dto.setTotal(rs.getInt("item_count")*(rs.getInt("price")));
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
		ArrayList<CartDTO> cartList=new ArrayList<>();

		String sql="SELECT cart_info.item_id as item_id,ii.item_name as item_name,ii.item_name_kana as item_name_kana, ii.image_file_path as image_file_path,ii.price as price,ii.release_company as release_company,ii.release_date as release_date, cart_info.item_count as item_count FROM cart_info LEFT JOIN item_info ii ON cart_info.item_id = ii.item_id where user_id = ?";

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
		Connection con=db.getConnection();
		ArrayList<CartDTO> cartList=new ArrayList<>();

		String sql="SELECT item_id, item_count FROM cart_info WHERE user_id=?";

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

		boolean result=false;

		String sql="SELECT id FROM cart_info WHERE user_id=? AND item_id=?";

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

		boolean result=false;

		String sql="SELECT id FROM cart_info WHERE temp_user_id=? AND item_id=?";

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

		int count=0;

		String sql="UPDATE cart_info SET item_count=item_count+" +itemCount
			+" WHERE user_id=? AND item_id=?";

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

		int count=0;

		String sql="UPDATE cart_info SET item_count=item_count +" +itemCount
				+" WHERE user_id=? AND item_id=?";

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

		String sql="UPDATE item_info SET item_stock=item_stock-? WHERE item_id=?";

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
		con=db.getConnection();
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
		con=db.getConnection();
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


	//ミニカート用 小池 ユーザーIDから6件以下検索し取得する
	public  void miniCart(String userId){
		String sql="SELECT item_count, item_name, price FROM cart_info WHERE user_id = ? LIMIT 6";
		con=db.getConnection();
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, userId);

			ResultSet rs=ps.executeQuery();

			while (rs.next()) {
				CartDTO CartDTO=new CartDTO();
				CartDTO.setItemCount(rs.getInt("item_count"));
				CartDTO.setItemName(rs.getString("item_name"));
				CartDTO.setPrice(rs.getInt("price"));
			}

		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public  ArrayList<CartDTO> UserMiniCart(String userId){

		String sql="select item_info.item_name, item_info.price, cart_info.item_count from item_info right outer join cart_info on item_info.item_id = cart_info.item_id WHERE cart_info.user_id = ?  LIMIT 6";
		con=db.getConnection();
		ArrayList<CartDTO> MiniCartId=new ArrayList<>();
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, userId);

			ResultSet rs=ps.executeQuery();

			while (rs.next()) {
				CartDTO CartDTO=new CartDTO();
				CartDTO.setItemName(rs.getString("item_name"));
				CartDTO.setPrice(rs.getInt("price"));
				CartDTO.setItemCount(rs.getInt("item_count"));

				MiniCartId.add(CartDTO);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				con.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}
		return MiniCartId;
	}

	public ArrayList<CartDTO> TempUserMiniCart(String tempUserId){
		String sql="select item_info.item_name, item_info.price, cart_info.item_count from item_info right outer join cart_info on item_info.item_id = cart_info.item_id WHERE cart_info.temp_user_id = ?  LIMIT 6";
		con=db.getConnection();

		ArrayList<CartDTO> MiniCartId=new ArrayList<>();
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, tempUserId);

			ResultSet rs=ps.executeQuery();

			while (rs.next()) {
				CartDTO CartDTO=new CartDTO();
				CartDTO.setItemName(rs.getString("item_name"));
				CartDTO.setPrice(rs.getInt("price"));
				CartDTO.setItemCount(rs.getInt("item_count"));

				MiniCartId.add(CartDTO);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				con.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}
		return MiniCartId;
	}
}
