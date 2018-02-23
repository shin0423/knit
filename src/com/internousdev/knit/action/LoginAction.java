package com.internousdev.knit.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.knit.dao.CartDAO;
import com.internousdev.knit.dao.CategoryDAO;
import com.internousdev.knit.dao.LoginDAO;
import com.internousdev.knit.dto.CartDTO;
import com.internousdev.knit.dto.CategoryDTO;
import com.internousdev.knit.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport implements SessionAware {
	private String userId;
	private String password;
	private ArrayList<String> errorMessage = new ArrayList<String>();
	private boolean saveId;
	private LoginDAO loginDAO = new LoginDAO();
	private LoginDTO loginDTO = new LoginDTO();
	private ArrayList<CartDTO> userCartList = new ArrayList<CartDTO>();
    private CartDAO cartDAO = new CartDAO();
    //private DestinationInfoDAO destinationInfoDAO = new DestinationInfoDAO();
    //private ArrayList<DestinationInfoDTO> destinationInfoDTOList = new ArrayList<DestinationInfoDTO>();
    private ArrayList<CartDTO> tempUserCartList = new ArrayList<CartDTO>();
    private ArrayList<Integer> userCartItemIdList = new ArrayList<Integer>();
    private ArrayList<Integer> tempUserCartItemIdList = new ArrayList<Integer>();
	private int totalPrice;
	private Map<String, Object> session;
	private List<String> errorList = new ArrayList<>();
	private String token;

	//ミニカート
	private ArrayList<CartDTO> miniCartList=new ArrayList<CartDTO>();

	private List<CategoryDTO> categoryList = new ArrayList<>();

	@SuppressWarnings("static-access")
	public String execute() throws SQLException {
		String result = ERROR;

		loginDTO = loginDAO.getUserInfo(userId, password);

		/**
		 * ユーザーIDチェック
		 */
		if (userId == null || userId.equals("")) {
			errorMessage.add("ユーザーIDが未入力です");
			result = ERROR;
		} else if ( !( 1 <= userId.length() && userId.length() <= 8 ) ) {
			errorMessage.add("ユーザーIDは1文字以上8文字以下です");
		} else if ( !( userId.matches("^[0-9a-zA-Z]+$") ) ) {
			errorMessage.add("ユーザーIDは半角英数字です");
        }



		/**
		 * パスワード入力チェック
		 */
		if (password == null || password.equals("")) {
			errorMessage.add("パスワードが未入力です");
		} else if ( !( 1 <= password.length() && password.length() <= 16 ) ) {
			errorMessage.add("パスワードは1文字以上16文字以下です");
		}

		/**
		 * IDを保存するか
		 */

		if (saveId) {
			session.put("saveId", loginDTO.getUserId());
		} else {
			session.remove("saveId");
		}




		if (!loginDAO.getExistUserId(userId)) {
            errorMessage.add("IDが存在しません");
            System.out.println("errorMessage");
		}

		if (userId == null || password == null) {
			result = ERROR;
		} else if ( userId.equals(loginDTO.getUserId()) && password.equals(loginDTO.getPassword()) )  {
			/**
			 * 既にログイン状態ならエラー
			 */
			if ( (boolean) session.get("loginFlg") ) {
				errorMessage.add("既にログイン状態です。一度ログアウトしてから試してください");
				System.out.println(errorMessage);
				result = ERROR;
			/**
			 * 管理者か一般ユーザーか判断
			 */
			} else if (loginDTO.getAdminFlg().equals("1") ) {
				CategoryDAO categoryDAO = new CategoryDAO();
				setCategoryList(categoryDAO.getCategoryList());
				loginDAO.login(loginDTO);
				session.put("adminLoginFlg", true);
				System.out.println("管理者ログイン成功");
				errorMessage=null;
				RandomStringUtils rndStr = new RandomStringUtils();
				token = rndStr.randomAlphabetic(10);
				System.out.println("トークン値"+token);
				setToken(token);
				session.put("token", token);
				result = "admin";

				/**
				 * 一般ユーザーとしてログイン
				 */
			} else if (loginDTO.getAdminFlg().equals("0")) {
				loginDAO.login(loginDTO);
				session.put("userId", loginDTO.getUserId());
				session.put("loginFlg", true);
				makeCartList();
				int i = 0;
				i = calcTotalPrice(userCartList);
				session.put("allTotalPrice", i);
				System.out.println("一般ログイン成功");

				//小池
				CartDAO cartDAO = new CartDAO();
				miniCartList = cartDAO.UserMiniCart(session.get("userId").toString());
				session.put("miniCartList", miniCartList);

				result = SUCCESS;
			}

		} else {
			errorMessage.add("ログイン情報を間違えています");
		}
		return result;
		}

	/**
	 * カートリスト生成メソッド
	 * @throws SQLException
	 */
	public void makeCartList() throws SQLException {
		userCartList = cartDAO.showUserCartList(session.get("userId").toString());
		tempUserCartList = cartDAO.showTempUserCartList(session.get("tempUserId").toString());

		/**
		 * ユーザーのカート内商品のIDを全取得してリストに入れる
		 */
		int i = 0;
		for (i = 0; i < userCartList.size(); i++) {
			userCartItemIdList.add(userCartList.get(i).getItemId());
		}
		System.out.println("ユーザーカートの商品のIDリスト生成 : " + userCartItemIdList);

		/**
		 * 仮ユーザーのカート内商品のIDを全取得してリストに入れる
		 */
		i = 0;
		for (i = 0; i < tempUserCartList.size(); i++) {
			tempUserCartItemIdList.add(tempUserCartList.get(i).getItemId());
		}
		System.out.println("仮ユーザーカートの商品のIDリスト生成 : " + tempUserCartItemIdList);

		/**
		 * ユーザーカートリストと仮ユーザーカートリストの重複をチェック
		 */
		i = 0;
		for (i = 0; i < tempUserCartItemIdList.size(); i++) {

			/**
			 * 仮ユーザーカートリストにユーザーカートリストにある物が含まれているか
			 */
			boolean exist = userCartItemIdList.contains(Integer.valueOf(tempUserCartItemIdList.get(i)) );
			System.out.println("カート重複確認 : " + exist);

			/**
			 * もし含まれていた場合の処理
			 */
			if (exist) {

				/**
				 * 重複商品の選択数をユーザーのカート情報の選択数に足すメソッド
				 */
				cartDAO.changeItemStockId(Integer.valueOf(tempUserCartList.get(i).getItemCount()),
						Integer.valueOf(tempUserCartItemIdList.get(i)),
						session.get("userId").toString());
				System.out.println(session.get("userId").toString() + "のカートに" + tempUserCartItemIdList.get(i) + "(このIDに該当する商品)の重複分" + tempUserCartList.get(i).getItemCount() + "個追加");

				/**
				 * 仮ユーザーカートリストから重複してた商品を削するメソッド
				 */
				cartDAO.deleteSeparete(session.get("tempUserId").toString(),
						tempUserCartItemIdList.get(i));
				System.out.println(session.get("tempUserId").toString() + "のカート内の" + tempUserCartItemIdList.get(i) + "(このIDに該当する商品)を削除");
				/**
				 * 含まれていなかった場合の処理
				 */
			} else {
				cartDAO.changeUserId(session.get("tempUserId").toString(),
						session.get("userId").toString());
				System.out.println(session.get("tempUserId").toString() + "のカート情報を" + session.get("userId").toString() + "のカート情報に統合");
			}

		}
	}

    /**
	 * 合計値段を計算するメソッド
	 */
	public int calcTotalPrice(ArrayList<CartDTO> cartDTOList) {
		totalPrice = 0;
		for (CartDTO cartDTO : cartDTOList) {
			totalPrice += cartDTO.getPrice() * cartDTO.getItemCount();
			System.out.println("合計値段" + totalPrice + "円");
		}

		return totalPrice;
	}

	/**
	 * 宛先へ直接飛ばす
	 * @return

	public String getDestinationInfo() {
		if ( (boolean) session.get("loginFlg") ) {
			destinationInfoDTOList = destinationInfoDAO.SearchDestination(session.get("userId").toString());

			if (destinationInfoDTOList.size() > 0) {
				result = SUCCESS;
			} else if ( !(boolean) session.get("loginFlg") ) {
				result = ERROR;
			} else {
				result = "destination";
			}
		return result;
		}
	}
	*/


    public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public ArrayList<String> getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(ArrayList<String> errorMessage) {
		this.errorMessage = errorMessage;
	}

	public boolean getSaveId() {
		return saveId;
	}

	public void setSaveId(boolean saveId) {
		this.saveId = saveId;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public ArrayList<CartDTO> getUserCartList() {
		return userCartList;
	}

	public void setUserCartList(ArrayList<CartDTO> userCartList) {
		this.userCartList = userCartList;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	public List<CategoryDTO> getCategoryList() {
		return categoryList;
	}

	public void setCategoryList(List<CategoryDTO> categoryList) {
		this.categoryList = categoryList;
	}

	public List<String> getErrorList() {
		return errorList;
	}

	public void setErrorList(List<String> errorList) {
		this.errorList = errorList;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
}