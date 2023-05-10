package com.callor.classes.datas;

public class DataIndex {
	
	// Inner class 
	// 큰 바깥쪽 클래스 내에 소분류 클래스를 구성하는 방식
	public static class STUDENT {
		public static final int ST_NUM = 0;
		public static final int ST_NAME = 1;
		public static final int ST_DEPT = 2;
		public static final int ST_GRADE = 3;
		public static final int ST_PROF = 4;
		public static final int ST_TEL = 5;
		public static final int ST_ADDRESS = 6;
	}
	
	public static class SCORE {
		// 학번,국어,영어,수학,음악,미술,소프트웨어공학,데이터베이스
		public static final int ST_NUM = 0;
		public static final int SC_KOR = 1;
		public static final int SC_ENG = 2;
		public static final int SC_MATH = 3;
		public static final int SC_MUSIC = 4;
		public static final int SC_ART = 5;
		public static final int SC_SOFTWARE = 6;
		public static final int SC_DATABASE = 7;
	}

}
