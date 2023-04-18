package com.callor.controller.var;

public class VarE {
	public static void main(String[] args) {
		String str = "Republic of Korea";
		String nation = "";
		
		// str 에 저장된 문자열을 12번째 에서 잘라서
		// 오른쪽의 문자열을 nation 변수에 저장
		nation = str.substring(12);
		System.out.println(nation);
		
		// str 에 저장된 문자열을 9번째에서 한번자르고
		// 11번째에서 또 한번 자르고 
		// 그 사이의 문자열을 출력
		System.out.println(str.substring(9,11));
		
		
		
	}

}
