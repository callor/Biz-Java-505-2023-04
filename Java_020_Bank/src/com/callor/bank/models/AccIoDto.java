package com.callor.bank.models;


/*
 * 거래내역 데이터 클래스
 * 계좌번호 : acNum
 * 거래일자 : aiDate,
 * 거래시각 : aiTime,
 * 거래구분 : aiDiv
 * 입금 : aiInput
 * 출금 : aiOuput
 */
public class AccIoDto {
	
	public String acNum;
	public String aiDate;
	public String aiTime;
	public String aiDiv;
	public int aiInput;
	public int aiOutput;
	public AccIoDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AccIoDto(String acNum, String aiDate, String aiTime, String aiDiv, int aiInput, int aiOutput) {
		super();
		this.acNum = acNum;
		this.aiDate = aiDate;
		this.aiTime = aiTime;
		this.aiDiv = aiDiv;
		this.aiInput = aiInput;
		this.aiOutput = aiOutput;
	}
	@Override
	public String toString() {
		return "AccIoDto [acNum=" + acNum + ", aiDate=" + aiDate + ", aiTime=" + aiTime + ", aiDiv=" + aiDiv
				+ ", aiInput=" + aiInput + ", aiOutput=" + aiOutput + "]";
	}
	

}
