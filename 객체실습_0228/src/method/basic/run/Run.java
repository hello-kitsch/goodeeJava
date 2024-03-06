package method.basic.run;

import method.basic.controller.Controller;

public class Run {
	public static void main(String[] args) {
		Controller ctrl = new Controller();
		System.out.println(ctrl.twoString("abc","zyx"));
		System.out.println(ctrl.sumInt(5, 1));
		System.out.println(ctrl.isStrEng('1'));
		System.out.println(ctrl.isEqualStr("avc", "avc"));
	}
}
