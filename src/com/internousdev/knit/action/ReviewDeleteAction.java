package com.internousdev.knit.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.knit.dao.BuyItemInfoDAO;
import com.internousdev.knit.dao.ReviewDeleteDAO;
import com.internousdev.knit.dto.BuyItemDTO;
import com.opensymphony.xwork2.ActionSupport;

public class ReviewDeleteAction extends ActionSupport implements SessionAware {

	private Map<String, Object> session;
	private ReviewDeleteDAO reviewDeleteDAO = new ReviewDeleteDAO();
	private BuyItemInfoDAO buyItemInfoDAO = new BuyItemInfoDAO();
	private BuyItemDTO buyItemDTO = new BuyItemDTO();

	public String execute() throws SQLException {
		String result = ERROR;

		reviewDeleteDAO.reviewDelete(session.get("userId").toString());

		result = SUCCESS;

		return result;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
