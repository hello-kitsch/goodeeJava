package com.student.model.vo;

public class Student {
	private static int count;
	private int number; //private final int number;
	private String name;
	private int age;
	private int grade;
	private int classNumber;
	private char gender;
	private double height;
	private String address;
	private String phone;
	
	{
		number = ++Student.count;
	}
	
	public Student() {}
	 
	public Student(String name, int age, int grade, 
			int classNumber, char gender, double height, 
			String address, String phone) {
		this.name = name;
		this.age = age;
		this.grade = grade;
		this.classNumber = classNumber;
		this.gender = gender;
		this.height = height;
		this.address = address; 
		this.phone = phone;
		
	}
	
	public int getNumber() {
		return number;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getGrade() {
		return grade;
	}
	
	public void setClassNumber(int classNumber) {
		this.classNumber = classNumber;
	}
	public int getClassNumber() {
		return classNumber;
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
	
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress() {
		return address;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPhone() {
		return phone;
	}
	
	public String infoStudent() {
		return number + " " + name + " " + age + " " +
				grade + " " + classNumber + " " +
				gender + " " + height + " " + address + " " + phone;
	}
}
