package com.bs.practice1.func;
import java.util.Scanner;

public class VariablePractice4 {
	public void engStrPrint() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력하세요: ");
		String eng = sc.nextLine();
		System.out.println("첫 번째 문자: " + eng.charAt(0));
		System.out.println("두 번째 문자: " + eng.charAt(1));
		System.out.println("세 번째 문자: " + eng.charAt(2));
	}
}