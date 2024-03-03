package com.inherent.run;

import com.inherent.vo.Driver;
import com.inherent.vo.Employee;
import com.inherent.vo.Person;
import com.inherent.vo.Student;
import com.inherent.vo.Teacher;

public class Run {
	public static void main(String[] args) {
		Person p1 = new Student("손지연", 23, '여', "물리", 1);
		System.out.println(((Student)p1).toString());
		
		Person p2 = new Teacher("유지연", 24, '남', "물리", "수학");
		System.out.println(((Teacher)p2).toString());

		Person p3 = new Employee("강지연", 25, '여', "개발1팀", "010-1234-5678");
		System.out.println(((Employee)p3).toString());
		
		Person p4 = new Driver("이지연", 26, '남', "물리", 5);
		System.out.println(((Driver)p4).toString());
	}
	
}

//+1. mvc 패턴화 +2. 싱글톤
//1) 컨트롤러 -> 기능설정 -> 싱글톤
//2) dao -> 객체배열 및 기능설정하는컨트롤러의 접근용이성을 제공
//3) mainView -> 기능보여주기, 입출력모듈 -> 싱글톤