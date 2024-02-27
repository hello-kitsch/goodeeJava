package com.obj.model.vo;

public class Person {
	private static int count; //static에 대해서 이용하려면 static getter,setter를 만들어서 사용
	private String personId;
	private String name;
	private int age;
	private char gender;
	private double height;
	{
		this.personId = "KOR_" + ++Person.count;
	}
	
	public static void setCount(int count) {
		Person.count = count;
	}
//	public static int getCount() {
//		return Person.count;
//	}
	
	public String getPersonId() {
		return this.personId;
	}
	private void setPersonId(String personId) {
		this.personId = personId;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
//		if(age>19) {
			this.age = age;
//		}
//		else { throw new IllegalArgumentException(); }
	}
	public int getAge() {
		return age;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public char getGender() {
		return gender;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getHeight() {
		return height;
	}
	
	public String infoPerson() {
		return personId + " " + name + " " + age + " " + gender + " " + height;
	}
}
