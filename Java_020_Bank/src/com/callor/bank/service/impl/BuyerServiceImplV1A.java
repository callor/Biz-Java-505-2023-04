package com.callor.bank.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.bank.models.BuyerDto;
import com.callor.bank.service.BuyerService;
import com.callor.bank.utils.Line;

public class BuyerServiceImplV1A implements BuyerService{
	
	protected Scanner scan;
	protected List<BuyerDto> buyerList;
	
	public BuyerServiceImplV1A() {
		buyerList = new ArrayList<>();
		scan = new Scanner(System.in);
	}
	
	@Override
	public void loadBuyer() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printBuyerList() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public BuyerDto getBuyer(String buId) {
		// TODO Auto-generated method stub
		return null;
	}
	
	/*
	 * 현재 buyerList 에 저장된 요소들을 탐색하여
	 * 고객ID 가 가장 큰 값을 갖는 요소를 찾아서
	 * 고객ID + 1 의 값을 return
	 */
	protected int getMaxId() {
		
		int maxId = 0;
		for(BuyerDto dto : buyerList) {
			int intId = Integer.valueOf(dto.buId);
			if(intId > maxId) maxId = intId;
		}
		return maxId + 1;
		
	}
	
	protected BuyerDto buyerItemInput() {
		
		
		// null 값으로 임시 clear
		BuyerDto buDto = null;
		
		// 값에 대한 검증을 하기 위한 while
		String buId = ""; 
		while(true) {
			
			System.out.printf("고객ID(%04d) >>",getMaxId());
			buId = scan.nextLine();
			// Q 처럼 단독 알파벳으로 쓰면 좋을 것 같은데??
			// 입력하는 도중 알파벳은 실수로 자꾸 눌릴수 있다.
			// 실수로 알파벳 Q 는 쉽게 누를 수 있지만
			// 상대적으로 QUIT 는 실수로 입력할 확률이 낮다.
			// 입력도중 알파벳을 잘못입력하여 종료되는 것을 방지하기 위함
			if(buId.equals("QUIT")) return null;
			if(buId.equals("")) buId = String.format("%04d", getMaxId());
			
			try {
				int intBuId = Integer.valueOf(buId);
				buId = String.format("%04d", intBuId);
				break;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("고객 ID 는 정수로만 입력하세요");
			}
			
			// 여기까지 buDto 는 "null 인 상태"
			for(BuyerDto dto : buyerList) {
				
				// 고객ID 에 해당하는 정보가 있으면
				// 이때부터는 buDto 는 null 인 상태가 아니고
				// 입력한 고객ID 의 데이터의 주소를 갖는 상태
				if(dto.buId.equals(buId)) {
					buDto = dto;
					break;
				}
				
			}
			
		} // buId 입력 끝
		
		System.out.printf("고객이름(%s) >> ",
				buDto == null ? "신규" : buDto.buName);
		String buName = scan.nextLine();
		if(buName.equals("QUIT")) return null;
		
		System.out.printf("전화번호(%s) >> ",
				buDto == null ? "신규" : buDto.buTel);
		String buTel= scan.nextLine();
		if(buTel.equals("QUIT")) return null;
		
		System.out.printf("주소(%s) >> ",
				buDto == null ? "신규" : buDto.buAddr);
		
		String buAddr= scan.nextLine();
		if(buAddr.equals("QUIT")) return null;
		
		System.out.printf("생년월일(%s) >> ",
				buDto == null ? "신규" : buDto.buBirth);
		String buBirth= scan.nextLine();
		if(buBirth.equals("QUIT")) return null;
		
		System.out.printf("직업(%s) >> ",
				buDto == null ? "신규" : buDto.buJob);
		String buJob = scan.nextLine();
		if(buJob.equals("QUIT")) return null;
		
		if(buDto == null) buDto = new BuyerDto();
		
		buDto.buId = buId;
		buDto.buName = buName;
		buDto.buTel = buTel ;
		buDto.buAddr = buAddr ;
		buDto.buBirth = buBirth;
		buDto.buJob = buJob	;
		return buDto;
		
	}
	
	@Override
	public void inputBuyer() {
		
		// 전체적인 입력 반복을 위한 while
		while(true) {
			System.out.println(Line.dLine(100));
			System.out.println("고객정보 관리");
			System.out.println(Line.sLine(100));
			
			BuyerDto buDto = buyerItemInput();
			if(buDto == null) break;
			/*
			 * 
			 * buyerList 데이터를 추가 또는 수정
			 * buyerList 데이터에 buDto 요소가 없으면 추가
			 * 있으면 무시
			 * 
			 * "주소에 대한 개념으로 이해하여 보자"
			 * 
			 * 
			 * List type 객체의 contains method 
			 * List type 객체(buyerList)의 요소중에
			 * buDto 변수에 담긴 주소를 가진 요소가 있냐?
			 */
			if( !buyerList.contains(buDto) ) buyerList.add(buDto);
		}
		System.out.println("고객정보 입력 종료");
		
	}
}
