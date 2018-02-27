package com.internousdev.knit.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.knit.dao.CategoryDAO;
import com.internousdev.knit.dao.ShowItemDAO;
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
	private ArrayList<String> errorList = new ArrayList<>();
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
		//ランダムトークンチェック
		if(!(token.equals(session.get("token").toString()))){
			return "errorPage";
		}
		RandomStringUtils rndStr = new RandomStringUtils();
		token = rndStr.randomAlphabetic(10);
		setToken(token);
		session.put("token", token);

		result=SUCCESS;
		categoryList = categoryDAO.getCategoryList();

		if( Integer.parseInt(categoryId) > 0 &&  Integer.parseInt(categoryId) < 5){
			errorList.add("初期のカテゴリーは削除できません");
			return ERROR;

		}
		//デリート処理
		int truthCategoryId = categoryDAO.selectCategory(categoryId);
		int res = categoryDAO.deleteCategory(categoryId);
		if (res > 0) {
			categoryDAO.deleteCategoryItem(truthCategoryId);
			categoryList.clear();
			categoryList = categoryDAO.getCategoryList();
			String[] categoryIdArray = new String[categoryList.size()];
			for(int i = 0;categoryList.size() > i ; i++){
				categoryIdArray[i] = categoryList.get(i).getId();
			}
			for(int i = 0 ; categoryList.size() > i ; i++){
				categoryDAO.updateCategoryId(i+1,categoryIdArray[i]);
			}
			ShowItemDAO showItemDAO = new ShowItemDAO();
			session.put("buyItemList",showItemDAO.ShowItem());
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

	public ArrayList<String> getErrorList() {
		return errorList;
	}

	public void setErrorList(ArrayList<String> errorList) {
		this.errorList = errorList;
	}

}
