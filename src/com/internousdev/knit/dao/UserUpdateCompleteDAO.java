package com.internousdev.knit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.knit.util.DBConnector;
import com.internousdev.knit.util.DateUtil;

public class UserUpdateCompleteDAO {

	private DateUtil dateUtil = new DateUtil();
	public int userUpdate1(String newPassword,String userId) throws SQLException{
		DBConnector db = new DBConnector();

	    Connection con = db.getConnection();
        //DB接続　情報の登録
	    //パスワードのみ
	    int count=0;
		String sql = "UPDATE user_info SET password = ?, update_date = ? WHERE user_id = ? ";
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1,newPassword);
			ps.setString(2,dateUtil.getDate());
			ps.setString(3,userId);

			count = ps.executeUpdate();
		} catch (Exception e){
			e.printStackTrace();
		}finally{
			con.close();
		}
		return count;
	}
	//メールアドレスのみ
	public int userUpdate2(String newEmail,String userId) throws SQLException{
		DBConnector db = new DBConnector();

	    Connection con = db.getConnection();

	    int count=0;
		String sql = "UPDATE user_info SET email = ?, update_date = ? WHERE user_id = ?";
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1,newEmail);
			ps.setString(2,dateUtil.getDate());
			ps.setString(3,userId);

			count = ps.executeUpdate();

		} catch(Exception e){
			e.printStackTrace();;
		}finally{
			con.close();
		}
		return count;
	}
	//パスワード、メールアドレスともに変更するとき
	public int userUpdate3(String newEmail,String newPassword,String userId) throws SQLException{
		DBConnector db = new DBConnector();

	    Connection con = db.getConnection();

	    int count=0;
		String sql = "UPDATE user_info SET email = ?, password = ?, update_date = ? WHERE user_id = ?";
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1,newEmail);
			ps.setString(2,newPassword);
			ps.setString(3,dateUtil.getDate());
			ps.setString(4,userId);

			count = ps.executeUpdate();
		} catch(Exception e){
			e.printStackTrace();;
		}finally{
			con.close();
		}
		return count;
	}
}
