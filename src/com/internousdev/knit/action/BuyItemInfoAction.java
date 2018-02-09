package com.internousdev.knit.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.knit.dao.BuyItemInfoDAO;
import com.internousdev.knit.dao.ReviewDAO;
import com.internousdev.knit.dto.BuyItemDTO;
import com.internousdev.knit.dto.ReviewDTO;
import com.opensymphony.xwork2.ActionSupport;

public class BuyItemInfoAction extends ActionSupport {
	private String itemId;
	private BuyItemDTO buyItemDTO = new BuyItemDTO();
	private List<ReviewDTO> reviewList = new ArrayList<ReviewDTO>();


	public String execute() throws SQLException{
		buyItemDTO=null;
		BuyItemInfoDAO buyItemInfoDAO = new BuyItemInfoDAO();
		buyItemDTO=buyItemInfoDAO.selectBuyItemInfo(itemId);
		ReviewDAO reviewDAO = new ReviewDAO();
		setReviewList(reviewDAO.selectReviewAll(itemId));

		for(int i=0;reviewList.size() > i ; i++){
			String stars="";
			for(int j=0;reviewList.get(i).getReview() > j; j++){
				stars+="★";
			}
			reviewList.get(i).setReviewStar(stars);
		}


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


	public List<ReviewDTO> getReviewList() {
		return reviewList;
	}


	public void setReviewList(List<ReviewDTO> reviewList) {
		this.reviewList = reviewList;
	}

}
