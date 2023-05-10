package com.callor.classes.service.impl;

import java.util.ArrayList;

import com.callor.classes.config.Line;
import com.callor.classes.models.StudentDto;

public class StudentServiceImplV4 extends StudentServiceImplV3 {
	
	public StudentServiceImplV4() {
		// stdList 객체는 V3 클래스에서 protected 로 선언한 객체이다
		// 이 객체는 V3 클래스를 상속(extends)받은 클래스에서 접근 가능하다
		stdList = new ArrayList<>();
	}

	@Override
	public void printStudent() {
		
		printHeader();
		int rows = 0 ;
		for(StudentDto dto : stdList) {
			System.out.printf("%s %d\t", dto.stNum,dto.stNum.length());
			System.out.printf("%s\t", dto.stName.substring(0, 3));
			System.out.printf("%s\t",dto.stDept);
			System.out.printf("%d\t",dto.stGrade);
			System.out.printf("%s\t",dto.stTel);
			System.out.printf("%s\n",dto.stAddress);
			if(++rows % 5 == 0 && rows < stdList.size()) {
				System.out.println(Line.sLINE(100));
			}
		}
		System.out.println(Line.dLINE(100));
	}
	
	
}
