package mang.oop.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnect {

	private static final String url = "jdbc:mysql://localhost:3306/managment?useSSL=false";
	private static final String userName = "root";
	private static final String password = "password";
	private static Connection conn;
	
	public static Connection getConnection() {
	
		try {
		Class.forName("com.mysql.jdbc.Driver");
		
		conn = DriverManager.getConnection(url, userName, password);
		
	}catch (Exception e) {
		System.out.println("	!!!! Database connection not succeed..	");
	}
	
	return conn;
	
	}
}
