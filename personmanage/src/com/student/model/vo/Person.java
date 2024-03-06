package com.student.model.vo;

public abstract class Person {
	private static int count;
	private int number;
	private String name;
	private int age;
	private char gender;
	private double height;
	private String address;
	private String phone;
	
	{
		number = ++Person.count;
	}
	
	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(String name, int age, char gender, double height, String address, String phone) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.height = height;
		this.address = address;
		this.phone = phone;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Person.count = count;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Person [number=" + number + ", name=" + name + ", age=" + age + ", gender=" + gender + ", height="
				+ height + ", address=" + address + ", phone=" + phone + ", ";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(name.equals(((Person)obj).getName()) &&
				age == ((Person)obj).getAge() &&
				gender == ((Person)obj).getGender() &&
				height == ((Person)obj).getHeight() &&
				address.equals(((Person)obj).getAddress()) &&
				phone.equals(((Person)obj).getPhone()))
			return true;
		else
			return false;
	}
}
