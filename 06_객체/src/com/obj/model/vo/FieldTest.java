package com.obj.model.vo;

public class FieldTest {
	/*
	 * 필드 선언하기
	 * 접근제한자 [예약어] 자료형 변수명;
	 * 
	 * 접근 제한자 -> 생성된 객체에서 접근연산자(.)으로 접근이 가능하게 설정
	 * public: 프로젝트 내 어디서든 접근 가능
	 * protected: 상속 받은 클래스 내부에서 접근 가능
	 * default(생략): 같은 패키지 내부에서 접근 가능
	 * private: 클래스 내부에서만 접근 가능 -> 대부분 이걸로 선언!
	 */
	public int price; //JVM에 의해 디폴트값으로 초기화됨
	String name="기본이름";
	private double height;
	
	/* 
	 * final 예약어 사용하기
	 * 직접대입, 초기화블록, 생성자를 이용할 수 있음.
	 * DB에서 사용할때, record 클래스(final을 정의할 수 있는)를 사용
	 */
	public final String CLASS_NAME = "GDJ79";
	
	/*
	 * 참조형 자료형 필드 만들기
	 * 참조형 자료형 변수은 JVM에 의해 힙영역에서 null값으로 초기화됨
	 */
	public int[] numbers = new int[5];
	public BasicObject obj = new BasicObject(); //has a 구문
	
	
	public void test() {
		System.out.println(height);
		System.out.println(this.height);
		height = 180.5;
	}
//	height = 180.5;
	
	
}
