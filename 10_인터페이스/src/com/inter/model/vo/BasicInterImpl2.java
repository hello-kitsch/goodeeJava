package com.inter.model.vo;

import com.inter.common.BasicInter;

public class BasicInterImpl2 implements BasicInter{
	private String test;
	
	
	public String getTest() {
		return test;
	}

	public void setTest(String test) {
		this.test = test;
	}

	@Override
	public void test() {
		System.out.println("이건 뭐지?");
	}
	
	@Override
	public int calc(int su, int su2) {
		return su*su2;
	}
	
	@Override
	public String checkStr(String str, char c) {
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == c) {
				return "있다";
			}
		}
		return "없다";
	}
	
	@Override
	public void addFunc() {
		System.out.println("다시 설정하기");
	}
}
