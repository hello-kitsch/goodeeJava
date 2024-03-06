package com.inter.model.vo;

import com.inter.common.SoundActionAble;
import com.inter.common.SwimActionAble;

public class Dog extends Animal implements SoundActionAble, SwimActionAble{

	public Dog() {
		super();
		// TODO Auto-generated constructor stub
	}

	//alt+s+c
	public Dog(String name, String type, int age, double weight) {
		super(name, type, age, weight);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void move() {
		System.out.println(getName() + "가 앞으로 뛰어간다");
	}
	
	@Override
	public void bark() {
		System.out.println(getName() + "가 멍멍멍!!!");
	}
	
	@Override
	public void swim() {
		System.out.println(getName() + "가 수영한다");
	}
}
