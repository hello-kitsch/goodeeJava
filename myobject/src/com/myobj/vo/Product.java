package com.myobj.vo;

public class Product {
	
	private static int count = 1;
	public String pdtNum;
	public String pdtName;
	public int pdtPrice;
	public String pdtColor;
	public double pdtSale;

	{
		pdtNum = "P_" + count;
		count++;
	}
	
	public Product(String pdtName, int pdtPrice) {
		this.pdtName = pdtName;
		this.pdtPrice = pdtPrice;
	}
	
	public Product(String pdtName, int pdtPrice, String pdtColor) {
		this(pdtName, pdtPrice);
//		this.pdtName = pdtName;
//		this.pdtPrice = pdtPrice;
		this.pdtColor = pdtColor;
	}
	
	public Product(String pdtName, int pdtPrice, String pdtColor, double pdtSale) {
		this(pdtName, pdtPrice, pdtColor);
//		this.pdtName = pdtName;
//		this.pdtPrice = pdtPrice;
//		this.pdtColor = pdtColor;
		this.pdtSale = pdtSale;
	}
	
	public Product(String pdtName, int pdtPrice, double pdtSale) {
		this(pdtName, pdtPrice);
//		this.pdtName = pdtName;
//		this.pdtPrice = pdtPrice;
		this.pdtSale = pdtSale;
	}
}
