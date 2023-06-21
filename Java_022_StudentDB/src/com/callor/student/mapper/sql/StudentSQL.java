package com.callor.student.mapper.sql;

public class StudentSQL {
	
	// myBatis 에서 사용할 SQL 명령문은 반드시 final 키워드가 있어야 한다
	public static final String STUDENT_INSERT 
			= " INSERT INTO tbl_student("
			+ " st_num, st_name, st_dept, st_grade, st_tel) "
			+ " VALUES("
			+ " #{st_num}, #{st_name}, "
			+ " #{st_dept} , #{st_grade},#{st_tel} ) ";
	
	public static final String STUDENT_UPDATE 
		= " UPDATE tbl_student "
				+ " SET st_name = #{st_name}, "
				+ " 	st_dept = #{st_dept}, "
				+ " 	st_grade = #{st_grade},  "
				+ " 	st_tel = #{st_tel} "
				+ " WHERE st_num = #{st_num} ";

}
