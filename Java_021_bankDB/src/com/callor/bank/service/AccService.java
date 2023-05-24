package com.callor.bank.service;

import java.util.List;

import com.callor.bank.models.AccDto;

public interface AccService {
	
	// 전체 데이터를 조회하여 List<AccDto> type 으로 return
	public List<AccDto> selectAll();
	
	// id 값(보통 PK 값)을 전달받아 조회를 한 후
	// PK로 조회(SELECT)를 하면 데이터는 없거나 1개이다
	public AccDto findById(String acNum);
	public int insert(AccDto dto);
	public int update(AccDto dto);
	public int deletet(String acNum);

}
