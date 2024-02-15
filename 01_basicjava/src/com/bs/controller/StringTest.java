package com.bs.controller;

public class StringTest {

	public static void main(String[] args) {
		//문자열 자료형 이용하기
		String name = "유병승";
		System.out.println(name);
		//기본 자료형으로 쓸 수 있는 클래스 -> 기본 자료형으로 쓸 수 없는 클래스? 
		//기본자료형으로 쓸 수 있기 때문에 생성자 없이 생성 가능한 것?
		String name2 = new String("김동훈");
		System.out.println(name2);
		
		//+ 연산자 이용 시 문자열 결합 연산 실행
		String msg; //선언은 한번만.
		msg = "자바 선생님 " + "유병승";
		System.out.println(msg);
		msg = "학생 " + name2;
		System.out.println(msg);
		int age= 19, age2 = 20;
		int result = age + age2;
		System.out.println(result);
		
		//문자열 타입 + 다른 타입(기본 자료형) 연산
		msg = "나의 나이는 " + 19;
		System.out.println(msg);
		
		msg = "이름 " + name + "나이 " + age;
		System.out.println(msg);
		msg = 20 + 24 + "년도 화이팅!!";
		System.out.println(msg);
		msg = "" + 20 + 24 + "년도 화이팅!!";
		System.out.println(msg);
		msg = 20 + (24 + "년도 화이팅!!");
		System.out.println(msg);
		
		//본인 이름, 나이, 성별(M/F), 주소, 전화번호를
		//각 변수를 생성해서 저장하고 한 개 문자열로 합쳐서 한번에 출력하기
		String name3 = "손지연";
		int age3 = 23;
		char gender = 'F';
		double height = 168.1;
		String address = "경기도 의정부시";
		String phoneNumber = "010-8851-2799";
		msg = "나의 이름은 "+name3+"이고 나이는 "+age3+"살이고 키는 "+height+", 주소는 "+address+", 성별은 "+gender+", 전화번호는 "+phoneNumber+"이다.";
		System.out.println(msg);
		
		//String 클래스로 유용한 기능(메소드)을 제공함.
		//1. String 변수에 저장된 문자열의 길이를 알려주는 기능: length()
		System.out.println("길이알려줘".length());
		System.out.println(name.length());
		int length = "길이알려줘".length();
		System.out.println(length);
		length = name.length();
		System.out.println(length);
		
		//if(name.length() > 5) {}
		//for(int i = 0; i<name.length(); i++) {}
		
		//2. 문자열 변수에 저장된 특정 문자 한 개만 가져오는 기능(메소드) 제공: charAt(원하는문자위치값)
		System.out.println("ABC".charAt(0));
		System.out.println("ABC".charAt(1));
		System.out.println(msg.charAt(0));
		System.out.println(msg.length());
		//System.out.println(msg.charAt(76));
		
		char a = msg.charAt(10);
		
	}
}
