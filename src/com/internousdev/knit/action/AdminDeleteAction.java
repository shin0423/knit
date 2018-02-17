package com.internousdev.knit.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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

	public String execute() throws SQLException {
		int res = admiDAO.deleteAdminItemInfo(itemId);

		if (res > 0) {
			result = SUCCESS;
			setCategoryList(categoryDAO.getCategoryList());
			buyItemList = showItemDAO.ShowItem();
			session.put("buyItemList", buyItemList);
		} else{
			result = ERROR;

		}
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

}
