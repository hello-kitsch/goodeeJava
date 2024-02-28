package com.inherit.model.vo;

public class Student extends Person {
//	private String name;
//	private int age;
//	private String address;
//	private String phone;
	private int grade;
	private int classNumber;
	
	public Student() { }

	
	public Student(String name, int age, String address, String phone, int grade, int classNumber) {
		super();
		this.grade = grade;
		this.classNumber = classNumber;
	}


	public int getGrade() {
		return grade;
	}


	public void setGrade(int grade) {
		this.grade = grade;
	}


	public int getClassNumber() {
		return classNumber;
	}


	public void setClassNumber(int classNumber) {
		this.classNumber = classNumber;
	}

}
