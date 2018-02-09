package com.internousdev.knit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.knit.util.DBConnector;
import com.internousdev.knit.util.DateUtil;

public class UserUpdateCompleteDAO {

	private DateUtil dateUtil = new DateUtil();
	public int userUpdate(String newPassword,String userId) throws SQLException{
		DBConnector db = new DBConnector();

	    Connection con = db.getConnection();

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

	public int userUpdate(String telNumber,String userAddress,String userId) throws SQLException{
		DBConnector db = new DBConnector();

	    Connection con = db.getConnection();

	    int count=0;
		String sql = "UPDATE destination_info SET tel_number = ?,user_address = ?,update_date = ? WHERE user_id = ?";
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1,telNumber);
			ps.setString(2,userAddress);
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
