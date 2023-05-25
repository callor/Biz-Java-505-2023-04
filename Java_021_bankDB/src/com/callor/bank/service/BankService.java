package com.callor.bank.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.callor.bank.config.DBContract;
import com.callor.bank.models.AccDto;
import com.callor.bank.models.BuyerDto;
import com.callor.bank.service.impl.AccServiceV1;
import com.callor.bank.service.impl.BuyerServiceImplV1;
import com.callor.bank.utils.Line;

public class BankService {
	
	protected final Scanner scan;
	
	protected List<BuyerDto> buyerList;
	protected final BuyerService buyerService;
	protected final AccService accService;
	
	public BankService() {
		accService = new AccServiceV1();
		buyerService = new BuyerServiceImplV1();
		scan = new Scanner(System.in);
	}
	
	public void printBuyerList() {
		buyerList = buyerService.selectAll();
		System.out.println("=".repeat(100));
		System.out.println("대한은행 고객 리스트");
		System.out.println("=".repeat(100));
		System.out.println("ID\t이름\t전화번호\t주소\t생년월일\t직업");
		System.out.println("-".repeat(100));
		for(BuyerDto buyerDto : buyerList) {
			System.out.printf("%s\t", buyerDto.buId);
			System.out.printf("%s\t", buyerDto.buName);
			System.out.printf("%s\t", buyerDto.buTel);
			System.out.printf("%s\t", buyerDto.buAddr);
			System.out.printf("%s\t", buyerDto.buBirth);
			System.out.printf("%s\n", buyerDto.buJob);
		}
		System.out.println("=".repeat(100));
		
	}
	
	public void findByBuyer() {
		System.out.println("=".repeat(100));
		System.out.println("조회하고자 하는 고객ID 를 입력하세요");
		System.out.print("ID >> ");
		String strId = scan.nextLine();
		
		BuyerDto buyerDto = buyerService.findById(strId);
		if(buyerDto == null) {
			System.out.println("조회한 고객ID 는 없는 데이터 입니다");
		} else {
			System.out.println(buyerDto.toString());
		}
	}
	
	public void insertBuyer() {
		
		System.out.println("=".repeat(100));
		System.out.println("고객정보 등록");
		System.out.println("=".repeat(100));
		
		System.out.print("고객 ID >> ");
		String strBuId = scan.nextLine();
		
		System.out.print("고객명 >> ");
		String strBuName = scan.nextLine();

		System.out.print("전화번호 >> ");
		String strBuTel = scan.nextLine();

		BuyerDto buyerDto = new BuyerDto();
		buyerDto.buId = strBuId;
		buyerDto.buName = strBuName;
		buyerDto.buTel = strBuTel;
		buyerService.insert(buyerDto);
		
		
	}
	
	public void delete() {
		System.out.println("=".repeat(100));
		System.out.println("삭제할 고객ID 를 입력하세요");
		System.out.print("고객ID >> ");
		String strBuId = scan.nextLine();
		
		BuyerDto buyerDto = buyerService.findById(strBuId);
		if(buyerDto == null) {
			System.out.printf("%s 고객ID 는 없는 정보입니다",strBuId);
		} else {
			System.out.println(buyerDto.toString());
			System.out.println("고객정보를 정말 삭제할까요???(YES/NO)");
			String yesNo = scan.nextLine();
			if(yesNo.equals("YES")) {
				int result = buyerService.delete(strBuId);
				if(result > 0) {
					System.out.println("고객정보 삭제 완료~~");
				} else {
					System.out.println("고객정보 삭제 실패!!");
				}
			} else {
				System.out.println("삭제 취소!!");
			}
		}
	}
	
	public void update() {
		while(true) {
			System.out.println("수정할 고객 id 를 입력하세요");
			String strBuId = scan.nextLine();
			BuyerDto buyerDto = buyerService.findById(strBuId);
			if(buyerDto == null) {
				System.out.printf("%s, 고객 정보가 없습니다",strBuId);
				continue;
			}
			System.out.println(buyerDto.toString());
			System.out.printf("고객Id : %s\n", buyerDto.buId);
			
			System.out.printf("고객이름(%s)", buyerDto.buName);
			String strBuName = scan.nextLine();
			if( !strBuName.equals("") ) buyerDto.buName = strBuName;
			
			System.out.printf("전화번호(%s)", buyerDto.buTel);
			String strBuTel = scan.nextLine();
			if( !strBuTel.equals("") ) buyerDto.buTel = strBuTel;

			int result = buyerService.update(buyerDto);
			if(result > 0) System.out.println("변경 성공");
			else System.out.println("변경 실패");
			
			break;
		}
	}
	
	public void findUserInfo() {
		
		this.printBuyerList();
		
		System.out.println("조회할 고객ID를 입력하세요");
		System.out.print("고객ID >> ");
		String strBuId = scan.nextLine();
		
		BuyerDto buyerDto = buyerService.findById(strBuId);
		
		if(buyerDto == null) {
			System.out.println("고객ID 가 없습니다");
			return ;
		} else {
			System.out.println(Line.sLine(100));
			System.out.printf("고객ID :  %s\n",buyerDto.buId);
			System.out.printf("이름 :  %s\n",buyerDto.buName);
			System.out.printf("전화번호 :  %s\n",buyerDto.buTel);
			System.out.printf("주소 :  %s\n",buyerDto.buAddr);
			System.out.println(Line.sLine(100));
		}
		
		List<AccDto> accList = accService.findByBuId(strBuId);
		if(accList.isEmpty()) {
			System.out.println("고객의 계좌정보가 없습니다");
			return;
		} else {
			System.out.println(Line.sLine(100));
			System.out.println("계좌번호\t구분\t잔액");
			System.out.println(Line.sLine(100));
			for(AccDto accDto : accList) {
				System.out.printf("%s\t",accDto.acNum);
				
				int intDiv = 0;
				try {
					intDiv = Integer.valueOf(accDto.acDiv);
					
					System.out.printf("%s\t",
							DBContract.ACC_DIV[intDiv - 1]);
					
				} catch (Exception e) {
					System.out.printf("%s\t","종류불명");
				}
				System.out.printf("%d\n",accDto.acBalance);
			}
			System.out.println(Line.sLine(100));
		}
		
	}
	
	
	public void makeAccount() {
		/*
		 * 계좌번호 만들기 : 날짜 + 일련번호
		 * 1. 오늘날짜의 문자열 만들기
		 * 2. 계좌리스트에 오늘날짜에 해당하는 값이 있는지 검사
		 * 		있으면 일련번호 추출하여 + 1하고
		 * 		없으면 1로 설정
		 */
		Date date = new Date(System.currentTimeMillis());
		SimpleDateFormat today = new SimpleDateFormat("YYYYMMdd");
		
		// 오늘날짜의 문자열을 만들기(20230524)
		String todayString = today.format(date);
		
//		List<AccDto> accList = accService.selectAll();
//		int maxNum = 0 ;
//		for(AccDto accDto : accList) {
//			String tempDate = accDto.acNum.substring(0,todayString.length());
//			// 날짜와 같은 데이터 있으면 일련번호 추출
//			if(tempDate.equals(todayString)) {
//				String strNum = accDto.acNum.substring(todayString.length());
//				int intNum = Integer.valueOf(strNum);
//				if(intNum > maxNum) maxNum = intNum;
//			}
//		}
//		maxNum ++;
		
		int maxNum = Integer.valueOf(accService.maxAcNum(todayString)) + 1;
		String acNum = String.format("%s%02d",todayString, maxNum);
		System.out.println("계좌번호 : " + acNum);
		
	}
	
	

	
	
	
}
