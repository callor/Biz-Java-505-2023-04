package com.callor.system.exec;

public class NumbersA {
	
	public static void main(String[] args) {
		
		// 문자열형 숫자
		// 덧셈(연결)연산만 가능, 기타 4칙연산 불가
		// 숫자로 보이지만 실제 데이터는 문자열이다
		String strNum1 = "30";
		String strNum2 = "30.0";
		String strNum3 = "30 + 40";
		
		// 문자열형 숫자를 4칙연산이 가능한 숫자로 변환하기
		int num1 = Integer.valueOf(strNum1);
		float num2 = Float.valueOf(strNum2);
		
		/*
		 * 문자열형 숫자를 실제 4칙연산이 가능한 숫자로
		 * 변환하기 위해서는 숫자형 문자열 외에 어떠한
		 * 문자열로 포함할수 없다
		 */
		System.out.println(Integer.valueOf("30"));
//		System.out.println(Integer.valueOf(" 30"));
//		System.out.println(Integer.valueOf("30 "));
//		System.out.println(Integer.valueOf("A30"));
//		System.out.println(Integer.valueOf("30A"));
		
//		int num3 = Integer.valueOf(strNum3);
		
		System.out.println(num1 + num2);
//		System.out.println(num1 + num3);
		
	}

}
