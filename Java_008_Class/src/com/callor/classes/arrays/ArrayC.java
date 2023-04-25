package com.callor.classes.arrays;

public class ArrayC {
	
	public static void main(String[] args) {
		int[] nums = new int[10];
		
		nums[0] = 33; // num0 = 33
		nums[1] = 35; // num1 = 35
		nums[2] = 56; // num2 = 56
		nums[3] = 77; // num3 = 77
		nums[4] = 90;
		nums[5] = 50;
		nums[6] = 44;
		nums[7] = 57;
		nums[8] = 98;
		nums[9] = 78;
		
		System.out.println(nums[0]);
		System.out.println(nums[1]);
		System.out.println(nums[2]);
		System.out.println(nums[3]);
		System.out.println(nums[4]);
		System.out.println(nums[5]);
		System.out.println(nums[6]);
		System.out.println(nums[7]);
		System.out.println(nums[8]);
		System.out.println(nums[9]);
		
		// num0, num1, num2
		for(int index = 0 ; index < 10 ; index++) {
			System.out.println( nums[index] );
			// System.out.println(numindex);
		}
		
		
		
		
	}

}
