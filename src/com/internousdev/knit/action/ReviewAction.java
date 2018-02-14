package com.internousdev.knit.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.knit.dao.BuyItemInfoDAO;
import com.internousdev.knit.dao.ReviewDAO;
import com.internousdev.knit.dto.BuyItemDTO;
import com.internousdev.knit.dto.ReviewDTO;
import com.opensymphony.xwork2.ActionSupport;

public class ReviewAction extends ActionSupport implements SessionAware {
	private int itemId;
	private int review = 0;
	private String reviewBody;
	private ArrayList<String> reviewStar = new ArrayList<String>();
	private ArrayList<String> reviewErrorMessage = new ArrayList<String>();
	private ReviewDAO reviewDAO = new ReviewDAO();
	private BuyItemInfoDAO buyItemInfoDAO = new BuyItemInfoDAO();
	private Map<String, Object> session;
	private BuyItemDTO buyItemDTO = new BuyItemDTO();
	private List<ReviewDTO> reviewList = new ArrayList<ReviewDTO>();

	public String execute() throws SQLException {
		String result = ERROR;

		setBuyItemDTO(buyItemInfoDAO.selectBuyItemInfo(String.valueOf(itemId)));
		setReviewList(reviewDAO.selectReviewAll(String.valueOf(itemId)));
		starDisplay();

		if ((boolean) session.get("loginFlg")) {
			boolean exist = reviewDAO.confirmReviewHistory(session.get("userId").toString(), Integer.valueOf(itemId));
			if (reviewBody.equals("")) {
				reviewErrorMessage.add("レビューが未入力です");
				System.out.println("レビュー内容無しエラー");
			} else if (reviewBody.length() > 100) {
				reviewErrorMessage.add("レビューは100文字までです");
				System.out.println("レビューは100文字まで");
			} else if (session.containsKey("userId") && exist) {
				reviewErrorMessage.add("一度レビューに書き込んだことがある場合は書き込めません");
			} else if ( !reviewDAO.confirmPurchaseItemHistory(session.get("userId").toString(), Integer.valueOf(itemId)) ) {
				reviewErrorMessage.add("この商品の購入情報が無いので書き込みできません");
				System.out.println("この商品の購入情報が無いので書き込み不可");
			} else {
				reviewDAO.completeReview(session.get("userId").toString(), Integer.valueOf(itemId), Integer.valueOf(review), reviewBody);
				setReviewList(reviewDAO.selectReviewAll(String.valueOf(itemId)));
				starDisplay();
				result = SUCCESS;
			}
		} else {
			reviewErrorMessage.add("ログインしていない状態でレビューに書き込めません");
		}

		return result;

	}

	public void starDisplay() {
		int i;
		int j;
		for(i = 0; i < reviewList.size(); i++){
			String stars = "";
			for (j = 0; j < reviewList.get(i).getReview(); j++) {
				stars += "★";
			}
			reviewList.get(i).setReviewStar(stars);
		}
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public int getReview() {
		return review;
	}

	public void setReview(int review) {
		this.review = review;
	}

	public String getReviewBody() {
		return reviewBody;
	}

	public void setReviewBody(String reviewBody) {
		this.reviewBody = reviewBody;
	}

	public ArrayList<String> getReviewStar() {
		return reviewStar;
	}

	public void setReviewStar(ArrayList<String> reviewStar) {
		this.reviewStar = reviewStar;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public ArrayList<String> getReviewErrorMessage() {
		return reviewErrorMessage;
	}

	public void setReviewErrorMessage(ArrayList<String> reviewErrorMessage) {
		this.reviewErrorMessage = reviewErrorMessage;
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

}
