package com.bs.controller;

public class VariableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//변수 선언하기
		//자료형 변수명;
		//논리형 데이터를 저장하는 변수 선언하기
		//저장할 수 있는 데이터 : true, false;
		boolean flag; //한 개의 값만 저장 가능
		flag = true;
		flag = false;
		//flag = 1;
		
		//문자를 저장하는 변수 선언하기
		char gender;
		gender = '남';
		//gender = '남자';
		gender = '여';
		
		int age;
		age = 19;
		
		long stock;
		stock = 10000000000L; //리터럴을 int로 보기 때문에 outofrange 발생, L표시 필요
		
		float weight;
		weight = 65.5f; //리터럴을 double로 보기 때문에 type mismatch -> f표시 필요
		
		double height;
		height = 180.5;
		
		String name;
		name = "유병승";
		
		//명명규칙
		String testtesttesttesttesttesttesttesttesttesttesttesttesttest;
		//int double;
		//char 1gender;
		char gender1;
		
		int num_ber;
		int num$ber;
		int _number;
		//int ^number;
		//int num^ber;
		
		String studentNickName;
		String studentnickname;
		
		//변수명은 중복되면 안됨. (*같은 영역-중괄호로 구분-에 있을때)
		//int studentNickName;
		
		//s
		
		//변수 활용하기
		//변수에 저장된 값3을 가져오기
		//변수명을 작성하면 변수에 저장된 값을 가져옴.
		//flag;
		System.out.println(flag);
		System.out.println(name);
		studentNickName = "BS";
		//지역변수를 반드시 초기화 후 사용해야함. -> 왜? 기존에 있는 쓰레기값이 변수에 저장됨.
		System.out.println(studentNickName);
		
		//String name1;
		//String name2;
		//String name3;
		//String name4;
		String name1, name2, name3, name4;
		
		//선언과 동시에 초기화
		long salary = 1000000; //자동 형변환
		String test = "";
		String test2 = null; //null은 참조형만 쓸 수 있음.
		char chtest = ' '; //''는 안됨. -> ?왜?
		
		//상수 활용(상수는 스네이크케이스 작명법을 사용)
		final int AGE;// = 19;
		//AGE = 20;
		AGE = 21;
		
		//변수에 저장된 값을 다른 변수에 저장
		String hobby = "게임";
		String hobby2 = hobby;
		//?변수를 다른 변수에 대입. 로컬 내의 변수 이름은 주솟값 매핑 테이블을 가지고 있는가?
		//hobby2 = age;
		
	}
	int studentNickName;
	//String studentNickName;
}
