package com.internousdev.knit.dto;

//宛先情報格納
public class SettlementConfirmDTO {

	private int id;
	private String user_id;

	private String family_name;
	private String first_name;
	private String family_name_kana;
	private String first_name_kana;
	private String email;
	private String tel_number;
	private String user_address;


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getUserId() {
		return user_id;
	}
	public void setUserId(String user_id) {
		this.user_id = user_id;
	}

	public String getFamilyName() {
		return family_name;
	}
	public void setFamilyName(String family_name) {
		this.family_name = family_name;
	}

	public String getFirstName() {
		return first_name;
	}
	public void setFirstName(String first_name) {
		this.first_name = first_name;
	}

	public String getFamilyNameKana() {
		return family_name_kana;
	}
	public void setFamilyNameKana(String family_name_kana) {
		this.family_name_kana = family_name_kana;
	}

	public String getFirstNameKana() {
		return first_name_kana;
	}
	public void setFirstNameKana(String first_name_kana) {
		this.first_name_kana = first_name_kana;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelNumber() {
		return tel_number;
	}
	public void setTelNumber(String tel_number) {
		this.tel_number = tel_number;
	}

	public String getUserAddress() {
		return user_address;
	}
	public void setUserAddress(String user_address) {
		this.user_address = user_address;
	}
}
