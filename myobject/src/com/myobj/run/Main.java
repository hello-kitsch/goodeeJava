package com.myobj.run;

import com.myobj.vo.Product;

public class Main {
	public static void main(String[] args) {
		Product pdt1 = new Product("맥북", 590, "그레이", 0.2);
		Product pdt2 = new Product("갤럭시 S24", 180, "블랙", 0.1);
		Product pdt3 = new Product("아파트 34평", 40000, "핫핑크", 0);
//		Product.count = 1; //static 변수의 접근 제한자 활용
		Product pdt4 = new Product("책상", 200, 0.0);
		Product pdt5 = new Product("이어폰", 30, "화이트");
		Product pdt6 = new Product("자동차", 200, "블랙", 0.3);
		
		Product[] pdtArr = new Product[6];
		pdtArr[0] = pdt1;
		pdtArr[1] = pdt2;
		pdtArr[2] = pdt3;
		pdtArr[3] = pdt4;
		pdtArr[4] = pdt5;
		pdtArr[5] = pdt6;
		
		for(int i=0; i<pdtArr.length; i++) {
			String totalEmp = pdtArr[i].pdtNum + ": " + pdtArr[i].pdtName + " " + pdtArr[i].pdtPrice + " " + pdtArr[i].pdtColor + " " + pdtArr[i].pdtSale;
			System.out.println(totalEmp);
		}
		for(Product i : pdtArr) {
			System.out.println(i.pdtNum+i.pdtColor+i.pdtPrice+i.pdtColor+i.pdtSale);
		}
	}
}