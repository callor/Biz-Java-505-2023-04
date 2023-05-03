package com.callor.system.models;

/*
 * 클래스의 맴버 변수, 맴버 method
 * 		맴버** : 현재의 클래스 scope 내부에서 선언된 변수, method
 * 		맴버 변수 : field, 객체변수, 속성, Attribute
 * 
 * Dto 클래스의 맴버 변수의 접근 제한자
 * 		접근제한자는 public, private, protected 가 있는데
 * 		맴버 변수, 맴버 method 에 접근제한자가 없을때
 * 		
 * 		1. package 가 다른 곳에서 맴버** 에 접근하려고 하면 접근이 안된다
 * 		2. public 접근제한자가 있으면 package 에 관계없이
 * 			현재 프로젝트의 어떤 곳에서든 자유롭게 접근이 가능
 * 		3. private 접근제한자가 있으면 현재 클래스의 맴버 method 에서만
 * 			접근이 가능하다
 * 
 * Dto 클래스의 맴버 변수와 getter, setter method
 * 		java 의 프로젝트 패턴에서 Dto 클래스의 맴버 변수는 
 * 				모두 private 선언
 * 		private 으로 선언된 맴버 변수에 값을 저장, 읽기 위하여
 * 				setter, getter method 를 선언
 * 		Dto 클래스를 객체로 생성한 후 맴버 변수에 접근하기 위하여
 * 				맴버 변수를 직접 호명하지 않고,
 * 				setter, getter method 를 통하여 접근한다
 * 
 */
public class StudentDto {
	
	private String stNum;
	private String stName;
	private String stDept;
	private int stGrade;
	private String stTel;
	
	public String getStNum() {
		return stNum;
	}
	public void setStNum(String stNum) {
		this.stNum = stNum;
	}
	public String getStName() {
		return stName;
	}
	public void setStName(String stName) {
		this.stName = stName;
	}
	public String getStDept() {
		return stDept;
	}
	public void setStDept(String stDept) {
		this.stDept = stDept;
	}
	public int getStGrade() {
		return stGrade;
	}
	public void setStGrade(int stGrade) {
		this.stGrade = stGrade;
	}
	public String getStTel() {
		return stTel;
	}
	public void setStTel(String stTel) {
		this.stTel = stTel;
	}
	
	/*
	 * 
	 * StudentDto 클래스로 선언한 객체의 맴버 변수(속성)에 저장된
	 * 값을 문자열로 만들어 return 해주는 method
	 * 
	 * 개발자가 정의한 클래스를 사용하여 객체변수를 생성하면
	 * 기본적으로 toString() 이라는 method 자동 생성된다
	 * 		단, toString() method 는 소스코드에 나타나지 않는다
	 * 		하지만 객체.toString() 처럼 method 를 사용할 수 있다
	 * 		원래 toString() method 는 객체의 정보중에서 메모리 주소 등을
	 * 		알려주는 문자열을 생성하여 return 하는 코드가 들어 있다.
	 * 
	 * 기본적으로 toString() method 가 return 하는 문자열은 별로
	 * 		효용(필요) 가치가 없다
	 * 		그래서, 원래의 toString() method 코드를 감춰버리고
	 * 		맴버변수의 값을 문자열로 만들어 return 하는 method 로
	 * 		"재 정의(Override)" 했다.
	 */
	@Override
	public String toString() {
		return "StudentDto [stNum=" + stNum 
				+ ", stName=" + stName 
				+ ", stDept=" + stDept 
				+ ", stGrade=" + stGrade
				+ ", stTel=" + stTel + "]";
	}
	

}
