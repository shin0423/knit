package com.internousdev.knit.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.knit.dao.BuyItemInfoDAO;
import com.internousdev.knit.dao.ReviewDAO;
import com.internousdev.knit.dao.ReviewDeleteDAO;
import com.internousdev.knit.dto.BuyItemDTO;
import com.internousdev.knit.dto.ReviewDTO;
import com.internousdev.knit.util.IdCheck;
import com.opensymphony.xwork2.ActionSupport;

public class ReviewDeleteAction extends ActionSupport implements SessionAware {
	private int itemId;
	private String token;
	private Map<String, Object> session;
	private ReviewDeleteDAO reviewDeleteDAO = new ReviewDeleteDAO();
	private BuyItemDTO buyItemDTO = new BuyItemDTO();
	private List<ReviewDTO> reviewList = new ArrayList<ReviewDTO>();
	private ArrayList<String> reviewErrorMessage = new ArrayList<String>();

	@SuppressWarnings("static-access")
	public String execute() throws SQLException {
		if(session.containsKey("userId")){
			IdCheck idCheck = new IdCheck();
			if(idCheck.checkUser(session.get("userId").toString())){
				return "errorPage";
			}
		}

		RandomStringUtils rndStr = new RandomStringUtils();
		token = rndStr.randomAlphabetic(10);
		System.out.println("トークン値"+token);
		setToken(token);
		session.put("token", token);

		BuyItemInfoDAO buyItemInfoDAO = new BuyItemInfoDAO();
		ReviewDAO reviewDAO = new ReviewDAO();

		String result = ERROR;

		setBuyItemDTO( buyItemInfoDAO.selectBuyItemInfo(String.valueOf(itemId)) );
		setReviewList( reviewDAO.selectReviewAll(String.valueOf(itemId)) );


		if(!session.get("userId").equals("")) {

			boolean exist = reviewDAO.confirmReviewHistory(session.get("userId").toString(), Integer.valueOf(itemId));

			if (exist) {
				reviewDeleteDAO.reviewDelete( session.get("userId").toString(), Integer.valueOf(itemId) );
				setReviewList(reviewDAO.selectReviewAll(String.valueOf(itemId)));
				System.out.println("itemId取得テスト"+itemId);
				result = SUCCESS;
			} else {
				reviewErrorMessage.add("削除するレビューがありません");
				System.out.println("itemId取得テスト"+itemId);
			}

		} else {
			reviewErrorMessage.add("レビューを消すにはログインしてください");
			System.out.println("itemId取得テスト"+itemId);
		}


		return result;
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
