package com.callor.classes.exec;

import com.callor.classes.module.MyClassA;

public class ExecE {
	
	public static void main(String[] args) {
		// MyClassA type 의 myA 객체를 선언하고
		// MyClassA() 생성 method 를 사용하여 myA 객체를 초기화
		MyClassA myA = new MyClassA();
		
		/*
		 * MyClassA 클래스에 선언된 add(int,int) method 에는
		 * static key word 가 없다
		 * static key word 가 없는 method 를 사용하기 위해서는
		 * 객체라고하는 대리자가 필요하다
		 * 
		 * 객체는 클래스 type 으로 선언하고, 
		 * 		생성자 method 를 사용하여
		 * 		초기화를 수행한다.
		 */
		int result = myA.add(30, 40);
		System.out.println(result);
		
	}
}
