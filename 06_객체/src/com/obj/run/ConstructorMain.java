package com.obj.run;

import com.obj.model.vo.ConstructorTest;

public class ConstructorMain {
	public static void main(String[] args) {
		ConstructorTest ct = new ConstructorTest();
		ConstructorTest ct2 = new ConstructorTest(10, "test");
		
		System.out.println(ct.num + " " + ct.msg);
		System.out.println(ct2.num + " " + ct2.msg);
		
		ConstructorTest ct3 = new ConstructorTest(20);
		ConstructorTest ct4 = new ConstructorTest("javatest");
		ConstructorTest ct5 = new ConstructorTest("testjava", 20);
	}
}