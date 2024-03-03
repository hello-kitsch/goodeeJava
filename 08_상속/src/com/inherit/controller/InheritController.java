package com.inherit.controller;

import com.inherit.model.vo.Child;
import com.inherit.model.vo.Employee;
import com.inherit.model.vo.Parent;
import com.inherit.model.vo.Person;
import com.inherit.model.vo.Programmer;
import com.inherit.model.vo.Student;
import com.inherit.model.vo.Teacher;
import com.inherit.model.vo.Test;

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
//		p.test();
		
		Child c = new Child();
		System.out.println(c.msg);
//		c.test();
		
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
//		s.setName("유병승");
		t.setName("유승주");
		e.setName("유지희");
		s.setEmail("email");
		t.setEmail("temail");
		
		Programmer pro = new Programmer();
		pro.getName();
		 
		/*
		 * 상속은 계층 구조를 갖는다
		 */
		Person person = new Person();
		person.msg = "안녕~";
		System.out.println(person.msg);
		s.msg = "오잉?";
		e.msg = "호호";
		t.msg = "히히";
		
		/*
		 * 부모 클래스에서 자식 클래스 접근하기 불가능
		 */ 
//		person.getGrade();
		
		/*
		 * 부모 클래스에 선언된 private 필드는 접근이 불가능
		 */
//		String name = s.name;
		Student s1 = new Student(1, 3);
		System.out.println(s1.getName());
		
		Student s2 = new Student("김혜정",26,"금천구","0101234",4,1);
		System.out.println(s2.infoStudent());
		
		/*
		 * 상속관계에서 부모가 설정한 메소드를 자식이 재정의해서 사용할 수 있음
		 * 오버라이드: 메소드의 선언부를 부모의 멤버 메소드의 선언부와 동일하게 설정하고 구현부만 변경하는 것
		 * 메소드 선언부에 @Override(어노테이션)를 작성하면 컴파일 시점에 check 가능
		 */
		
		/*
		 * java.lang.Object 클래스는 모든 클래스의 부모 -> root
		 * jdk17 document
		 */
		s2.equals(new Student());
		Test test = new Test();
//		test.
//		"test".equals("test");
//		Object.
		
		System.out.println(s2); //객체의 toString() 호출
//		s2.toString();
		System.out.println(t);
		
		/*
		 * 클래스에 상속을 불가능하게 만들기
		 * 클래스 선언부에 final 예약어를 설정
		 */
		
		/*
		 * 메소드 오버라이드 차단하기
		 * 메소드 선언부에 final 예약어를 설정
		 */
	}
}