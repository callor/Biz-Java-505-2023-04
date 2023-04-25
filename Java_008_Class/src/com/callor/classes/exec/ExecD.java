package com.callor.classes.exec;

public class ExecD {
	public static void main(String[] args) {
		
		int intKor1 = (int)(Math.random() * 50) + 51;
		int intKor2 = (int)(Math.random() * 50) + 51;
		int intKor3 = (int)(Math.random() * 50) + 51;
		int intKor4 = (int)(Math.random() * 50) + 51;
		int intKor5 = (int)(Math.random() * 50) + 51;
		
		int intTotal = intKor1;
		intTotal += intKor2;
		intTotal += intKor3;
		intTotal += intKor4;
		intTotal += intKor5;
		
		System.out.println(intTotal);
		System.out.println(intTotal / 5);
	}
}
