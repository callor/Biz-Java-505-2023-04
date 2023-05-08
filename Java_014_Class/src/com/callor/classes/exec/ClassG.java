package com.callor.classes.exec;

import java.util.ArrayList;
import java.util.List;

public class ClassG {
	
	public static void main(String[] args) {
		List<Integer> numList = new ArrayList<>();
		for(int i = 0 ; i < 10 ;i++) {
			int rndNum = (int)(Math.random() * 51) + 50;
			numList.add(rndNum);
		}
		for(int i = 0 ; i < numList.size() ; i++) {
			if(numList.get(i) % 2 == 0) {
				System.out.println(numList.get(i));
			}
		}
		
		// numList 의 맨 끝에 정수 10을 추가하기
		numList.add(10);
		
		// index 0 번 위치의 데이터 제거
		numList.remove(0);
		
		// index 0 번 위치에 데이터 추가
		numList.add(0,20);
		
		// index 0 번 위치의 데이터 읽어서 num 변수에 저장
		int num = numList.get(0);
		
		// index 1 번 위치의 데이터를 100으로 변경
		// 기존의 index 1 번 위치의 데이터는 삭제되고 100이 저장
		numList.set(1, 100);
		
		
	}

}
