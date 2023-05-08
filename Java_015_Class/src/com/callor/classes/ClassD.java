package com.callor.classes;

import java.util.ArrayList;

public class ClassD extends ClassC{

	/*
	 * Constructor(생성자 method)
	 * 클래스를 객체로 생성할때 호출하는 method
	 * new ClassD() 와 같은 코드를 사용하면
	 * 감춰진 기본 생성자가 호출되어
	 * 객체를 사용할수 있도록 준비해 준다.
	 * 
	 * 생성자 method 는 기본적으로 아무런 코드가 없지만
	 * java 언어 컴파일러에 의해서 클래스를 객체변수로 만들어주는
	 * 코드가 실행된다.
	 * 
	 * 이 생성자 method 에 임의의 코드를 추가하여
	 * 꼭 필요한 변수를 생성하거나 하는 일을 수행할수 있다.
	 * 
	 * 여기에서는 numList 객체변수를 사용할수 있도록 준비하는 코드 추가
	 */
	public ClassD() {
		// ClassD classD = new ClassD() 코드가 실행될때
		// numList 객체변수를 사용할수 있도록 만드는 코드가 (자동으로) 실행된다
		numList = new ArrayList<>();
	}
	
	@Override
	public void printList() {
		System.out.println("리스트 출력");
		/*
		 * classC 에서 numList 객체변수를 선언만 해 둔 상태이다
		 * 객체변수를 선언만 한 상태에서는 method 등을 사용할수 없다
		 * 선언만 한 객체변수의 method 등을 호출하면
		 * NullPointerException 이 발생한다.
		 */
		System.out.println(numList.toString());
	}

}
