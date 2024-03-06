package com.inter.model.vo;

import com.inter.common.BasicInter;
import com.inter.common.TestInter;

public class InterTestImpl implements BasicInter, TestInter {
	@Override
	public void test() {
		
	}
	
	@Override 
	public int calc(int s, int s2) { return s+s2; }
	
	@Override
	public String checkStr(String s, char c) {
		return "test";
	}
	
	@Override
	public String music(String n) {
		return n;
	}
}
