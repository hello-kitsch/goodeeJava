package com.printer.run;

import com.print.controller.PrinterController;
import com.printer.common.CannonPrinter;

public class Main {
	public static void main(String[] args) {
//		new PrinterController(new SamsungPrinter()).print();
//		new PrinterController(new LgPrinter()).print();
		new PrinterController(new CannonPrinter()).print();
	}
}
