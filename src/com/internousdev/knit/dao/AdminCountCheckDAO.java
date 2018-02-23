package com.internousdev.knit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.knit.util.DBConnector;

public class AdminCountCheckDAO {
	private DBConnector db = new DBConnector();

	public int selectAdminCount() throws SQLException{
		int result = 0;
		Connection con = db.getConnection();
		String sql = "SELECT admin_count FROM user_info WHERE admin_flg=1";
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			if(rs.next()){
				result = rs.getInt("admin_count");
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			con.close();
		}
		return result;

	}

	public void updateAdminCount() throws SQLException{
		Connection con = db.getConnection();
		String sql = "UPDATE user_info SET admin_count = admin_count +1";
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.execute();
		}catch (SQLException e) {
			e.printStackTrace();
		}finally{
			con.close();
		}
	}
}
