package com.internousdev.knit.action;

import java.sql.SQLException;
import java.util.Map;

import com.internousdev.knit.dao.AddressDataDAO;
import com.internousdev.knit.dto.AddressDataDTO;
import com.opensymphony.xwork2.ActionSupport;

public class testAction extends ActionSupport{
	public static void main(String[] args) throws SQLException{

			Map<String, Object> session;
			String familyName="";
			String firstName="";
			String familyNameKana="";
			String firstNameKana="";
			String email="";
			String telNumber="";
			String userAddress="";


				String result = ERROR;
				System.out.println("エラーです");

				AddressDataDTO dto = new AddressDataDTO();
				dto.setUserId("asd");
				dto.setFullName(familyName, firstName, familyNameKana, firstNameKana);
				dto.setEmail(email);
				dto.setTelNumber(telNumber);
				dto.setUserAddress(userAddress);
				System.out.println("宛先情報セット完了");

				AddressDataDAO dao = new AddressDataDAO();
				if(dao.registerAddress(dto)){
					System.out.println("宛先DBに登録完了");
					result = SUCCESS;
				}
			System.out.println(result);
		}


}
