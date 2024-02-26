package com.obj.run;

import com.obj.model.vo.Animal;

public class GetterSetterMain {
	public static void main(String[] args) {
		Animal pubao = new Animal();
//		pubao.name = "푸바오";
		pubao.setName("푸바오");
//		System.out.println(pubao.name);
		System.out.println(pubao.getName());
	}
}
