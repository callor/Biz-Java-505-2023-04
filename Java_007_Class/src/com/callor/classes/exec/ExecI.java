package com.callor.classes.exec;

import com.callor.classes.module.MyClassC;

public class ExecI {
	
	public static void main(String[] args) {
		MyClassC myC = new MyClassC();
		int count = 0;
		for(int i = 0 ; i < 100;i++) {
			int rndNum = (int)(Math.random() *50) + 51;
			int result = myC.prime(rndNum);
			if(result > 0) {
				count++;
			}
		}
		System.out.println("소수의 개수 : " + count);
		for(int i = 0 ; i < 10 ; i++) {
		}
	}

}
