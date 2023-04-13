package com.callor.hello.algebra;

public class BooleanC {

	public static void main(String[] args) {
		System.out.println( 33 % 2 == 0);
		// 삼항연산자
		// ? 왼쪽의 연산 결과가 
		//		true 이면 "응"을 출력하고
		// 		아니면 "아니"를 출력
		// 여기에서는 당연히 "아니"가 출력된다
		System.out.println( 33 % 2 == 0 ? "응" : "아니");
		System.out.println( 33 % 2 == 0 ? 33 / 2 : 33 * 2);
		System.out.println( 33 % 2 == 0 ? "짝수" : "홀수");
	}
}
