package com.printer.common;

public class CannonPrinter implements PrinterDriver {
	
	@Override
	public void print() {
		System.out.println("캐논 프린터기 인쇄중...");
	}
}
