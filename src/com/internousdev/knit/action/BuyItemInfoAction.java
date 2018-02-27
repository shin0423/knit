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
import com.internousdev.knit.util.ItemIdChecker;
import com.opensymphony.xwork2.ActionSupport;

public class BuyItemInfoAction extends ActionSupport implements SessionAware {
	private String itemId;
	private int optionCount;
	private BuyItemDTO buyItemDTO = new BuyItemDTO();
	private List<Integer> optionNumber = new ArrayList<Integer>();
	private List<ReviewDTO> reviewList = new ArrayList<ReviewDTO>();
	private List<BuyItemDTO> categoryItemList = new ArrayList<>();

	Map<String,Object> session;

	private String token;

	@SuppressWarnings("static-access")
	public String execute() throws SQLException{
		buyItemDTO=null;
		BuyItemInfoDAO buyItemInfoDAO = new BuyItemInfoDAO();
		buyItemDTO=buyItemInfoDAO.selectBuyItemInfo(itemId);//商品IDを使い商品テーブルから詳細を持ってくる
		ReviewDAO reviewDAO = new ReviewDAO();
		setReviewList(reviewDAO.selectReviewAll(itemId));
		ItemIdChecker checker = new ItemIdChecker();
		if(!(checker.itemIdChecker(itemId))){//urlからない商品IDの商品を参照した場合エラーで弾く
			return "unknownItem";
		}

		RandomStringUtils rndStr = new RandomStringUtils();//ランダムトークンを使用し、多重にカートにアイテムが入らないようにする
		token = rndStr.randomAlphabetic(10);
		setToken(token);
		session.put("token", token);

		for(int i=0;reviewList.size() > i ; i++){//レビューのテーブルから値を取得し、レビューの星を計算する
			String stars="";
			for(int j=0;reviewList.get(i).getReview() > j; j++){
				stars+="★";
			}
			reviewList.get(i).setReviewStar(stars);
		}

		if (buyItemDTO.getItemStock() <= 5) {//商品購入の際在庫以上に商品追加できないように、プルダウンのオプション個数を制限する
			for (optionCount = 1; optionCount <= buyItemDTO.getItemStock(); optionCount++) {
				optionNumber.add(optionCount);
			}
		}
		setCategoryItemList(buyItemInfoDAO.categoryItemSelect(buyItemDTO.getCategoryId(),Integer.parseInt(itemId)));

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


	public List<Integer> getOptionNumber() {
		return optionNumber;
	}


	public void setOptionNumber(List<Integer> optionNumber) {
		this.optionNumber = optionNumber;
	}



	public String getToken() {
		return token;
	}


	public void setToken(String token) {
		this.token = token;
	}


	public Map<String, Object> getSession() {
		return session;
	}


	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
	public List<BuyItemDTO> getCategoryItemList() {
		return categoryItemList;
	}


	public void setCategoryItemList(List<BuyItemDTO> categoryItemList) {
		this.categoryItemList = categoryItemList;

	}


}
