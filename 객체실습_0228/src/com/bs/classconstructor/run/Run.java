package com.bs.classconstructor.run;

import com.bs.classconstuctor.model.vo.Product;

public class Run {
	public static void main(String[] args) {
		Product p1 = new Product("컴퓨터","maxbook",200);
		Product p2 = new Product("핸드폰","갤럭시노트",120,0.2);
		Product p3 = new Product("마스크",10,0.5,100);
		p1.printInfo();
		p2.printInfo();
		p3.printInfo();
	}
}
