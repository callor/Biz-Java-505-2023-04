package com.callor.classes.exec;

import com.callor.classes.module.MyClassC;

public class ExecH {
	/*
	 * 51 ~ 100까지 중의 임의의 랜던수를 생성하여
	 * MyClassC 의 prime() method 에게 전달하고
	 * 소수인지 아닌지 결과를 Console 에 출력
	 */
	public static void main(String[] args) {
		int rndNum = (int)(Math.random() * 50) + 51;
		
		// MyClassC type 의 myC 객체 생성(선언과 초기화)
		// myC 는 MyClassC 의 대리자 역할을 수행할 것이다
		MyClassC myC = new MyClassC();
		
		// myC 대리자를 통하여 prime(int) method 를 호출하고
		// 결과를 result 변수에 받기
		int result = myC.prime(rndNum);
		
		// result에 저장된 값이 0 보다 크면 "소수", 
		//			아니면 "소수아님"
		if(result > 0) {
			System.out.println(rndNum + " 는 소수");
		} else {
			System.out.println(rndNum + " 는 소수가 아님");
		}
		
		
	}

}
