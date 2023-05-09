package com.callor.classes.exec;

import com.callor.classes.service.ScoreService;
import com.callor.classes.service.impl.ScoreServiceImplV3;
import com.callor.classes.service.impl.ScoreServiceImplV4;

public class ExecG {
	
	public static void main(String[] args) {
		
		/*
		 * ScoreService interface 로 객체를 선언하고
		 * ScoreServiceImplV3() 생성자로 객체를 생성(초기화)한다
		 * 
		 * ScoreServiceImplV3 클래스에 정의된(선언된) method 를 사용하던중
		 * 그보다 upgrade 된 ScoreServiceV4 클래스를 프로젝트에서
		 * 사용하려면 클래스 생성자 이름만 변경하면
		 * 나머지 코드는 변경할 필요가 없다
		 * 
		 */
		ScoreService scService = new ScoreServiceImplV3();
		scService.makeScore();
		scService.printScore();
		
		ScoreService scService1 = new ScoreServiceImplV4();
		scService1.printScore();
		
	}

}
