package com.internousdev.knit.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.knit.dao.ReviewDAO;
import com.internousdev.knit.dto.BuyItemDTO;
import com.opensymphony.xwork2.ActionSupport;

public class ReviewAction extends ActionSupport implements SessionAware {
	private String userId;
	private int itemId;
	private int review;
	private String reviewBody;
	private ArrayList<String> reviewStar;
	private ArrayList<String> errorMessage = new ArrayList<String>();
	private ReviewDAO reviewDAO = new ReviewDAO();
	private BuyItemDTO buyItemDTO = new BuyItemDTO();
	private Map<String, Object> session;

	public String execute() throws SQLException {
		String result = ERROR;

		userId = session.get("userId").toString();
		itemId = buyItemDTO.getItemId();

		if (reviewBody.equals("")) {
			errorMessage.add("レビューが未入力です");
			System.out.println("レビュー内容無しエラー");
		} else if (reviewBody.length() > 100) {
			errorMessage.add("レビューは100文字までです");
			System.out.println("レビューは100文字まで");
		}

		if (reviewDAO.confirmPurchaseItemHistory(userId, itemId)) {
			reviewDAO.completeReview(userId, itemId, review, reviewBody);
			showReviewStar(review);
			result = SUCCESS;
			System.out.println("書き込み成功");
		} else {
			errorMessage.add("この商品の購入情報が無いので書き込みできません");
			System.out.println("この商品の購入情報が無いので書き込み不可");
		}

		return result;
	}

	public ArrayList<String> showReviewStar(int review) {
		int i = 0;
		for (i = 0; i <= review; i++) {
			reviewStar.add("★");
		}
		return reviewStar;
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
}
