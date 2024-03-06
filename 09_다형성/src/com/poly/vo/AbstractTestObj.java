package com.poly.vo;

//추상클래스는 클래스 선언부에 abstract 예약어를 선언
public abstract class AbstractTestObj {
	private String data;
	private int stock;
	
	public AbstractTestObj() {
		// TODO Auto-generated constructor stub
	}

	public AbstractTestObj(String data, int stock) {
		super();
		this.data = data;
		this.stock = stock;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
	
	@Override
	public String toString() {
		return this.data+" "+this.stock;
	}
}
