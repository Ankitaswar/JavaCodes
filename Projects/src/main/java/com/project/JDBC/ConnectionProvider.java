package com.project.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {

	private static Connection con;
	public static Connection getConnection() {
      String url = "jdbc:mysql://localhost:3306/aliens";
      String username = "root";
      String password = "Ankit123@";
		
	try {
	   Class.forName("com.mysql.jdbc.Driver");
	   Connection con = DriverManager.getConnection(url , username , password);
	}catch(Exception e) {
		e.printStackTrace();
	}
	return con;
	
	}
	
}
