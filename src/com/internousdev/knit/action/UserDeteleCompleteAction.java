package com.internousdev.knit.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.knit.dao.UserDeleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class UserDeteleCompleteAction extends ActionSupport implements SessionAware{
	public Map<String,Object> session;
	public String execute(){
		int countComplete=0;
		String deleteUserId = session.get("userId").toString();
		UserDeleteDAO userDeleteDAO = new UserDeleteDAO();
		//上から購入履歴、レビュー、カートの中身、住所情報、ユーザーIDやパスワード　を削除するDAO
		countComplete+=userDeleteDAO.deletePurchaseHistory(deleteUserId);
		countComplete+=userDeleteDAO.deleteReviewInfo(deleteUserId);
		countComplete+=userDeleteDAO.deleteUserCartInfo(deleteUserId);
		countComplete+=userDeleteDAO.deleteUserDestinationInfo(deleteUserId);
		countComplete+=userDeleteDAO.deleteUserInfo(deleteUserId);
		//削除した件数チェック
		System.out.println(countComplete);
		return SUCCESS;


	}



	public void setSession(Map<String,Object> session){
		this.session=session;
	}

}
