package com.callor.system.exec;

import java.util.Scanner;

public class ScannerB {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		while(true) {
			System.out.println("두 개의 정수를 입력하세요");
			System.out.print("정수1 ( QUIT:종료 ) >> ");
			String strNum1 = scan.nextLine();
			if(strNum1.equals("QUIT")) {
				break;
			}
			/*
			 * 만약 키보드로 30 이라는 값을 입력하고 Enter누르면
			 * strNum1 변수에는 문자열형 숫자인 "30" 문자열이 저장된다
			 * 마찬가지고 strNum2 에도 문자열형 숫자가 저장된다
			 * 이 두 변수를 덧셈연산하면 문자열 연결 연산이 되고
			 * 나머지 4칙 연산은 오류가 난다.
			 * 
			 * 원하는 연산은
			 * "정수형" 숫자값의 4칙 연산이다
			 * 따라서 입력된 "문자열형" 숫자를 실제 
			 * "정수형" 숫자형 데이터로 변환을 해 주어야 한다.
			 */
			
			// 문자열형 숫자를 정수형 숫자 데이터로 변환하기
			num1 = Integer.valueOf(strNum1);
			

			
			System.out.printf("정수2 ( QUIE:종료 ) >> ");
			String strNum2 = scan.nextLine();
			if(strNum2.equals("QUIT")) {
				break;
			}
			
			num2 = Integer.valueOf(strNum2);
			System.out.printf("%d + %d = %d\n", 
						num1, num2, num1 + num2);
			System.out.printf("%d - %d = %d\n", 
					num1, num2, num1 - num2);
			System.out.printf("%d x %d = %d\n", 
					num1, num2, num1 * num2);
			System.out.printf("%d ÷ %d = %d\n", 
					num1, num2, num1 / num2);
		}
		System.out.println("GAME OVER");
		
		
	}
	
}
