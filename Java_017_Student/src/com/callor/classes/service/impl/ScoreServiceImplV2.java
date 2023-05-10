package com.callor.classes.service.impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

import com.callor.classes.models.ScoreDto;

public class ScoreServiceImplV2 extends ScoreServiceImplV1{

	public ScoreServiceImplV2() {
		// V1 에서 protected 로 선언 scList 를 사용할수 있도록
		// 초기화 하는 작업, 반드시 필요
		scList = new ArrayList<>();
	}
	
	@Override
	public void loadScore() {
		
		InputStream is = null;
		Scanner scan = null;
		String scoreFile = "/src/com/callor/classes/datas/score.csv";
		
		try {
			is = new FileInputStream(scoreFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		scan = new Scanner(is);
		
		while(scan.hasNext()) {
			String line = scan.nextLine();
			ScoreDto dto = str2Dto(line);
			scList.add(dto);
		}
		scan.close();
	}
	
	
}
