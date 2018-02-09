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

		if (reviewBody.equals("")) {
			reviewErrorMessage.add("レビューが未入力です");
			System.out.println("レビュー内容無しエラー");
		} else if (reviewBody.length() > 100) {
			reviewErrorMessage.add("レビューは100文字までです");
			System.out.println("レビューは100文字まで");
		}

		setBuyItemDTO(buyItemInfoDAO.selectBuyItemInfo(String.valueOf(itemId)));
		setReviewList(reviewDAO.selectReviewAll(String.valueOf(itemId)));
		reviewList = reviewDAO.selectReviewAll(String.valueOf(itemId));

		int i;
		int j;
		for(i = 0; i < reviewList.size(); i++){
			String stars = "";
			for (j = 0; j < reviewList.get(i).getReview(); j++) {
				stars += "★";
			}
			reviewList.get(i).setReviewStar(stars);
		}

		boolean exist = reviewDAO.confirmReviewHistory(session.get("userId").toString(), Integer.valueOf(itemId));

		if(session.containsKey("userId") && !exist){
			if ( reviewDAO.confirmPurchaseItemHistory(session.get("userId").toString(), Integer.valueOf(itemId)) ) {
				reviewDAO.completeReview(session.get("userId").toString(), Integer.valueOf(itemId), Integer.valueOf(review), reviewBody);
				result = SUCCESS;
			System.out.println("書き込み成功");
			} else {
				reviewErrorMessage.add("この商品の購入情報が無いので書き込みできません");
				System.out.println("この商品の購入情報が無いので書き込み不可");
			}
		} else {
			reviewErrorMessage.add("一度レビューをしたことがあるので書き込めません");
			result = ERROR;
		}

		if ( !(boolean) session.get("loginFlg") ) {
			System.out.println("てすと");
			reviewErrorMessage.add("ログインしていない状態ではレビューに書き込めません");
			result = ERROR;
		}

		return result;
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
