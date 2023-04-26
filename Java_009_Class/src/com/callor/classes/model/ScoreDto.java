package com.callor.classes.model;
/*
 * DB, 다량의 데이터를 정보처리에서 활용하기 위한
 * 방법으로 "모델링" 방법이 있다
 * 필요한 데이터의 필수 속성들을 추출하는 추상화를 실시
 * 추상화된 데이터를 실제 정보처리에서 사용하기 위한
 * 클래스를 디자인 하는 것
 * 
 * 클래스 중에서 데이터와 밀접한 연관이 있는 클래스를
 * Java 에서는 model Class 또는 data Class 라고 한다
 * 이러한 클래스는 ...model package 를 생성하고 클래스를 
 * 저장한다.
 * 
 * 성적처리를 하기 위하여 model Class 를 생성
 * 학번, 이름, 국어, 영어, 수학 점수를 저장할 변수를 선언
 * 총점, 평균을 계산하여 return 하는 method 를 선언
 */
public class ScoreDto {
	
	public String stNum;
	public String stName;
	
	public int scKor;
	public int scEng;
	public int scMath;
	
	/*
	 * this.변수
	 * 현재 클래스에 선언된 변수를 가리킨다
	 * 
	 * this : 클래스를 객체변수로 선언하면
	 * 객체변수 자체를 가리키는 키워드
	 */
	public int getTotal() {
		int total = this.scKor;
		total += this.scEng;
		total += this.scMath;
		return total;
	}
	
	public float getAvg() {
		float avg = (float)this.getTotal() / 3;
		return avg;
	}
	

}
