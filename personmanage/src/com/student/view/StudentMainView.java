package com.student.view;

import java.util.Arrays;
import java.util.Scanner;

import com.student.controller.StudentController;
import com.student.model.vo.Person;
import com.student.model.vo.Student;

public class StudentMainView implements MainView {
	public static int[] infoArr = new int[Student.STUDENT_INFO_NUM];
	
	@Override
	public int mainMenu() {
		System.out.println("==== 학생관리 프로그램 ====");
		System.out.println("1. 등록");
		System.out.println("2. 전체조회")	;
		System.out.println("3. 검색");
		System.out.println("4. 수정(학년,반,주소,전화번호)");
		System.out.println("5. 삭제");
		System.out.println("0. 종료");
		System.out.print("입력: ");
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}
	@Override
	public Person inputNewInfo() {
		String name = "", address = "", phone = "", genderX = "";
		int age = 0, grade = 0, classNumber = 0;
		double height = 0; 
		
		printMsg("이름 : ");
		name = inputString();

		
		printMsg("나이 : ");
		age = inputInt();
	
		
		printMsg("학년 : ");
		grade = inputInt();

		
		printMsg("반 : ");
		classNumber = inputInt();

		
		printMsg("성별 : ");
		genderX = inputString();

		
		printMsg("키 : ");
		height = inputDouble();

		
		printMsg("주소 : ");
		address = inputString();

		
		printMsg("전화번호 : ");
		phone = inputString();
		
		return new Student(name, age, genderX.charAt(0), height, address, phone, grade, classNumber);
	}

	@Override
	public Person inputEditInfo() {
		Scanner sc = new Scanner(System.in);
		String name = "", address = "", phone = "", genderX = "";
		int age = 0, grade = 0, classNumber = 0;
		double height = 0; 
		
		printMsg("이름을 수정하시려면 y를 입력하세요");
		if(check()) {
			System.out.print("이름 : ");
			name = inputString();
			infoArr[0] = 1;
		}
		
		printMsg("나이를 수정하시려면 y를 입력하세요");
		if(check()) {
			System.out.print("나이 : ");
			age = inputInt();
			infoArr[1] = 1;
		}
		
		printMsg("성별을 수정하시려면 y를 입력하세요");
		if(check()) {
			System.out.print("성별 : ");
			genderX = inputString();
			infoArr[2] = 1;
		}
		
		printMsg("키를 수정하시려면 y를 입력하세요");
		if(check()) {
			System.out.print("키 : ");
			height = inputDouble();
			infoArr[3] = 1;
		}
		
		printMsg("주소를 수정하시려면 y를 입력하세요");
		if(check()) {
			System.out.print("주소 : ");
			address = inputString();
			infoArr[4] = 1;
		}
		
		printMsg("전화번호를 수정하시려면 y를 입력하세요");
		if(check()) {
			System.out.print("전화번호 : ");
			phone = inputString();
			infoArr[5] = 1;
		}
		
		printMsg("학년을 수정하시려면 y를 입력하세요");
		if(check()) {
			System.out.print("학년 : ");
			grade = inputInt();
			infoArr[6] = 1;
		}
		
		printMsg("반을 수정하시려면 y를 입력하세요");
		if(check()) {
			System.out.print("반 : ");
			classNumber = inputInt();
			infoArr[7] = 1;
		}
		return new Student(name, age, genderX.charAt(0), height, address, phone, grade, classNumber);
	}
	@Override
	public int searchMetaInfo() {
		printMsg("""
				1. 번호로 검색
				2. 이름으로 검색
				3. 학년으로 검색
				4. 주소로 검색
				5. 성별로 검색
				6. 나이로 검색
				입력:
				""");
		return inputInt();
	}
	@Override
	public int deleteMetaInfo() {
		printMsg("삭제하실 사람의 번호를 입력하시오:");
		return inputInt();
	}
	@Override
	public void printObj(Person[] p) {
		System.out.println("=== 조회 결과 ===");
		int count = 0;
		for(int i=0; i<p.length; i++) {
			Student s = (Student)p[i];
			if(s != null) {
				System.out.println(s);
				count++;
			} 
		}
		if(count == 0)
			System.out.println("그런 사람 없습니다.");
	}
}