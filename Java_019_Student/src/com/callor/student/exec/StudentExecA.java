package com.callor.student.exec;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.student.models.StudentDto;
import com.callor.student.utils.Line;

public class StudentExecA {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<StudentDto> stdList = new ArrayList<>();
		
		/*
		 * 어떤 데이터를 입력할것인가 라는 안내메시지
		 * 각 속성(요소)를 입력할때 prompt 보이기
		 */
		System.out.println(Line.dLine(80));
		System.out.println("학생 정보 입력");
		System.out.println(Line.sLine(80));
		
		System.out.print("학번 >> ");
		String stNum = scan.nextLine();
		
		System.out.print("이름 >> ");
		String stName = scan.nextLine();

		System.out.print("학과 >> ");
		String stDept = scan.nextLine();

		System.out.print("학년(정수) >> ");
		String stGrade = scan.nextLine();

		System.out.print("전화번호 >> ");
		String stTel = scan.nextLine();
		
		// 객체 생성 후 각 요소에 데이터 setting
		StudentDto stDto = new StudentDto();
		stDto.stNum = stNum;
		stDto.stName = stName;
		stDto.stDept = stDept;
		stDto.stGrade = Integer.valueOf(stGrade);
		stDto.stTel = stTel;
		
		// field 생성자를 사용하여 (데이터가 포함된) 객체 생성
		stDto = new StudentDto(
				stNum, stName, stDept, 
				Integer.valueOf(stGrade), stTel
		);
		
		System.out.println(stDto);
		
		// dto 객체 데이터를 List 에 추가하기
		stdList.add(stDto);
		System.out.println(stdList.toString());
		
		
	}
}
