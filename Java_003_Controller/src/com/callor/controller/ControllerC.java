package com.callor.controller;

public class ControllerC {
	public static void main(String[] args) {
		for(int i = 0; i < 20 ; i++) { 
			// i++; for {} 내에서 index 값 변경하기
			// 가급적 사용하지 않는 것이 좋다
			if( (i + 1) % 2 == 1) {
				System.out.print(i + 1 + ", ");
			}
		}
		System.out.println();
		for(int i = 0; i < 20 ; i += 2) {
			System.out.print(i+1 + ", ");
		}
		
	}

}
