package com.internousdev.knit.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.knit.dao.AdmiDAO;
import com.internousdev.knit.dao.ShowItemDAO;
import com.internousdev.knit.dto.BuyItemDTO;
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
	public Map<String,Object> session;

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

		if (!i.priceChk(price).equals("OK")) {
			errorList.add(i.priceChk(price));
		}

		if (errorList.size() == 0) {
			int res = admiDAO.insertAdminItemInfo(itemId, itemName, itemNameKana, itemDescription, categoryId, price,
					releaseCompany, itemStock);
			errorList = null;
			if (res == 0) {
				result = ERROR;
			}else {
				buyItemList = showItemDAO.ShowItem();
				session.put("buyItemList", buyItemList);
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

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
