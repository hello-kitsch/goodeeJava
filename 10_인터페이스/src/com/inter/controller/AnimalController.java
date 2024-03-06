package com.inter.controller;

import com.inter.common.FlyActionAble;
import com.inter.common.SoundActionAble;
import com.inter.common.SwimActionAble;
import com.inter.model.vo.Animal;

public class AnimalController {
	
	public void animalFly(FlyActionAble f) {
		f.fly();
	}
	
	public void animalBark(SoundActionAble s) {
		s.bark();
	}
	
	public void animalSwim(SwimActionAble s) {
		s.swim();
	}
	
	public void animalMove(Animal a) {
		a.move();
	}
}
