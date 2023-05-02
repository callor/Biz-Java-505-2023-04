package com.callor.score.service;

import com.callor.score.model.ScoreDto;

/*
 * Java 를 이용한 Application에서
 * 일반적인 패턴으로 Service 클래스를 사용한다
 * Service 클래스는 역할이 주로 비즈니스로직 코드가 작성된다
 * 직접적으로 사용자에게 하는일이 노출되지 않고,
 * 데이터 연산, 가공, 통계 등을 수행하는 코드이다
 * 
 * 학생의 과목점수를 랜덤값으로 생성하는 method
 * 학생의 성적리스트를 출력하는 method
 * 각 과목의 총점을 계산하여 출력하는 method
 * 각 과목의 평균을 계산하여 출력하는 method
 */
public class ScoreServiceV1 {
	
	// 각 과목의 총점을 합산하기 위한 변수 선언
	private int intKor = 0;
	private int intEng = 0;
	private int intMath = 0;
	private int intMusic = 0;
	private int intArt = 0;
	private float floatAvg = 0.0f;
	
	// 배열 선언만, 개수도 정하지 않고, 
	// 초기화도 하지 않은 상태
	private ScoreDto[] scoreList; // this.scoreList
	/*
	 * scoreList 객체 변수의 데이터를 전달받아 
	 * 변수값을 초기화(setting)하는 method
	 * 1. ScoreDto 클래스를 배열로 하는 type 의
	 * 		scoreList 매개변수 선언
	 * 2. 다른곳에서 전달받은 scoreList 변수의 값을
	 * 		this.scoreList 변수에 할당하기
	 */
	public void setScoreList(ScoreDto[] scoreList) {
		this.scoreList = scoreList;
	}
	
	/*
	 * private 접근제한자가 선언된 method
	 * 이 method 는 같은 클래스 scope 의 method 들만
	 * 사용할수 있도록 하는 것
	 */
	private int getScore() {
		return (int)(Math.random() * 50) + 51;
	}
	
	// 학생의 과목점수를 랜던값으로 생성하는 method
	public void scoreRndMake() {
		for(int i = 0; i < scoreList.length ; i++) {
			
			// 23*** 형식의 학번 생성하기
			String stNum = String.format("23%03d", i+1);
			
			// 생성한 학번 각 학생의 성적 객체에 등록하기
			scoreList[i].stNum = stNum;
			scoreList[i].scKor = getScore();
			scoreList[i].scEng = getScore();
			scoreList[i].scMath = getScore();
			scoreList[i].scMusic = getScore();
			scoreList[i].scArt = getScore();
		}
	}
	
	public void scoreListPrint() {	
		
		System.out.println("=".repeat(70));
		System.out.println("한울 고교 성적처리 시스템 2023");
		System.out.println("-".repeat(70));
		System.out.println("학번\t국어\t영어\t수학\t음악\t미술\t총점\t평균");
		System.out.println("-".repeat(70));
		for(int i = 0; i < scoreList.length ; i++) {
			System.out.print(scoreList[i].stNum + "\t");
			System.out.printf("%5d\t",scoreList[i].scKor);
			System.out.printf("%5d\t",scoreList[i].scEng);
			System.out.printf("%5d\t",scoreList[i].scMath);
			System.out.printf("%5d\t",scoreList[i].scMusic);
			System.out.printf("%5d\t",scoreList[i].scArt);
			System.out.printf("%5d\t",scoreList[i].getTotal());
			System.out.printf("%5.2f\n", scoreList[i].getAvg());
		}
		System.out.println("-".repeat(70));
	}
	public void scoreTotalPrint() { 

		// 각 과목의 총점을 합산하기 위한 변수 선언
//		int intKor = 0;
//		int intEng = 0;
//		int intMath = 0;
//		int intMusic = 0;
//		int intArt = 0;
		
		// 각 과목에 대한 총점 계산하기
		for(int i = 0 ; i < scoreList.length ; i++) {
			intKor += scoreList[i].scKor;
			intEng += scoreList[i].scEng;
			intMath += scoreList[i].scMath;
			intMusic += scoreList[i].scMusic;
			intArt += scoreList[i].scArt;
			
			// 평균의 평균을 출력하기 위한 준비
			// 각 학생의 평균의 총 합산을 계산하여 floatAvg 에
			// 저장해 두기
			floatAvg += scoreList[i].getAvg();
		}
		System.out.print("총점\t");
		System.out.printf("%5d\t",intKor);
		System.out.printf("%5d\t",intEng);
		System.out.printf("%5d\t",intMath);
		System.out.printf("%5d\t",intMusic);
		System.out.printf("%5d\t",intArt);
		
		int intTotal = intKor;
		intTotal += intEng;
		intTotal += intMath;
		intTotal += intMusic;
		intTotal += intArt;
		System.out.printf("%5d\n",intTotal);
	}
	public void scoreAvgPrint() { 	
		
		System.out.print("평균\t");
		System.out.printf("%5.2f\t", (float)intKor / scoreList.length);
		System.out.printf("%5.2f\t", (float)intEng / scoreList.length);
		System.out.printf("%5.2f\t", (float)intMath / scoreList.length);
		System.out.printf("%5.2f\t", (float)intMusic / scoreList.length);
		System.out.printf("%5.2f\t\t", (float)intArt / scoreList.length);
		System.out.printf("%5.2f\n", floatAvg / scoreList.length);
		System.out.println("=".repeat(70));
	}

}
