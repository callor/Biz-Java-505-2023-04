package com.callor.classes.exec;

public class ExecD {
	public static void main(String[] args) {
		int[] nums = new int[10];
		
		// 데이터준비, 데이터 수집
		for(int i = 0 ; i < 10 ; i++) {
			nums[i] = (int)(Math.random() * 50) + 51;
		}
		
		// 데이터 처리  5의 배수 찾기
		for(int i = 0 ; i < 10 ;i++) {
			if(nums[i] % 5 == 0) {
				System.out.println("5의 배수 : " + nums[i]);
			}
		}
	}

}
