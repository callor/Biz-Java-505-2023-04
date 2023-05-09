package com.callor.classes.exec;

import com.callor.classes.service.ScoreService;
import com.callor.classes.service.impl.ScoreServiceImplV3;

public class ScoreExA {
	
	public static void main(String[] args) {
		ScoreService scService = new ScoreServiceImplV3();
		scService.makeScore();
		scService.printScore();
	}

}
