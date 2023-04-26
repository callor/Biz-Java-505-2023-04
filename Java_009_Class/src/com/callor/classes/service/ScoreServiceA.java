package com.callor.classes.service;

import com.callor.classes.model.ScoreDto;

public class ScoreServiceA {
	
	// 51 ~ 100까지 범위의 
	// 렌덤수를 만들어 return 하는 method
	public int getScore() {
		int score = (int)(Math.random() * 50) + 51;
		return score;
	}
	
	// ScoreDto type 매개변수를 통하여
	// 성적정보 데이터를 받아서 출력하기
	public void scorePrint(ScoreDto score) {
		System.out.print(score.stNum + "\t");
		System.out.print(score.stName+ "\t");
		System.out.printf("%3d\t", score.scKor);
		System.out.printf("%3d\t", score.scEng);
		System.out.printf("%3d\t", score.scMath);
		
		System.out.printf("%3d\t", score.getTotal());
		System.out.printf("%5.2f\n", score.getAvg());
	}
	public void scoreTotalPrint(int kor, int eng, int math) {
		System.out.print("\t");
		System.out.print("\t");
		System.out.printf("%3d\t", kor);
		System.out.printf("%3d\t", eng);
		System.out.printf("%3d\t", math);
		
		System.out.printf("%3d\n", kor + eng + math);
//		System.out.printf("%5.2f\n", (float)(kor + eng + math) / 3);
	}

	

}
