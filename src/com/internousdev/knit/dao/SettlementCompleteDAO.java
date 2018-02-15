package com.internousdev.knit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.knit.dto.CartDTO;
import com.internousdev.knit.util.DBConnector;
import com.internousdev.knit.util.DateUtil;
import com.internousdev.knit.util.OrderNum;




public class SettlementCompleteDAO {

	private DBConnector dbConnector = new DBConnector();
	private Connection connection = dbConnector.getConnection();

	private DateUtil dateUtil =new DateUtil();
	private OrderNum orderNum = new OrderNum();

	public ArrayList<CartDTO> CartDTOList = new ArrayList<CartDTO>();


	//指定ログインユーザーのカート情報をすべて取得
			public ArrayList<CartDTO> getUserCartList(String userId){

				String sql="SELECT * FROM cart_info LEFT JOIN product_info ON cart_info.item_id = item_info.item_id where cart_info.user_id=?";

				try{
					PreparedStatement preparedStatement=connection.prepareStatement(sql);
					preparedStatement.setString(1, userId);
					ResultSet resultSet=preparedStatement.executeQuery();

					while(resultSet.next()){
						CartDTO cartDTO=new CartDTO();
						cartDTO.setItemName(resultSet.getString("item_name"));
						cartDTO.setItemNameKana(resultSet.getString("item_name_kana"));
						cartDTO.setImageFilePath(resultSet.getString("image_file_path"));
						cartDTO.setPrice(resultSet.getInt("price"));
						cartDTO.setReleaseCompany(resultSet.getString("release_company"));
						cartDTO.setReleaseDate(resultSet.getString("release_date"));
						cartDTO.setItemId(resultSet.getInt("item_id"));

						cartDTO.setId(resultSet.getInt("id"));
						cartDTO.setItemCount(resultSet.getInt("item_count"));

						CartDTOList.add(cartDTO);

					}
				}catch(SQLException e){
					e.printStackTrace();
				}try{
					connection.close();
				}catch(SQLException e){
					e.printStackTrace();
				}
				return CartDTOList;
			}

			//カートの商品を決済後購入履歴に登録

			public void insertPurchaseHistory(String userId,int itemId,int itemCount){

				String sql="INSERT INTO purchase_history_info(user_id, product_id, product_count, regist_date) VALUES( ?, ?, ?, NOW())";

				try {
					PreparedStatement preparedStatement=connection.prepareStatement(sql);
					preparedStatement.setString(1, userId);
					preparedStatement.setInt(2, itemId);
					preparedStatement.setInt(3, itemCount);

					preparedStatement.execute();


				} catch (SQLException e) {
					e.printStackTrace();
				}try{
					connection.close();
				}catch(SQLException e){
					e.printStackTrace();
				}

			}

			//決済後のカート情報を削除
//
//			public void deleteCartInfo(String userId) throws SQLException{
//
//				String sql="DELETE FROM cart_info WHERE user_id=?";
//
//				try{
//					PreparedStatement preparedStatement=connection.prepareStatement(sql);
//					preparedStatement.setString(1, userId);
//
//					preparedStatement.executeUpdate();
//
//				}catch(SQLException e){
//					e.printStackTrace();
//				}finally {
//					connection.close();
//				}
//		}

			//購入情報を履歴に渡す
			public int setPurchaseHistory(List<CartDTO> cartList, String UserId) throws SQLException {

				String sql;

				int ret = 0;

				try{
					for (int i = 0; i<cartList.size(); i++){
						sql = "INSERT INTO purchase_history_info(user_id, item_id, item_count, price, regist_date, order_num, status, send_flg) VALUES(?, ?, ?, ?, ?, ?, ?, ?)";
						PreparedStatement ps = connection.prepareStatement(sql);

						ps.setString(1, UserId);
						ps.setInt(2, cartList.get(i).getItemId());
						ps.setInt(3, cartList.get(i).getItemCount());
						ps.setInt(4, cartList.get(i).getPrice());
						ps.setString(5, dateUtil.getDate());
						ps.setString(6, orderNum.previewOrderNum());
						ps.setInt(7, 1);
						ps.setInt(8, 0);

						ret += ps.executeUpdate();

					}
					} catch (SQLException e) {
						e.printStackTrace();
					}finally {
						connection.close();
					}
					return ret;



			}

}