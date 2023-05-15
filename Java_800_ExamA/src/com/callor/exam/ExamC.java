package com.callor.exam;

import java.util.ArrayList;
import java.util.List;

public class ExamC {
	
	private static int prime(int num) {
		for(int i = 2; i < num ; i++) {
			if(num % i == 0) return 0;
		}
		return num;
	}
	
	public static void main(String[] args) {
		List<Integer> rndList = new ArrayList<>();
		
		for(int i = 0 ; i < 30 ; i ++) {
			int num = (int)(Math.random() * 51) + 50;
			rndList.add(num);
		}
		int count = 0;
		int total = 0;
		for(Integer num : rndList) {
			if( prime(num) > 0) {
				count++;
				total += num;
			}
		}
		System.out.println("소수의 개수 : " + count);
		System.out.println("소수의 합 : " + total);
		
	}

}
