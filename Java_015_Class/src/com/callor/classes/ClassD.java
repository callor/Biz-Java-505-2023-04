package com.callor.classes;

public class ClassD extends ClassC{
	
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
