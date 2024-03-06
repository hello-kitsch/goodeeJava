package com.printer.common;

public class LgPrinter implements PrinterDriver {
	public void lgPrint()  {
		System.out.println("lg 프린터기 인쇄중...");
	}
	
	@Override
	public void print() {
		lgPrint();
	}
}
