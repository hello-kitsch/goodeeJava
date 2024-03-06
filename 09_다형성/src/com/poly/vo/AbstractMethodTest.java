package com.poly.vo;

public abstract class AbstractMethodTest {
	/*
	 * 추상 메소드 선언하기
	 * 메소드의 선언부만 설정하고, 구현부는 상속받는 자식이 구현하게 하는 메소드 선언
	 * 메소드 예약어에 abstract를 사용
	 * ex) public abstract void test();
	 *     public abstract String check(String a, char b);
	 */
	public abstract void test();
	/*
	 * 추상 메소드가 선언된 클래스를 상속받는 클래스에서 재정의해서 구현
	 * 
	 */
}
