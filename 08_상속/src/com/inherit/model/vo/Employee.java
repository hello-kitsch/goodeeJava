package com.inherit.model.vo;

public class Employee extends Person {
//	private String empName;
//	private int age;
//	private String address;
//	private String phone;
	private String department;
	private int salary;
	
	public Employee() { }

	public Employee(String empName, int age, String address, String phone, String department, int salary) {
		super();
		this.department = department;
		this.salary = salary;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
}
