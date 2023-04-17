package com.callor.var.controller;

public class ControlD {
	
	public static void main(String[] args) {
		int intRnd = (int)(Math.random() * 10);
		if(intRnd % 2 == 0) {
			System.out.println(intRnd + "는(은) 짝수");
		}
		if(intRnd % 2 != 0) {
			System.out.println(intRnd + "는(은) 짝수 아님!!");
		}
		if(intRnd % 2 == 1) {
			System.out.println(intRnd + "는(은) 홀수");
		}
		if(intRnd % 2 != 1) {
			System.err.println(intRnd + "는(은) 홀수가 아님");
		}
		
		
		
	}

}
