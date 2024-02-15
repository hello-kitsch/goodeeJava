package com.operator.controller;
import java.util.Scanner;

//기능 제공용 클래스
public class OperatorController {
	public void singleOp() {
		//단항연산자에 대해 알아보자.
		//1. 부정연산자 -> boolean형의 값을 반전시키는 연산자: !변수명, !기능(메소드)호출, !비교연산자
		System.out.println("==== 부정연산자 ====");
		boolean flag = true;
		System.out.println(flag);
		System.out.println(!flag);
		
		int age = 19;
		System.out.println(age > 19);
		System.out.println(!(age > 19));
		
		String name = "유병승";
		System.out.println(name.contains("유"));
		System.out.println(!name.contains("유"));
		
		//2. 증가, 감소 연산: ++변수명, 변수명++/--변수명, 변수명--
		System.out.println("====증가 감소 연산====");
		int number = 10;
		System.out.println(number);
		//후위 증감 연산
		number++; //number = number + 1;
		System.out.println(number);
		number--; //number = number - 1;
		System.out.println(number);
		//전위 증감 연산
		++number;
		System.out.println(number);
		--number;
		System.out.println(number);
		
		number = 5; 
		//int result = number++; //후위 연산자는 다른 연산자와 같이 쓸 때 우선순위가 밀림.
		int result = ++number;
		System.out.println(result);
		System.out.println(number);
		
		number = 19;
		result = result++ + 20;
		System.out.println(result);
		System.out.println(number);
		
		//for(int i=0; i<10; i++) {}
		//입력 받은 문자에 중복 문자가 몇 개 있는지 구하는 기능
		
	}
	
	public void calculatorOp() {
		//산술 연산자
		int su = 2;
		int su2 = 10;
		int result = su + su2;
		System.out.println(result);
		result = su - su2;
		System.out.println(result);
		result = su * su2;
		System.out.println(result);
		double result2 = (double)su / su2; 
		System.out.println(result);
		
		//%연산자 -> 나머지를 구하는 것
		//짝수, 홀수, 배수, 약수, 최대공약수...
		result = su % su2;
		System.out.println(result);
		System.out.println(su % 2);
		System.out.println(3 % su);	
	}
	
	//간단한 계산기 만들기
	//두 개의 숫자를 입력 받아 +,-,*,/의 결과를 출력하는 기능 구현
	public void calc() {
		System.out.println("두 개의 숫자를 공백으로 구분하여 입력하시오.");
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		//System.out.printf("더하기: %.0f \n", a + b);
		System.out.println("더하기: " + (int)(a + b));
		//System.out.printf("빼기: %.0f \n", a - b);
		System.out.println("빼기: " + (int)(a - b));
		//System.out.printf("곱하기: %.0f \n", a * b);
		System.out.println("곱하기: " + (int)(a * b));
		System.out.printf("나누기: %.2f \n", a / b);
	}
	
	public void compareOp() {
		//비교 연산자 활용하기
		//동등 비교: 값이 일치하는지(==), 불일치 하는지(!=) 비교
		//대소 비교: 숫자 값의 크기를 비교(>, <, <=, >=)
		//비교연산의 결과는 boolean형(true,false)으로 반환
		//1. 동등비교
		int num = 13;
		int num2 = 19;
		int num3 = 13;
		System.out.println("num == num2 " + (num == num3));
		System.out.println("num == num3 " + (num == num3));
		
		double dnum = 180.5;
		double dnum2 = 180.2;
		double dnum3 = 180.5;
		System.out.println("dnum == dnum2 " + (dnum == dnum3));
		System.out.println("dnum == dnum3 " + (dnum == dnum3));
		
		System.out.println("num != num2 " + (num != num2));
		
		//문자 동등 비교
		//문자
		char ch = 'A';
		char ch2 = 'a';
		char ch3 = 'A';
		System.out.println("ch == ch2 " + (ch == ch2));
		System.out.println("ch == ch3 " + (ch == ch3));
		//문자열: ==으로 비교할 수가 없다 -> equals() 기능을 호출해서 비교
		
		Integer i = 1;
		System.out.println(i);
		String name = "유병승";
		String name2 = "윤상빈";
		String name3 = "유병승";
		String name4 = new String("유병승");
		System.out.println("name == name2 " + (name == name2));
		System.out.println("name == name3 " + (name == name3)); //리터럴로 받은 String이므로 ==연산자 사용 가능
		System.out.println("name == name4 " + (name == name4));
		System.out.println("name.equals(name4) " + name.equals(name4));
		System.out.println(name);
		System.out.println(name4);
		//입력 받은 이름이 윤상빈이니? true/false
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 입력: ");
		String inputName = sc.nextLine();
		System.out.println(inputName == "윤상빈");
		//equals() -> String 변수명 또는 "".equals(String 변수명 또는 "")
		System.out.println(inputName.equals("윤상빈"));
		//문자열 불일치 비교
		System.out.println(!inputName.equals("윤상빈"));
		
		//2. 대소 비교
		num = 200;
		num2 = 300;
		num3 = 200;
		System.out.println("num>num2 " + (num>num2));
		System.out.println("num>num3 " + (num>num3));
		System.out.println("num<num2 " + (num<num2));
		System.out.println("num<num3 " + (num<num3));
		System.out.println("num<=num3 " + (num<=num3));
		
		//문자 대소 비교하기
		//문자
		System.out.println(ch>ch2);
		System.out.println(ch<ch2); //자동 형변환이 이루어짐
		System.out.println('a'<'z');
		//문자열
		//System.out.println("안녕">"하이");
	}
	
	public void testStr() {
		System.out.println("아이디를 입력하시오.");
		Scanner sc = new Scanner(System.in);
		String id = sc.nextLine();
		System.out.println(id.equals("admin"));
	}
	
	public void checkAge() {
		System.out.println("만 나이를 입력하시오.");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		System.out.println(age>=19);
	}
	
	public void logicOp() {
		//논리연산자 활용하기
		//2개 이상의 진위형(비교연산, 기능호출)을 연결할 때 사용하는 연산
		//&&: and(그리고), 즉 두 개의 진위형이 모두 true일 때 true 반환
		//||: or(또는), 즉 두 개의 진위형 중 한 개가 true면 true 반환
		// 진위형 && 진위형, 진위형 || 진위형
		
		String id = "admin";
		String password = "1111";
		System.out.println(id.equals("admin") && password.equals("1234"));
		
		char gender = 'M';
		int age = 20;
		System.out.println(gender == 'F' && age >= 19);
		System.out.println(gender == 'F' || age >= 19);
		
		String address = "경기도";
		System.out.println(address.equals("경기도") || address.equals("서울"));
		
		//숫자값의 범위를 찾을 때 사용
		int age2 = 17;
		System.out.println(13 <= age2 && age2 <=18);
		
		//영문자 한개를 입력받아 그 문자가 소문자인지 아닌지 확인
		System.out.println("영문자 한 개 입력");
		Scanner sc = new Scanner(System.in);
		char a = sc.next().charAt(0);
		System.out.println((int)a>=97 && (int)a<=122); //97대신 'a'를 써도 됨.
		
		//나이가 20대이면서 여자인 사람 찾기
		System.out.println("나이 입력");
		int age3 = sc.nextInt();
		System.out.println("성별(M/F) 입력");
		char gender2 = sc.next().charAt(0);
		System.out.println(age3>=20 && age3<=29 && gender2=='F');
		
		//사는 곳이 서울 또는 인천이면서 30대인 사람 조회
		System.out.println("주소 입력: ");
		sc.nextLine();
		String address2 = sc.nextLine();
		System.out.println((age3 >=30 && age3 <= 39) && (address.equals("서울") || address.equals("인천")));
	}
	
	
	
}
