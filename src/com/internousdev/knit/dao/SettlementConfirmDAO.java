package com.internousdev.knit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.internousdev.knit.dto.SettlementConfirmDTO;
import com.internousdev.knit.util.DBConnector;;

public class SettlementConfirmDAO {

	private DBConnector db = new DBConnector();
	private Connection con = db.getConnection();


	//宛先情報の取得
	public ArrayList<SettlementConfirmDTO> getDestinationInfo(String userId) {

		ArrayList<SettlementConfirmDTO> destinationList = new ArrayList<SettlementConfirmDTO>();
		String sql = ""
				+ "SELECT id, user_id,family_name,first_name,family_name_kana,first_name_kana,email,tel_number,user_address "
				+ "FROM destination_info "
				+ "where user_id = ?";


		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, userId);

			ResultSet resultSet = ps.executeQuery();

			while(resultSet.next()) {
				SettlementConfirmDTO settlementConfirmDTO = new SettlementConfirmDTO();

				if ((resultSet.getString("tel_number").equals("未入力"))||((resultSet.getString("user_address").equals("未入力")))) {

				}else{
				settlementConfirmDTO.setId(resultSet.getInt("id"));
				settlementConfirmDTO.setUserId(resultSet.getString("user_id"));
				settlementConfirmDTO.setFamilyName(resultSet.getString("family_name"));
				settlementConfirmDTO.setFirstName(resultSet.getString("first_name"));
				settlementConfirmDTO.setFamilyNameKana(resultSet.getString("family_name_kana"));
				settlementConfirmDTO.setFirstNameKana(resultSet.getString("first_name_kana"));
				settlementConfirmDTO.setEmail(resultSet.getString("email"));
				settlementConfirmDTO.setTelNumber(resultSet.getString("tel_number"));
				settlementConfirmDTO.setUserAddress(resultSet.getString("user_address"));
				destinationList.add(settlementConfirmDTO);
			}


			}

		} catch(Exception e) {
			e.printStackTrace();
		}

		return destinationList;
	}

}