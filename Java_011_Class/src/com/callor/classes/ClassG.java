package com.callor.classes;

import java.util.Scanner;

public class ClassG {
	
	/*
	 * 두 개의 정수를 입력받아 두 정수의 4칙연산 결과를 출력하기
	 * 이 연산을 무한 반복하다가
	 * 
	 * 입력한 값이 -1 이면 반복문을 즉시 중단하기
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		/*
		 * while(반복조건) {  }
		 * 반복조건이 true 인 동안 무한 반복 loop
		 * 
		 * while(true) {  }
		 * 끝이 없이(왜 조건이 무조건 true 이므로) 무한 반복
		 * 코드를 강제로 멈추지 않으면 영원히 반복된다.
		 */
		while(true) {
			System.out.println("두 개의 정수를 입력하세요");
			System.out.println("-1 을 입력하면 종료합니다");
			System.out.print("정수1 >> ");
			num1 = scan.nextInt();
			
			// while(true) 무한반복 종료 조건 설정
			if(num1 == -1) {
				break;
			}
			
			System.out.print("정수2 >> ");
			num2 = scan.nextInt();
			if(num2 == -1) {
				break;
			}
			System.out.printf("%d + %d = %d\n",
						num1, num2, num1 + num2);
		}
		System.out.println("GAME OVER!!");
	}

}
