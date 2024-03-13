package com.student.model.vo;

public class Student extends Person {
	public static final int STUDENT_INFO_NUM = 9;
	
	private int grade;
	private int classNumber;
	
	public Student() {}

	public Student(int num, String name, int age, char gender, 
			double height, String address, String phone, 
			int grade, int classNumber) {
		super(name, age, gender, height, address, phone);
		super.setNumber(num);
		this.grade = grade;
		this.classNumber = classNumber;
	}
	
	public Student(String name, int age, char gender, 
			double height, String address, String phone, 
			int grade, int classNumber) {
		super(name, age, gender, height, address, phone);
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

	@Override
	public String toString() {
		return super.toString() + "grade=" + grade + ", " + "classNumber=" + classNumber + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(super.equals(obj))
//				grade == ((Student)obj).getGrade() &&
//				classNumber == ((Student)obj).getClassNumber()
			return true;
		else
			return false;
	}
}
