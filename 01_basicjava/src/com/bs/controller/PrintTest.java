package com.bs.controller;

public class PrintTest {

	public static void main(String[] args) {
		//console창에 원하는 데이터를 출력하는 것
		//System.out.print() -> 개행 없이 데이터 출력
		//System.out.println() -> 개행하며 데이터 출력
		System.out.print("안녕");
		System.out.print("하세요");
		System.out.print("호호호호");
		int age = 19;
		System.out.print(age);
		
		System.out.println("안녕");
		System.out.println("하세요");
		System.out.println("호호호호");
		System.out.println(age);
		
		//문자열에 escape 문자 처리하기
		String msg = "안녕하세요 저는 유병승입니다\n"
				+ "저는 자바 선생님입니다.\"하하하하\"";
		System.out.println(msg);
		
		String filePath = "c:\\Users\\GD";
		System.out.println(filePath);
		
		String html = "<p onclick=\"location.assign('')\">클릭</p>";
		System.out.println(html);
		
		//System.out.printf() -> 형식 맞춰서 출력할 때 사용
		//System.out.printf("출력패턴(%d, %c, %s, %f)", 값, 값, 값);
		System.out.printf("나의 이름은 %s이고, 나이는 %d, 성별은 %c, 키는 %f\n", 
				"유병승", 19, '남', 180.5);
		System.out.printf("%-5s\t%2d\t%1c\t%.2f\n", 
				"유병승", 19, '남', 180.5);
		System.out.printf("%5s\t%2d\t%1c\t%.2f\n", 
				"이이", 42, '남', 170.5);
	}

}
