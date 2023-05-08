package com.callor.classes.exec;

import java.util.ArrayList;
import java.util.List;

public class ClassF {
	
	public static void main(String[] args) {
		List<String> strList = new ArrayList<>();
		strList.add("Korea");
		strList.add("대한민국");
		strList.add("우리나라");
		
		// index 0 번의 데이터 제거
		// 데이터가 제거되면 list의 size() 가 줄어든다
		strList.remove(0);
		strList.remove(0);
		strList.remove(0);
		
		for(int i = 0 ; i < strList.size() ; i++) {
			System.out.print(strList.get(i));
		}
		
	}

}
