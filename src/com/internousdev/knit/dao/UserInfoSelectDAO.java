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
	/**
	 * 宛先情報をDBに登録する
	 * @param dto
	 * @return
	 * @throws SQLException
	 */
	public AddressDataDTO getUserInfor(String userId){

		AddressDataDTO dto = new AddressDataDTO();
		String sql="SELECT * FROM user_info WHERE user_id = ?";

		try{
			con = db.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1,  userId);
			ResultSet rs= ps.executeQuery();

			while (rs.next()) {
				dto.setUserId(rs.getString("user_id"));
				dto.setFamilyName(rs.getString("family_name"));
				dto.setFirstName(rs.getString("first_name"));
				dto.setFamilyNameKana(rs.getString("family_name_kana"));
				dto.setFirstNameKana(rs.getString("first_name_kana"));
				dto.setEmail(rs.getString("email"));

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
		return dto;
		}
	}