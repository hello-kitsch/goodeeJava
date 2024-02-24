package com.obj.model.vo;

public class ConstructorTest {
	
	public int num;
	public String msg;
	public static int soo;
	
	/*
	 * 생성자 선언
	 * :접근제한자 클래스명([매개변수, 매개변수, ...]) { 로직 }
	 */
	/*
	 * 기본 생성자 선언
	 */
	public ConstructorTest() {
		System.out.println("기본 생성자");
	}
	
//	ConstructorTest() {} //같은 패키지 내에서만 호출 가능
//	private ConstructorTest() {} //this 생성자 호출로만 사용 가능??? 싱글톤 패턴으로도 가능
	
	public static ConstructorTest singletonPattern() {
		return new ConstructorTest();
	}
	/*
	 * 매개변수가 있는 생성자 선언
	 * 외부(호출하는 곳)에서 보내준 값을 필드에 저장하는 기능
	 * 일반적으로 매개변수로 선언해서 받는 값은 필드에 선언된 것과 동일하게 설정
	 */
	public ConstructorTest(int num, String msg) {
		System.out.println("매개변수가 있는 생성자");
		System.out.println("su: " + num + " str: " + msg);
		this.num = num;
		this.msg = msg;
	}
	
	public ConstructorTest(int su) {
		this("호호"); //this 생성자, 가장 처음에 호출(순서)
		num = su;
//		this.msg = "test";
	}
	
	public ConstructorTest(String str) {
		msg = str;
	}
	
	public ConstructorTest(String msg, int su) {
		System.out.println("public ConstructorTest(String msg, int su)");
	}

}
