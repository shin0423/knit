package com.internousdev.knit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
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
	public int putProductIntoCart(String userId,int productId,int productCount,int price)throws SQLException{
		System.out.println("putProductIntoCart");
		int count=0;

		System.out.println(userId);
		System.out.println("productId");
		System.out.println("productCount");

		String sql="INSERT INTO cart_info(user_id,temp_user_id,product_id,product_count,price,regist_data)"
				+"VALUES(?,?,?,?,?,NOW())";

		try {
			con=db.getConnection();
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, userId);
			ps.setString(2, userId);
			ps.setInt(3, productId);
			ps.setInt(4, productCount);
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

	public int putProductIntoCartOfGuestUser(String tempUserId,int productId,int price,int productCount)throws SQLException{
		System.out.println("putProductIntoCartOfGuestUser");
		int count=0;

		String sql="INSERT INTO cart_info(user_id,temp_user_id,product_id,product_count,price,regist_date)"
				+"VALUES(?,?,?,?,?,NOW())";

		try {
			con=db.getConnection();
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, tempUserId);
			ps.setString(2, tempUserId);
			ps.setInt(3, productId);
			ps.setInt(4, productCount);
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
	 * ログインユーザーのカート情報を引き出す
	 */

	public ArrayList<CartDTO> showUserCartList(String userId) throws SQLException{
		System.out.println("showUserCartList");
		ArrayList<CartDTO> cartList=new ArrayList<>();

	}


}
