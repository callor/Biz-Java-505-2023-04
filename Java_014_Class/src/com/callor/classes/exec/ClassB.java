package com.callor.classes.exec;

public class ClassB {
	
	public static void main(String[] args) {
		int[] nums = new int[10];
		for(int i = 0 ; i < nums.length ; i++) {
			nums[i] = (int)(Math.random() * 51) + 50;
		} 
		
		for(int i = 0 ; i < nums.length ; i++) {
			for(int j = i + 1 ; j < nums.length ; j++) {
				if(nums[i] > nums[j]) {
					int temp  = nums[i];
					nums[i] = nums[j] ;
					nums[j] = temp;
				}
			}
		}
		
		for(int i = 0 ; i < nums.length ; i++) {
			System.out.printf("%d\t",nums[i]);
		}
		
		
	}

}
