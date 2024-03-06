package com.bs.hw.person.view;

import java.util.Scanner;

import com.bs.hw.person.controller.PersonController;
import com.bs.hw.person.model.vo.Employee;
import com.bs.hw.person.model.vo.Student;

public class PersonMenu {
	Scanner sc = new Scanner(System.in);
	PersonController pc = new PersonController();
	
	public void mainMenu() {
		while(true) {
			System.out.println("학생은 최대 3명까지 저장할 수 있습니다.");
			System.out.println("현재 저장된 학생은 " + pc.personCount()[0] + "명입니다.");
			System.out.println("사원은 최대 10명까지 저장할 수 있습니다.");
			System.out.println("현재 저장된 사원은 " + pc.personCount()[1] + "명입니다.");
			
			System.out.println("==== 메뉴 선택 ====");
			System.out.println("1. 학생 메뉴");
			System.out.println("2. 사원 메뉴");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 입력: ");
			int num = sc.nextInt();
			switch(num) {
				case 1: studentMenu(); break;
				case 2: employeeMenu(); break;
				case 9: System.out.println("종료합니다"); return;
				default: System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
	}
	
	public void studentMenu() {
		while(true) {
			System.out.println("==== Student Menu ====");
			System.out.println("1. 학생 추가");
			System.out.println("2. 학생 보기");
			System.out.println("9. 메인으로");
			if(pc.personCount()[0] == 3)
				System.out.println("학생을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가 메뉴는 더 이상 활성화 되지 않습니다.");
			System.out.print("메뉴 입력: ");
			int num = sc.nextInt();
			sc.nextLine();
			switch(num) {
				case 1:
					if(pc.personCount()[0] == 3) {
						System.out.println("잘못 입력하셨습니다. 다시 입력해주세요"); 
						break;
					} else {
						insertStudent(); 
						return;
					}
				case 2: printStudent(); return;
				case 9: System.out.println("메인으로 돌아갑니다."); return;
				default: System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
	}
	
	public void employeeMenu() {
		while(true) {
			System.out.println("==== Employee Menu ====");
			System.out.println("1. 사원 추가");
			System.out.println("2. 사원 보기");
			System.out.println("9. 메인으로");
			if(pc.personCount()[1] == 10)
				System.out.println("사원을 담을 수 있는 공간이 꽉 찼기 때문에 사원 추가 메뉴는 더 이상 활성화 되지 않습니다.");
			System.out.print("메뉴 입력: ");
			int num = sc.nextInt();
			sc.nextLine();
			switch(num) {
				case 1:
					if(pc.personCount()[1] == 10) {
						System.out.println("잘못 입력하셨습니다. 다시 입력해주세요"); 
						break;
					} else {
						insertEmployee(); 
						return;
					}
				case 2: printEmployee(); return;
				case 9: System.out.println("메인으로 돌아갑니다."); return;
				default: System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
	}
	
	public void insertStudent() {
		while(true) {
			if(pc.personCount()[0] == 3) {
				System.out.println("학생을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가를 종료하고 학생 메뉴로 돌아갑니다.");
				break;
			} else {
				System.out.print("학생 이름: ");
				String name = sc.nextLine();
				System.out.print("학생 나이: ");
				int age = sc.nextInt();
				System.out.print("학생 키: ");
				double height = sc.nextDouble();
				System.out.print("학생 몸무게: ");
				double weight = sc.nextDouble();
				System.out.print("학생 학년: ");
				int grade = sc.nextInt();
				sc.nextLine();
				System.out.print("학생 전공: ");
				String major = sc.nextLine();
				
				pc.insertStudent(name, age, height, weight, grade, major);
				System.out.println("그만하시려면 N(n), 이어하시려면 아무 키나 누르세요: ");
				char ch = sc.next().charAt(0);
				sc.nextLine();
				if(ch == 'n' || ch == 'N')
					break;
				else 
					continue;
			}
		}
	}
	
	public void printStudent() {
		Student[] s = pc.printStudent();
		for(Student ss : s) {
			System.out.println(ss.toString());
		}
	}
	
	public void insertEmployee() {
		while(true) {
			if(pc.personCount()[1] == 10) {
				System.out.println("사원을 담을 수 있는 공간이 꽉 찼기 때문에 사원 추가를 종료하고 사원 메뉴로 돌아갑니다.");
			} else {
				System.out.print("사원 이름: ");
				String name = sc.nextLine();
				System.out.print("사원 나이: ");
				int age = sc.nextInt();
				System.out.print("사원 키: ");
				double height = sc.nextDouble();
				System.out.print("사원 몸무게: ");
				double weight = sc.nextDouble();
				System.out.print("사원 급여: ");
				int salary = sc.nextInt();
				sc.nextLine();
				System.out.print("사원 부서: ");
				String partment = sc.nextLine();
				
				pc.insertStudent(name, age, height, weight, salary, partment);
				System.out.println("그만하시려면 N(n), 이어하시려면 아무 키나 누르세요: ");
				char ch = sc.next().charAt(0);
				if(ch == 'n' || ch == 'N')
					break;
				else 
					continue;
			}
		}
	}
	
	public void printEmployee() {
		Employee[] e = pc.printEmployee();
		for(Employee ee : e) {
			System.out.println(ee.toString());
		}
	}
}
