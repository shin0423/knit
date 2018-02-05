package com.internousdev.knit.dao;
package com.internousdev.knit.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.internousdev.knit.dto.AdminDTO;
import com.internousdev.knit.util.DBConnector;

}
public class AdmiDAO {
	private DBConnector dbConnector=new DBConnector();
	private Connection connection=dbConnector.getConnection();
	private AdminLoginDTO adminLoginDTO=new AdminLoginDTO();

	public AdminLoginDTO getAdminLogin(String adminId,String adminPassword){
		String sql="SELECT * FROM user_info where user_id=? AND password=? ";
		try{
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1,adminId);
			preparedStatement.setString(2, adminPassword);

			ResultSet resultSet=preparedStatement.executeQuery();

			if(resultSet.next()){
				adminLoginDTO.setAdminId(resultSet.getString("id"));
				adminLoginDTO.setAdminPassword(resultSet.getString("password"));

				if(!(resultSet.getString("id").equals(null))){
					adminLoginDTO.setAdminLoginFlg(true);
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return adminLoginDTO;
	}

	public AdminDTO getAdminDTO(){
		return adminLoginDTO;
	}

	public AdminItemInfoDTO getAdminItemInfo(String productId,String productName,String productNameKana,String productDescription,String categoryId,String imageFilePath,String imageFileName,String releadeCompany){
		String sql="INSERT INTO product_info (product_id,product_name,product_name_kana,product_description,category_id,image_file_path,image_file_name, "
	}


















}
