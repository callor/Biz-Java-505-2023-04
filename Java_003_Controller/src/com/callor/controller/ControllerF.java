package com.callor.controller;

public class ControllerF {
	
	public static void main(String[] args) {
		int last = 10;
		for(int i = 0 ; i < last ; i++) {
			for(int j = 0; j < last ; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("=".repeat(20));
		
		for(int i = 0 ; i < last ; i++) {
			for(int j = 0 ; j <  i + 1 ; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}
