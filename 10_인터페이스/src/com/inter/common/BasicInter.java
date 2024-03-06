package com.inter.common;

//@FunctionalInterface
public interface BasicInter extends ParentInter { //, TestInter {
	/*
	 * 인터페이스 내부에 선언한 메소드는 기본적으로 추상메소드가 됨.
	 */
	void test(); //public abstract void test();
	
	public abstract int calc(int su, int su2);
	
	/*
	 * 필드 선언하기
	 * static final 예약어 자동으로 설정
	 */
	int AGE=19;
	
	String TEST_MESSAGE = "에러코드 내용, 출력 내용 등 설정";
	
	/*
	 * default 메소드 선언하기 -> 인터페이스 안에서 body를 갖는 메소드
	 */
	default void addFunc() { //default는 접근제한자의 의미가 아님.
		System.out.println("AddFunc 출력");
	}
}
