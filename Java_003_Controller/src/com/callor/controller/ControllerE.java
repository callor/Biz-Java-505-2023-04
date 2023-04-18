package com.callor.controller;

public class ControllerE {
	public static void main(String[] args) {
		
		for(int i = 0 ; i < 1000 ; i ++) {
			int intScore = (int)(Math.random() * 50) + 51;
//			if(intScore < 51 || intScore > 100) {
			if( !(intScore >= 51 && intScore <= 100) ) {
				System.out.println(intScore);	
			}
		}
		System.out.println("Test End");
		
		// 다음 예제에서 num2 의 최종 값을 확인하고
		// 왜 그렇게 값이 나오는지 설명
		int num1 = 100;
		int num2 = 100;
		if(++num1 > 100 || ++num2 > 100) {
			System.out.println("OK");
		}
		if(--num1 > 100 && --num2 > 100) {
			System.out.println("Hello");
		}
	}
	

}
