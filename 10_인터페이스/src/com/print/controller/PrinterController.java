package com.print.controller;

import com.printer.common.PrinterDriver;

public class PrinterController {
	
//	private SamsungPrinter printer = new SamsungPrinter();
//	private LgPrinter printer = new LgPrinter();
	private PrinterDriver printer;
	
	//기본 생성자를 막아놓아야함. 외부에서 기본생성자를 호출한다면 NPE가 발생.
	public PrinterController(PrinterDriver driver) {
		printer = driver;
	}
	public void print() {
//		printer.printSam();
//		printer.lgPrint();
		printer.print();
	}
}
