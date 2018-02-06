package com.internousdev.knit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.knit.dto.AddressDataDTO;
import com.internousdev.knit.util.DBConnector;

public class AddressDataDAO {

	DBConnector db = new DBConnector();
	Connection con = null;

	public boolean registerAddress(AddressDataDTO dto) throws SQLException{

		int updateCount = 0;
		boolean result = false;
		String sql = "INSERT INTO destination(user_id, fanily_name, first_name, "
				+ "family_name_kana, first_name_kana, email, tel_number, user_address, "
				+ "regist_date) VALUES(?, ?, ?, ?, ?, ?, ?, ?, NOW())";
		try{
			con = db.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, dto.getUserId());
			ps.setString(2, dto.getFamilyName());
			ps.setString(3, dto.getFirstName());
			ps.setString(4, dto.getFamilyNameKana());
			ps.setString(5, dto.getFirstNameKana());
			ps.setString(6, dto.getEmail());
			ps.setString(7, dto.getTelNumber());
			ps.setString(8, dto.getUserAddress());
			updateCount = ps.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			con.close();
		}

		if(updateCount == 1){
			result = true;
		}
		return result;
	}

	public ArrayList<AddressDataDTO> obtainingDestinationInfo(String userId) throws SQLException{

		ArrayList<AddressDataDTO> AddressList = new ArrayList<AddressDataDTO>();
		String sql="SELECT id, family_name, first_name, family_name_kana, first_name_kana, "
				+ "email, tel_number, user_address FROM destination_info WHERE user_id = ?";
		try{
			con = db.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1,  userId);
			ResultSet rs= ps.executeQuery();

			while(rs.next()){
				AddressDataDTO dto = new AddressDataDTO();
				dto.setId(rs.getInt("id"));
				dto.setFamilyName(rs.getString("family_name"));
				dto.setFirstName(rs.getString("first_name"));
				dto.setFamilyNameKana(rs.getString("family_name_kana"));
				dto.setFirstNameKana(rs.getString("first_name_kana"));
				dto.setEmail(rs.getString("email"));
				dto.setTelNumber(rs.getString("tel_number"));
				dto.setUserAddress(rs.getString("user_address"));
				AddressList.add(dto);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			con.close();
		}
		return AddressList;
	}
}
