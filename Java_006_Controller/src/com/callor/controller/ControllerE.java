package com.callor.controller;

public class ControllerE {
	
	/*
	 * 2개의 정수형 인수를 전달받아
	 * 		method 선언을 할때 정수형 매개변수 2개가 필요
	 * 덧셈을 수행한 후
	 * 		결과는 int 형이다
	 * 결과를 return 하는 method
	 * 		method 의 return type 이 int
	 */
	public static int add(int num1, int num2) {
		// 결과값을 변수에 저장후 return
		// add() method 입장에서 보면 num1과 num2 에는
		// 어떤 정수값이 저장되어 있을 것이다 라는 믿음
		int sum = num1 + num2;
		return sum;
		
		// 연산과 동시에 결과를 return
		// 두 변수에 저장된 값을 덧셈하고 그 결과를 return
		// return num1 + num2;
	}
	
	public static void main(String[] args) {
		// 1. add() method 호출
		// 2. add() method 는 2개의 정수형 매개변수를 가지고 있다
		//		정수값 2개를 "전달"해 주어야 한다.
		// 3. add() method 실행한 후 결과값을 return 한다
		// 4. add() method 가 return 한 값을 다른 변수에 저장
		// 5. 이때 "add() method 실행결과" 를 다른 변수에 
		//		저장하려면 그 변수의 type 의 add() method의
		//		return type 과 같아야 한다.
		//		그래스 int result 형식으로 변수를 선언한다.
		// 6. result 변수에는 add() method 의 실행결과가 담긴다
		int result = add(30,40);
		System.out.println("결과:" + result);
		
	}
	
	

}
