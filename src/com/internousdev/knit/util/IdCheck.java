
	package com.internousdev.knit.util;

	import java.sql.SQLException;

import com.internousdev.knit.dao.CheckUserDAO;

	public class IdCheck {

//ゆーざーIDが存在する場合falseない場合はtrueをかえす
		public boolean checkUser(String userId) throws SQLException{
				CheckUserDAO dao = new CheckUserDAO();
				boolean result = false;
				if(!(dao.checkUserID(userId))){
					result = true;
				}
				return result;
			}





	}


