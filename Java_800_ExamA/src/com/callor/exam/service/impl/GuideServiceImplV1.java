package com.callor.exam.service.impl;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.exam.models.GuideDto;
import com.callor.exam.service.GuideService;
import com.callor.exam.utils.Index;

public class GuideServiceImplV1 implements GuideService{

	// 객체에 final 키워드를 부착하면 반드시 생성자에서  생성해주어야 한다
	protected final List<GuideDto> guideList;	
	public GuideServiceImplV1() {
		this.guideList = new ArrayList<>();
	}
	
	
	@Override
	public void loadGuide() {

		String guideFile = "src/com/callor/exam/guide.txt";
		InputStream is = null;
		Scanner scan = null;
		
		try {
			is = new FileInputStream(guideFile);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		scan = new Scanner(is);
		
		int rows = 0;
		while(scan.hasNext()) {
			String line = scan.nextLine();
			String[] guide = line.split(",");
			
			GuideDto guDto = new GuideDto();
			try {
				guDto.id = guide[Index.GUIDE.GU_ID];
				guDto.item = guide[Index.GUIDE.GU_ITEM];
				guDto.seq = Integer.valueOf(guide[Index.GUIDE.GU_SEQ]);
				guDto.guide = guide[Index.GUIDE.GU_GUIDE];
				guideList.add(guDto);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(rows + " 번째 에서 Exception 발생");
			}
			
		}
		scan.close();
		System.out.println("로딩된 데이터 개수 : " + guideList.size() );
		
	}

	@Override
	public void printGuide() {
		
		System.out.println("=".repeat(150));
		System.out.println("ID\t종목명\t순서\t가이드");
		System.out.println("-".repeat(150));
		
		
		String id = null;
		for(GuideDto dto : guideList ) {
			
			if( id != null && !id.equals(dto.id) ) {
				System.out.println("-".repeat(150));
			}
			id = dto.id;
			
			System.out.printf("%s\t", dto.id);
			System.out.printf("%s\t\t\t", dto.item);
			System.out.printf("%d\t\t", dto.seq);
			System.out.printf("%s\n", dto.guide);
		}
		System.out.println("=".repeat(150));
		
	}

}
