package com.callor.classes.exec;

public class ExecF {
	public static void main(String[] args) {
		int[] nums = new int[10];
		for(int index = 0 ; index < nums.length ; index++) {
			nums[index] = (int)(Math.random() * 50) + 51;
		}
		
		// 배열의 요소에 저장된 값중에서 최초로 5의 배수가 저장된
		// 위치 찾기
		for(int index = 0; index < nums.length ; index++) {
			if(nums[index] % 5 == 0) {
				System.out.printf("최초 5의 배수 위치 : %d, ",index);
				System.out.printf(" 5의 배수 값 : %d \n", nums[index]);
				break;
			}
		}
		
		
	}

}
