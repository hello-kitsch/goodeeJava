package com.poly.vo;

public class PolyChild extends PolyParent{
	private double avg;
	private char alpha;
	
	public PolyChild() {
		// TODO Auto-generated constructor stub
	}

	PolyChild(double avg, char alpha) {
		super();
		this.avg = avg;
		this.alpha = alpha;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public char getAlpha() {
		return alpha;
	}

	public void setAlpha(char alpha) {
		this.alpha = alpha;
	}

}
