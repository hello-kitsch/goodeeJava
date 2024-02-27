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
	public void setType(String type) {
		this.type = type;
	}
	public String getType() {
		return type;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getWeight() {
		return weight;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	public void setFood(String food) {
		this.food = food;
	}
	public String getFood() {
		return food;
	}
}
