package com.callor.classes.exec;

import java.io.InputStream;
import java.util.Scanner;

public class ScannerExecA {
	
	public static void main(String[] args) {
		InputStream is = System.in;
		Scanner scan = new Scanner(is);
		
		System.out.print("문자열 입력 >> ");
		String str = scan.nextLine();
		System.out.println("입력한 문자열 : " + str );
	}

}
