package com.callor.classes.exec;

import java.util.ArrayList;
import java.util.List;

public class NumbersD {
	
	public static void main(String[] args) {
		List<Integer> numList = new ArrayList<>();
		for(int i = 0 ; i < 45 ; i++) {
			numList.add(i+1);
		}
		
		// List shuffle 하기
		for(int i = 0 ; i < 1000; i++) {
			int rndIndex1 = (int)(Math.random() * numList.size());
			int rndIndex2 = (int)(Math.random() * numList.size());
			int temp = numList.get(rndIndex1);
			numList.set(rndIndex1, numList.get(rndIndex2));
			numList.set(rndIndex2, temp);
		}
		
		
	}

}
