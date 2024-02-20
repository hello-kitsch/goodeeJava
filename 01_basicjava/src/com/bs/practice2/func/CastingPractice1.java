package com.bs.practice2.func;

import java.util.Scanner;

public class CastingPractice1 {
	public void printUnicode() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자 하나를 입력하세요: ");
		char ch = sc.next().charAt(0);
		System.out.println("A unicode: " + (int)ch);
	}
}
