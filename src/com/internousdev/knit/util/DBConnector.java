package com.internousdev.knit.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {
	private String url="jdbc:mysql://localhost/knit";
	private String driverName="com.mysql.jdbc.Driver";
	private String user="root";
	private String password="mysql";


	public Connection getConnection(){
		Connection con = null;
		try{
			Class.forName(driverName);
			con=(Connection) DriverManager.getConnection(url,user,password);
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(SQLException e){
			e.printStackTrace();
		}

		return con;
	}
}
