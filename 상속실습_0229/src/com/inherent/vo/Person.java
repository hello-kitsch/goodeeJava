package com.inherent.vo;

public class Person {
	private String name;
	private int age;
	private char gender;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(String name, int age, char gender) {
//		super();
		if(name.length()>=2)
			this.name = name;
		if(age >= 10) 
			this.age = age;
		if(gender == '남' || gender == '여')
			this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public boolean setName(String name) {
		if(name.length() >= 2) {
			this.name = name;
			return true;
		}
		return false;
	}

	public int getAge() {
		return age;
	}

	public boolean setAge(int age) {
		if(age >= 10) {
			this.age = age;
			return true;
		}
		return false;
	}

	public char getGender() {
		return gender;
	}

	public boolean setGender(char gender) {
		if(gender == '남' || gender == '여') {
			this.gender = gender;
			return true;
		}
		else
			return false;
			
	}
	
	@Override
	public boolean equals(Object obj) {
		if(getName() == null || getAge() == 0) {
			return false;
		}
		if(name.equals(((Person)obj).getName()) &&
				age == ((Person)obj).getAge())
			return true;
		else 
			return false;
	}
	
	@Override
	public String toString() {
		return name + " " + age + " " + gender;
	}
}
