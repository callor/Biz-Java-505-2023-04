package com.callor.student.exec;

import com.callor.student.service.StudentService;
import com.callor.student.service.impl.StudentServiceImplV2;

public class StudentExecF {
	
	public static void main(String[] args) {
		StudentService stService = new StudentServiceImplV2();
		stService.loadStudent();
		stService.printStudent();
		stService.insertStudent();
	}

}
