package com.internousdev.knit.action;
import java.sql.SQLException;

import com.internousdev.knit.dao.AdmiDAO;
import com.internousdev.knit.util.InputChecker;
import com.opensymphony.xwork2.ActionSupport;

public class AdminInsertCountAction extends ActionSupport {
	private int itemStock;
	private String insertItemStock;
	private String itemId;
	private int totalStock;
	private int intInsertItemStock;
	private String errorMessage;
	private AdmiDAO admiDAO=new AdmiDAO();

	public String execute() throws SQLException {
		String result=SUCCESS;
		InputChecker i=new InputChecker();

		if(!i.insertItemStockChk(insertItemStock).equals("OK")){
			setErrorMessage((i.insertItemStockChk(insertItemStock)));
			result=ERROR;
		}else{intInsertItemStock=Integer.parseInt(insertItemStock);
			  totalStock=intInsertItemStock+itemStock;
			  admiDAO.insertAdminItemCount(totalStock,itemId);
			  }
		return result;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public int getItemStock(){
		return itemStock;
	}
	public void setItemStock(int itemStock){
		this.itemStock=itemStock;
	}
	public String getInsertItemStock(){
		return insertItemStock;
	}
	public void setInsertItemStock(String insertItemStock){
		this.insertItemStock=insertItemStock;
	}
	public String getItemId(){
		return itemId;
	}
	public void setItemId(String itemId){
		this.itemId=itemId;
	}
	public int getTotalStock(){
		return totalStock;
	}
	public void setTotalStock(int totalStock){
		this.totalStock=totalStock;
	}
	public int getIntInsertItemStock(){
		return intInsertItemStock;
	}
	public void setIntInsertItemStock(int intInsertItemStock){
		this.intInsertItemStock=intInsertItemStock;
	}

}
