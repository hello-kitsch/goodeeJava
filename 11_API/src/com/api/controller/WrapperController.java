package com.api.controller;

public class WrapperController {
	public static void main(String[] args) {
		/*
		 * Wrapper
		 * 기본 자료형을 객체로 취급하게 해주는 클래스들
		 * jvm이 자동으로 형변환 해줌(auto boxing, unboxing)
		 */
		Integer integer = 10;
		int i = integer;

		/*
		 * 상속관계에 있는 다형성을 이용할 수 있다.
		 */
		Object o = i;
		printData(100);
		printData(true);
		printData(0.13);
		
		/*
		 * Wrapper 클래스가 제공하는 메소드들
		 * String 데이터를 기본 자료형으로 변경해주는 메소드
		 * Wrapper 클래스명.parse자료형("문자열")
		 */
		String test = "19";
		int age = Integer.parseInt(test);
		test = "180.5";
		double height = Double.parseDouble(test);
		
		test = "19"; //test = null;
		age = Integer.parseInt(test);
		System.out.println(age);
		double weight = Double.parseDouble(test); //trim()을 내부적으로 사용
		System.out.println(test);
		
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.toBinaryString(10));
		System.out.println(Integer.toHexString(10));
	}
	
	public static void printData(Object o) {
		System.out.println(o);
	}
}
