package com.callor.bank.utils;

public class Line {
	
	public static final String dLine = "=".repeat(50);
	public static final String sLine = "-".repeat(50);

	public static final String dLine(int length) {
		return "=".repeat(length);
	}
	public static final String sLine(int length) {
		return "-".repeat(length);
	}

	// public static final String sLine(int length) {
	//	System.out.println("=".repeat(length));
	// }
	
}
