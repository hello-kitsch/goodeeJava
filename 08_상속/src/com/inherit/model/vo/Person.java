package com.inherit.model.vo;

public class Person {
	private String name;
	private int age;
	private String address;
	private String phone;
	private String email;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}

	
	Person(String name, int age, String address, String phone, String email) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.phone = phone;
		this.email = email;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
