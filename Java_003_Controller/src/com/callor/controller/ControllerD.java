package com.callor.controller;

public class ControllerD {
	/*
	 * 1 ~ 100까지의 숫자를 가로방향으로 일렬로 나열하기
	 * 
	 * 1	2	3	4	5
	 * 6	7	8	9	10
	 * 
	 * 
	 */
	public static void main(String[] args) {
		int last = 100;
		for(int i = 0 ; i < last ; i ++) {
			
			 // i+1(1 ~ 100까지) 숫자를 일렬로 나열하기
			System.out.print( (i+1) + "\t");
			
			// 나열을 하다가 출력한 숫자가 5의 배수이면
			// Enter(줄바꿈)을 하여라
			if( (i+1) % 5 == 0 ) {
				System.out.println();
			}
		}
	}

}
