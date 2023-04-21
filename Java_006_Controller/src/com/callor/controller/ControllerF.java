package com.callor.controller;

public class ControllerF {
	/*
	 * method 중복선언(Over loading)
	 * 1. 같은 이름의 method 를 중복하여 선언할수 있다
	 * 2. method 의 이름은 유일성을 갖는 식별자이다
	 * 3. 그럼에도 불구하고 Java 에서는 method 이름의
	 * 		중복을 허용한다.
	 * 
	 * method 중복이 허용되는 경우
	 * 1. method 의 parameter(매개변수)의 
	 * 		개수는 같으나 각각의 type 이 다른 경우
	 * 2. method 의 매개변수 개수가 다른 경우
	 * 3. method 의 매개변수 type 이 여러가지 일때
	 * 		순서가 다른 경우
	 * 
	 * 이것은 현재 모듈(module) 개발자가 아닌
	 * 		이 모듈을 사용하는 다른 개발자에게 좋은 일이다
	 * 이 모듈을 사용하는 개발자는 method 를 호출할때
	 * 		전달하는 값을 어떤 type 으로 전달해야 하는지
	 * 		고민을 덜 할수 있다
	 */
	public static int add(int num1, int num2) {
		return num1 + num2;
	}
	public static int add(int num1, int num2, int num3) {
		return num1 + num2 + num3;
	}
	public static float add(float num1, float num2) {
		return num1 + num2;
	}
	public static double add(double num1, double num2) {
		return num1 + num2;
	}

	public static void main(String[] args) {
		System.out.println( add(10, 20) );
		System.out.println( add( 10.0f, 20.0f ));
		System.out.println( add( 10.0, 20.0 ));
	}

}
