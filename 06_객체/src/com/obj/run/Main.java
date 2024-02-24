package com.obj.run;

import com.obj.model.vo.BasicObject;
//import com.obj.model.vo.DefaultObject;
import com.obj.model.vo.SubMain;

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
	}
}