package com.callor.var;

public class VarD {
	
	public static void main(String[] args) {
		// 변수에 할당할 값이 정해진 경우
		// 0 이 아닌 값으로 초기화를 하는 것이 좋다
		int num1 = 30;
		int num2 = 40;
		
		int sum1 = 0;
		// 변수를 초기화하고 연산결과로 초기화 하기
		// int sum1 = num1 + num2; 
		
		// 이미 선언된 변수에 연산결과 대입(할당, 저장)
		sum1 = num1 + num2;
	}

}
