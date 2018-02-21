package com.internousdev.knit.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.knit.dao.AdmiDAO;
import com.internousdev.knit.dao.CategoryDAO;
import com.internousdev.knit.dao.ShowItemDAO;
import com.internousdev.knit.dto.BuyItemDTO;
import com.internousdev.knit.dto.CategoryDTO;
import com.opensymphony.xwork2.ActionSupport;

public class AdminDeleteAction extends ActionSupport implements SessionAware {
	private String itemId;
	private String result;
	private AdmiDAO admiDAO = new AdmiDAO();
	private ShowItemDAO showItemDAO = new ShowItemDAO();
	private CategoryDAO categoryDAO = new CategoryDAO();
	private List<BuyItemDTO> buyItemList = new ArrayList<>();
	private List<CategoryDTO> categoryList = new ArrayList<>();
	public Map<String,Object> session;
	private String token;

	@SuppressWarnings("static-access")
	public String execute() throws SQLException {
		//管理者フラグチェック
		if(!(session.containsKey("adminLoginFlg"))){
			return "errorPage";
		}
		//ランダムトークンチェック
		if(!(token.equals(session.get("token").toString()))){
			return "errorPage";
		}
		RandomStringUtils rndStr = new RandomStringUtils();
		token = rndStr.randomAlphabetic(10);
		System.out.println("トークン値"+token);
		setToken(token);
		session.put("token", token);
		int res = admiDAO.deleteAdminItemInfo(itemId);

		if (res > 0) {
			result = SUCCESS;
			setCategoryList(categoryDAO.getCategoryList());
			buyItemList = showItemDAO.ShowItem();
			session.put("buyItemList", buyItemList);
		} else{
			result = ERROR;

		}
		categoryList.clear();
		categoryList = categoryDAO.getCategoryList();
		return result;
	}

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public List<CategoryDTO> getCategoryList() {
		return categoryList;
	}

	public void setCategoryList(List<CategoryDTO> categoryList) {
		this.categoryList = categoryList;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

}
