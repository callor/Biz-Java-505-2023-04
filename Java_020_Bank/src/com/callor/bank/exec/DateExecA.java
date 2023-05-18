package com.callor.bank.exec;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateExecA {
	
	/*
	 * 컴퓨터 프로그래밍에서 날짜와 관련된 데이터, 정보에는 상당히 많은 ISSUE 가 있다
	 * 자바에서는 1.8 을 기준으로 날짜와 시간을 처리하는 방식이 차이가 있다
	 * 또한 프로그래밍 언어, 시스템, 국가, 소프트웨어 마다 처리하는 방식이 차이가 있다
	 * 
	 * 그래서 날짜와 관련된 이슈를 피해하기 위하여 여러가지 기법이 사용되는데
	 * 그중 많이 사용하는 방법중 하나가 날짜 type 의 데이터를 문자열로 변환하여
	 * 사용하는 방법이다
	 */
	public static void main(String[] args) {
		
		// java 1.7 이하에서 사용하는 날짜 type 의 객체
		Date date = new Date(System.currentTimeMillis());
		System.out.println(date.toString());
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd");
		SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
		
		// 날짜 type 의 데이터를 String.format type 의 문자열로 변환하기
		String dateString = dateFormat.format(date);
		String timeString = timeFormat.format(date);
		
		System.out.println(dateString);
		System.out.println(timeString);
		
		
		// java 1.8 부터 사용하는 날짜 type 의 객체
		LocalDate localDate = LocalDate.now();
		LocalTime localTime = LocalTime.now();
		LocalDateTime localDateTime = LocalDateTime.now();
		
		DateTimeFormatter dateFormat1 = DateTimeFormatter.ofPattern("YYYY-MM-dd");
		DateTimeFormatter timeFormat1 = DateTimeFormatter.ofPattern("HH:mm:ss");
		
		System.out.println( localDate.format(dateFormat1) );
		System.out.println( localTime.format(timeFormat1) );
		
		System.out.println( localDateTime.format(dateFormat1) );
		System.out.println( localDateTime.format(timeFormat1) );

		
	}

}
