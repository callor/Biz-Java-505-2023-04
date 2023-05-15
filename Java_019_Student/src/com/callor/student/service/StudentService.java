package com.callor.student.service;

import java.util.List;

import com.callor.student.models.StudentDto;

public interface StudentService {
	
	public void loadStudent();
	public void printStudent();
	
	public StudentDto getStudent(String stNum);
	public List<StudentDto> getStudentList() ;
	
}
