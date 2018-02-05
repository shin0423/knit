package com.internousdev.knit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.knit.dto.MyPageDTO;
import com.internousdev.knit.util.DBConnector;

public class MyPageDAO {
	
	DBConnector db = new DBConnector();
	
	Connection con = db.getConnection();
	
	public ArrayList<MyPageDTO> getUserInfo(String userId){
		
		MyPageDTO myPageDTO = new MyPageDTO();
		
		ArrayList<MyPageDTO> myPageList = new ArrayList<MyPageDTO>();
		
		String sql =" SELECT * FROM user_info where user_id = ? ";
		
		try{
			
			PreparedStatement ps = con.prepareStatement(sql);
			
			ps.setString(1, userId);
			
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				
				myPageDTO.setUserId(rs.getString("user_id"));
				
				myPageDTO.setPassword(rs.getString("password"));
				
				myPageDTO.setFamilyName(rs.getString("family_name"));
				
				myPageDTO.setFirstName(rs.getString("first_name"));
				
				myPageDTO.setFamilyNameKana(rs.getString("family_name_kana"));
				
				myPageDTO.setFirstNameKana(rs.getString("first_name_kana"));
				
				myPageDTO.setSex(rs.getBoolean("sex"));
				
				myPageDTO.setEmail(rs.getString("email"));
				
				myPageList.add(myPageDTO);
				
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		try {
			con.close();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return myPageList;
	}
	
}
