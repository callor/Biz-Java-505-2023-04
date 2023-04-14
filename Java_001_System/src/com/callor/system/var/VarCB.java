package com.callor.system.var;

public class VarCB {
	
	public static void main(String[] args) {
		
		int intNum1 = 30;
		float floatNum1 = 25.0f;
		
		// intNum1 변수에 정수 20을 더하여
		// 다른 변수에 보관하고자 한다
		// 이때 결과를 보관할 변수 intResult 를 선언하고
		// 결과를 intResult 에 보관한다
		int intResult = 0;
		intResult = intNum1 + 20;
		
		/*
		 * 이 경우 위에서 floatNum1 변수를 선언하였는데
		 * 사용할일이 없다
		 * 그래서 결과를 floatNum1 저장한다
		 * floatNum1 에 결과가 저장이 되더라도
		 * 원래결과와 저장된 변수의 type이 달라서
		 * 코드가 실행되는 과정에서 문제가
		 * 발생할 수 있다
		 * 때문에 결과에 정확히 일치한 type 의 변수에 
		 * 결과를 보관하는 것이 좋다
		 */
		floatNum1 = intNum1 + 20;
		
		/*
		 * intNum1 % 2 의 결과는 정수형이다.!!
		 * 값은 중요하지 않다.
		 * 때문에 반드시 결과를 저장할 변수의 type 은
		 * 정수형 이어야 한다.
		 */
		int intYes1 = intNum1 % 2;
		
		/*
		 * intNum1 % 2 == 0 연산의 최종결과는
		 * boolean type 이다. 값은 중요하지 않다
		 * 결과값을 저장하려면 
		 * 반드시 boolean type 의 변수에 
		 * 저장해야 한다
		 */
		boolean bYes = intNum1 % 2 == 0;
		
		// 숫자 <-> boolean 간에는 변환을 할수 없다
		// intYes1 = intNum1 % 2 == 0;
		// bYes = intNum1 % 2;
		
		
		
	}

}
