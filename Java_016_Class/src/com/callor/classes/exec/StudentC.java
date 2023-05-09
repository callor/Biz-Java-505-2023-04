package com.callor.classes.exec;

import java.util.ArrayList;
import java.util.List;

import com.callor.classes.models.StdData;
import com.callor.classes.models.StudentDto;

public class StudentC {
	public static void main(String[] args) {
		
		List<StudentDto> stdList = new ArrayList<>();
		for(int index = 0 ; index < StdData.STUDENT.length ; index++) {
			String[] student = StdData.STUDENT[index].split(",");
			StudentDto stdDto = new StudentDto();
			
			stdDto.stNum = student[StdData.ST_NUM];
			stdDto.stName = student[StdData.ST_NAME];
			stdDto.stDept = student[StdData.ST_DEPT];
			stdDto.stGrade = Integer.valueOf(student[StdData.ST_GRADE]);
			stdDto.stTel = student[StdData.ST_TEL];
			stdDto.stAddress = student[StdData.ST_ADDRESS];
			stdList.add(stdDto);
		}
	}
}
