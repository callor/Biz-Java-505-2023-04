package com.callor.classes.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.callor.classes.config.Line;
import com.callor.classes.datas.DataIndex;
import com.callor.classes.datas.DataSource;
import com.callor.classes.models.ScoreDto;
import com.callor.classes.models.StudentDto;
import com.callor.classes.service.ScoreService;
import com.callor.classes.service.StudentService;

/*
 * interface(class)를 implements 한 클래스는
 * interface에 선언된 모든 method 를 의무적으로 구현해야 한다
 * interface에 선언된 method 를 한개라도 생략하면
 * 		클래스 코드는 문법오류가 발생하고 실행 불가 상태가 된다
 */
public class ScoreServiceImplV1 implements ScoreService {
	
	// 가급적 사용하지 말기
	// private List<ScoreDto> scList = new ArrayList<>(); 
	private List<ScoreDto> scList;
	
	// 변수의 초기화, 객체의 초기화, 변수의 생성, 변수의 초기화
	// 변수, 객체를 사용가능한 상태로 만드는 것
	// scList 초기화하여 사용가능하도록 생성
	public ScoreServiceImplV1() {
		scList = new ArrayList<>();
	}

	@Override
	public void printScore() {
		
		StudentService stService = new StudentServiceImplV1();
//		stService.loadStudent();
		
		System.out.println(Line.dLINE(100));
		System.out.println("학번\t이름\t학과\t\t국어\t영어\t수학\t음악\t미술");
		System.out.println(Line.sLINE(100));
		for(ScoreDto dto : scList) {
			
			// 학번을 StudentServiceImplV1.getStudent() method 에게 전달하고
			// 학번에 해당하는 학생 데이터를 return 받아서
			// StudentDto type 의 객체에 저장하기
			StudentDto stDto = stService.getStudent(dto.getStNum());
			
			System.out.print(dto.getStNum() + "\t");
			
			if(stDto != null) {
				System.out.print(stDto.stName + "\t");
				System.out.print(stDto.stDept + "\t");
			} else {
				System.out.print("-\t");
				System.out.print("-\t");
			}
			System.out.print(dto.getScKor() + "\t");
			System.out.print(dto.getScEng() + "\t");
			System.out.print(dto.getScMath() + "\t");
			System.out.print(dto.getScMusic() + "\t");
			System.out.print(dto.getScArt() + "\n");
		}
		System.out.println(Line.dLINE(100));
	}

	
	// ScData.SCORE 배열을 loading 하여
	// scList 데이터로 변환하기
	@Override
	public void loadScore() {
		// TODO Auto-generated method stub
		// DataSource.SCORE 문자열 배열의 값을 
		// List<ScoreDto> type의 리스트 데이터로 변환하기
		for (String str : DataSource.SCORE) {
			String[] score = str.split(",");
			
			// ScoreDto 클래스는 field 생성자가 있다
			// field 생성자를 통하여 데이터가 포함된 scDto 객체를 생성
			ScoreDto scDto = new ScoreDto(
					score[DataIndex.SCORE.ST_NUM], 
					Integer.valueOf(score[DataIndex.SCORE.SC_KOR]),
					Integer.valueOf(score[DataIndex.SCORE.SC_ENG]), 
					Integer.valueOf(score[DataIndex.SCORE.SC_MATH]),
					Integer.valueOf(score[DataIndex.SCORE.SC_MUSIC]), 
					Integer.valueOf(score[DataIndex.SCORE.SC_ART]),
					Integer.valueOf(score[DataIndex.SCORE.SC_SOFTWARE]), 
					Integer.valueOf(score[DataIndex.SCORE.SC_DATABASE])
			);
			scList.add(scDto);
		}
	}

}
