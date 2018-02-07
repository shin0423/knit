package com.internousdev.knit.dto;

import java.util.Date;


public class CartDTO {

	private int id;
	private String userId;
	private String tempUserId;
	private int itemId;
	private int itemCount;
	private String itemName;
	private String itemNameKana;
	private String imageFilePath;
	private int price;
	private String releaseCompany;
	private String releaseDate;
	private Date registDate;
	private Date updateDate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id=id;
	}

	public String userId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId=userId;
	}

	public String getTempUserId() {
		return tempUserId;
	}

	public void setTempUserId(String tempUserId) {
		this.tempUserId=tempUserId;
	}


	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId=itemId;
	}

	public int getItemCount() {
		return itemCount;
	}

	public void setItemCount(int itemCount) {
		this.itemCount=itemCount;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName=itemName;
	}

	public String getItemNameKana() {
		return itemNameKana;
	}

	public void setItemNameKana(String itemNameKana) {
		this.itemNameKana=itemNameKana;
	}

	public String getImageFilePath() {
		return imageFilePath;
	}

	public void setImageFilePath(String imageFilePath) {
		this.imageFilePath=imageFilePath;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price=price;
	}

	public String getReleaseCompany() {
		return releaseCompany;
	}

	public void setReleaseCompany(String releaseCompany) {
		this.releaseCompany=releaseCompany;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate=releaseDate;
	}

	public Date getRegistDate() {
		return registDate;
	}

	public void setRegistDate(Date registDate) {
		this.registDate=registDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate){
		this.updateDate=updateDate;
	}
}

