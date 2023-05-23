package com.callor.bank.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	private static Connection dbConn = null;
	
	static {
		
		try {
			Class.forName(DBContract.jdbcDriver);
			dbConn = DriverManager.getConnection(
					DBContract.DB_URL,
					DBContract.USER_NAME,
					DBContract.PASSWORD
					);
			System.out.println("DB Connection OK!!!");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
