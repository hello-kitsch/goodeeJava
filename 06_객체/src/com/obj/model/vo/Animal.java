package com.obj.model.vo;

public class Animal {
	private String name;
	private String type;
	private double weight;
	private int age;
	private String food; //초식, 육식, 잡식
	
	/*
	 * 필드와 매핑되는 getter, setter 메소드를 선언한다
	 */
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
}
