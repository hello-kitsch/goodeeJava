package com.bs.classconstuctor.model.vo;

public class Product {
	public static int count = 0;
	public int pNum;
	public String pType;
	public String pName;
	public int pPrice;
	public double pDiscount;
	public int pStock;
	{
		pNum = ++count;
	}
	public Product() {
		// TODO Auto-generated constructor stub
	}
	
	public Product(String pType, String pName, int pPrice) {
		super();
		this.pType = pType;
		this.pName = pName;
		this.pPrice = pPrice;
	}

	public Product(String pType, String pName, int pPrice, double pDiscount) {
		super();
		this.pType = pType;
		this.pName = pName;
		this.pPrice = pPrice;
		this.pDiscount = pDiscount;
	}

	public Product(String pName, int pPrice, double pDiscount, int pStock) {
		super();
		this.pName = pName;
		this.pPrice = pPrice;
		this.pDiscount = pDiscount;
		this.pStock = pStock;
	}

	public void printInfo() {
		System.out.println(pType+" "+pName+" "+pPrice+" "+pDiscount+" "+pStock);
	}
}
