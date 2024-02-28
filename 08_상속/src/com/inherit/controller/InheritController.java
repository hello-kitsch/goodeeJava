package com.inherit.controller;

import com.inherit.model.vo.Child;
import com.inherit.model.vo.Employee;
import com.inherit.model.vo.Parent;
import com.inherit.model.vo.Student;
import com.inherit.model.vo.Teacher;

public class InheritController {
	public void basicInherit() {
		/*
		 * 기본 상속에 대해 알아보자
		 * 기존에 선언되어 있는 클래스의 내용을 가져다 사용
		 * 상속: 클래스의 관계에 따라 설정
		 * is a 관계에 있을 때 상속설정 가능.
		 * 클래스 선언부에 extends 예약어를 이용해서 설정
		 * ex. public 클래스명 extends 부모클래스명 { }
		 */
		Parent p = new Parent();
		System.out.println(p.msg);
		p.test();
		
		Child c = new Child();
		System.out.println(c.msg);
		c.test();
		
		/*
		 * 직업별 사람을 관리하는 프로그램
		 * 학생, 강사, 회사원, 프로그래머
		 */
//		Student s = new Student("유병승", 19, "경기도 시흥시", "0101234", 1, 3);
//		Teacher t = new Teacher("유승주", 29, "경기도 부천시", "0105678", new String[] {"영어", "코딩"}, 3);
//		Employee e = new Employee("유지희", 24, "경기도 안양시", "0101234", "개발팀", 10);
		Student s = new Student();
		Teacher t = new Teacher();
		Employee e = new Employee();
		s.setName("유병승");
		t.setName("유승주");
		e.setName("유지희");
		s.setEmail("email");
		t.setEmail("temail");
	}
}