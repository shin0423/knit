package com.internousdev.knit.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.knit.dao.CartDAO;
import com.internousdev.knit.dao.CategoryDAO;
import com.internousdev.knit.dao.ShowItemDAO;
import com.internousdev.knit.dto.BuyItemDTO;
import com.internousdev.knit.dto.CartDTO;
import com.internousdev.knit.dto.CategoryDTO;
import com.opensymphony.xwork2.ActionSupport;

public class TopAction extends ActionSupport implements SessionAware {

	/*↓小池作成↓ */

	//仮ユーザーIDとloginflgを入れるためにsessionを作成
	private Map<String,Object> session;

	//DAOから受け取る商品リストを用意
	List<BuyItemDTO> buyItemList = new ArrayList<>();

	//DAOから受け取るカテゴリーリストを用意
	List<CategoryDTO> categoryList = new ArrayList<>();

	//ミニカート
	private ArrayList<CartDTO> miniCartList=new ArrayList<CartDTO>();

	public String execute(){

		CategoryDAO categoryDAO = new CategoryDAO();

		//商品一覧のDAOをインスタンス化
		ShowItemDAO showItemDAO = new ShowItemDAO();

		CartDAO cartDAO = new CartDAO();

		//ランダム文字列を作るためにインスタンス化
		RandomStringUtils rndStr = new RandomStringUtils();



		//↓


		try {


			categoryList = categoryDAO.getCategoryList();

			session.put("categoryList", categoryList);




			//↓商品を表示させるためのDAOのメソッドを使ってリストに入れる↓
			buyItemList = showItemDAO.ShowItem();

			//sessionに商品一覧を入れる
			session.put("buyItemList", buyItemList);

			//↓loginFlgがない場合loginFlgにfalseを入れてさらに仮ユーザーIDを発行する
			if (!(session.containsKey("loginFlg"))) {
				session.put("loginFlg", false);

				//仮ユーザーIDの変数作成(ランダムな英字を10文字作成)
				String tempUserId =rndStr.randomAlphabetic(10);

				//発行された仮ユーザーIDの中身をコンソールで確認
				System.out.println("仮ユーザーIDの値"+tempUserId);

				//仮ユーザーIDをsessionに入れる
				session.put("tempUserId", tempUserId);

				//sessionに仮ユーザーIDが入ってるか確認
				System.out.println("sessionのtempUserIdの値"+session.get("tempUserId").toString());
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

if ((boolean)session.get("loginFlg")) {
			miniCartList = cartDAO.UserMiniCart(session.get("userId").toString());

			if (miniCartList.isEmpty()) {
				System.out.println("やったぜ！");

			}

			session.put("miniCartList", miniCartList);
		}else {
			miniCartList = cartDAO.TempUserMiniCart(session.get("tempUserId").toString());

			if (miniCartList.isEmpty()) {
				System.out.println("やったぜ！仮");

			}
			session.put("miniCartList", miniCartList);
		}



		return SUCCESS;

		/*↑小池作成↑ */
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public List<BuyItemDTO> getBuyItemList() {
		return buyItemList;
	}

	public void setBuyItemList(List<BuyItemDTO> buyItemList) {
		this.buyItemList = buyItemList;
	}
}
