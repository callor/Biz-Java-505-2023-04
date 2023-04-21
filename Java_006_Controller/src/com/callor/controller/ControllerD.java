package com.callor.controller;

public class ControllerD {
	public static int prime() {
		int rndNum = (int) (Math.random() * 50) + 51;
		for (int i = 2; i < rndNum; i++) {
			if (rndNum % i == 0) {
				return 0;
			}
		}
		return rndNum;
	}

	public static void main(String[] args) {
		int intPrimeTotal = 0;
		int intPrimeCount = 0;
		for (int i = 0; i < 100; i++) {
			int resultNum = prime();
			if (resultNum > 0) {
				intPrimeCount ++;
				intPrimeTotal += resultNum;
			}
		} // end for
		System.out.printf("소수의 개수 : %d, 소수의 합 %d\n",
				intPrimeCount, intPrimeTotal);
		
	}
}
