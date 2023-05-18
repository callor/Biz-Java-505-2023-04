package com.callor.bank.models;

/*
 * 계좌정보 데이터 클래스
 * 계좌번호 : acNum
 * 계좌구분 : acDiv
 * 고객ID : buId
 * 최종잔액 : acBalance
 */

public class AccDto {
	
	public String acNum;
	public String acDiv;
	public String buId;
	public int acBalance;
	public AccDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AccDto(String acNum, String acDiv, String buId, int acBalance) {
		super();
		this.acNum = acNum;
		this.acDiv = acDiv;
		this.buId = buId;
		this.acBalance = acBalance;
	}
	@Override
	public String toString() {
		return "AccDto [acNum=" + acNum + ", acDiv=" + acDiv + ", buId=" + buId + ", acBalance=" + acBalance + "]";
	}
	
	

}
