package com.callor.classes.exec;

import com.callor.classes.model.ScoreDto;
import com.callor.classes.module.ServiceB;

public class ExecB {
	
	public static void main(String[] args) {
		/*
		 * ScoreDto 클래스를 사용하여 scoreDto 객체를
		 * 선언하고
		 * 생성자 method( ScoreDto() ) 를 사용하여
		 * 객체를 초기화(new) 한다.
		 * 
		 *  scoreDto 객체를 초기화하여
		 *  사용할 준비가 되면 인스턴스 가 되었다
		 *  라고 표현한다.
		 *  
		 *  scoreDto 객체를 초기화 하는 순간
		 *  ScoreDto 클래스에서 선언한 변수들(여기서는 9가지)을
		 *  모두 사용할수 있도록 동시에 초기화가 된다.
		 * 
		 */
		ScoreDto scoreDto = new ScoreDto();
		// 초기화된 scoreDto 에 포함된 변수들의 값을 다시 세팅
		scoreDto.intKor = (int)(Math.random() * 50 ) + 51;
		scoreDto.intMath = (int)(Math.random() * 50 ) + 51;
		scoreDto.intEng = (int)(Math.random() * 50 ) + 51;
		scoreDto.intMusic = (int)(Math.random() * 50 ) + 51;
		scoreDto.intSport = (int)(Math.random() * 50 ) + 51;
		scoreDto.intArt = (int)(Math.random() * 50 ) + 51;
		scoreDto.intHistory = (int)(Math.random() * 50 ) + 51;
		scoreDto.stNum = "0001";
		scoreDto.stName = "홍길동";
		
		ServiceB serviceB = new ServiceB();
		serviceB.score(scoreDto);
		
		
	}
}
