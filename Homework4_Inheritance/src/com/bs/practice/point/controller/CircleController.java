package com.bs.practice.point.controller;

import com.bs.practice.point.model.vo.Circle;
import com.bs.practice.point.model.vo.Rectangle;

public class CircleController {
	private final double PI = 3.14;
	private Circle c = new Circle();
	
	public String calcArea(int x, int y, int radius) {
		c.setX(x);
		c.setY(y);
		c.setRadius(radius);
		return c.toString() + " , 면적: " + (PI*radius*radius);
	}
	
	public String calcCircum(int x, int y, int radius) {
		c.setX(x);
		c.setY(y);
		c.setRadius(radius);
		return c.toString() + " , 둘레: " + (PI*2*radius);
	}
}
