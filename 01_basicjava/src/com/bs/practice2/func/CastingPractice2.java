package com.bs.practice2.func;

import java.util.Scanner;

public class CastingPractice2 {
	public void scoreCalc() {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어: ");
		double kor = sc.nextDouble();
		System.out.print("영어: ");
		double eng = sc.nextDouble();
		System.out.print("수학: ");
		double math = sc.nextDouble();
		System.out.println("총점: " + (kor + eng + math));
		System.out.println("평균: " + (kor + eng + math) / 3);
	}
}
