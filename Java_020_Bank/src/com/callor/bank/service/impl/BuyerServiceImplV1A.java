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
	
	protected BuyerDto buyerItemInput() {
		
		// 값에 대한 검증을 하기 위한 while
		String buId = "";
		while(true) {
			System.out.print("고객ID >>");
			buId = scan.nextLine();
			// Q 처럼 단독 알파벳으로 쓰면 좋을 것 같은데??
			// 입력하는 도중 알파벳은 실수로 자꾸 눌릴수 있다.
			// 실수로 알파벳 Q 는 쉽게 누를 수 있지만
			// 상대적으로 QUIT 는 실수로 입력할 확률이 낮다.
			// 입력도중 알파벳을 잘못입력하여 종료되는 것을 방지하기 위함
			if(buId.equals("QUIT")) return null;
			try {
				int intBuId = Integer.valueOf(buId);
				buId = String.format("%04d", intBuId);
				break;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("고객 ID 는 정수로만 입력하세요");
			}
		} // buId 입력 끝
		
		System.out.print("고객이름 >> ");
		String buName = scan.nextLine();
		if(buName.equals("QUIT")) return null;
		
		System.out.print("전화번호 >> ");
		String buTel= scan.nextLine();
		if(buTel.equals("QUIT")) return null;
		
		System.out.print("주소 >> ");
		String buAddr= scan.nextLine();
		if(buAddr.equals("QUIT")) return null;
		
		System.out.print("생년월일 >> ");
		String buBirth= scan.nextLine();
		if(buBirth.equals("QUIT")) return null;
		
		System.out.print("직업 >> ");
		String buJob = scan.nextLine();
		if(buJob.equals("QUIT")) return null;

		BuyerDto buDto = new BuyerDto();
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
			buyerList.add(buDto);
		}
		System.out.println("고객정보 입력 종료");
		
	}
}
