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
//		System.out.println("エラーです");

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
		return result;
	}
	/**
	 * @return
	 */
	public Map<String, Object>getSession(){
		return session;
	}
	/*
	 * @param session セットする session
	 */
	public void setSession(Map<String, Object> session){
		this.session = session;
	}
	/**
	 * @return firstName
	 */
	public String getFirstName(){
		return firstName;
	}
	/**
	 * @param firstName セットする firstName
	 */
	public void setFirstName(String fristName){
		this.firstName = fristName;
	}
	/**
	 * @return familyName
	 */
	public String getFamilyName(){
		return familyName;
	}
	/**
	 * @param familyName セットする familyName
	 */
	public void setFamilyName(String familyName){
		this.familyName = familyName;
	}
	/**
	 * @return firstNameKana
	 */
	public String getFamilyNameKana(){
		return familyNameKana;
	}
	/**
	 * @param familyNameKana セットする familyNameKana
	 */
	public void setFamilyNameKana(String familyNameKana){
		this.familyName = familyNameKana;
	}
	/**
	 * @return firstNameKana
	 */
	public String getFirstNameKana(){
		return firstNameKana;
	}
	/**
	 * @param firstNameKana セットする firstNameKana
	 */
	public void setFirstNameKana(String firstNameKana){
		this.firstNameKana = firstNameKana;
	}
	/**
	 * @return email
	 */
	public String getEmail(){
		return email;
	}
	/**
	 * @param email セットする email
	 */
	public void setEmail(String email){
		this.email = email;
	}
	/**
	 * @return telNumber
	 */
	public String getTelNumber(){
		return telNumber;
	}
	/**
	 * @param telNumber セットする telNumber
	 */
	public void setTelNumber(String telNumber){
		this.telNumber = telNumber;
	}
	/**
	 * @return userAddress
	 */
	public String getUserAddress(){
		return userAddress;
	}
	/**
	 * @param userAddress セットする userAddress
	 */
	public void setUserAddress(String userAddress){
		this.userAddress = userAddress;
	}
}
