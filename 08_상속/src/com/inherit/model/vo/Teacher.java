package com.inherit.model.vo;

public class Teacher extends Person {
//	private String teacherName;
//	private int age;
//	private String address;
//	private String phone;
	private String[] subject;
	private int career;
	
	public Teacher() {	}
	
	
	public Teacher(String[] subject, int career) {
		super();
		this.subject = subject;
		this.career = career;
	}

	public String[] getSubject() {
		return subject;
	}

	public void setSubject(String[] subject) {
		this.subject = subject;
	}

	public int getCareer() {
		return career;
	}

	public void setCareer(int career) {
		this.career = career;
	}
	
	
}
