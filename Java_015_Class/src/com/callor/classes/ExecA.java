package com.callor.classes;

public class ExecA {
	
	public static void main(String[] args) {
		ClassA classA = new ClassA();
		classA.add(30,40);
		System.out.println(classA.toString());
		
		ClassB classB = new ClassB();
		classB.add(100,200);
		System.out.println(classB.toString());
		
		
	}

}
