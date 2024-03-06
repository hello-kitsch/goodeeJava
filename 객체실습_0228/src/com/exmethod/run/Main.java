package com.exmethod.run;

import com.exmethod.controller.ExMethodController;

public class Main {
	public static void main(String[] args) {
		ExMethodController emc = new ExMethodController();
		//1.
		emc.printMsg("전달되 메세지를 출력하는 메소드 구현");
		//2.
		System.out.println(emc.sumOnetoHundred());
		//3.
		System.out.println(emc.oddOrEven(1));
		//4.
		System.out.println(emc.checkEngChar("a123k"));
		//5.
		emc.checkStrWithChar("apple", 'b');
		//6.
		emc.gugudanCustom(3);
	}
}
