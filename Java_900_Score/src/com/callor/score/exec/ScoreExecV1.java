package com.callor.score.exec;

import com.callor.score.model.ScoreDto;
import com.callor.score.service.ScoreServiceV1;

public class ScoreExecV1 {
	
	public static void main(String[] args) {
		
		// 10 명 학생의 점수를 저장할 객체배열 선언
		ScoreDto[] scoreList = new ScoreDto[10];
		
		// 객체배열 초기화 하기
		for(int i = 0 ; i < scoreList.length ; i++) {
			scoreList[i] = new ScoreDto();
		}
		
		// ScoreService 에 있는 method 들을 사용하기 위한 준비
		ScoreServiceV1 scService = new ScoreServiceV1();
		
		// ScoreService 클래스의 scoreList 객체 배열변수에
		// 생성된(선언과 초기화가 완료된) scoreList 객체 배열값을
		// 세팅하는 절차
		scService.setScoreList(scoreList);
		// 점수생성하기
		scService.scoreRndMake();
		// 점수리스트 출력하기
		scService.scoreListPrint();
		scService.scoreTotalPrint();
		scService.scoreAvgPrint();
		
		
	}

}
