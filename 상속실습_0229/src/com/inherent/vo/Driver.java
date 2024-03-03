package com.inherent.vo;

public class Driver extends Person {
	private String local;
	private int career;
	
	public Driver() {
		// TODO Auto-generated constructor stub
	}

	public Driver(String name, int age, char gender, String local, int career) {
		super(name, age, gender);
		this.local = local;
		this.career = career;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public int getCareer() {
		return career;
	}

	public void setCareer(int career) {
		this.career = career;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(super.equals(obj) == true &&
				super.getGender() == ((Driver)obj).getGender() &&
				local.equals(((Driver)obj).getLocal()) &&
				career == ((Driver)obj).getCareer())
			return true;
		else 
			return false;
	}
	
	@Override
	public String toString() {
		return super.toString() + local + " " + career;
	}
}
