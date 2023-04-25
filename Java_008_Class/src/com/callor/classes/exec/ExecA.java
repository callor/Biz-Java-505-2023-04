package com.callor.classes.exec;

import com.callor.classes.module.ServiceA;

public class ExecA {
	
	public static void main(String[] args) {
		ServiceA serviceA = new ServiceA();
		
		int intKor = (int)(Math.random() * 50) + 51;
		int intEng = (int)(Math.random() * 50) + 51;
		int intMath = (int)(Math.random() * 50) + 51;
		int intHistory = (int)(Math.random() * 50) + 51;
		int intMusic = (int)(Math.random() * 50) + 51;
		int intArt = (int)(Math.random() * 50) + 51;
		int intSport = (int)(Math.random() * 50) + 51;
		serviceA.score(intKor, intEng, intMath, intHistory, intMusic, intArt, intSport);
	}

}
