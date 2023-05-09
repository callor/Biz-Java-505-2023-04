package com.callor.classes.models;

public class ScoreDto {
	
	private String stNum;
	private int scKor;
	private int scEng;
	private int scMath;
	
	public ScoreDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ScoreDto(String stNum, int scKor, int scEng, int scMath) {
		super();
		this.stNum = stNum;
		this.scKor = scKor;
		this.scEng = scEng;
		this.scMath = scMath;
	}
	public String getStNum() {
		return stNum;
	}
	public void setStNum(String stNum) {
		this.stNum = stNum;
	}
	public int getScKor() {
		return scKor;
	}
	public void setScKor(int scKor) {
		this.scKor = scKor;
	}
	public int getScEng() {
		return scEng;
	}
	public void setScEng(int scEng) {
		this.scEng = scEng;
	}
	public int getScMath() {
		return scMath;
	}
	public void setScMath(int scMath) {
		this.scMath = scMath;
	}
	@Override
	public String toString() {
		return "ScoreDto [stNum=" + stNum + ", scKor=" + scKor + ", scEng=" + scEng + ", scMath=" + scMath + "]";
	}
	
	

}
