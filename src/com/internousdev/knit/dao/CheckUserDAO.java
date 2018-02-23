package com.internousdev.knit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.knit.util.DBConnector;

public class CheckUserDAO {
	public boolean checkUserID(String user_id) throws SQLException{
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		String sql="SELECT user_id FROM user_info WHERE user_id = ?";
		boolean result = false;

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1,user_id);
			ResultSet rs=ps.executeQuery();
			if(rs.next()){
				result = true;
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			con.close();
		}

		return result;
	}
}
