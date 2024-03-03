package com.inherit.model.vo;

public class Student extends Person {
//	private String name;
//	private int age;
//	private String address;
//	private String phone;
	private int grade;
	private int classNumber;
	
	public Student() { 
//		super() 자동 생성
	}

	
	public Student(int grade, int classNumber) {
		super();
		name = "유병승";
		setName("유병승");
		this.grade = grade;
		this.classNumber = classNumber;
		super.test();
	}

	public Student(String name, int age, String address,
			String phone, int grade, int classNumber) {
		super(name, age, address, phone);
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
	
//	@Override
//	public void test() {
//		System.out.println("studentTest메소드");
//	}
	
	public String infoStudent() {
		return super.name + " " + super.getAge() + " " + super.getAddress() + " " + 
				super.getPhone() + " " + getGrade() + " " + getClassNumber();
	}
	
	@Override
	public String toString() { //객체의 대표값
		return super.name + " " + super.getAge() + " " + super.getAddress() + " " + 
		super.getPhone() + " " + getGrade() + " " + getClassNumber();
	}
}
