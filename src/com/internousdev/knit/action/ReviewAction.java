package com.internousdev.knit.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.knit.dao.BuyItemInfoDAO;
import com.internousdev.knit.dao.ReviewDAO;
import com.internousdev.knit.dto.BuyItemDTO;
import com.internousdev.knit.dto.ReviewDTO;
import com.internousdev.knit.util.IdCheck;
import com.opensymphony.xwork2.ActionSupport;

public class ReviewAction extends ActionSupport implements SessionAware {
	private String token;
	private int itemId;
	private int review = 0;
	private List<Integer> optionNumber = new ArrayList<Integer>();
	private String reviewBody;
	private ArrayList<String> reviewStar = new ArrayList<String>();
	private ArrayList<String> reviewErrorMessage = new ArrayList<String>();
	private ReviewDAO reviewDAO = new ReviewDAO();
	private BuyItemInfoDAO buyItemInfoDAO = new BuyItemInfoDAO();
	private Map<String, Object> session;
	private BuyItemDTO buyItemDTO = new BuyItemDTO();
	private List<ReviewDTO> reviewList = new ArrayList<ReviewDTO>();
	private List<BuyItemDTO> categoryItemList = new ArrayList<BuyItemDTO>();

	@SuppressWarnings("static-access")
	public String execute() throws SQLException {
		if(session.containsKey("userId")){
			IdCheck idCheck = new IdCheck();
			if(idCheck.checkUser(session.get("userId").toString())){
				return "errorPage";
			}
		}
		String result = ERROR;

		RandomStringUtils rndStr = new RandomStringUtils();
		token = rndStr.randomAlphabetic(10);
		setToken(token);
		session.put("token", token);

		setBuyItemDTO(buyItemInfoDAO.selectBuyItemInfo(String.valueOf(itemId)));
		setReviewList(reviewDAO.selectReviewAll(String.valueOf(itemId)));
		setCategoryItemList(buyItemInfoDAO.categoryItemSelect(buyItemDTO.getCategoryId(),itemId));
		starDisplay();

		if ((boolean) session.get("loginFlg")) {
			boolean exist = reviewDAO.confirmReviewHistory(session.get("userId").toString(), Integer.valueOf(itemId));
			if (reviewBody.equals("")) {
				reviewErrorMessage.add("レビューが未入力です");
				getOptionNum();

			} else if (reviewBody.length() > 100) {
				reviewErrorMessage.add("レビューは100文字までです");
				getOptionNum();

			} else if (session.containsKey("userId") && exist) {
				reviewErrorMessage.add("一度レビューに書き込んだことがある場合は書き込めません");
				getOptionNum();

			} else if ( !reviewDAO.confirmPurchaseItemHistory(session.get("userId").toString(), Integer.valueOf(itemId)) ) {
				reviewErrorMessage.add("この商品の購入履歴がないためレビューできません");
				getOptionNum();

			} else if ( !(String.valueOf(review).matches("[+-]?(?:0[xX])?[0-9a-fA-F]+[hH]?")) ) {
				reviewErrorMessage.add("不正な値を検出した為、書き込みを完了できませんでした");
				getOptionNum();
				System.out.println("ちぇっくきのう"+String.valueOf(review).matches("[+-]?(?:0[xX])?[0-9a-fA-F]+[hH]?"));

				result = "input";

			} else if ( 6 <= review || review <= 0 ) {
				reviewDAO.completeReview(session.get("userId").toString(), Integer.valueOf(itemId), 1, reviewBody);
				setReviewList(reviewDAO.selectReviewAll(String.valueOf(itemId)));
				reviewErrorMessage.add("星数の異常値を検出した為、星の数1で書き込みを完了しました");
				starDisplay();
				getOptionNum();

				itemId = buyItemDTO.getItemId();


				result = SUCCESS;
			} else if ( 1 <= review && review <= 5 ) {
				reviewDAO.completeReview(session.get("userId").toString(), Integer.valueOf(itemId), Integer.valueOf(review), reviewBody);
				setReviewList(reviewDAO.selectReviewAll(String.valueOf(itemId)));
				starDisplay();
				getOptionNum();

				itemId = buyItemDTO.getItemId();


				result = SUCCESS;
			}
		} else {
			reviewErrorMessage.add("ログインしていない状態でレビューに書き込めません");
			getOptionNum();
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

	public void getOptionNum () {
		for (int optionCount = 1; optionCount <= buyItemDTO.getItemStock(); optionCount++) {
			optionNumber.add(optionCount);
		}
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
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

	public List<BuyItemDTO> getCategoryItemList() {
		return categoryItemList;
	}

	public void setCategoryItemList(List<BuyItemDTO> categoryItemList) {
		this.categoryItemList = categoryItemList;
	}

	public List<Integer> getOptionNumber() {
		return optionNumber;
	}

	public void setOptionNumber(List<Integer> optionNumber) {
		this.optionNumber = optionNumber;
	}

}
