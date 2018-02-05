package com.internousdev.knit.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.knit.dao.LoginDAO;
import com.internousdev.knit.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport implements SessionAware {
	private String userId;
	private String password;
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
			System.out.println("ID未入力");
		} else if ( !( 1 < userId.length() && userId.length() < 16 ) ) {
			System.out.println("ユーザーIDは1文字より大きく16文字未満");
		} else if ( !( userId.matches("^[0-9a-zA-Z]+$") ) ) {
			System.out.println("ユーザーIDは半角英数字");
		}

		/**
		 * パスワード入力チェック
		 */
		if (password.equals("")) {
			System.out.println("PASS未入力");
		} else if ( !( 1 < password.length() || password.length() < 16 ) ) {
			System.out.println("PASSは1文字より大きく16文字未満");
		} else if ( !( password.matches("^[0-9a-zA-Z]+$") ) ) {
			System.out.println("PASSは半角英数字");
		}


		/**
		 * IDを保存するか
		 */
		if (saveId) {
			session.put("userId", userId);
		} else {
			session.remove("userId");
		}

		/**
		 * ユーザーIDがDBに存在するか確認
		 */
		if (!userId.equals("") || !password.equals("")) {
			if (!loginDAO.getExistUserId(userId)) {
				System.out.println("IDミス");
				result = ERROR;
			} else {
				loginDTO = loginDAO.getUserInfo(userId, password);

				/**
				 * 一般ユーザーログイン判定
				 */
				if ( userId.equals(loginDTO.getUserId())
								&& password.equals(loginDTO.getPassword())
								&& loginDTO.getAdminFlg().equals("0")) {
					loginDAO.login(loginDTO);
					session.put("userId", loginDTO.getUserId());
					session.put("loginFlg", true);
					result = SUCCESS;

				/**
				 * 管理者ユーザーログイン判定
				 */
				} else if ( userId.equals(loginDTO.getUserId())
										&& password.equals(loginDTO.getPassword())
										&& loginDTO.getAdminFlg().equals("1")) {
					loginDAO.login(loginDTO);
					session.put("userId", loginDTO.getUserId());
					session.put("loginFlg", true);
					result = "admin";

				} else {
					System.out.println("パスワードミス");
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
