package com.callor.bank.service.impl;

import com.callor.bank.service.AccService;

public class AccServiceImpmlV1 implements AccService{

	/*
	 * 신규계좌 등록하기
	 * 1. 고객번호를 입력받고, 
	 * 2. 고객번호가 고객정보 있는가 확인
	 * 		BuyerServiceImplV1.getBuyer() method 를 사용하여
	 * 		고객정보 찾기
	 * 		없으면 : 고객정보를 등록하세요 라고 메시지 표현
	 * 3. 고객번호가 있으면 신규 계좌를 생성 : List<AccDto> type accList 에 추가
	 * 
	 */
	@Override
	public void accInit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void inout() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printAccList() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveAccList() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void loadAccList() {
		// TODO Auto-generated method stub
		
	}

}
