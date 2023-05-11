package com.callor.books.models;

public class AuthorDto {

	private String auCode;
	private String auName;
	private String auTel;
	private String auAddress;
	
	
	
	public AuthorDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AuthorDto(String auCode, String auName, String auTel, String auAddress) {
		super();
		this.auCode = auCode;
		this.auName = auName;
		this.auTel = auTel;
		this.auAddress = auAddress;
	}
	public String getAuCode() {
		return auCode;
	}
	public void setAuCode(String auCode) {
		this.auCode = auCode;
	}
	public String getAuName() {
		return auName;
	}
	public void setAuName(String auName) {
		this.auName = auName;
	}
	public String getAuTel() {
		return auTel;
	}
	public void setAuTel(String auTel) {
		this.auTel = auTel;
	}
	public String getAuAddress() {
		return auAddress;
	}
	public void setAuAddress(String auAddress) {
		this.auAddress = auAddress;
	}
	@Override
	public String toString() {
		return "AuthDto [auCode=" + auCode + ", auName=" + auName + ", auTel=" + auTel + ", auAddress=" + auAddress
				+ "]";
	}
	
	
	
	
}
