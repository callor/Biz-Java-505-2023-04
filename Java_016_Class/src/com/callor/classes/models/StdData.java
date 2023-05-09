package com.callor.classes.models;

public class StdData {
	
	public static final int ST_NUM = 0;
	public static final int ST_NAME = 1;
	public static final int ST_DEPT = 2;
	public static final int ST_GRADE = 3;
	public static final int ST_PROF = 4;
	public static final int ST_TEL = 5;
	public static final int ST_ADDRESS = 6;
	
	
	// 10 명 학생 데이터를 각 요소에 저장한 문자열 배열 STUDENT 선언
	// static : 클래스를 통해서 직접 접근 가능한 변수가 된다
	// final : 이 배열의 데이터는 아무도 수정하지 못한다.
	public static final String[] STUDENT = {
	"S0001,갈한수,기계공학과,2,심혜원,090-4407-3262,경북 경산시 사정동 278-1",
	"S0002,강이찬,유전공학과,1,이예림,090-4733-4976,경기도 남양주시 별내동 192-23",
	"S0003,개원훈,기계공학과,4,가우스,090-4696-8657,광주광역시 북구 일곡동 830-1번지 1층",
	"S0004,경시현,국사학전공,2,가우스,090-2669-6066,경기도 이천시 마장면 목리 산13-32",
	"S0005,공동영,물리화학과,3,이예림,090-4660-6621,충청북도 진천국 진천읍 읍내리395-7",
	"S0006,기대연,한국역사학과,1,아인슈타인,090-3153-8403,인천 서구 경서동 626-8번지",
	"S0007,기원호,국사학전공,1,제임스웰,090-3633-6768,울산 남구 삼산동 1497-1번지 1층",
	"S0008,기은성,심리학과,3,소크라테스,090-6114-7480,경상북도 경주시 천군동 산 30-1 블루월리조트",
	"S0009,나한율,유전공학과,1,가우스,090-6819-6025,인천광역시 서구 마전동 909-8 번지",
	"S0010,남동예,영어영문학부,2,빌게이츠,090-4674-7619,경기도 용인시 기흥구 언남동 412-4번지"
	};
}
