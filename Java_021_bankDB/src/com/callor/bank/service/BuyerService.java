package com.callor.bank.service;

import java.util.List;

import com.callor.bank.models.BuyerDto;

public interface BuyerService {
	
	// 전체 List 를 조회하는 method
	public List<BuyerDto> selectAll();
	
	// PK 를 기준으로 1개의 데이터를 조회하는 method
	public BuyerDto findById(String id);
	
	// 1개의 데이터를 DB 에 추가하는 method
	public int insert(BuyerDto dto);
	
	// 데이터를 Update(수정)하는 method
	public int update(BuyerDto dto);
	
	// PK를 전달받아 1개의 데이터를 삭제하는 method
	public int delete(String id);
	
	
	

}
