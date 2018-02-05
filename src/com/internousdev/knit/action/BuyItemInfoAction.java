package com.internousdev.knit.action;

import java.sql.SQLException;

import com.internousdev.knit.dao.BuyItemInfoDAO;
import com.internousdev.knit.dto.BuyItemDTO;
import com.opensymphony.xwork2.ActionSupport;

public class BuyItemInfoAction extends ActionSupport {
	private String itemId;
	private BuyItemDTO buyItemDTO = new BuyItemDTO();


	public String execute() throws SQLException{
		buyItemDTO=null;
		BuyItemInfoDAO buyItemInfoDAO = new BuyItemInfoDAO();
		buyItemDTO=buyItemInfoDAO.selectBuyItemInfo(itemId);

		return SUCCESS;

	}


	public BuyItemDTO getBuyItemDTO() {
		return buyItemDTO;
	}


	public void setBuyItemDTO(BuyItemDTO buyItemDTO) {
		this.buyItemDTO = buyItemDTO;
	}


	public String getItemId() {
		return itemId;
	}


	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

}
