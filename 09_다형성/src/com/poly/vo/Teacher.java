package com.poly.vo;

public class Teacher extends Person {
	private String subject;
	private int salary;
	
	public Teacher() {
		// TODO Auto-generated constructor stub
	}

	public Teacher(String name, int age, String subject, int salary) {
		super(name, age);
		this.subject = subject;
		this.salary = salary;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public String infoTeacher() {
		return super.infoPerson() + this.salary + this.subject;
	}
	
	@Override
	public String infoPerson() {
		return infoTeacher();
	}
	
	@Override
	public String toString() {
		return infoTeacher();
	}
	
	@Override
	public String info() {
		return infoTeacher();
	}
}
