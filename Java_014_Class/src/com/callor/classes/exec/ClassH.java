package com.callor.classes.exec;

import java.util.ArrayList;
import java.util.List;

public class ClassH {
	
	public static void main(String[] args) {
		// java 1.7 이후 버전에서는 생성자에는 Generic 을 생략해도 된다
		List<Integer> numList = new ArrayList<Integer>();
		
		for(int i = 0 ; i < 10 ; i++) {
			int rndNum = (int)(Math.random() * 51) + 50;
			numList.add(rndNum);
		}
		
		for(int i = 0 ; i < numList.size() ; i++) {
			for(int j = i + 1; j < numList.size() ; j++) {
				if(numList.get(i) > numList.get(j)) {
					int num = numList.get(i);
					numList.set(i, numList.get(j));
					numList.set(j, num);
				}
			}
		}
		// List type 의 객체변수에는 toString() method 가 포함되고
		// 단순히 List 의 값들을 출력 해 볼 수 있다.
		System.out.println(numList.toString());
		
	}

}
