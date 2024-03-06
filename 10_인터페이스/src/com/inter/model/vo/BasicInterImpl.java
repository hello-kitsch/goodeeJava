package com.inter.model.vo;

import com.inter.common.BasicInter;

public class BasicInterImpl implements BasicInter {
	
	@Override
	public void test() {
		System.out.println("인터페이스 메소드 구현");
	}
	
	@Override
	public int calc(int su, int su2) {
		return su+su2;
	}
	
	@Override
	public String checkStr(String msg, char ch) {
		return "나몰랑";
	}
}
