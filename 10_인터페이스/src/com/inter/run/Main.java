package com.inter.run;

import com.inter.controller.AnimalController;
import com.inter.controller.InterfaceController;
import com.inter.model.vo.Dog;
import com.inter.model.vo.Duck;
import com.inter.model.vo.Shark;

public class Main {

	public static void main(String[] args) {
//		new InterfaceController().basicInterface();
		
		Dog a = new Dog("뽀삐", "강아지", 3, 3.2);
		AnimalController ac = new AnimalController();
		ac.animalBark(a);
		ac.animalSwim(a);
//		ac.animalFly(null);
		ac.animalMove(a);
		
		Shark s = new Shark("샤크라", "백상아리", 5, 100.3);
		ac.animalSwim(s);
		ac.animalMove(s);
		
		Duck d = new Duck("도널드", "일반오리", 50, 15.3);
		ac.animalBark(d);
		ac.animalFly(d);
		ac.animalMove(d);
		ac.animalSwim(d);
		
		new InterfaceController().extraInterface();
		
	}

}
