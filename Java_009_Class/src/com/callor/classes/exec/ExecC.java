package com.callor.classes.exec;

public class ExecC {
	public static void main(String[] args) {
		// 배열 생성(선언과 초기화가 된 상태)
		int[] nums = new int[10];
		
		// 생성된 배열 요소에 값 채워넣기
		// 데이터 수집
		for(int i = 0 ; i < 10 ; i++) {
			nums[i] = (int)(Math.random() * 50) + 51;
		}
		
		// 배열 요소에 채워진 값들의 전체를 합산
		// 데이터 처리
		int sum = 0;
		for(int i = 0 ; i < 10 ; i++) {
			sum += nums[i];
		}
		System.out.println(sum);
	}
	

}
