package com.callor.classes.module;

public class ServiceC {
	
	public void guguDan(int num) {
		System.out.println("====================");
		System.out.println(num + " 단 구구단");
		System.out.println("--------------------");
		for(int i = 0 ; i < 10 ; i++) {
			System.out.printf("%d x %d = %d\n",
					num, i+1, num * (i + 1));
		}
		System.out.println("=======================");
		
		
	}

}
