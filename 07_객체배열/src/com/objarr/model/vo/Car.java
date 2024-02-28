package com.objarr.model.vo;

public class Car {
	private String category;
	private String color;
	private double km;
	private String model;
	
	//ctrl + space + enter
	public Car() {}
	
	//alt + s+r+a+r
	public Car(String category, String color, double km, String model) {
		this.category = category;
		this.color = color;
		this.km = km;
		this.model = model;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getKm() {
		return km;
	}

	public void setKm(double km) {
		this.km = km;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String infoCar() {
		return category + " " + color + " " + km + " " + model;
	}
	
}
