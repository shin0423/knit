package com.internousdev.knit.util;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.knit.dao.BuyItemInfoDAO;
import com.internousdev.knit.dto.BuyItemDTO;

public class ItemIdChecker {
	public boolean itemIdChecker(String itemId) throws SQLException{
		boolean result = false;
		BuyItemInfoDAO dao = new BuyItemInfoDAO();
		List<BuyItemDTO> list = new ArrayList<>();
		list = dao.itemCheck();
		for(int i = 0;list.size() > i ; i++){
			System.out.println(list.get(i).getItemId());
			if(itemId.equals(String.valueOf(list.get(i).getItemId()))){
				result = true;
			}
		}
		return result;
	}
}
