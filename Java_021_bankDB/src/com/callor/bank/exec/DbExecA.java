package com.callor.bank.exec;

import java.sql.Connection;

import com.callor.bank.config.DBContract;

public class DbExecA {
	
	/*
	 * DB(DBMS Server)에 연결하는 절차
	 * 1. Driver 를 활성화(실행)
	 * 2. 접속정보를 통하여 연결
	 * 3. SQL 전송
	 * 4. 결과 받기
	 */
	public static void main(String[] args) {
		
		// DB 와 연결하기 위한 Input 장치
		Connection conn = null;
		
		// jdbcDriver 를 Loading하여 활성화 하라
		try {
			Class.forName(DBContract.jdbcDriver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
