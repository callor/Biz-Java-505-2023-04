package com.callor.classes.module;

public class ServiceA {
	
	public void score(
			int intKor, 
			int intEng,
			int intMath,
			int intHistory,
			int intMusic,
			int intArt,
			int intSport
			) {
		System.out.println("국어 : " + intKor);
		System.out.println("영어 : " + intEng);
		System.out.println("수학 : " + intMath);
		System.out.println("국사 : " + intHistory);
		System.out.println("음악 : " + intMusic);
		System.out.println("미술 : " + intArt);
		System.out.println("체육 : " + intSport);
		
		int intTotal = intKor;
		intTotal += intEng ;
		intTotal += intMath ;
		intTotal += intHistory ;
		intTotal += intMusic ;
		intTotal += intArt ;
		intTotal += intSport ;
		
		float floatAvg = (float)intTotal / 7;
		
		System.out.println("총점 : " + intTotal);
		System.out.println("평균 : " + floatAvg);
	}
}
