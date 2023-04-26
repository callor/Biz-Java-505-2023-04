package com.callor.classes.arrays;

public class ArrayF {
	/*
	 * prime() method 에게 정수값 1개를 전달하고
	 * 그 정수값이 소수인지 아닌지 알려줘 라고 요청
	 */
	public static int prime(int num) {
		for(int i = 0 ; i < num ; i++) {
			if(num % i == 0) {
				return 0;
			}
		}
		return num;
	}
	
	/*
	 * 다수의 데이터를 정보처리할 경우
	 * 데이터를 수집하고, 수집이 완료되었을때
	 * 한꺼번에 처리를 한다
	 * 
	 * 실시간 처리 : 데이터가 발생하는 즉시 처리, 티켓예매
	 * 배치(Batch) 처리 : 데이터를 모두 수집하고 
	 * 		수집이 완료되었을대 처리, 급여계산, 인구통계
	 * 
	 */
	public static void main(String[] args) {
		int[] nums = new int[10];
		for(int i = 0 ; i < 10 ; i ++) {
			nums[i] = (int)(Math.random() * 50) + 51;
		}
		
		for(int i = 0 ; i < 10 ; i++) {
			// prime() method 호출하여 prime() 구하기
			if(prime(nums[i]) > 0) {
				System.out.println(nums[i] + "는 소수");
			} else {
				System.err.println(nums[i] + "는 소수");
			}
		}
		
	}

}
