package com.object.model.vo;

public class Employee {
	private static int count = 0;
	private int eNum;
	private String eName;
	private String partment;
	private String position;
	private int salary;
	private double bonus;
	
	{
		eNum = ++count;
	}
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public int geteNum() {
		return eNum;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String getPartment() {
		return partment;
	}

	public void setPartment(String partment) {
		this.partment = partment;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	@Override
	public String toString() {
		return eNum + " " + eName + " " + partment + " " +
				position + " " + salary + " " + bonus;
	}
	
	public void printEmployee() {
		System.out.println(toString());
	}
}
