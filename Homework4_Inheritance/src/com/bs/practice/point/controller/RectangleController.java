package com.bs.practice.point.controller;

import com.bs.practice.point.model.vo.Circle;
import com.bs.practice.point.model.vo.Rectangle;

public class RectangleController {
	private Rectangle r = new Rectangle();
	
	public String calcArea(int x, int y, int height, int width) {
		r.setX(x);
		r.setY(y);
		r.setHeight(height);
		r.setWidth(width);
		return r.toString() + " , 면적: " + (height*width);
	}
	
	public String calcPerimeter(int x, int y, int height, int width) {
		r.setX(x);
		r.setY(y);
		r.setHeight(height);
		r.setWidth(width);
		return r.toString() + " , 둘레: " + (2*(height+width));
	}
}
