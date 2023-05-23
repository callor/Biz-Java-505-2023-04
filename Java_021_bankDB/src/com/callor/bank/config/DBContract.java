package com.callor.bank.config;

/*
 * DB 와 연결하는 Session(통로)를 만든 클래스 도구
 */
public class DBContract {
	
	public static final String  jdbcDriver = "oracle.jdbc.driver.OracleDriver";
	public static final String DB_URL = "jdbc:oracle:thin:@localhost:1521:xe";
	public static final String USER_NAME = "C##myuser";
	public static final String PASSWORD = "12341234";
	
	public static class BUYER {
		public static final int BUID = 1;
		public static final int BUNAME = 2;
		public static final int BUTEL = 3;
		public static final int BUADDR = 4;
		public static final int BUBIRTH = 5;
		public static final int BUJOB = 6;
	}
	
	

}
