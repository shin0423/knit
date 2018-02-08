package com.internousdev.knit.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.knit.dto.AddressDataDTO;
import com.opensymphony.xwork2.ActionSupport;

public class CreateAddressMockAction extends ActionSupport implements SessionAware{

	private List<AddressDataDTO> noInpList = new ArrayList<AddressDataDTO>();
	private String familyName;
	private String firstName;
	private String familyNameKana;
	private String firstNameKana;
	private String email;
	private String telNumber;
	private String userAddress;

	private Map<String,Object> session;

	public String execute(){

		String result=ERROR;

		for(int i=0; i< 5; i++){
			AddressDataDTO dto = new AddressDataDTO();
			dto.setId(i+1);
			dto.setUserId("asd");
			dto.setFamilyName("内山");
			dto.setFirstName("英世");
			dto.setFamilyNameKana("うちやま");
			dto.setFirstNameKana("うちや");
			dto.setEmail("aaa@aaaaa.com");
			dto.setTelNumber("0312345678");
			dto.setUserAddress("東京都千代田区三番町1");
			noInpList.add(dto);

		}

		AddressDataDTO dto = new AddressDataDTO();
		dto.setUserId("asd");
		dto.setFamilyName("内山");
		dto.setFirstName("英世");
		dto.setFamilyNameKana("うちやま");
		dto.setFirstNameKana("うちや");
		dto.setEmail("aaa@aaaaa.com");
		dto.setTelNumber("0312345678");
		dto.setUserAddress("東京都千代田区三番町1");
		 familyName=dto.getFamilyName();
		firstName=dto.getFirstName();
		 familyNameKana=dto.getFamilyNameKana();
		 firstNameKana=dto.getFirstNameKana();
		 email=dto.getEmail();
		telNumber=dto.getTelNumber();
		 userAddress=dto.getUserAddress();


		session.put("userId","asd");
		result=SUCCESS;
		return result;
	}

	public List<AddressDataDTO> getNoInpList() {
		return noInpList;
	}

	public void setNoInpList(List<AddressDataDTO> noInpList) {
		this.noInpList = noInpList;
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

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}



}