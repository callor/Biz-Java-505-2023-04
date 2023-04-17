package com.callor.var.controller;

public class ControlB {
	
	public static void main(String[] args) {
		
		double douRnd = Math.random();
		douRnd = douRnd * 10;
		int intRnd = (int)douRnd;
		
		System.out.println( douRnd );
		System.out.println( intRnd );
		
		intRnd = (int)(Math.random() * 10);
		
		
	}

}
