package com.callor.student.exec;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.callor.student.config.DBConnection;
import com.callor.student.mapper.StudentDao;
import com.callor.student.models.StudentDto;

public class DbExecA {
	
	public static void main(String[] args) {
		SqlSession sqlSession 
			= DBConnection.getFactory().openSession(true);
		StudentDao stDao = sqlSession.getMapper(StudentDao.class);
		
		List<StudentDto> stdList = stDao.selectAll();
		System.out.println(stdList.toString());
	}

}
