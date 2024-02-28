package com.student.view;

import java.util.Scanner;
import static com.student.controller.StudentController.getController;

import com.student.controller.StudentController;
import com.student.model.vo.Student;

public class MainView {
	private StudentController sctr = getController();
	
	//싱글톤패턴
	private static MainView view; //필드 근데 static
	private MainView() {} //생성자 (이 클래스 내부에서만 쓸 수있게 private)
	public static MainView getView() { //메소드 근데 static
		if(MainView.view == null) 
			MainView.view = new MainView();
		return MainView.view;
	}
	
	
	public void mainMenu() {
		while(true) {
			System.out.println("==== 학생관리 프로그램 ====");
			System.out.println("1. 등록");
			System.out.println("2. 전체조회")	;
			System.out.println("3. 이름으로 조회");
			System.out.println("4. 학년으로 조회");
			System.out.println("5. 수정(학년,반,주소,전화번호)");
			System.out.println("6. 삭제");
			System.out.println("0. 종료");
			System.out.print("입력: ");
			Scanner sc = new Scanner(System.in);
			int menu = sc.nextInt();
			
			switch(menu) {
				case 1: sctr.enrollStudent(); break;
				case 2: sctr.checkAllStudent(); break;
				case 3: sctr.searchStudentForName(); break;
				case 4: sctr.searchStudentForGrade(); break;
				case 5: sctr.editStudentInfo(); break;
				case 6: sctr.deleteStudentInfo(); break; 
				case 0: System.out.println("프로그램을 종료합니다."); return;
				default: System.out.println("잘못된 값을 입력했습니다. 다시 입력하세요!"); break;
			}
		}
	}
	
	public String inputString() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=== 학생 이름으로 조회 ===");
		System.out.print("조회할 학생 이름를 입력하세요: ");
		return sc.nextLine();
	}
	
	public int inputInt() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=== 조회 ===");
		System.out.print("수정할 번호를 입력하세요: ");
		return sc.nextInt();
	}
	
	public Student inputNewStudentInfo() {
		Scanner sc = new Scanner(System.in);
		Student s = new Student();
		
		System.out.println("학년을 수정하시려면 y를 입력하세요");
		char answer = sc.next().charAt(0);
		if(answer == 'y' || answer == 'Y') {
			System.out.print("학년 : ");
			s.setGrade(sc.nextInt());
		}
		
		System.out.println("반을 수정하시려면 y를 입력하세요");
		answer = sc.next().charAt(0);
		if(answer == 'y' || answer == 'Y') {
			System.out.print("반 : ");
			s.setClassNumber(sc.nextInt());
		}
		
		sc.nextLine();
		System.out.println("주소를 수정하시려면 y를 입력하세요");
		answer = sc.next().charAt(0);
		if(answer == 'y' || answer == 'Y') {
			System.out.print("주소 : ");
			s.setAddress(sc.nextLine());
		}
		
		System.out.println("전화번호를 수정하시려면 y를 입력하세요");
		answer = sc.next().charAt(0);
		if(answer == 'y' || answer == 'Y') {
			System.out.print("전화번호 : ");
			s.setPhone(sc.next());
		}
		return s;
	}
	
	public Student inputStudentView() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("==== 학생 등록 ====");
			Student s = new Student();
			System.out.print("이름 : ");
			String name = sc.nextLine();
			s.setName(name);
			System.out.print("나이 : ");
			int age = sc.nextInt();
			s.setAge(age);
			System.out.print("학년 : ");
			int grade = sc.nextInt();
			s.setGrade(grade);
			System.out.print("반 : ");
			int classNumber = sc.nextInt();
			s.setClassNumber(classNumber);
			System.out.print("성별 : ");
			char gender = sc.next().charAt(0);
			s.setGender(gender);
			System.out.print("키 : ");
			double height = sc.nextDouble();
			sc.nextLine();
			s.setHeight(height);
			System.out.print("주소 : ");
			String address = sc.nextLine();
			s.setAddress(address);
			System.out.print("전화번호 : ");
			String phone = sc.next();
			s.setPhone(phone);
//			return new Student(name, age, grade, classNumber, gender, 
//					height, address, phone);
			return s;
		}
	}
	
	public void printMsg(String msg) {
		System.out.println("=== 시스템 알림 ====");
		System.out.println(msg);
		System.out.println("==================");
	}
	
	public void printStudent(String student) {
		System.out.println("=== 학생 조회 결과 ===");
		if(student != null) {
			System.out.println(student);
		} else {
			System.out.println("그런 학생 없습니다.");
		}
		System.out.println("===================");
	}
}