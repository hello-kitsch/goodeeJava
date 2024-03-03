package com.inherent.vo;

public class Student extends Person{
	private String subject;
	private int classNum;

	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(String name, int age, char gender, String subject, int classNum) {
		super(name, age, gender);
		this.subject = subject;
		this.classNum = classNum;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getClassNum() {
		return classNum;
	}

	public void setClassNum(int classNum) {
		this.classNum = classNum;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(super.equals(obj) == true &&
				super.getGender() == ((Student)obj).getGender() &&
				subject.equals(((Student)obj).getSubject()))
			return true;
		else 
			return false;
	}
	
	@Override
	public String toString() {
		return super.toString() + subject + " " + classNum;
	}
}
