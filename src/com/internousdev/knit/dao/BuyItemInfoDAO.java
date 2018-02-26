package com.internousdev.knit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.knit.dto.BuyItemDTO;
import com.internousdev.knit.util.DBConnector;

public class BuyItemInfoDAO {


	public BuyItemDTO selectBuyItemInfo(String item_id) throws SQLException{
		String sql="SELECT * FROM item_info WHERE item_id=?";
		DBConnector db=new DBConnector();
		BuyItemDTO buyItemDTO = new BuyItemDTO();
		Connection con = db.getConnection();


		try{
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1,item_id);
			ResultSet rs=ps.executeQuery();

			if(rs.next()){
				buyItemDTO.setItemId(rs.getInt("item_id"));
				buyItemDTO.setItemName(rs.getString("item_name"));
				buyItemDTO.setItemNameKana(rs.getString("item_name_kana"));
				buyItemDTO.setItemDescription(rs.getString("item_description"));
				buyItemDTO.setCategoryId(rs.getInt("category_id"));
				buyItemDTO.setPrice(rs.getInt("price"));
				buyItemDTO.setItemStock(rs.getInt("item_stock"));
				buyItemDTO.setItemImagePath(rs.getString("image_file_path"));
				buyItemDTO.setItemImageName(rs.getString("image_file_name"));
				buyItemDTO.setReleaseCompany(rs.getString("release_company"));
				buyItemDTO.setReleaseDate(rs.getString("release_date"));
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			con.close();
		}
		return buyItemDTO;
	}

	public List<BuyItemDTO> categoryItemSelect(int category_id,int item_id) throws SQLException{
		String sql="SELECT * FROM item_info WHERE category_id=? AND item_id NOT IN('"+item_id+"') ORDER BY RAND() LIMIT 3";
		DBConnector db=new DBConnector();
		List<BuyItemDTO> categoryItemList = new ArrayList<>();
		Connection con = db.getConnection();
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1,category_id);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				BuyItemDTO buyItemDTO = new BuyItemDTO();
				buyItemDTO.setItemImagePath(rs.getString("image_file_path"));
				buyItemDTO.setItemName(rs.getString("item_name"));
				buyItemDTO.setItemId(rs.getInt("item_id"));
				categoryItemList.add(buyItemDTO);
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}finally{
			con.close();
		}
		return categoryItemList;
	}

	public List<BuyItemDTO> itemCheck() throws SQLException{
		String sql="SELECT * FROM item_info";
		DBConnector db=new DBConnector();
		List<BuyItemDTO> ItemCheckList = new ArrayList<>();
		Connection con = db.getConnection();
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				BuyItemDTO dto = new BuyItemDTO();
				dto.setItemId(rs.getInt("item_id"));
				ItemCheckList.add(dto);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			con.close();
		}
		return ItemCheckList;

	}

}
