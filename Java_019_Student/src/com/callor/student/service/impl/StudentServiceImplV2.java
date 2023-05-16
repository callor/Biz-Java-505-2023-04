package com.callor.student.service.impl;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;

import com.callor.student.models.StudentDto;
import com.callor.student.utils.Config;

/*
 * insertStudent(), 
 * printStudent(), loadStudent() 모두 상속받는다
 * 
 */
public class StudentServiceImplV2 extends StudentServiceImplV1 {
	
	@Override
	public void insertStudent() {

		// V2 에서 상속받은 V1 의 insertStudent() 를 먼저
		// 실행해 달라
		super.insertStudent();
		
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
