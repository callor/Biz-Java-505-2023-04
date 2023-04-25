package com.callor.classes.exec;

import com.callor.classes.model.ScoreDto;

public class ExecC {
	
	public static void main(String[] args) {
		ScoreDto 홍길동 = new ScoreDto();
		ScoreDto 이몽룡 = new ScoreDto();
		ScoreDto 성춘향 = new ScoreDto();
		
		홍길동.stName = "홍길동";
		홍길동.intKor = 100;
		
		이몽룡.stName = "이몽룡";
		이몽룡.intKor = 88;
		
		성춘향.stName = "성춘향";
		성춘향.intKor = 99;
		성춘향.intEng = 76;
		성춘향.intHistory = 98;
		성춘향.intMath = 85;
		성춘향.intMusic = 78;
		성춘향.intArt = 76;
		성춘향.intSport = 90;
		
		System.out.println("성춘향 국어점수 : " 
					+ 성춘향.intKor);
		
		System.out.println("성춘향 총점 : " 
					+ 성춘향.getTotal());
		
	}

}

