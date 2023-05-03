package com.callor.system.exec;

import java.util.Scanner;

public class ScannerD {

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
