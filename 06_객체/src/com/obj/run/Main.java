package com.obj.run;

import com.obj.model.vo.BasicObject;
import com.obj.model.vo.Employee;
import com.obj.model.vo.Saram;

/*
 * 클래스의 접근 제한자
 * 클래스를 이용할 수 있는 범위를 설정하는 예약어
 * public: 프로젝트 내 모든 패키지에서 이용이 가능한 클래스를 설정
 * default: 동일한 패키지 내에서만 이용이 가능한 클래스를 설정
 */
public class Main {
	public static void main(String[] args) {
		/* 
		 * public으로 선언한 클래스 생성하기(=객체화)
		 */
		new BasicObject();
		/*
		 * default로 선언한 클래스 생성하기
		 */
//		new DefaultObject();
		/*
		 * 선언한 클래스는 프로젝트에서 하나의 참조형 자료형이 된다.
		 */
		BasicObject bo;
		bo = new BasicObject();
//		bo = new SubMain();
//		Scanner sc = new Scanner(System.in);
		java.util.Scanner sc;
		
		/*
		 * 0228 필드 실습 과제
		 */
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		e1.name = "유병승"; e1.department = "강사부";
		e2.name = "은세계"; e2.department = "학생부";
		System.out.println(e1.name+" "+e1.department);
		System.out.println(e2.name+" "+e2.department);
		
		Saram s1 = new Saram();
		Saram s2 = new Saram();
		s1.phone = "01036446259";
		s1.height = 180.5;
		s1.weight = 65.5;
		s2.phone = "01012345678";
		s2.height = 195.5;
		s2.weight = 100.2;
		System.out.println(s1.phone+" "+s1.height+" "+s1.weight);
		System.out.println(s2.phone+" "+s2.height+" "+s2.weight);
	}
}