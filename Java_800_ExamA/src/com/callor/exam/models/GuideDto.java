package com.callor.exam.models;

public class GuideDto {
	
	public String id;
	public String item;
	public int seq;
	public String guide;
	
	public GuideDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public GuideDto(String id, String item, int seq, String guide) {
		super();
		this.id = id;
		this.item = item;
		this.seq = seq;
		this.guide = guide;
	}



	@Override
	public String toString() {
		return "GuideDto [id=" + id + ", item=" + item + ", seq=" + seq + ", guide=" + guide + "]";
	}
	
	
	

}
