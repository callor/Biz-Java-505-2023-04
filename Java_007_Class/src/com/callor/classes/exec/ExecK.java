package com.callor.classes.exec;

import com.callor.classes.module.ServiceB;

public class ExecK {
	public static void main(String[] args) {
		String name = "홍길동";
		int intKor = (int)(Math.random() * 50) + 51;
		int intEng = (int)(Math.random() * 50) + 51;
		int intMath = (int)(Math.random() * 50) + 51;
		
		ServiceB serviceB = new ServiceB();
		serviceB.scorePrint(name, intKor, intEng, intMath);
	}

}
