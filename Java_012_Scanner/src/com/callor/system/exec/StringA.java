package com.callor.system.exec;

public class StringA {
	
	public static void main(String[] args) {
		// 문자열 변수
		/*
		 * 일반적인 변수(primitive variable)
		 * 		int, float, long, double, boolean, char
		 * primitive 변수는 변수를 선언하는 키워드가
		 * 		모두 소문자이다.
		 * 		이 키워드는 단지 데이터를 저장하는 공간인
		 * 		변수를 선언하는 용도
		 * 		(숫자)변수의 형(type)을 강제 변환하는 용도 로
		 * 		만 사용된다. = (int)변수
		 * 
		 * 문자열변수는 primitive type 이 아니다
		 * 				class type 이다.
		 * class type 으로 생성된 변수는
		 * 		여러가지 기능(method)들을 많이 포함하고 있다		
		 */
		String str1 = "Korea";
		System.out.println(str1.substring(3));
		
		// String class type 의 변수 생성하기
		String str2 = "Korea"; // 첫번째(일반적인)방법
		String str3 = new String("Korea"); // 두번째(객체방식) 방법
		
		System.out.println("STR2 : " + str2);
		System.out.println("STR3 : " + str3);
		
		boolean bYes = str2 == str3;
		System.out.println(bYes);
		
	}

}
