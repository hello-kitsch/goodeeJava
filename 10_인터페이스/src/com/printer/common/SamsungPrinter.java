package com.printer.common;

public class SamsungPrinter implements PrinterDriver {
	public void printSam()  {
		System.out.println("samsung 프린터기 인쇄중...");
	}
	
	@Override
	public void print() {
		printSam();
	}
}