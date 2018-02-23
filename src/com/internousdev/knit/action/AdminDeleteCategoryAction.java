package com.internousdev.knit.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.knit.dao.CategoryDAO;
import com.internousdev.knit.dto.CategoryDTO;
import com.internousdev.knit.util.AdminCountCheck;
import com.opensymphony.xwork2.ActionSupport;

public class AdminDeleteCategoryAction extends ActionSupport implements SessionAware{
	private String categoryId;
	private String result;
	private CategoryDAO categoryDAO = new CategoryDAO();
	private List<CategoryDTO> categoryList = new ArrayList<>();
	public Map<String,Object> session;
	private String token;
	@SuppressWarnings("static-access")
	public String execute() throws SQLException {
		//管理者フラグチェック
		if(!(session.containsKey("adminLoginFlg"))){
			return "errorPage";
		}
		AdminCountCheck countCheck = new AdminCountCheck();
		int count = Integer.parseInt(session.get("adminCount").toString());
		if(!countCheck.AdminCountChecker(count)){
			return "errorPage";
		}
		//ランダムトークんチェック
		if(!(token.equals(session.get("token").toString()))){
			return "errorPage";
		}
		RandomStringUtils rndStr = new RandomStringUtils();
		token = rndStr.randomAlphabetic(10);
		System.out.println("トークン値"+token);
		setToken(token);
		session.put("token", token);

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

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

}
