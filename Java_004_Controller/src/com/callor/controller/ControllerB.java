package com.callor.controller;

public class ControllerB {
	
	public static void main(String[] args) {
		
		/*
		 * 51 ~ 100까지 범위의 랜덤수 100 개 생성
		 * 
		 * 가. 생성된 수가 짝수인지 판별
		 * 나. 생성된 수가 "짝수"인지, "아닌지"판별
		 * 다. 생성된 수가 "짝수"인지, "홀수"인지 판별
		 */
		for(int i = 0 ; i < 100 ; i ++) {
			int rndNum = (int)(Math.random() *50) + 51;
			
			// 짝수판별 
			if(rndNum % 2  == 0) {
				System.out.println(rndNum);
			}
			
			// 짝수인지 아닌지 판별
			if(rndNum % 2 == 0) {
				System.out.println(rndNum + " 짝수");
			} else {
				System.err.println(rndNum + " 짝수 아님");
			}
			
			// 짝수인지 홀수인지 판별
			if(rndNum % 2 == 0) {
				System.out.println(rndNum + " 짝수");
			} else if(rndNum % 2 == 1) {
				System.out.println(rndNum + " 홀수");
			}
			
		}
		
	}

}
