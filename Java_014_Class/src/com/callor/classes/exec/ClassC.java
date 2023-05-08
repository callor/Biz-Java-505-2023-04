package com.callor.classes.exec;

public class ClassC {
	
	public static void main(String[] args) {
		
		int[] nums = new int[10];
		for(int i = 0 ; i < nums.length ; i++) {
			nums[i] = (int)(Math.random() * 51 ) + 50;
		}
		
		// nums 배열 요소에 저장된 모든 값이 삭제되고
		// 새로운 배열 20개를 생성하기
		// 배열은 새로 생성을 하면 기존의 모든 내용이 삭제된다.
		// 배열은 한번 만들어진 상태에서 새롭게 크기를 변경하거나 할수 없다
		// nums = new int[20];
		
		
		// 배열요소 전부를 반복하는 확장된 for 반복문(for Each)
		// 0 번 index 부터 배열 끝 index 까지 무조건 반복
		// nums 배열요소를 모두 펼쳐 놓고, 0 index 요소 부터
		// 끝 index 요소까지 순서대로 num 변수에 저장하여 {} 코드에서
		// 사용할수 있도록 한다.
		for(int num : nums) {
			System.out.print(num + "\t");
		}
		
		
	}

}
