package com.callor.classes.module;

public class MyClassC {
	
	public int prime(int num1) {
		for(int i = 2 ; i < num1 ; i++) {
			if(num1 % i == 0) {
				return 0;
			}
		}
		return num1;
	}

}
