package com.callor.hello.algebra;

/*
 * 불린연산(부울연산)
 * 어떤 연산의 결과가 true 또는 false 인 경우만
 * 존재하는 연산
 * 여러개의 연산의 결과를 AND(&&), OR(||) 으로 연결하여
 * 최종 결과를 판단한다.
 * 연산식을 AND, OR 연산자로 연결하여 비교할때는
 * 판단하는 결과식이 2의 연산식 
 * 		개수 승 만큼 비교해야 한다
 */
public class BooleanB {
	
	public static void main(String[] args) {
		System.out.println( 30 > 40 || 40 < 30);
		System.out.println( 30 > 40 && 40 < 30);
		System.out.println( 40 < 30 || 30 > 40);
		System.out.println( 40 > 30 || 30 > 40);
		
		System.out.println( 30 > 40 || 40 < 30 || 20 > 10);
		
		System.out.println( 30 != 40 );
		
		
	}

}
