package com.internousdev.knit.action;

import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.knit.dao.AdmiDAO;
import com.internousdev.knit.util.InputChecker;
import com.opensymphony.xwork2.ActionSupport;

public class AdminInsertItemAction extends ActionSupport {
	private String itemId;
	private String itemName;
	private String itemNameKana;
	private String itemDescription;
	private String categoryId;
	private String releaseCompany;
	private String itemStock;
	private ArrayList<String> errorList = new ArrayList<>();
	private AdmiDAO admiDAO = new AdmiDAO();

	public String execute() throws SQLException {
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

		if (errorList.size() == 0) {
			int res = admiDAO.insertAdminItemInfo(itemId, itemName, itemNameKana, itemDescription, categoryId,
					releaseCompany, itemStock);
			if (res == 0) {
				result = ERROR;
			}
		} else {
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
}
