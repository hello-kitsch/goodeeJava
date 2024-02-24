package com.obj.run;

import com.obj.model.vo.InitialBlockTest;

public class InitialMain {
	public static void main(String[] args) {
		System.out.println(InitialBlockTest.count); //클래스명이 클래스변수가 담긴 클래스의 주소
		for(int i=0; i<3; i++) {
			InitialBlockTest ibt = new InitialBlockTest();
			System.out.println(ibt.EMP_NO);
			System.out.println(ibt.name);
			System.out.println(ibt.age);
			System.out.println(ibt.gender);
			System.out.println("객체 생성수: " + InitialBlockTest.count); //ibt.count
		}
	}
}