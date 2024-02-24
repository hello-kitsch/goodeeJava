package com.obj.model.vo;

public class SubMain {
	public static void main(String[] args) {
		new DefaultObject();
		FieldTest ft = new FieldTest();
		System.out.println(ft.price);
		System.out.println(ft.name);
		ft.name = "유병승";
		System.out.println(ft.name);
//		System.out.println(ft.height);
	}
}
