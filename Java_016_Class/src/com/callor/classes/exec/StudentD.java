package com.callor.classes.exec;

import com.callor.classes.models.StudentDto;
import com.callor.classes.service.StudentService;
import com.callor.classes.service.impl.StudentServiceImplV1;

public class StudentD {
	public static void main(String[] args) {
		StudentService stService = new StudentServiceImplV1();
		
		stService.loadStudent();
		stService.printStudent();
		
		StudentDto stDto = stService.getStudent("S0003");
		System.out.println(stDto.toString());
		
	}

}
