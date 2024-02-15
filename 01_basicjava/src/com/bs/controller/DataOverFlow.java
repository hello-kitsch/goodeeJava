package com.bs.controller;

public class DataOverFlow {
	public static void main(String[] args) {
		//byte bnum = 120;
		int bnum = 120;
		for(int i=0; i<1000; i++) {
			System.out.println(bnum++);
		}
	}
}