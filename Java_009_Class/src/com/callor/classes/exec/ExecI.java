package com.callor.classes.exec;

public class ExecI {
	
	public static void main(String[] args) {
		int[] nums = new int[50];
		for(int index = 0 ; index < nums.length ; index++) {
			nums[index] = (int)(Math.random() * 50 ) + 51;
		}
		
		int lastNum = 0;
		/*
		 * lastIndex 초기화를 0으로 실행할 경우
		 * 만약 배열에 담긴 값중에 3의 배수가 하나도 없을 경우
		 * lastIndex 는 그대로 0이 될 것이고
		 * 결과 출력에서 0의 index 와 index 0 의 요소값이 출력된다
		 * 이러한 논리적인 문제를 해결하기 위하여
		 * lastIndex 를 -1 로 초기화 하고 
		 * 결과 출력부분에서 lastIndex 의 값을 
		 * 			한번 더 검사할 필요가 있다
		 */
		int lastIndex = -1;
		for(int index = 0 ; index < nums.length ; index++) {
			if(nums[index] % 3 == 0) {
				lastIndex = index;
				lastNum = nums[index];
			}
		}
		if(lastIndex > -1) {
			System.out.println("마지막 3의 배수 위치 : " + lastIndex);
			System.out.println("마지막 3의 배수 값 : " + lastNum);
			System.out.println("마지막 3의 배수 값 : " + nums[lastIndex]);
		} else {
			System.out.println("3의 배수 없음");
		}
		
		/*
		 * index 시작값 : nums.length = 50
		 * index 종료값 : index > 0 조건이 있어서 index 1 일 경우에
		 * 		for() 종료
		 * 49,48,47,46 ... 0 까지 index 값을 생성해야 하는데
		 * 여기의 코드는 50,49,48,47... 1까지 index 생성되고 있다
		 * 시작하자마자 nums[50] 요소의 값을 읽으려고 시도한다
		 * Index OutofBounds 오류 발생
		 */
		// for(int index = nums.length ; index > 0 ; index--) {
		for(int index = nums.length - 1 ; index >= 0 ; index--) {
			if(nums[index] % 3 == 0) {
				System.out.println("마지막 3의 배수 : " + nums[index]);
				System.out.println("위치 : " + index);
			}
		}
		
		
	}

}
