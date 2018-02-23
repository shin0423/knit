package com.internousdev.knit.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.knit.dao.AddressDataDAO;
import com.internousdev.knit.dao.DestinationInfoDAO;
import com.internousdev.knit.dto.AddressDataDTO;
import com.internousdev.knit.util.IdCheck;
import com.opensymphony.xwork2.ActionSupport;

public class CreateAddressCompleteAction extends ActionSupport implements SessionAware{

	private Map<String, Object> session;
	private String familyName;
	private String firstName;
	private String familyNameKana;
	private String firstNameKana;
	private String email;
	private String telNumber;
	private String userAddress;

	private String token;

	DestinationInfoDAO destinationInfoDAO = new DestinationInfoDAO();


	public String execute() throws SQLException{
		if(session.containsKey("userId")){
			IdCheck idCheck = new IdCheck();
			if(idCheck.checkUser(session.get("userId").toString())){
				return "errorPage";
			}
		}

		if(!(token.equals(session.get("token").toString()))){
			System.out.println("こっちきてくれ");
			return "errorPage";
		}else {
			System.out.println("こっちこないでええええええええ");
		}

		RandomStringUtils rndStr = new RandomStringUtils();
		token = rndStr.randomAlphabetic(10);
		System.out.println("トークン値"+token);
		setToken(token);
		session.put("token", token);

		String result = ERROR;
//		System.out.println("エラーです");

	//   確認用のプログラム

		AddressDataDTO dto = new AddressDataDTO();
		dto.setUserId(session.get("userId").toString());
		dto.setFamilyName(familyName);
		dto.setFirstName(firstName);
		dto.setFamilyNameKana(familyNameKana);
		dto.setFirstNameKana(firstNameKana);
		dto.setEmail(email);
		dto.setTelNumber(telNumber);
		dto.setUserAddress(userAddress);


		System.out.println("登録する値一覧（CreateAddressCompleteAction）--------------");
		System.out.println(dto.getUserId());
		System.out.println(dto.getFamilyName());
		System.out.println(dto.getFirstName());
		System.out.println(dto.getFamilyNameKana());
		System.out.println(dto.getFirstNameKana());
		System.out.println(dto.getEmail());
		System.out.println(dto.getTelNumber());
		System.out.println(dto.getUserAddress());
		System.out.println("---------------------------");


		System.out.println("宛先情報セット完了");

		AddressDataDAO dao = new AddressDataDAO();
		if(dao.registerAddress(dto) > 0){
			System.out.println("宛先DBに登録完了");
			result = SUCCESS;
		}


		destinationInfoDAO.DeleteInComplete(session.get("userId").toString());
		return result;
	}

	//  getter&setter

	public Map<String, Object> getSession() {
		return session;
	}


	public void setSession(Map<String, Object> session) {
		this.session = session;
	}


	public String getFamilyName() {
		return familyName;
	}


	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getFamilyNameKana() {
		return familyNameKana;
	}


	public void setFamilyNameKana(String familyNameKana) {
		this.familyNameKana = familyNameKana;
	}


	public String getFirstNameKana() {
		return firstNameKana;
	}


	public void setFirstNameKana(String firstNameKana) {
		this.firstNameKana = firstNameKana;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getTelNumber() {
		return telNumber;
	}


	public void setTelNumber(String telNumber) {
		this.telNumber = telNumber;
	}


	public String getUserAddress() {
		return userAddress;
	}


	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
}
