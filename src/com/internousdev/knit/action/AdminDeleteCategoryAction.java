package com.internousdev.knit.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.knit.dao.CategoryDAO;
import com.internousdev.knit.dto.CategoryDTO;
import com.opensymphony.xwork2.ActionSupport;

public class AdminDeleteCategoryAction extends ActionSupport implements SessionAware{
	private String categoryId;
	private String result;
	private CategoryDAO categoryDAO = new CategoryDAO();
	private List<CategoryDTO> categoryList = new ArrayList<>();
	public Map<String,Object> session;

	public String execute() throws SQLException {
		result=SUCCESS;
		System.out.println(categoryId);
		categoryList = categoryDAO.getCategoryList();


		int res = categoryDAO.deleteCategory(categoryId);
		System.out.println(res);
		if (res > 0) {
			System.out.println("success");
			categoryList.clear();
			categoryList = categoryDAO.getCategoryList();
			String[] categoryIdArray = new String[categoryList.size()];
			for(int i = 0;categoryList.size() > i ; i++){
				categoryIdArray[i] = categoryList.get(i).getId();
			}
			for(int i = 0 ; categoryList.size() > i ; i++){
				categoryDAO.updateCategoryId(i+1,categoryIdArray[i]);
			}
		} else{
			result =ERROR;

		}
		categoryList.clear();
		categoryList = categoryDAO.getCategoryList();
		session.put("categoryList", categoryList);
		return result;
	}

	public List<CategoryDTO> getCategoryList() {
		return categoryList;
	}

	public void setCategoryList(List<CategoryDTO> categoryList) {
		this.categoryList = categoryList;
	}

	public String getCategoryId(){
		return categoryId;
	}

	public void setCategoryId(String categoryId){
		this.categoryId=categoryId;
	}

	public void setSession(Map<String,Object> session){
		this.session=session;
	}

}
