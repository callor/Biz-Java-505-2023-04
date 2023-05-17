package com.callor.bank.exec;

public class BuyerExecB {
	
	public static void main(String[] args) {
		String str1 = "대한민국만세";
		String str2 = "대,한,민,국,만,세";
		String str3 = "대\t한\t민\t국\t만\t세";
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		String[] array1 = str1.split("");
		String[] array2 = str2.split(",");
		String[] array3 = str3.split("\t");
		
		for(String s : array3) {
			System.out.println(s);
		}
		
		
	}

}
