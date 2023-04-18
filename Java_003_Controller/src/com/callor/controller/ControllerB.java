package com.callor.controller;

public class ControllerB {
	public static void main(String[] args) {
		
		/*
		 * int index = 0
		 * for() 반복문에서 사용할 변수 선언
		 * for() 반복문이 시작될때 최초에 한번 실행
		 * 실행횟수에 관계없이 1번만 실행
		 */
		int sum = 0;
		for(int index = 0;index < 10 ; index++) {
			System.out.print(index + 1 + "\t");
			// 누적연산
			// 한 변수에 다른변수의 변화되는 값을 계속
			// 덧셈하여 쌓는 연산
			sum += (index + 1);
		}
		System.out.println();
		System.out.println(sum);
		
		
	}

}
