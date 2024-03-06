package com.poly.vo;

public class Employee extends Person {
//	private String name;
//	private int age;
	private int salary;
	private String department;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, int age, int salary, String department) {
		super(name, age);
//		this.name = name;
//		this.age = age;
		this.salary = salary;
		this.department = department;
	}

//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public int getAge() {
//		return age;
//	}
//
//	public void setAge(int age) {
//		this.age = age;
//	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	public String infoEmp() {
		return super.infoPerson() + this.salary + this.department;
	}
	
	@Override
	public String infoPerson() {
		return infoEmp();
	}
	
	@Override
	public String toString() {
		return infoEmp();
	}
	
	@Override
	public boolean equals(Object other) {
		if(this == other) return true;
		else if(other instanceof Employee) {
			Employee e = (Employee)other;
			if(this.salary==e.salary
				&& this.department.equals(e.department))
				return true;
		}
		return false;
	}
	
	@Override
	public String info() {
		return toString();
	}
}
