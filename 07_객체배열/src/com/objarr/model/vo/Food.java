package com.objarr.model.vo;

public class Food {
	private String name;
	private int price;
	private String type;
	private double calorie;
	
	public Food() {}
	
	public Food(String name, int price, String type, double calorie) {
		this.name = name;
		this.price = price;
		this.type = type;
		this.calorie = calorie;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getCalorie() {
		return calorie;
	}

	public void setCalorie(double calorie) {
		this.calorie = calorie;
	}
	
	//alt+s+r+a+r -> setter, getter를 자동으로 생성해줌.
	
	
}
