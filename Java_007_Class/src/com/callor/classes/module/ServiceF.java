package com.callor.classes.module;

public class ServiceF {
	
	public void score(
			int intKor,
			int intEng,
			int intMath,
			int intHistory,
			int intMusic,
			int intArt,
			int intSport
			) {
		
		int total = 
				intKor + 
				intEng +
				intMath +
				intHistory +
				intMusic +
				intArt +
				intSport ;
		
		float avg = (float)total / 7;
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + avg );
		
	}

}
