package com.callor.classes.exec;

public class ExecB {

	public static void main(String[] args) {
		int rndNum = (int)(Math.random() * 50 ) + 51;
		/*
		 * ExecA 클래스에 정의된 prime() method에게
		 * rndNum 변수의 값을 전달하고
		 * 소수인가를 판별하여 그 결과를 return 받는다.
		 * 
		 * prime() method 가 return 한 값을 result 변수에
		 * 저장, 할당, 대입 한다
		 */
		int result = ExecA.prime(rndNum);
		if(result > 0) {
			System.out.println(result + " 는 소수");
		} else {
			System.err.println(rndNum + " 는 소수 아님");
		}
	}
}
