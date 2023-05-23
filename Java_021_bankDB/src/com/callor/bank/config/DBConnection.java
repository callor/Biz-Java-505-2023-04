package com.callor.bank.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	
	// DB 에 연결할 Connection 객체를 미리 준비해 놓기
	// static type 으로 Connection 객체를 선언하여 준비하기
	// private 으로 선언한 이유는 static {} 코드 블럭이 실행되기 전에
	// 어떤 이유로 dbConn 객체가 참조되는 것을 방지하는 목적(nullPointer 방지)
	private static Connection dbConn = null;
	
	// static 초기화 블럭
	// static 으로 선언된 변수, 객체 등을 초기화 시키기 위한 코드 블럭
	// 프로젝트가 시작되면 항상 자동으로 실행되는 코드 블럭
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
	} // end static
	
	// dbConn 을 다른 객체에서 참조할때 사용할 getter method
	public static Connection getDBConn() {
		return dbConn;
	}

}
