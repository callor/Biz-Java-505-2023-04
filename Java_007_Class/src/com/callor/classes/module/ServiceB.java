package com.callor.classes.module;

public class ServiceB {

	public void scorePrint(String name, 
			int intKor, int intEng, int intMath) {
		
		int total = intKor + intEng + intMath;
		float avg = (float)total / 3;
		
		System.out.println("=====================================");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("-------------------------------------");
		System.out.printf("%s\t %d\t %d\t %d\t %d\t %2.5f\n",
						name, intKor, intEng, intMath, total, avg);
	}
	
}
