package com.callor.system.service;

import java.util.Scanner;

import com.callor.system.models.StudentDto;

public class StudentServiceV2 {

	// 학생리스트를 담을 배열 선언
	private StudentDto[] stList;
	
	public void inputStudents() {
		Scanner scan = new Scanner(System.in);
		
		// 요소가 5개인 배열을 선언
		// 배열의 요소는 초기화가 안된상태, 사용이 불가한 상태
		stList = new StudentDto[5];

		// 학생 수 만큼 반복
		while(true) {
			System.out.println("학생정보를 입력하세요");
			int intNum = 0;
			while(true) {
				System.out.print("학번( 1 ~ 5 ) >> ");
				String stNum = scan.nextLine();
				try {
					intNum = Integer.valueOf(stNum);
				} catch (Exception e) {
					System.out.println("학번은 정수로 입력하세요");
					continue;
				}
				
				// 학번에서 -1을 입력하면 더이상 입력받지 않기
				if(intNum < 0) {
					// method 를 종료하라
					return;
				}
				
				if(intNum < 1 || intNum > stList.length + 1) {
					System.out.println("학번은 1 ~ 5까지 입력하세요");
					continue;
				}
				break;
			}
			System.out.print("이름 >> ");
			String stName = scan.nextLine();

			// studentDto type 객체 생성
			StudentDto student = new StudentDto();
			
			// 0001, 0002, 0003, 0004, 0005 
			student.setStNum( String.format("%04d", intNum) );
			
			// stList[0] : 1번 학생의 정보
			// stList[4] : 5번 학생의 정보
			student.setStName(stName);
			
			/*
			 * 현재 stList 배열의 요소는 초기화가 되지 않은 상태이다
			 * 이때 StudentDto type student 객체를 생성하였고,
			 * student 객체의 속성 값을 setting 한 후
			 * student 객체를 배열의 요소에 저장
			 * 
			 * stList[intNum - 1] 요소를 다시 초기화 하지 않아도
			 * student 객체를 저장하므로써 자동으로 초기화 가 된다
			 */
			// stList[intNum - 1] = new StudentDto();
 			stList[intNum - 1] = student;
 			
 			int num;
 			num = 100;
 			
 			int num2;
 			num2 = num;
 			
// 			System.out.println(stList[intNum - 1]);
		}
	}
	
	public void printStudents() {
		for(int i = 0 ; i < stList.length ; i++) {
			System.out.print(stList[i].getStNum() + "\t" );
			System.out.print(stList[i].getStName() + "\n" );
		}
	}
	
	
}
