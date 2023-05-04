package com.callor.scanner.exec;

import java.util.Scanner;

public class ScannerB {
	
	private static int getNum() {
		Scanner scan = new Scanner(System.in);
		int num = 0;
		while(true) {
			System.out.println("3이상 양의 정수를 입력하세요");
			System.out.print("정수( QUIT : 종료 ) >> ");
			String strNum = scan.nextLine();
			if(strNum.equals("QUIT")) {
				return -1;
			}
			try {
				num = Integer.valueOf(strNum);	
				if(num < 3) {
					continue;
				}
				break;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("정수만을 정확히 입력해 주세요");
			}
		}
		return num;
	}
	
	public static void main(String[] args) {
		
		int index = 0;
		for(index = 2; index < num ; index++) {
			if(num % index == 0) {
				break;
			}
		}
		
		// for() 반복문이 끝났을때
		// num가 소수와 num가 소수가 아닌경우
		if(index >= num) {
			System.out.println(num + " 는 소수");
		} else {
			System.out.println(num + " 는 소수가 아님");
		}
		
		
		
		
	}

}
