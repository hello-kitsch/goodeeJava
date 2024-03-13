package com.io.model.vo;

import java.io.InputStream;
import java.io.Serializable;
import java.nio.charset.Charset;


public class Animal implements Serializable{
	private String name;
	private int age;
	private double weight;
	
	public Animal() {
		// TODO Auto-generated constructor stub
	}

	public Animal(String name, int age, double weight) {
		super();
		this.name = name;
		this.age = age;
		this.weight = weight;
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

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	@Override
	public String toString() {
		return name+","+age+","+weight;
	}
}