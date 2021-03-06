package com.internousdev.knit.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.knit.dao.BuyItemDAO;
import com.internousdev.knit.dto.BuyItemDTO;
import com.opensymphony.xwork2.ActionSupport;

public class BuyItemAction extends ActionSupport implements SessionAware{
	private String searchWord; //ユーザーが入力した検索ワード
	private List<BuyItemDTO> buyItemAfterSearchList = new ArrayList<>();
	public Map<String,Object> session;
	private String categoryId;
	private String moreUp;
	private String moreDown;



	private String token;

	public String execute() throws SQLException{
		BuyItemDAO buyItemDAO=new BuyItemDAO();//検索用DAO
		searchWord = searchWord.replace("　", " ");
		List<String> searchList = new ArrayList<String>();
		String[] searchWordList = searchWord.split(" ", 0);//複数検索対応するため、スペースで区切って分ける

		for(int i=0; i < searchWordList.length; i++){//分けた文章をリストに格納
			if(String.valueOf(searchWordList[i])!=" "){
				searchList.add(String.valueOf(searchWordList[i]));
			}
		}

		if(searchList.size() == 0){//分けた文がなければ空文字を挿入
			searchList.add("");
			}
		System.out.println(searchList.size());

		if (moreUp.equals("")) {//値段範囲の最低値がなければ0を入れる
			moreUp ="0";
		}

		if (moreDown.equals("")) {//値段範囲の最高値がなければ1000000000を入れる
			moreDown ="1000000000";
		}


		buyItemAfterSearchList = buyItemDAO.selectItemByList(searchList,categoryId,moreUp,moreDown);//実際に検索し結果をリストに入れjspに渡す。


	return SUCCESS;

	}


	public void setSession(Map<String,Object> session){
		this.session=session;

	}


	public List<BuyItemDTO> getBuyItemAfterSearchList() {
		return buyItemAfterSearchList;
	}


	public void setBuyItemAfterSearchList(List<BuyItemDTO> buyItemAfterSearchList) {
		this.buyItemAfterSearchList = buyItemAfterSearchList;
	}


	public String getSearchWord() {
		return searchWord;
	}


	public void setSearchWord(String searchWord) {
		this.searchWord = searchWord;
	}


	public String getCategoryId() {
		return categoryId;
	}


	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}



	public String getMoreUp() {
		return moreUp;
	}


	public void setMoreUp(String moreUp) {
		this.moreUp = moreUp;
	}


	public String getMoreDown() {
		return moreDown;
	}


	public void setMoreDown(String moreDown) {
		this.moreDown = moreDown;
	}


	public String getToken() {
		return token;
	}


	public void setToken(String token) {
		this.token = token;
	}



}
