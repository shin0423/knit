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
import com.internousdev.knit.util.AdminCountCheck;
import com.internousdev.knit.util.InputChecker;
import com.opensymphony.xwork2.ActionSupport;

public class AdminInsertItemAction extends ActionSupport implements SessionAware {
	private String itemId;
	private String itemName;
	private String itemNameKana;
	private String itemDescription;
	private String categoryId;
	private String releaseCompany;
	private String itemStock;
	private String price;


	private ArrayList<String> errorList = new ArrayList<>();
	private AdmiDAO admiDAO = new AdmiDAO();
	private ShowItemDAO showItemDAO = new ShowItemDAO();
	private List<BuyItemDTO> buyItemList = new ArrayList<>();
	public Map<String, Object> session;
	private CategoryDAO categoryDAO = new CategoryDAO();
	private List<CategoryDTO> categoryList = new ArrayList<>();

	private String token;

	@SuppressWarnings("static-access")
	public String execute() throws SQLException {

		if(!(session.containsKey("adminLoginFlg"))){
			return "errorPage";
		}

		AdminCountCheck countCheck = new AdminCountCheck();
		int count = Integer.parseInt(session.get("adminCount").toString());
		if(!countCheck.AdminCountChecker(count)){
			return "errorPage";
		}
		if(!(token.equals(session.get("token").toString()))){
			return "errorPage";
		}

		RandomStringUtils rndStr = new RandomStringUtils();
		token = rndStr.randomAlphabetic(10);
		setToken(token);
		session.put("token", token);

		System.out.println(categoryId);
		String result = SUCCESS;
		InputChecker i = new InputChecker();

		if (!i.itemIdChk(itemId).equals("OK")) {
			errorList.add(i.itemIdChk(itemId));
		}

		if (!i.itemNameChk(itemName).equals("OK")) {
			errorList.add(i.itemNameChk(itemName));
		}

		if (!i.itemNameKanaChk(itemNameKana).equals("OK")) {
			errorList.add(i.itemNameKanaChk(itemNameKana));
		}

		if (!i.itemDescriptionChk(itemDescription).equals("OK")) {
			errorList.add(i.itemDescriptionChk(itemDescription));
		}

		if (!i.releaseCompanyChk(releaseCompany).equals("OK")) {
			errorList.add(i.releaseCompanyChk(releaseCompany));
		}

		if (!i.insertItemStockChk(itemStock).equals("OK")) {
			errorList.add(i.insertItemStockChk(itemStock));
		}

		if (!i.priceChk(price).equals("OK")) {
			errorList.add(i.priceChk(price));
		}

		out :if (errorList.size() == 0) {
			int intItemId=Integer.parseInt(itemId);
			buyItemList = showItemDAO.ShowItem();
			for (int j = 0; buyItemList.size() > j; j++) {
				if (itemName.equals(buyItemList.get(j).getItemName()) || intItemId==(buyItemList.get(j).getItemId())
						|| itemNameKana.equals(buyItemList.get(j).getItemNameKana())) {
					errorList.add("入力された商品はすでに登録されています。");
					result= ERROR;
					break out;
				}
			}
			int a =Integer.parseInt(price);


			if (!( a < 1000000)) {
				return "errorPage";
			}

			price =String.valueOf(a);

			admiDAO.insertAdminItemInfo(itemId, itemName, itemNameKana, itemDescription, categoryId, price,
					releaseCompany, itemStock);
			errorList = null;
			buyItemList.clear();
			buyItemList = showItemDAO.ShowItem();
			session.put("buyItemList", buyItemList);
		} else {

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

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemNameKana() {
		return itemNameKana;
	}

	public void setItemNameKana(String itemNameKana) {
		this.itemNameKana = itemNameKana;
	}

	public String getItemDescription() {
		return itemDescription;
	}

	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getReleaseCompany() {
		return releaseCompany;
	}

	public void setReleaseCompany(String releaseCompany) {
		this.releaseCompany = releaseCompany;
	}

	public ArrayList<String> getErrorList() {
		return errorList;
	}

	public void setErrorList(ArrayList<String> errorList) {
		this.errorList = errorList;
	}

	public String getItemStock() {
		return itemStock;
	}

	public void setItemStock(String itemStock) {
		this.itemStock = itemStock;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
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

	public Map<String, Object> getSession() {
		return session;
	}
}
