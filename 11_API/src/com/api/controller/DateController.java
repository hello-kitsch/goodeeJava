package com.api.controller;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateController {
	public static void main(String[] args) {
		/*
		 * java.util.Date 클래스를 이용해서 날짜 데이터를 관리
		 * java.util.Calendar
		 * java.util.GregorianCalendar
		 * java.sql.Date -> JDBC 이용할 때 사용하는 타입
		 * java.time.LocalDateTime
		 * java.time.LocalDate
		 * java.time.LocalTime
		 */
		
		Date today = new Date(); //오늘 날짜 데이터를 저장함.
		//실행하는 컴퓨터에 설정된 날짜를 가져옴.
		System.out.println(today);
		
		today = new Date(1234567890000L);
		System.out.println(today);
		//java.util.Date 타입으로 사용
		
		//java.util.Calendar 클래스
		//GregorianCalendar 클래스
		//Calendar 클래스는 new 연산자로 생성이 불가능
		Calendar c; //= new Calendar(); //추상클래스로 선언되어 있기 때문
		//Calendar를 가져오는 메소드를 이용
		c = Calendar.getInstance();
		System.out.println(c);
		//저장된 년, 월, 일, 시, 분, 초 데이터 가져오기
		//Calendar클래스가 제공하는 get() 메소드를 이용
		int year = c.get(Calendar.YEAR);
		System.out.println(year);
		int month = c.get(Calendar.MONTH);
		System.out.println(month + 1);
		int day = c.get(Calendar.DATE);
		System.out.println(day);
		int hour = c.get(Calendar.HOUR);
		System.out.println(hour);
		int min = c.get(Calendar.MINUTE);
		System.out.println(min);
		System.out.println(year+"년"+
				((month+1)>=10?month+1:("0"+(month+1)))+"월"
				+day+"일");
		
		/*
		 * 날짜값 설정하기
		 * set(필드설정, 값)
		 */
		Calendar birthDay = Calendar.getInstance();
		birthDay.set(Calendar.YEAR, 1996);
		birthDay.set(Calendar.MONTH, 10-1);
		birthDay.set(Calendar.DATE, 28);
		birthDay.set(Calendar.HOUR, 7);
		birthDay.set(Calendar.MINUTE, 30);
		birthDay.set(Calendar.SECOND, 54);
		
		year = birthDay.get(Calendar.YEAR);
		month = birthDay.get(Calendar.MONTH);
		day = birthDay.get(Calendar.DATE);
		hour = birthDay.get(Calendar.HOUR);
		min = birthDay.get(Calendar.MINUTE);
		System.out.println("승우님의 탄생일: " + year + "."
				+ month + "." + day + " " + hour +  ":" + min);
		
		GregorianCalendar gc = new GregorianCalendar();
		System.out.println(gc);
		year = gc.get(Calendar.YEAR);
		System.out.println(year);
		
		//생성시 매개변수가 있는 생성자를 이용해서 원하는 날짜를 설정할 수 있음.
		gc = new GregorianCalendar(2001, 4-1, 21);
		
		//날짜를 원하는 문자형태
		//java.text.SimpleDateFormat 클래스 이용
		// y = 년, M = 월, d = 일, h = 시, m = 분, s = 초, e = 요일
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
		String strToday = sdf.format(today);
		System.out.println(strToday);
		//format 메소드는 Date 객체만 가능함.
		//다른 타입은 Date로 변환해서 대임
		//GregorianCalendar -> Date 변환
		Date jiheeBirth = new Date(gc.getTimeInMillis());
//		strToday = sdf.format(gc);
		strToday = sdf.format(jiheeBirth);
		System.out.println(strToday);
		
		//날짜값이 문자열 형태로 전달된 데이터를 Date, Calendar로 파싱하기
		//WEB에서 날짜값을 yyyy-MM-dd 패턴으로 표시
		String enrollDate = "2024-02-13";
		String[] data = enrollDate.split("-");
		gc = new GregorianCalendar(
				Integer.parseInt(data[0]),
				Integer.parseInt(data[1])-1,
				Integer.parseInt(data[2]));
		System.out.println(sdf.format(new Date(gc.getTimeInMillis())));
		
		//SimpleDateFormat에서 제공하는 메소드
		//parse()
		SimpleDateFormat change = new SimpleDateFormat("yyyy-MM-dd");
		Date d = null;
		try {
			d = change.parse(enrollDate);
		} catch(ParseException e) {
			e.printStackTrace();
		}
		System.out.println(d);
		
		//날짜 연산하기
		//add() 메소드를 이용
		System.out.println(new Date(gc.getTimeInMillis()));
		gc.add(Calendar.YEAR, -10);
		System.out.println(new Date(gc.getTimeInMillis()));
		gc.add(Calendar.MONTH, 10);
		System.out.println(new Date(gc.getTimeInMillis()));
		
		GregorianCalendar t = new GregorianCalendar();
		GregorianCalendar b = new GregorianCalendar(1993,11-1,9);
		//System.out,.println(t-b)
		System.out.println(t.getTimeInMillis() - b.getTimeInMillis());
		System.out.println((t.getTimeInMillis() - b.getTimeInMillis()) / 1000 + "s");
		System.out.println((t.getTimeInMillis() - b.getTimeInMillis()) / 6000 + "min");
		System.out.println((t.getTimeInMillis() - b.getTimeInMillis()) / 36000 + "hour");
		System.out.println((t.getTimeInMillis() - b.getTimeInMillis()) / (24*36000) + "day");
		
		//java 8
		//LocalDate, LocalTime, LocalDateTime 클래스
		//static now(); -> 현재일
		LocalDate ld = LocalDate.now();
		System.out.println(ld);
		year = ld.getYear();
		month = ld.getMonthValue();
		day = ld.getDayOfMonth();
		DayOfWeek week = ld.getDayOfWeek(); //enum타입
		System.out.println(year);
		System.out.println(month);
		System.out.println(day);
		System.out.println(week);
//		System.out.println(week.getValue());
		
		//원하는 날짜를 설정하기
		//static of();
		ld = LocalDate.of(1999, 11, 8);
		System.out.println(ld);
		
		//LocalTime: 시간
		//static now(); -> 현재 시간
		LocalTime lt = LocalTime.now();
		System.out.println(lt);
		hour = lt.getHour();
		min = lt.getMinute();
		int second = lt.getSecond();
		System.out.println(hour+":"+min+":"+second);
		
		//원하는 시간을 설정하기
		//static of()
		lt = LocalTime.of(12, 49, 49);
		System.out.println(lt);
				
		//왜 localdate와 localtime을 분리했을까?
		
		//날짜와 시간을 모두 저장
		//LocalDateTime 클래스 이용
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
//		ldt = LocalDateTime.of(ld, lt);
		ldt = LocalDateTime.of(2002,2,24,17,37);
		System.out.println(ldt);
		
		LocalDateTime changeLdt = ldt.minusMonths(2);
		System.out.println(changeLdt);
		
		//날짜 사이의 간격을 계산해주는 메소드
		//ChronoUnit 클래스
		//날짜 사이 간격: ChronoUnit.DAYS.between(날짜, 날짜)
		//개월수: ChronoUnit.MONTHS.between(날짜, 날짜)
		LocalDate mj = LocalDate.of(1993, 11, 9);
		long days = ChronoUnit.DAYS.between(mj, LocalDate.now());
		System.out.println(days);
		long months = ChronoUnit.MONTHS.between(mj, LocalDate.now());
		System.out.println(months);
		
		//java.util.Date, java.sql.Date, java.sql.Timestamp
		//호환 (***)
		//LocalDate -> java.util.Date로 변환
		//LocalDate -> java.sql.Date -> java.util.Date
		Date todayConvert = java.sql.Date.valueOf(ld);
		//sql.Data은 util.Date를 상속
		System.out.println(today);
		System.out.println(sdf.format(today));
		//java.util.Date -> LocalDate
		//java.util.Date -> java.sql.Date.toLocalDate() -> LocalDate
		LocalDate ld2 = new java.sql.Date(today.getTime()).toLocalDate();
		System.out.println(ld2);
		
		//LocalDateTime -> Date 변환
		//java.sql.Timestamp 클래스를 이용
		Timestamp.valueOf(ldt);
		Date ldtConvert = Timestamp.valueOf(ldt);
		
		//Date -> LocalDateTime 변경
		LocalDateTime ldt2 = new Timestamp(new Date().getTime()).toLocalDateTime();
		
		long value = Math.round(180.4);
//		int value = Math.round(180.4F);
		System.out.println(value);
		
		double value2 = Math.ceil(180.1);
		System.out.println(value2);
	}
}
