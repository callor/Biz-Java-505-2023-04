package com.callor.classes.arrays;

public class ArrayF {
	
	public static int prime(int num) {
		for(int i = 0 ; i < num ; i++) {
			if(num % i == 0) {
				return 0;
			}
		}
		return num;
	}
	
	public static void main(String[] args) {
		int[] nums = new int[10];
		for(int i = 0 ; i < 10 ; i ++) {
			nums[i] = (int)(Math.random() * 50) + 51;
		}
		
		for(int i = 0 ; i < 10 ; i++) {
			// prime() method 호출하여 prime() 구하기
			if(prime(nums[i]) > 0) {
				System.out.println(nums[i] + "는 소수");
			} else {
				System.err.println(nums[i] + "는 소수");
			}
		}
		
	}

}
