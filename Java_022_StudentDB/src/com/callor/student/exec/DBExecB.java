package com.callor.student.exec;

import org.apache.ibatis.session.SqlSession;

import com.callor.student.config.DBConnection;
import com.callor.student.mapper.StudentDao;
import com.callor.student.models.StudentDto;

public class DBExecB {
	
	public static void main(String[] args) {
		SqlSession sqlSession = DBConnection.getFactory().openSession(true);
		StudentDao stDao = sqlSession.getMapper(StudentDao.class);
		StudentDto stDto = new StudentDto();
		stDto.st_num ="230010";
		stDto.st_name = "임꺽정";
		stDto.st_dept = "국어국문";
		stDto.st_grade = 1;
		stDto.st_tel = "010-555-5555";
		int result = stDao.insert(stDto);
		if(result > 0) {
			System.out.println("데이터 추가 성공");
		} else {
			System.out.println("데이터 추가 실패");
		}
	}
}
