package com.callor.bank.utils;

public class Config {
	
	public static final String BUYER_FILE = "src/com/callor/bank/datas/buyer.txt";

	public static final void bankTitle(String jobTitle) {
		System.out.println(Line.dLine(100));
		System.out.printf("대한은행 시스템(%s)\n", jobTitle);
		System.out.println(Line.sLine(100));
	}
	
}
