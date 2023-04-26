package com.callor.classes.exec;

public class ExecB {
	
	public static void main(String[] args) {
		// 정수형 배열 nums 를 선언하고, 
		// 저장 공간 10 개를 생성하라
		int[] nums = new int[10];
		
		// nums 배열의 0번 요소부터 9번 요소까지
		// 순서대로 1 ~ 10까지 값을 저장하기
		for(int index = 0 ; index < 10 ; index ++) {
			// nums[index] 위치에 index + 1 의 값을 저장
			nums[index] = index + 1;
		}
		
		// nums 배열의 0번 요소부터 9번 요소까지
		// 51 ~ 100까지 랜덤수를 저장하라
		for(int index = 0 ; index < 10 ; index++) {
			// nums[index] 위치에 51 ~ 100까지 랜덤수 저장
			nums[index] = (int)(Math.random() * 50) + 51;
		}
		
		
	}

}
