package com.callor.classes;

import java.util.Scanner;

public class ClassC {
	public static void main(String[] args) {
		/*
		 * 키보드를 통해서 데이터를 입력받고
		 * 연산을 위한 기본 데이터로 사용한다
		 * 이때 키보드를 통해서 데이터를 입력받기 위한 도구
		 */
		Scanner scan = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		
		/*
		 * 코드가 실행되는 도중에 prompt 를 보여주고
		 * 사용자로 부터 두 개의 정수를 입력받은 후
		 * 덧셈하여 출력하기
		 */
		System.out.println("두 개의 정수를 키보드로 입력하세요");
		System.out.print("정수1 >> ");
		num1 = scan.nextInt();
		System.out.print("정수2 >> ");
		num2 = scan.nextInt();
		
		System.out.printf("%d + %d = %d\n", 
						num1, num2, num1 + num2);
		
		
		
	}

}
