package com.internousdev.knit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.knit.dto.DestinationInfoDTO;
import com.internousdev.knit.util.DBConnector;



public class DestinationInfoDAO {

	//Mysqlに繋ぐためにコネクターを作成
	private DBConnector dbConnector = new DBConnector();

	private Connection connection = dbConnector.getConnection();



	//↓作成者 小池↓

	public ArrayList<DestinationInfoDTO> SearchDestination(String loginId) throws SQLException{

		//受け取り用List作成
		ArrayList<DestinationInfoDTO> destinationList = new ArrayList<DestinationInfoDTO>();

		//Mysqlに送るSQL文準備
		String sql ="SELECT * FROM distination_info where user_id = ?";

		try {
			PreparedStatement preparedStatement =connection.prepareStatement(sql);

			//引数からloginIdを受け取りsql文の？の部分に入れる
			preparedStatement.setString(1, loginId);

			//MysqlにSQL文を送り結果を受け取る
			ResultSet resultSet = preparedStatement.executeQuery();

			//MySQLから受け取った値を宛先情報DTOに格納
			while (resultSet.next()) {
				DestinationInfoDTO DistinationInfoDTO = new DestinationInfoDTO();

				DistinationInfoDTO.setUserId(resultSet.getString("user_id"));
				DistinationInfoDTO.setFamilyName(resultSet.getString("family_name"));
				DistinationInfoDTO.setFirstName(resultSet.getString("first_name"));
				DistinationInfoDTO.setFamilyNameKana(resultSet.getString("family_name_kana"));
				DistinationInfoDTO.setFirstNameKana(resultSet.getString("first_name_kana"));
				DistinationInfoDTO.setEmail(resultSet.getString(("email")));
				DistinationInfoDTO.setTelNumber(resultSet.getString("tel_number"));
				destinationList.add(DistinationInfoDTO);

				//MySQLから受け取った値をDTOに入れてるか確認
				System.out.println("MySQLから値取得チェック"+DistinationInfoDTO.getUserId());
				System.out.println("MySQLから値取得チェック"+DistinationInfoDTO.getFamilyName());
				System.out.println("MySQLから値取得チェック"+DistinationInfoDTO.getFirstName());
				System.out.println("MySQLから値取得チェック"+DistinationInfoDTO.getFamilyNameKana());
				System.out.println("MySQLから値取得チェック"+DistinationInfoDTO.getFirstNameKana());
				System.out.println("MySQLから値取得チェック"+DistinationInfoDTO.getEmail());
				//MySQLから受け取った値をDTOに入れてるか確認
			}

		} catch (SQLException e1) {

			e1.printStackTrace();
		}finally {
			connection.close();
		}

		//DistinationInfoDTO(宛先情報)が入ったlistをreturnする
		return destinationList;

	}

	 public ArrayList<DestinationInfoDTO> OneDestination(String loginId){

		 Connection connection = dbConnector.getConnection();

		 ArrayList<DestinationInfoDTO> oneDestinationList = new ArrayList<DestinationInfoDTO>();

		 String sql ="SELECT * FROM destination_info WHERE user_id = ? LIMIT 1";

		 try {
			 PreparedStatement preparedStatement =connection.prepareStatement(sql);

			 preparedStatement.setString(1, loginId);

			 ResultSet resultSet = preparedStatement.executeQuery();

while (resultSet.next()) {


				 DestinationInfoDTO DistinationInfoDTO = new DestinationInfoDTO();
				 DistinationInfoDTO.setUserId(resultSet.getString("user_id"));
					DistinationInfoDTO.setFamilyName(resultSet.getString("family_name"));
					DistinationInfoDTO.setFirstName(resultSet.getString("first_name"));
					DistinationInfoDTO.setFamilyNameKana(resultSet.getString("family_name_kana"));
					DistinationInfoDTO.setFirstNameKana(resultSet.getString("first_name_kana"));
					DistinationInfoDTO.setEmail(resultSet.getString(("email")));
					DistinationInfoDTO.setTelNumber(resultSet.getString("tel_number"));
					 oneDestinationList.add(DistinationInfoDTO);

						//MySQLから受け取った値をDTOに入れてるか確認
						System.out.println("MySQLから値取得チェック"+DistinationInfoDTO.getUserId());
						System.out.println("MySQLから値取得チェック"+DistinationInfoDTO.getFamilyName());
						System.out.println("MySQLから値取得チェック"+DistinationInfoDTO.getFirstName());
						System.out.println("MySQLから値取得チェック"+DistinationInfoDTO.getFamilyNameKana());
						System.out.println("MySQLから値取得チェック"+DistinationInfoDTO.getFirstNameKana());
						System.out.println("MySQLから値取得チェック"+DistinationInfoDTO.getEmail());
						//MySQLから受け取った値をDTOに入れてるか確認
}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		 finally {
			try {
				connection.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}

		 return oneDestinationList;

	 }
	 public void DeleteInComplete(String loginId){
		 Connection connection = dbConnector.getConnection();
		 String sql ="DELETE FROM destination_info WHERE user_id = ? AND tel_number ='未入力' OR user_address ='未入力'";

	 try {
		 PreparedStatement preparedStatement =connection.prepareStatement(sql);

		 preparedStatement.setString(1, loginId);

		 preparedStatement.execute();


	} catch (SQLException e) {
		e.printStackTrace();
	}finally {
		try {
			connection.close();
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}
	 }
}
