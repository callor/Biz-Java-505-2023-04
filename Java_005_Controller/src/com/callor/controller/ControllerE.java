package com.callor.controller;

public class ControllerE {
	/*
	 * method 의 선언
	 * method 는 마치 java 의 명령문을 새로 만드는 것과 같다
	 * method 선언 규칙에 따라 이름() {} 등을 만들고
	 * {} 내에 원하는 코드를 작성한다
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
