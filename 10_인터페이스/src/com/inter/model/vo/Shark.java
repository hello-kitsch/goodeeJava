package com.inter.model.vo;

import com.inter.common.SwimActionAble;

public class Shark extends Animal implements SwimActionAble{
	public Shark() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Shark(String name, String type, int age, double weight) {
		super(name, type, age, weight);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void move() {
		System.out.println(getName() + " 꼬리를 살랑살랑 앞으로 이동");
	}
	
	@Override
	public void swim() {
		System.out.println(getName() + " 지느러미를 물위로 드러내고 위협하며 첨벙첨벙");
	}
	
	
}
