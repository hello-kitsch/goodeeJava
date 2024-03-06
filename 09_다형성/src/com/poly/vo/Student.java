package com.poly.vo;

import java.util.Objects;

public class Student extends Person {
//	private String name;
//	private int age;
	private int grade;
	private int classNumber;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int age, int grade, int classNumber) {
		super(name, age);
//		this.name = name;
//		this.age = age;
		this.grade = grade;
		this.classNumber = classNumber;
	}

//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public int getAge() {
//		return age;
//	}
//
//	public void setAge(int age) {
//		this.age = age;
//	}

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
	
	@Override
	public String infoPerson() {
		return super.infoPerson()+ this.grade + this.classNumber;
	}
	
	@Override
	public String toString() {
		return super.infoPerson() + this.grade + this.classNumber;
	}
	
	@Override
	public boolean equals(Object o) {
		//객체에 저장된 데이터를 기준으로 동등성을 비교
		//this와 매개변수 o를 비교
		if(this == o) return true;
		else if (o instanceof Student){
			Student target = (Student)o;
			if(super.getName().equals(target.getName())
					&& super.getAge() == target.getAge()
					&& this.grade == target.getGrade()
					&& this.classNumber == target.getClassNumber())
				return true;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(super.getName(), super.getAge(), this.grade, this.classNumber);
	}
	
	@Override
	public Student clone() {
		return new Student(super.getName(), super.getAge(), this.grade, this.classNumber);
	}
	
	@Override
	public String info() {
		return toString();
	}
}
