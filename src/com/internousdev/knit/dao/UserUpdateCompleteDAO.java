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

	public int userUpdate2(String newEmail,String userId) throws SQLException{
		DBConnector db = new DBConnector();

	    Connection con = db.getConnection();

	    int count=0;
		String sql = "UPDATE destination_info as di, user_info as ui SET di.email = ?, ui.email = ?, di.update_date = ?, ui.update_date = ? WHERE di.user_id = ui.user_id AND di.user_id = ?";
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1,newEmail);
			ps.setString(2,newEmail);
			ps.setString(3,dateUtil.getDate());
			ps.setString(4,dateUtil.getDate());
			ps.setString(5,userId);

			count = ps.executeUpdate();
			if(count > 0) {
				System.out.println("結果："+ count);
			}
		} catch(Exception e){
			e.printStackTrace();;
		}finally{
			con.close();
		}
		return count;
	}

	public int userUpdate3(String newEmail,String newPassword,String userId) throws SQLException{
		DBConnector db = new DBConnector();

	    Connection con = db.getConnection();

	    int count=0;
		String sql = "UPDATE destination_info as di, user_info as ui SET di.email = ?, ui.email = ?, ui.password = ?, di.update_date = ?, ui.update_date = ? WHERE di.user_id = ui.user_id AND di.user_id = ?";
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1,newEmail);
			ps.setString(2,newEmail);
			ps.setString(3,newPassword);
			ps.setString(4,dateUtil.getDate());
			ps.setString(5,dateUtil.getDate());
			ps.setString(6,userId);

			count = ps.executeUpdate();
		} catch(Exception e){
			e.printStackTrace();;
		}finally{
			con.close();
		}
		return count;
	}
}
