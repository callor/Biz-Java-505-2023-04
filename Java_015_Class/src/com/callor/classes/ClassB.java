package com.callor.classes;

/*
 * ClassB 에서 ClassA 의 기능을 상속(inherit)
 * 
 * ClassB 에는 아무런 method 도 정의되지 않았음엗
 * ClassA 를 상속받아서 마치 ClassA 의 method( 2개 add) 들이
 * 정의되어 있는 것처럼 사용이 가능하다
 * 
 * 객체지향(OOP) 프로그래밍에서 클래스를 상속받기
 * 기존에 잘 만들어진 클래스 코드가 있으면, 그 클래스 코드를
 * 내가 만든 클래스에서 사용하고 싶을때
 * ClassA 는 매우 잘 만들어진 클래스라고 하자
 * ClassB 는 ClassA 의 method 들을 그대로 물려받아 사용할수 있다.
 * 만약 원래 ClassA 개발자가 코드를 Upgrade 하면 
 * ClassB 도 같이 Upgrade 되는 효과를 낼수 있다
 * 
 */
public class ClassB extends ClassA{

	/*
	 * Java 에서 클래스의 상속(extends)
	 * Java 에서 클래스의 상속은 부모 클래스의 장점을 그대로 물려 받으면서
	 * 필요에 따라 method 를 다시 재 정의하여 사용할수 있는 기능이다.
	 */
	
	@Override
	public void add(int num1, int num2) {
		System.out.printf("%d + %d = %d\n",num1, num2, num1 + num2);
	}

	/*
	 * Object 를 상속받는 모든 클래스는
	 * 기본적으로 toString() method 가 있다.
	 * 기본 toString() method 클래의 패키지명, 메모리 주소 등을
	 * 문자열로 return 한다.
	 * 
	 * 기본 toString() method 코드는 실제로 별 효용이 없다.
	 * 일반적으로 toString() 각 class 에서 재 정의하여 사용한다
	 */
	@Override
	public String toString() {
		return "나는 원래 toString() method 를 재 정의 한 것이다";
	}
	
	
	
	
	
	
	
	

}
