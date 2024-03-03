package com.inherit.model.vo;

public class Person extends Parent {
	protected String name;
	private int age;
	private String address;
	private String phone;
	private String email;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}

	
	public Person(String name, int age, String address, String phone) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.phone = phone;
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
	
	protected final void test() {
		System.out.println("PersonTest메소드");
	}
}
