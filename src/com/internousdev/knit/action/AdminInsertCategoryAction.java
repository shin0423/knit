package com.internousdev.knit.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.knit.dao.CategoryDAO;
import com.internousdev.knit.dto.CategoryDTO;
import com.internousdev.knit.util.InputChecker;
import com.opensymphony.xwork2.ActionSupport;

public class AdminInsertCategoryAction extends ActionSupport implements SessionAware  {

	private CategoryDAO categoryDAO = new CategoryDAO();
	private List<CategoryDTO> categoryList = new ArrayList<>();
	public Map<String,Object> session;
	private String categoryName;
	private String categoryId;
	private String categoryDescription;
	private ArrayList<String> errorList = new ArrayList<>();


	public String execute() throws SQLException{
		String result=SUCCESS;
		categoryList = categoryDAO.getCategoryList();

		InputChecker i = new InputChecker();

		if (!i.categoryNameChk(categoryName).equals("OK")) {
			errorList.add(i.categoryNameChk(categoryName));
		}

		if (!i.categoryIdChk(categoryId).equals("OK")) {
			errorList.add(i.categoryIdChk(categoryId));
		}

		if (!i.categoryDescriptionChk(categoryDescription).equals("OK")) {
			System.out.println(i.categoryDescriptionChk(categoryDescription));
			errorList.add(i.categoryDescriptionChk(categoryDescription));
		}

		out :if (errorList.size() == 0) {
			categoryList = categoryDAO.getCategoryList();
			for (int j = 0; categoryList.size() > j; j++) {
				if (categoryName.equals(categoryList.get(j).getCategoryName()) || categoryId.equals(categoryList.get(j).getCategoryId())
						|| categoryDescription.equals(categoryList.get(j).getCategoryDescription())) {
					errorList.add("入力された商品はすでに登録されています。");
					result= ERROR;
					break out;
				}
			}
			categoryDAO.insertCategoryName(categoryId,categoryName,categoryDescription);
			categoryList.clear();
			categoryList = categoryDAO.getCategoryList();
			String[] categoryIdArray = new String[categoryList.size()];
			for(int j = 0;categoryList.size() > j ; j++){
				categoryIdArray[j] = categoryList.get(j).getId();
			}
			for(int o = 0 ; categoryList.size() > o ; o++){
				categoryDAO.updateCategoryId(o+1,categoryIdArray[o]);
			}
			categoryList.clear();
			categoryList = categoryDAO.getCategoryList();
			errorList=null;
			}else{
			result=ERROR;
		}
		return result;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryDescription() {
		return categoryDescription;
	}

	public void setCategoryDescription(String categoryDescription) {
		this.categoryDescription = categoryDescription;
	}

	public void setSession(Map<String,Object> session){
		this.session=session;
	}

	public List<CategoryDTO> getCategoryList() {
		return categoryList;
	}

	public void setCategoryList(List<CategoryDTO> categoryList) {
		this.categoryList = categoryList;
	}

	public ArrayList<String> getErrorList() {
		return errorList;
	}

	public void setErrorList(ArrayList<String> errorList) {
		this.errorList = errorList;
	}

}
