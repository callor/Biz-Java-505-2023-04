package com.callor.classes.exec;

import com.callor.classes.module.MyClassB;

public class ExecF {

	public static void main(String[] args) {
		/*
		 * (우리가) 생성한 MyClassB 클래스가
		 * 변수를 선언하는 키워드가 되었다
		 * Java 에서 기본적으로 제공하는 키워드 외에
		 * 개발자가 생성한 클래스도 변수를 선언하는
		 * 키워드가 된다.
		 */
		MyClassB myB = new MyClassB();
		System.out.println( myB.add(30, 40) );
		System.out.println( myB.add(30.0F, 40.0F) );
		System.out.println( myB.add("대한", "민국") );
	}
}
