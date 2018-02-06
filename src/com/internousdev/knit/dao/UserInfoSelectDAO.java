package com.internousdev.knit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.knit.dto.AddressDataDTO;
import com.internousdev.knit.util.DBConnector;

public class UserInfoSelectDAO {

	DBConnector db = new DBConnector();
	Connection con = null;

	public AddressDataDTO getUserInfor(String userId){
		AddressDataDTO ADDTO = new AddressDataDTO();
		String sql="SELECT * FROM user_info WHERE user_id = ?";

		try{
			con = db.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1,  userId);
			ResultSet rs= ps.executeQuery();

			while (rs.next()) {
				ADDTO.setUserId(rs.getString("user_id"));
				ADDTO.setFamilyName(rs.getString("family_name"));
				ADDTO.setFirstName(rs.getString("first_name"));
				ADDTO.setFamilyNameKana(rs.getString("family_name_kana"));
				ADDTO.setFirstNameKana(rs.getString("first_name_kana"));
				ADDTO.setEmail(rs.getString("email"));
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
			}
		}
		return ADDTO;
		}
	}