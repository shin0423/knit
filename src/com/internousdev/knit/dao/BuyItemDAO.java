package com.internousdev.knit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.knit.dto.BuyItemDTO;
import com.internousdev.knit.util.DBConnector;

public class BuyItemDAO {
	private DBConnector dbConnector = new DBConnector();
	private List<BuyItemDTO> buyItemList = new ArrayList<>();




	public List<BuyItemDTO> selectItemByList(List<String> searchList,String categoryId,String moreUp,String moreDown) {
		Connection con = dbConnector.getConnection();

		String sql="SELECT * FROM item_info WHERE (item_name LIKE '%" + searchList.get(0).toString() + "%' OR item_name_kana LIKE '%"+ searchList.get(0).toString() +"%')";
		for(int i=1; i < searchList.size();i++){
			sql = sql + " AND (item_name like '%" + searchList.get(i).toString() + "%' OR item_name_kana LIKE '%"+ searchList.get(i).toString()+"%')";
		}
		if(!(categoryId.equals("0"))){
			sql = sql + " AND category_id ="+categoryId;
		}
		if(!(moreUp.equals(""))){
			if(moreDown.equals("")){
			sql = sql + " AND price = price > "+moreUp;
			}
		};
		if(!(moreDown.equals(""))){
			if(moreUp.equals("")){
			sql = sql + " AND price = "+moreDown+" < price";
			}
		};
		if(!(moreDown.equals("")) && !(moreUp.equals(""))){
			sql = sql + " AND (price BETWEEN "+moreUp+" AND "+moreDown+")";
		}




		try{
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs= ps.executeQuery();
		while(rs.next()){
			BuyItemDTO buyItemDTO = new BuyItemDTO();
			buyItemDTO.setItemId(rs.getInt("item_id"));
			buyItemDTO.setItemName(rs.getString("item_name"));
			buyItemDTO.setItemDescription(rs.getString("item_description"));
			buyItemDTO.setCategoryId(rs.getInt("category_id"));
			buyItemDTO.setPrice(rs.getInt("price"));
			buyItemDTO.setItemStock(rs.getInt("item_stock"));
			buyItemDTO.setItemImagePath(rs.getString("image_file_path"));
			buyItemDTO.setItemImageName(rs.getString("image_file_name"));
			buyItemDTO.setReleaseCompany(rs.getString("release_company"));
			buyItemDTO.setReleaseDate(rs.getString("release_date"));
			buyItemList.add(buyItemDTO);

		}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return buyItemList;

	}

}
