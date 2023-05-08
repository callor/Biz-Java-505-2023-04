package com.callor.classes.exec;

public class ClassA {
	
	public static void main(String[] args) {
		// 정수형 배열 10개 생성
		int[] nums = new int[10];
		
		// 개별요소(0 번 요소)에 값 저장
		nums[0] = (int)(Math.random() * 51) + 50;
		
		// 정수형 배열 10의 요소에 51 ~ 100까지 랜덤수 저장
		for(int i = 0 ; i < nums.length ; i++) {
			nums[i] = (int)(Math.random() * 51 ) + 50;
		}
		
		for(int i = 0 ; i < nums.length; i++) {
			if(nums[i] % 2 == 0) {
				System.out.printf("index %d, 값 : %d\n",i, nums[i]);
				break;
			}
		}
		
		
		
	}

}
