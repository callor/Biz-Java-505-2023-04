package com.callor.bank.service;

import java.util.List;

import com.callor.bank.models.AccDto;

public interface AccService {
	
	// 전체 데이터를 조회하여 List<AccDto> type 으로 return
	public List<AccDto> selectAll();
	
	// id 값(보통 PK 값)을 전달받아 조회를 한 후
	// PK로 조회(SELECT)를 하면 데이터는 없거나 1개이다
	public AccDto findById(String acNum);
	
	// 고객ID를 전달받아 고객의 계좌정보 리스트를 Return
	/*
	 * PK 칼럼이 아닌 칼럼으로 SELECT 를 수행했을때
	 * 결과는 0 이상이다
	 * 만약 SELECT 된 결과가 1개 뿐이라는 확신이 있더라도
	 * 이 데이터는 List type 으로 취급한다
	 */
	public List<AccDto> findByBuId(String acBuId);
	
	public int insert(AccDto dto);
	public int update(AccDto dto);
	public int deletet(String acNum);

}
