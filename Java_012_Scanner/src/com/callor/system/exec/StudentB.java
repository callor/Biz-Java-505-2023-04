package com.callor.system.exec;

import com.callor.system.models.StudentDto;

public class StudentB {
	public static void main(String[] args) {
		StudentDto 이몽룡 = new StudentDto();
		
		// 이몽룡.stNum = "0001";
		//stNum 맴버 변수에 문자열 "0001"을 
		//		setting(대입,할당,저장)해 달라
		이몽룡.setStNum("0001");
		
		// strNum = 이몽룡.stNum();
		// stNum 맴버 변수에 저장된 문자열을 읽어서
		// strNum 변수에 저장해 달라
		String strNum = 이몽룡.getStNum();
		
		
		이몽룡.setStNum("0001");
		이몽룡.setStName("이몽룡");
		이몽룡.setStDept("컴퓨터공학");
		이몽룡.setStGrade(3);
		이몽룡.setStTel("010-111-1111");

		System.out.println(이몽룡.toString());
		
	}

}
