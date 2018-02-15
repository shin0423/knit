package com.internousdev.knit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.knit.dto.AddressDataDTO;
import com.internousdev.knit.util.DBConnector;

public class AddressDataDAO {

	DBConnector db = new DBConnector();
	Connection con = null;
	/**
	 * 宛先情報をDBに登録する
	 * @param dto
	 * @return
	 * @throws SQLException
	 */

	public int registerAddress(AddressDataDTO dto) throws SQLException{

	//  確認用プログラム

		System.out.println("登録する値一覧--------------");
		System.out.println(dto.getUserId());
		System.out.println(dto.getFamilyName());
		System.out.println(dto.getFirstName());
		System.out.println(dto.getFamilyNameKana());
		System.out.println(dto.getFirstNameKana());
		System.out.println(dto.getEmail());
		System.out.println(dto.getTelNumber());
		System.out.println(dto.getUserAddress());
		System.out.println("---------------------------");

		//  データベース&SQL

		int updateCount = 0;
		String sql = "INSERT INTO destination_info(user_id, family_name, first_name, "
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
		return updateCount;
	}

}
