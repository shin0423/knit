package com.internousdev.knit.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.knit.dao.CartDAO;
import com.internousdev.knit.dao.LoginDAO;
import com.internousdev.knit.dto.CartDTO;
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
	private int totalPrice;
	private Map<String, Object> session;

	public String execute() throws SQLException {
		String result = ERROR;

		/**
		 * ユーザーID入力チェック
		 */
		if (userId.equals("")) {
			errorMessage.add("ユーザーIDが未入力です");
		} else if ( !( 1 < userId.length() && userId.length() < 16 ) ) {
			errorMessage.add("ユーザーIDは2文字以上15文字以下です");
		} else if ( !( userId.matches("^[0-9a-zA-Z]+$") ) ) {
			errorMessage.add("ユーザーIDは半角英数字です");
		}

		/**
		 * パスワード入力チェック
		 */
		if (password.equals("")) {
			errorMessage.add("パスワードが未入力です");
		} else if ( !( 1 < password.length() && password.length() < 16 ) ) {
			errorMessage.add("パスワードは2文字以上15文字以下です");
		}

		/**
		 * IDを保存するか
		 */
		if (saveId) {
			session.put("saveUserId", userId);
			System.out.println("チェック");
		} else {
			session.remove("saveUserId");
		}

		/**
		 * ユーザーIDがDBに存在するか確認
		 */
		if (!userId.equals("") || !password.equals("")) {
			if (!loginDAO.getExistUserId(userId)) {
				errorMessage.add("IDかパスワードが間違っています");
				System.out.println(errorMessage);
				result = ERROR;
			} else {
				loginDTO = loginDAO.getUserInfo(userId, password);

				/**
				 * IDパスワード確認
				 */
				if (userId.equals(loginDTO.getUserId())
								&& password.equals(loginDTO.getPassword())) {

					/**
					 * 管理者ユーザーか判定してログイン
					 */
					if (loginDTO.getAdminFlg().equals("1")) {
						result = "admin";
						loginDAO.login(loginDTO);
						session.put("loginFlg", true);


					/**
					 * 一般ユーザーか判定してログイン
					 */
					} else {
						/**
						 * 以下ログイン成功時処理
						 */
						result = SUCCESS;
						loginDAO.login(loginDTO);
						session.put("userId", loginDTO.getUserId());
						session.put("loginFlg", true);

						CartDAO cartDAO = new CartDAO();
						//DestinationInfoDAO destinationInfoDAO = new DestinationInfoDAO();
						//ArrayList<DestinationInfoDTO> destinationInfoDTOList = new ArrayList<DestinationInfoDTO>();
						ArrayList<CartDTO> tempUserCartList = new ArrayList<CartDTO>();
						ArrayList<Integer> userCartItemIdList = new ArrayList<Integer>();
						ArrayList<Integer> tempUserCartItemIdList = new ArrayList<Integer>();

						userCartList = cartDAO.showUserCartList(session.get("userId").toString());
						tempUserCartList = cartDAO.showTempUserCartList(session.get("tempUserId").toString());

						/**
						 * ユーザーのカート内商品の商品IDを全取得してリストに入れる
						 */
						int i = 0;
						for (i = 0; i < userCartList.size(); i++) {
							userCartItemIdList.add(userCartList.get(i).getItemId());
						}

						/**
						 * 仮ユーザーのカート内商品の商品IDを全取得してリストに入れる
						 */
						i = 0;
						for (i = 0; i < tempUserCartList.size(); i++) {
							tempUserCartItemIdList.add(tempUserCartList.get(i).getItemId());
						}

						/**
						 * ユーザーカートリストと仮ユーザーカートリストの重複をチェック
						 */

							/**
							 * ユーザーカートの商品数より仮ユーザーカートの商品数の方が多いとき
							 */
						if (userCartList.size() < tempUserCartList.size()) {
							i = 0;
							for (i = 0; i <= userCartItemIdList.size(); i++) {

								/**
								 * 仮ユーザーカートリストにユーザーカートリストにある物が含まれているか
								 */
								boolean exist = tempUserCartItemIdList.contains(userCartItemIdList.get(i));

								/**
								 * もし含まれていた場合の処理
								 */
								if (exist) {

									/**
									 * 重複商品の選択数をユーザーのカート情報の選択数に足すメソッド
									 */
									cartDAO.changeItemStockId(Integer.valueOf(userCartList.get(i).getItemCount()),
															  Integer.valueOf(userCartItemIdList.get(i)),
															  session.get("userId").toString());

									/**
									 * 仮ユーザーカートリストから重複してた商品を削するメソッド
									 */
									cartDAO.deleteSeparete(session.get("tempUserId").toString(),
														   tempUserCartItemIdList.get(i));
								/**
								 * 含まれていなかった場合の処理
								 */
								} else {
									cartDAO.changeUserId(session.get("tempUserId").toString(),
											 session.get("userId").toString());
								}
								System.out.println(exist);
							}

						/**
						 * 仮ユーザーリストよりユーザーカートリストが多いとき
						 */
						} else {
							i = 0;
							for (i = 0; i <= tempUserCartItemIdList.size(); i++) {
								boolean exist = userCartItemIdList.contains(tempUserCartItemIdList);
								if (exist) {
									cartDAO.changeItemStockId(Integer.valueOf(tempUserCartList.get(i).getItemCount()),
															  Integer.valueOf(tempUserCartItemIdList.get(i)),
															  session.get("userId").toString());
									cartDAO.deleteSeparete(session.get("tempUserId").toString(),
														   tempUserCartItemIdList.get(i));
								} else {
									cartDAO.changeUserId(session.get("tempUserId").toString(),
														 session.get("userId").toString());
								}
								System.out.println(exist);
							}
						}

						/**
						 * 合計値段の計算
						 */
						userCartList = cartDAO.showUserCartList(session.get("userId").toString());
						calcTotalPrice(userCartList);

						/**
						 * 宛先情報登録ページへ直接飛ぶ設定

						if ( (boolean) session.get("loginFlg") ) {
							destinationInfoDTOList =
									destinationInfoDAO.SearchDestination(session.get("userId").toString());
						}

						if (destinationInfoDTOList.size() > 0) {
							result = SUCCESS;
						} else if ( !(boolean) session.get("loginFlg") ) {
							result = ERROR;
						} else {
							result = "destination";
						}
						return result;

						*/

					}
				} else {
					errorMessage.add("IDかパスワードが間違っています");
					System.out.println(errorMessage);
					result = ERROR;
				}
			}
		}

		return result;
	}

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

	public boolean isSaveId() {
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

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}
}
