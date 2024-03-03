package com.inherent.vo;

public class Teacher extends Person {
	private String major;
	private String subject;
	
	public Teacher() {
		// TODO Auto-generated constructor stub
	}

	public Teacher(String name, int age, char gender, String major, String subject) {
		super(name, age, gender);
		this.major = major;
		this.subject = subject;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(super.equals(obj) == true &&
				major.equals(((Teacher)obj).getMajor()))
			return true;
		else 
			return false;
	}
	
	@Override
	public String toString() {
		return super.toString() + major + " " + subject;
	}
}
