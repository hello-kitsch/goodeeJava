package com.test.variable;

import java.util.Scanner;

public class StudentInfo {
	public static void main(String[] args) {
		//학생 정보를 입력받고 출력하는 기능 구현하기
		//이름, 나이, 성별(남/여), 학년, 반, 번호, 키, 주소, 이메일 입력받고 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름: ");
		String name = sc.nextLine();
		System.out.println(name);
		
		System.out.println("나이: ");
		int age = sc.nextInt();
		System.out.println(age);
		
		sc.nextLine();
		System.out.println("성별(남/여): ");
		char gender = sc.nextLine().charAt(0);
		System.out.println(gender);
		
		System.out.println("학년: ");
		int grade = sc.nextInt();
		System.out.println(grade);
		
		System.out.println("반: ");
		int group = sc.nextInt();
		System.out.println(group);
		
		System.out.println("번호: ");
		int num = sc.nextInt();
		System.out.println(num);
		
		System.out.println("키: ");
		double height = sc.nextDouble();
		System.out.println(height);
		
		sc.nextLine();
		System.out.println("주소: ");
		String address = sc.nextLine();
		System.out.println(address);
		
		System.out.println("이메일: ");
		String email = sc.nextLine();
		System.out.println(email);
		
		System.out.println(name + " " + age + " " + gender + " " + grade + " " + group + " " + num + " " + height + " " + address + " " + email);
		System.out.printf("%s\t%d\t%c\t%d\t%d\t%d\t%.2f\t%s\t%s\n", name, age, gender, grade, group, num, height, address, email);
	}
}
