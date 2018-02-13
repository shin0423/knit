package com.internousdev.knit.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.knit.dao.BuyItemInfoDAO;
import com.internousdev.knit.dao.ReviewDAO;
import com.internousdev.knit.dao.ReviewDeleteDAO;
import com.internousdev.knit.dto.BuyItemDTO;
import com.internousdev.knit.dto.ReviewDTO;
import com.opensymphony.xwork2.ActionSupport;

public class ReviewDeleteAction extends ActionSupport implements SessionAware {

	private int itemId;
	private Map<String, Object> session;
	private ReviewDeleteDAO reviewDeleteDAO = new ReviewDeleteDAO();
	private BuyItemDTO buyItemDTO = new BuyItemDTO();
	private List<ReviewDTO> reviewList = new ArrayList<ReviewDTO>();
	private ArrayList<String> reviewErrorMessage = new ArrayList<String>();

	public String execute() throws SQLException {

		BuyItemInfoDAO buyItemInfoDAO = new BuyItemInfoDAO();
		ReviewDAO reviewDAO = new ReviewDAO();

		String result = ERROR;

		setBuyItemDTO(buyItemInfoDAO.selectBuyItemInfo( String.valueOf(itemId)) );
		setReviewList(reviewDAO.selectReviewAll(String.valueOf(itemId)));

		if(!session.get("userId").equals("")) {

			boolean exist = reviewDAO.confirmReviewHistory(session.get("userId").toString(), Integer.valueOf(itemId));

			if (exist) {
				reviewDeleteDAO.reviewDelete( session.get("userId").toString(), Integer.valueOf(itemId) );
				setReviewList(reviewDAO.selectReviewAll(String.valueOf(itemId)));
				result = SUCCESS;
			} else {
				reviewErrorMessage.add("削除するレビューがありません");
			}

		} else {
			reviewErrorMessage.add("レビューを消すにはログインしてください");
		}


		return result;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public BuyItemDTO getBuyItemDTO() {
		return buyItemDTO;
	}

	public void setBuyItemDTO(BuyItemDTO buyItemDTO) {
		this.buyItemDTO = buyItemDTO;
	}

	public List<ReviewDTO> getReviewList() {
		return reviewList;
	}

	public void setReviewList(List<ReviewDTO> reviewList) {
		this.reviewList = reviewList;
	}

	public ArrayList<String> getReviewErrorMessage() {
		return reviewErrorMessage;
	}

	public void setReviewErrorMessage(ArrayList<String> reviewErrorMessage) {
		this.reviewErrorMessage = reviewErrorMessage;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
