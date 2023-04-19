package com.callor.controller;

public class ControllerC {
	/*
	 * 100 개의 랜덤수를 생성하기
	 * 생성된 랜덤수가 3의 배수인가 판별
	 * 아니면 2의 배수인가 판별
	 */
	public static void main(String[] args) {
		for(int i = 0; i < 100 ; i ++) {
			int rndNum = (int)(Math.random() * 50) + 51;
			if(rndNum % 3 == 0) {
				System.out.println(rndNum + "\t*3");
			} else if(rndNum % 2 == 0) {
				System.out.println(rndNum + "\t\t*2");
			}
		}
	}

}
