package com.callor.classes.exec;

public class NumbersC {
	
	public static void main(String[] args) {
		
		// 참조형 정수 배열 10개 생성
		// 참조형(class) 정수 배열은 배열의 개수는 만들어 지지만
		// 각 요소는 초기화 되지 않는다
		Integer[] nums = new Integer[10];
		// 참조형 정수(숫자) 은 각 요소들을 모두 초기화 해 주어야 한다
		nums[0] = 0;
		for(int i = 0; i < nums.length ; i++) {
			nums[i] = 0;
		}
		// 참조형 숫자 배열의 요소는 일반 기본형 변수 초기화와 같이 생성한다
		for(int i = 0; i < nums.length ; i++) {
			nums[i] = new Integer(0);
		}
		
		// 기본형 정수 배열 10개 생성
		// 기본형 정수 배열은 별도로 값을 초기화 하지 않아도
		// 자동으로 0으로 초기화 생성된다
		int[] intNums = new int[10];
		
		System.out.println(nums[0]);
		System.out.println(intNums[0]);
		
		boolean bYes = nums[0].equals(nums[1]);
		System.out.println(bYes);
		
		bYes = nums[0] == nums[1];
		System.out.println(bYes);
		
		
		String str1 = "KOREA";
		String str2 = new String("KOREA");
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		
		
	}

}
