package com.internousdev.knit.util;

import java.sql.SQLException;

import com.internousdev.knit.dao.AdminCountCheckDAO;

public class AdminCountCheck {
	public boolean AdminCountChecker(int number) throws SQLException{
		boolean result = false;
		AdminCountCheckDAO adminCountCheckDAO = new AdminCountCheckDAO();
		if(number==adminCountCheckDAO.selectAdminCount()){
			result = true;
		}
		return result;
	}
}
