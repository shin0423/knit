package com.internousdev.knit.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.knit.dao.AddressDataDAO;
import com.internousdev.knit.dto.AddressDataDTO;
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

	public String execute() throws SQLException{
		String result = ERROR;
		System.out.println("エラーです");

		AddressDataDTO dto = new AddressDataDTO();
		dto.setUserId(session.get("userId").toString());
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
		return result;
	}
	public Map<String, Object>getSession(){
		return session;
	}
	public void setSession(Map<String, Object> session){
		this.session = session;
	}
	public String getFirstName(){
		return firstName;
	}
	public void setFirstName(String fristName){
		this.firstName = fristName;
	}
	public String getFamilyName(){
		return familyName;
	}
	public void setFamilyName(String familyName){
		this.familyName = familyName;
	}
	public String getFamilyNameKana(){
		return familyNameKana;
	}
	public void setFamilyNameKana(String familyNameKana){
		this.familyName = familyNameKana;
	}
	public String getFirstNameKana(){
		return firstNameKana;
	}
	public void setFirstNameKana(String firstNameKana){
		this.firstNameKana = firstNameKana;
	}
	public String getEmail(){
		return email;
	}
	public void setEmail(String email){
		this.email = email;
	}
	public String getTelNumber(){
		return telNumber;
	}
	public void setTelNumber(String telNumber){
		this.telNumber = telNumber;
	}
	public String getUserAddress(){
		return userAddress;
	}
	public void setUserAddress(String userAddress){
		this.userAddress = userAddress;
	}
}