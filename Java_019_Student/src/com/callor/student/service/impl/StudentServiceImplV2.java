package com.callor.student.service.impl;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;

import com.callor.student.models.StudentDto;
import com.callor.student.utils.Config;
import com.callor.student.utils.Line;

/*
 * insertStudent(), 
 * printStudent(), loadStudent() 모두 상속받는다
 * 
 */
public class StudentServiceImplV2 extends StudentServiceImplV1 {
	
	
	protected StudentDto inputStudent() {
		System.out.println(Line.dLine(60));
		System.out.println("학생정보 입력 종료하려면 QUIT 입력");
		System.out.println(Line.sLine(60));
		
		String stNum  = "";
		while(true) {
			System.out.print("학번(정수) >> ");
			stNum = scan.nextLine();
			if (stNum.equals("QUIT")) break;
			try {
				int intNum = Integer.valueOf(stNum);
				stNum = String.format("%04d", intNum);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("학번은 정수로 입력하세요");
				continue;
			}
			break;
		}
		if(stNum.equals("QUIT")) return null;

		System.out.print("이름 >> ");
		String stName = scan.nextLine();
		if (stName.equals("QUIT")) return null;

		System.out.print("학과 >> ");
		String stDept = scan.nextLine();
		if (stDept.equals("QUIT")) return null;

		int intGrade = 0;
		while (true) {
			System.out.print("학년 >> ");
			String strGrade = scan.nextLine();
			if (strGrade.equals("QUIT")) break;
			try {
				intGrade = Integer.valueOf(strGrade);
			} catch (Exception e) {
				// TODO: handle exception'
				System.out.println("학년은 정수로 입력하세요");
				continue;
			}
			if (intGrade < 1 || intGrade > 4) {
				System.out.println("학년은 정수 1 ~ 4까지만 입력하세요");
				continue;
			}
			break;
		}
		if(intGrade == 0)  return null;

		System.out.print("전화번호 >> ");
		String stTel = scan.nextLine();
		if (stTel.equals("QUIT"))  return null;

		StudentDto stDto = new StudentDto();
		stDto.stNum = stNum;
		stDto.stName = stName;
		stDto.stDept = stDept;
		stDto.stGrade = intGrade;
		stDto.stTel = stTel;
		// stdList.add(stDto);
		return stDto;

	}
	
	@Override
	public void insertStudent() {

		// V2 에서 상속받은 V1 의 insertStudent() 를 먼저
		// 실행해 달라
		// super.insertStudent();
		
		while(true) {
			StudentDto stDto = this.inputStudent();
			if(stDto == null) break;
			stdList.add(stDto);
		}
		
		// 그리고 나머지는 내가 처리할께
		System.out.println("여기는 V2");
		OutputStream os = null;
		PrintWriter out = null;
		
		try {
			os = new FileOutputStream(Config.STUDENT_FILE);
			out = new PrintWriter(os);
			
			for(StudentDto dto : stdList) {
				out.printf("%s,",dto.stNum);
				out.printf("%s,",dto.stName);
				out.printf("%s,",dto.stDept);
				out.printf("%d,",dto.stGrade);
				out.printf("%s\n",dto.stTel);
			}
			out.close();
			os.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	

}
