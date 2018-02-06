package com.internousdev.knit.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.knit.dao.ReviewDAO;
import com.opensymphony.xwork2.ActionSupport;

public class ReviewAction extends ActionSupport implements SessionAware {
	private String userId;
	private String itemId;
	private int review;
	private String reviewBody;
	private ReviewDAO reviewDAO = new ReviewDAO();
	private Map<String, Object> session;

	public String execute() throws SQLException {
		String result = ERROR;

		userId = session.get("userId").toString();
		itemId = session.get("itemId").toString();

		if (reviewBody.equals("")) {
			System.out.println("レビュー内容無しエラー");
		} else if (reviewBody.length() > 100) {
			System.out.println("レビューは100文字まで");
		}

		if (reviewDAO.confirmPurchaseItemHistory(userId, itemId)) {
			reviewDAO.completeReview(userId, itemId, review, reviewBody);
			result = SUCCESS;
		} else {
			System.out.println("この商品の購入情報が無いので書き込み不可");
		}

		return result;
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

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
