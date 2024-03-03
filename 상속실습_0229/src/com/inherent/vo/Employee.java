package com.inherent.vo;

public class Employee extends Person{
	private String partment;
	private String phone;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, int age, char gender, String partment, String phone) {
		super(name, age, gender);
		this.partment = partment;
		this.phone = phone;
	}

	public String getPartment() {
		return partment;
	}

	public void setPartment(String partment) {
		this.partment = partment;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(super.equals(obj) == true &&
				partment.equals(((Employee)obj).getPartment()))
			return true;
		else 
			return false;
	}
	
	@Override
	public String toString() {
		return super.toString() + partment + " " + phone;
	}
}
