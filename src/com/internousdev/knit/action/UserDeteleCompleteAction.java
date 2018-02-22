package com.internousdev.knit.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.knit.dao.CartDAO;
import com.internousdev.knit.dao.CategoryDAO;
import com.internousdev.knit.dao.ShowItemDAO;
import com.internousdev.knit.dao.UserDeleteDAO;
import com.internousdev.knit.dto.BuyItemDTO;
import com.internousdev.knit.dto.CartDTO;
import com.internousdev.knit.dto.CategoryDTO;
import com.opensymphony.xwork2.ActionSupport;

public class UserDeteleCompleteAction extends ActionSupport implements SessionAware{

	List<BuyItemDTO> buyItemList = new ArrayList<>();

	//DAOから受け取るカテゴリーリストを用意
	List<CategoryDTO> categoryList = new ArrayList<>();

	//ミニカート
	private ArrayList<CartDTO> miniCartList=new ArrayList<CartDTO>();
	RandomStringUtils rndStr = new RandomStringUtils();

	public Map<String,Object> session;
	public String execute() throws SQLException{
		int countComplete=0;
		String deleteUserId = session.get("userId").toString();
		UserDeleteDAO userDeleteDAO = new UserDeleteDAO();
ShowItemDAO showItemDAO = new ShowItemDAO();
		CartDAO cartDAO = new CartDAO();

		CategoryDAO categoryDAO = new CategoryDAO();

		ArrayList<CartDTO> miniCartList=new ArrayList<CartDTO>();

		RandomStringUtils rndStr = new RandomStringUtils();


		//上から購入履歴、レビュー、カートの中身、住所情報、ユーザーIDやパスワード　を削除するDAO
		countComplete+=userDeleteDAO.deletePurchaseHistory(deleteUserId);
		countComplete+=userDeleteDAO.deleteReviewInfo(deleteUserId);
		countComplete+=userDeleteDAO.deleteUserCartInfo(deleteUserId);
		countComplete+=userDeleteDAO.deleteUserDestinationInfo(deleteUserId);
		countComplete+=userDeleteDAO.deleteUserInfo(deleteUserId);
		//削除した件数チェック
		System.out.println(countComplete);
		session.clear();

		buyItemList = showItemDAO.ShowItem();

		session.put("buyItemList", buyItemList);

		categoryList = categoryDAO.getCategoryList();

		session.put("categoryList", categoryList);

		String tempUserId =RandomStringUtils.randomAlphabetic(10);

		session.put("tempUserId", tempUserId);

		miniCartList = cartDAO.TempUserMiniCart(session.get("tempUserId").toString());

		session.put("miniCartList", miniCartList);

		session.put("loginFlg", false);




		return SUCCESS;


	}



	public void setSession(Map<String,Object> session){
		this.session=session;
	}

}
