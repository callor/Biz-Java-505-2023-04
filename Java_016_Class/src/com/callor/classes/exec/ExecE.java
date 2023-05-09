package com.callor.classes.exec;

import com.callor.classes.models.StdData;

public class ExecE {
	
	public static void main(String[] args) {
		
		// StdData 클래스의 STUDENT 변수는 static 키워드로 선언되어 있기 때문에
		// 객체를 생성하여 객체를 통해 접근하지 않아도 된다.
		// 대신 클래스를 통해 Dot(.) 연산자로 변수에 직접 접근이 가능하다
		StdData stdData = new StdData();
		System.out.println(stdData.STUDENT);
		
		for(int i = 0 ; i < StdData.STUDENT.length ; i++) {
			System.out.println(StdData.STUDENT[i]);
		}
		
		// StdData 클래스에 정의된 STUDENT 변수(field)는 final 키워드가
		// 선언되어 있다. 따라서 STUDENT 변수는 다시 재 정의 할수 없다.
		// StdData.STUDENT = new String[10];
		
		String[] str = new String[10];
		str = new String[20];
		str = new String[30];
 		
	}

}
