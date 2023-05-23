package com.callor.bank.models;

public class BuyerDto {
	
	public String buId;
	public String buName;
	public String buTel;
	public String buAddr;
	public String buBirth;
	public String buJob;
	
	public BuyerDto(String buId, String buName, String buTel, String buAddr, String buBirth, String buJob) {
		super();
		this.buId = buId;
		this.buName = buName;
		this.buTel = buTel;
		this.buAddr = buAddr;
		this.buBirth = buBirth;
		this.buJob = buJob;
	}
	public BuyerDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "BuyerDto [buId=" + buId + ", buName=" + buName + ", buTel=" + buTel + ", buAddr=" + buAddr
				+ ", buBirth=" + buBirth + ", buJob=" + buJob + "]";
	}
	
	

}
