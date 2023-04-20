package com.callor.controller;

public class ControllerF {
	/*
	 * prime() method 의 코드를 수정하여
	 * 생성된 랜덤수가 소수인지 아닌지 판별하는 코드로 변경
	 */
	public static void prime() {
		int rndNum = (int) (Math.random() * 50) + 51;
		int index = 0;
		for (index = 2; index < rndNum; index++) {
			if (rndNum % index == 0) {
				break;
			}
		}
		if (rndNum <= index) {
			System.out.println(rndNum + " 는 소수");
		}
		return ;

	}

	public static void main(String[] args) {

		for (int i = 0; i < 100; i++) {
			// prime() method 의 {} 내의 코드를 실행해달라
			// prime() method 를 호출한다 라고 표현
			prime();
		}
	}
}
