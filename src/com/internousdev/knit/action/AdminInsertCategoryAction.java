package com.internousdev.knit.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.knit.dao.CategoryDAO;
import com.internousdev.knit.dao.ShowItemDAO;
import com.internousdev.knit.dto.BuyItemDTO;
import com.internousdev.knit.dto.CategoryDTO;
import com.internousdev.knit.util.InputChecker;

import com.opensymphony.xwork2.ActionSupport;

public class AdminInsertCategoryAction extends ActionSupport implements SessionAware  {

	private String errorMessage;
	private CategoryDAO categoryDAO = new CategoryDAO();
	private List<CategoryDTO> categoryList = new ArrayList<>();
	public Map<String,Object> session;
	private String categoryName;

	public String execute throws SQLException{
		String result=SUCCESS;
		errorMessage = null;
		InputChecker i = new InputChecker();

		if (!i.categoryNameChk(categoryName).equals("OK")) {
			setErrorMessage((i.insertItemStockChk(categoryName)));
			result = ERROR;
	}
}
