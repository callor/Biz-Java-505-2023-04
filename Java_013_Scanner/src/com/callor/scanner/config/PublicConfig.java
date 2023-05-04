package com.callor.scanner.config;

public class PublicConfig {
	
	/*
	 * 변수 선언문에 static 추가된경우
	 * "클래스 변수"
	 * 프로젝트가 시작될때 자동으로 생성(선언, 초기화)되는 변수
	 * 이 변수는 클래스를 객체로 생성하지 않아도 사용할수 있는 변수
	 * 
	 * 일반적인 클래스에 선언된 변수 사용하기 위해서는 반드시 객체 선언이
	 * 먼저 되어야 한다.
	 * 		DataClass obj = new DataClass()
	 * 		obj.변수 = 30;
	 * 
	 * 클래스 변수는 객체로 선언하지 않고 직접 호출할수 있다
	 * 		Config.변수 = 30;
	 * 		System.out.println(Config.변수);
	 * 
	 */
	public static String dLine = "=".repeat(60);
	public static String sLine = "-".repeat(60);
	
	/*
	 * 클래스 method
	 * 프로젝트가 시작될때 자동으로 메모리에 loading 되어
	 * 사용할 준비가 완료되는 method
	 * PublicConfig.dLine(100);
	 */
	public static String dLine(int length) {
		return "=".repeat(length);
	}
	public static String sLine(int length) {
		return "-".repeat(length);
	}
	
	/*
	 * 클래스에 포함된 변수, method 에는 static 키워드를 추가할수 있다
	 * 원래는 이러한 변수, method 를 정적변수, 정적메서드 라고 한다
	 * 
	 * 프로젝트가 시작될때 언제든지 사용할수 있도록 미리 준비되는 도구들
	 * 사용할때는 "클래스명.변수", "클래스명.메서드()" 와 같이 직접
	 * 클래스 이름을 통하여 접근한다.
	 * 
	 */
	
	

}
