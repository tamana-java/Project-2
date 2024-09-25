package com.shoolini.project.utility;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {
	
	private static Connection con = null;
	
	public static Connection getConnection() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shoolini?useSSL=true", "root", "khushal");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return con;
	}
	
	public static void main(String[] args) {
		Connection connection = DbConnection.getConnection();
		if(connection != null) {
			System.out.println("Connected...");
		}else {
			System.out.println("Something went wrong to establish connection...");
		}
	}

}
