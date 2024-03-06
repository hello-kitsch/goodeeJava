package com.inter.model.vo;

import com.inter.common.FlyActionAble;
import com.inter.common.SoundActionAble;
import com.inter.common.SwimActionAble;

public class Duck extends Animal implements SoundActionAble, SwimActionAble, FlyActionAble{

	public Duck() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Duck(String name, String type, int age, double weight) {
		super(name, type, age, weight);
		// TODO Auto-generated constructor stub
	}

	//alt+s+v
	@Override
	public void fly() {
		System.out.println(getName() + " 푸드덕");
	}

	@Override
	public void swim() {
		System.out.println(getName() + " 첨벙첨벙");
	}

	@Override
	public void bark() {
		System.out.println(getName() + " 꽥꽥");
	}

	@Override
	public void move() {
		System.out.println(getName() + " 뒤둥뒤뚱");
	}
}
