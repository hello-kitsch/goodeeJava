package com.obj.model.vo;

import java.util.Date;

public class InitialBlockTest {
	public final String EMP_NO;
	public String name = "유병승";
	public int age = 19;
	public char gender = '여'; 
	public static int count; //static 변수, class 변수
	/*
	 * 초기화 블록을 이용해서 필드값을 초기화
	 */
	{
		/*
		 * 인스턴스 초기화 블록
		 */
		System.out.println("인스턴스 초기화 블록 실행!");
		/*
		 * 필드값을 초기화시, 특정 로직을 통해서 초기화할 경우
		 */
		name = "초기화";
		int ageTemp = (int) (Math.random()*3);
		switch(ageTemp) {
			case 0: age=13; break;
			case 1: age=23; break;
			case 2: age=36; break;
		}
		char[] genderTemp = {'남', '여'};
		gender = genderTemp[(int)(Math.random() * 2)];
		/*
		 * 회원번호, 사원번호, 상품번호 등이 해당됨
		 */
//		EMP_NO = "BS_" + new Date() + "_" + (int)(Math.random()*1000); //해시 알고리즘을 얹는법?
		
		/*
		 * 객체 생성 수 확인
		 */
//		int count;
		InitialBlockTest.count++;
		System.out.println(InitialBlockTest.this);
		
		EMP_NO = "BS_" + InitialBlockTest.count++;
	}
	
	/*
	 * static 초기화 블록
	 * static 필드(클래스 변수)를 초기화할때 사용
	 * static { 초기화 내용 설정 }
	 */
	static {
		System.out.println("static 초기화 블록");
//		name = "되니?";
	}
}
