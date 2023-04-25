package com.callor.classes.arrays;

public class ArrayB {
	
	public static void main(String[] args) {
		// 10개의 요소를 갖는 정수형 배열 nums 선언
		int[] nums = new int[10];

		// nums 배열의 0번째 데이터를 Console 에 출력
		System.out.println(nums[0]);
		
		// nums 배열의 0번째 위치에 정수 100을 저장
		nums[0] = 100;
		
		/*
		 * 배열에 값을 저장하기
		 * 배열[index] = 값
		 * 
		 * 배열에서 값을 읽을때
		 * result = 배열[index]
		 * 
		 * index : 첨자 라고 한다
		 * 
		 * index 는 항상 0부터 시작한다
		 * index 의 끝 값은 (배열의 개수) - 1 이다
		 * 
		 */
		nums[10] = 100;
		
	}

}
