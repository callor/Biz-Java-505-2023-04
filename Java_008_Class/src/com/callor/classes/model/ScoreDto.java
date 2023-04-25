package com.callor.classes.model;

/*
 * 성적처리를 할때,
 * 학생이름, 각 과목의 점수를 속성으로 포함하는
 * 데이터 객체를 모델링 하자
 * Dto 클래스 : 데이터 객체를 모델링한 java 클래스
 * 
 * 모델링 단계
 * 
 * 1. 추상화 단계
 * 		성적처리(정보기기기를 사용하여 성적처리를 하기)
 * 		를 수행하기 위하여 
 * 		"꼭 필요한" 데이터 요소가 무엇이 있을까
 * 2. (Dto) 클래스 모델링
 * 		추상화된 각 요소를 클래스로 만드는 과정
 * 		=> 클래스에 변수를 선언하기
 * 
 * 7 개 과목의 성적을 처리할 것이고
 * 여기에는 학번과 학생이름이 포함되어 할 것이다
 *  
 */
public class ScoreDto {

	// 성적처리를 하는데 학생의 정보 요소도 필요
	public String stNum; // 학번
	public String stName; // 이름
	
	// 성적처리에 필요한 7개 과목 요소 선언(변수로 선언)
	public int intKor;
	public int intEng;
	public int intMath;
	public int intHistory;
	public int intMusic;
	public int intArt;
	public int intSport;
	
	public int getTotal() {
		int total = this.intKor;
		total += this.intEng;
		total += this.intMath;
		total += this.intHistory;
		total += this.intMusic;
		total += this.intArt;
		total += this.intSport;
		return total;
	}
	public float getAvg() {
		int total = this.getTotal();
		float avg = (float)total / 7;
		return avg;
	}

}
