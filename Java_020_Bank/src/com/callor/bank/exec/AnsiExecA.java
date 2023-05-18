package com.callor.bank.exec;

import com.callor.bank.utils.AnsiConsol;

public class AnsiExecA {
	
	public static void main(String[] args) {
		
		System.out.println(AnsiConsol.green + "Republic" + AnsiConsol.exit);
		
		System.out.println(AnsiConsol.GREEN("대한민국만세"));
		System.out.println(AnsiConsol.BLUE("대한민국만세"));
		System.out.println(AnsiConsol.CYAN("대한민국만세"));
		System.out.println(AnsiConsol.WHITE("대한민국만세"));
		
		System.out.println(AnsiConsol.message("RED","대한민국만세"));
		
		
	}
	

}
