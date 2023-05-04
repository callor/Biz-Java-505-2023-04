package com.callor.scanner.exec;

import java.util.Scanner;

public class ScannerF {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] nums = new int[6];

		while (true) {
			System.out.println("GAME Start");
			
			// 1 ~ 45 랜덤수 생성
			int rndNum = (int) (Math.random() * 45) + 1;
			
			while (true) {
				System.out.println("1 ~ 45 범위의 정수를 입력하세요");
				System.out.println("(QUIT : 종료) >> ");
				String strNum = scan.nextLine();
				if (strNum.equals("QUIT")) {
					// break;
					System.out.println("GAME OVER");
					return ;
				}
				try {
					int intNum = Integer.valueOf(strNum);
					if(intNum < 0 || intNum > 45) {
						System.out.println("1 ~ 45까지 범위의 정수만 입력하세요");
					} else if (rndNum == intNum) {
						System.out.println("참 잘했어요");
						break;
					} else if(rndNum > intNum ) {
						System.out.println("입력값이 너무 작아요");
					} else if(rndNum < intNum ){
						System.out.println("입력값이 너무 커요");
					}
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("정수를 정확히 입력하세요");
				}
			}

		}
	}

}
