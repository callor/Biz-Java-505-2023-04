package com.callor.classes.service;

import com.callor.classes.models.StudentDto;

public interface StudentService {

	public void loadStudent();
	public void printStudent();
	
	// 학번을 매개변수로 전달받아서
	// stList 에서 학번이 일치하는 학생정보를 찾아서 return
	public StudentDto getStudent(String stNum);
	
}
