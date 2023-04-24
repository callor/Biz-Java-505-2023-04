package com.callor.classes.module;

public class ServiceE {
	
	public void score(int intKor, int intEng, int intMath) {
		int total = intKor + intEng + intMath;
		float avg = (float)total / 3;
		System.out.println("국어 : " + intKor);
		System.out.println("영어 : " + intEng);
		System.out.println("수학 : " + intMath);
		
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + avg);
	}

}
