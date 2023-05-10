package com.callor.classes.exec;

import com.callor.classes.service.StudentService;
import com.callor.classes.service.impl.StudentServiceImplV3;

public class StudentExecE {
	
	public static void main(String[] args) {
		StudentService stService = new StudentServiceImplV3();
		stService.loadStudent();
		stService.printStudent();
	}

}
