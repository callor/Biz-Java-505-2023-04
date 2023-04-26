package com.callor.classes.exec;

public class ExecJ {
	
	// 매개변수 num 변수로 전달받은 값이
	// prime 이면 num 을 아니면 0을 return 하는 method 선언
	public static int prime(int num) {
		for(int i = 2 ; i < num ; i++) {
			if(num % i == 0) {
				return 0;
			}
		}
		return num;
	}
	
	public static void main(String[] args) {
		int[] nums = new int[50];
		for(int index = 0 ; index < nums.length ; index++) {
			nums[index] = (int)(Math.random() * 50 ) + 51;
		}
		
		int index;
		for(index = 0 ; index < nums.length ; index++) {
			if( prime(nums[index]) > 0) {
				break;
			}
		}
		int lastIndex = -1;
		for(int i = 0 ; i < nums.length ; i++) {
			if( prime(nums[i]) > 0 ) {
				lastIndex = i;
			}
		}
		if( lastIndex > 0) {
			System.out.println("최초 prime 수 위치 : " + index);
			System.out.println("최초의 prime 수 : " + nums[index]);
			System.out.println("마지막 prime 수 위치 " + lastIndex);
			System.out.println("마지막 prime 수 : " + nums[lastIndex]);
		}
		
		int firstIndex = -1;
		lastIndex = -1;
		for(int i = 0 ; i < nums.length ; i++) {
			if(firstIndex < 0 && prime(nums[i]) > 0) {
				firstIndex = i;
			}
			if(prime(nums[i]) > 0) {
				lastIndex = i;
			}
		}
		if(lastIndex > 0) {
			System.out.println("최초 prime index : " + firstIndex);
			System.out.println("최초 prime 수 :  " + nums[firstIndex]);
			System.out.println("마지막 prime index : " + lastIndex);
			System.out.println("마지막 prime 수 : " + nums[lastIndex]);
		}
		
		
		
		
	}

}
