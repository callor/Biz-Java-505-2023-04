package com.callor.student.exec;

import com.callor.student.service.StudentService;
import com.callor.student.service.impl.StudentServiceImplV1;

/*
 * 
 * StudentServiceImplV1 클래스를 작성하는 개발자가 테스트를 위해
 * 작성하는 코드
 * 
 * ImplV1 클래스에는 insertStudent() 라는 method 를 작성했다
 * 하지만, StudentService interface 에는 insertStudent() method 가 없다
 * 
 */
public class StudentExecC {
	
	public static void main(String[] args) {
		StudentService stService = new StudentServiceImplV1();
		
		
		((StudentServiceImplV1)stService).insertStudent();
		
	}

}
