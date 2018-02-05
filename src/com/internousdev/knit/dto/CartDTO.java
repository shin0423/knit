package com.internousdev.knit.dto;

import java.util.Date;

public class CartDTO {

	private int id;
	private String userId;
	private String tempUserId;
	private int productCount;
	private int price;
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

	public int productCount() {
		return productCount;
	}

	public void setProductCount(int productCount) {
		this.productCount=productCount;
	}

	public int price() {
		return price;
	}

	public void setPrice(int price) {
		this.price=price;
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

