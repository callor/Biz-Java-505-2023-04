package com.callor.controller;

public class ControllerA {
	public static void main(String[] args) {
		
		/*
		 * 51 ~ 100까지 랜덤수를 100개 생성하고
		 * 생성된 랜덤수가 51 ~ 100 범위의 수 인지 검증
		 */
		for(int i = 0 ; i < 100 ; i++) {
			int rndNum = (int)(Math.random() * 50) + 51;
			System.out.print(rndNum);
			if(rndNum < 51 || rndNum > 100) {
				System.err.println(" Over");
			} else {
				System.out.println(" OK");
			}
		}
		
		
	}

}
