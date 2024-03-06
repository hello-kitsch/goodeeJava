package com.inter.model.vo;

public abstract class Animal {
	private String name;
	private String type;
	private int age;
	private double weight;
	
	public Animal() {
		// TODO Auto-generated constructor stub
	}

	public Animal(String name, String type, int age, double weight) {
		super();
		this.name = name;
		this.type = type;
		this.age = age;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	//alt+s+s+s+enter
	@Override
	public String toString() {
		return "Animal [name=" + name + ", type=" + type + ", age=" + age + ", weight=" + weight + "]";
	}
	
	public abstract void move();
	
//	public abstract void bark();
	
}
