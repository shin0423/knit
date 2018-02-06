package com.internousdev.knit.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.knit.dao.LoginDAO;
import com.internousdev.knit.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport implements SessionAware {
	private String userId;
	private String password;
	private ArrayList<String> errorMessage = new ArrayList<String>();
	private boolean saveId;
	private LoginDAO loginDAO = new LoginDAO();
	private LoginDTO loginDTO = new LoginDTO();
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
		} else {
			errorMessage.add("");
		}

		/**
		 * パスワード入力チェック
		 */
		if (password.equals("")) {
			errorMessage.add("パスワードが未入力です");
		} else if ( !( 1 < password.length() && password.length() < 16 ) ) {
			errorMessage.add("パスワードは2文字以上15文字以下です");
		} else {
			errorMessage.add("");
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
						session.put("userId", loginDTO.getUserId());
						session.put("loginFlg", true);


					/**
					 * 一般ユーザーか判定してログイン
					 */
					} else {
						result = SUCCESS;
						loginDAO.login(loginDTO);
						session.put("userId", loginDTO.getUserId());
						session.put("loginFlg", true);

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
}
