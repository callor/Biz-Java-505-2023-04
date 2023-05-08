package com.callor.classes.models;

public class StudentDto {
	
	private String stNum;
	private String stName;
	private String stDept;
	private int stGrade;
	private String stTel;
	
	/*
	 * StudentDto 기본생성자
	 * super class 생성자
	 */
	public StudentDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	/*
	 * 속성, 변수, 필드를 초기화 시키는 임의생성자
	 * filed 생성자
	 */
	public StudentDto(String stNum, String stName, String stDept, int stGrade, String stTel) {
		super();
		this.stNum = stNum;
		this.stName = stName;
		this.stDept = stDept;
		this.stGrade = stGrade;
		this.stTel = stTel;
	}
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
	
	
	@Override
	public String toString() {
		return "StudentDto [stNum=" + stNum + ", stName=" + stName + ", stDept=" + stDept + ", stGrade=" + stGrade
				+ ", stTel=" + stTel + "]";
	}

	
	
	
}
