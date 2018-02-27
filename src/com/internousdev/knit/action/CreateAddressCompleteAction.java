package com.internousdev.knit.action;

import java.sql.SQLException;
import java.util.ArrayList;
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

	private ArrayList<String> errMsgList = new ArrayList<>();


	public String execute() throws SQLException{
		if(session.containsKey("userId")){
			IdCheck idCheck = new IdCheck();
			if(idCheck.checkUser(session.get("userId").toString())){
				return "errorPage";
			}
		}

		if(!(token.equals(session.get("token").toString()))){
	
			return "errorPage";
		}

		RandomStringUtils rndStr = new RandomStringUtils();
		token = rndStr.randomAlphabetic(10);
	
		setToken(token);
		session.put("token", token);

		String result = ERROR;


		if(!(familyName.equals(session.get("familyName").toString()))){
			return "errorPage";
		}
		if(!(firstName.equals(session.get("firstName").toString()))){
			return "errorPage";
		}
		if(!(familyNameKana.equals(session.get("familyNameKana").toString()))){
			return "errorPage";
		}
		if(!(firstNameKana.equals(session.get("firstNameKana").toString()))){
			return "errorPage";
		}

		if(!(email.equals(session.get("email").toString()))){
			return "errorPage";
		}
		if(!(telNumber.equals(session.get("telNumber").toString()))){
			return "errorPage";
		}
		if(!(userAddress.equals(session.get("userAddress").toString()))){
			return "errorPage";
		}
		System.out.println("結果----->>>>"+result);


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

	public ArrayList<String> getErrMsgList() {
		return errMsgList;
	}

	public void setErrMsgList(ArrayList<String> errMsgList) {
		this.errMsgList = errMsgList;
	}
}
