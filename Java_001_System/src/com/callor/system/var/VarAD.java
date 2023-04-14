package com.callor.system.var;

public class VarAD {
	public static void main(String[] args) {
		/*
		 * 정수형(int type) 변수 num1, num2, num3 를
		 * 선언하고 각각 0으로 초기화 하였다
		 */
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		
		/*
		 * 선언된 변수 num1, num2, num3 에
		 * 각각 정수 30, 20, 15를 대입하였다
		 */
		num1 = 30;
		System.out.println(num2); // 0 출력
		num2 = 20;
		num3 = 15;
		
		// num3 변수에 저장된 값을 "읽어서"
		// Console 에 연속 3번 출력하기
		// 읽는 수없이 실행해도 변수에 저장된 값은
		// 변함이 없다.
		// 변수에 한번 대입(저장)된 값은
		// 코드가 작동되는 동안 값이 계속 유지된다
		// 
		System.out.println(num3);
		System.out.println(num3);
		System.out.println(num3);
		
		// num1, num2, num3 각각의 변수를
		// 서로 복제하는 코드 순서가 애매하다..
		// 이 코드가 실행된 후 num1, num2, num3 값은
		// 모두 같아진다
		num1 = num3;
		num2 = num1;
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		
		// 세개의 변수중에 num3 의 값을
		// 200으로 변경했다
		// 변수 num3 에(만) 정수 200을 대입했다
		// 이 코드가 실행되었을때
		// num1, num2 변수의 값은 변함이 없다
		num3 = 200;
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		
		// 여기에서 코드 작동이 끝난다
	}
}
