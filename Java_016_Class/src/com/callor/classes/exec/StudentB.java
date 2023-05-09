package com.callor.classes.exec;

import com.callor.classes.models.StdData;

public class StudentB {
	
	public static void main(String[] args) {
		for(int index = 0 ; index < StdData.STUDENT.length ; index++) {
			String[] student = StdData.STUDENT[index].split(",");
			System.out.print(student[StdData.ST_NUM] + "\t");
			System.out.print(student[StdData.ST_NAME] + "\t");
			System.out.print(student[StdData.ST_DEPT] + "\t");
			System.out.print(student[StdData.ST_GRADE] + "\t");
			System.out.print(student[StdData.ST_TEL] + "\t");
			System.out.print(student[StdData.ST_ADDRESS] + "\n");
		}
	}

}
