package com.callor.bank.models;

public class AccListDto {
	
	public long aioSEQ; 	//	NUMBER
	public String acNum;	//	VARCHAR2(20)
	public String aioDate;	//	VARCHAR2(10)
	public String aioTime;	//	VARCHAR2(10)
	public String aioDiv;	//	VARCHAR2(1)
	public int aioInput;	//	NUMBER
	public int aioOutput;	//	NUMBER
	public String aioREM;	//	nVARCHAR2(30)
	
	public AccListDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AccListDto(long aioSEQ, String acNum, String aioDate, String aioTime, String aioDiv, int aioInput,
			int aioOutput, String aioREM) {
		super();
		this.aioSEQ = aioSEQ;
		this.acNum = acNum;
		this.aioDate = aioDate;
		this.aioTime = aioTime;
		this.aioDiv = aioDiv;
		this.aioInput = aioInput;
		this.aioOutput = aioOutput;
		this.aioREM = aioREM;
	}
	
	@Override
	public String toString() {
		return "AccListDto [aioSEQ=" + aioSEQ + ", acNum=" + acNum + ", aioDate=" + aioDate + ", aioTime=" + aioTime
				+ ", aioDiv=" + aioDiv + ", aioInput=" + aioInput + ", aioOutput=" + aioOutput + ", aioREM=" + aioREM
				+ "]";
	}
	
	
	
	

}
