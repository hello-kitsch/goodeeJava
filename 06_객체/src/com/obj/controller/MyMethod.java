package com.obj.controller;

import java.util.Scanner;

public class MyMethod {
	/*
	 * 1. 점심 메뉴 뭐먹지? 출력하는 기능
	 * 2. 1부터 10까지 출력하는 기능
	 * 3. 1부터 사용자가 원하는 수(전달받아서)까지 출력하는 기능
	 * 4. 1부터 5까지 더한 수를 반환하는 기능
	 * 5. 사용자에게 5번 메세지를 입력받고 입력받은 메세지를 반환하는 기능
	 * 6. 숫자 2개, 연산자를 전달받아 계산한 결과를 반환해주는 기능
	 * 7. 문자열을 전달받아 문자열의 중복값 여부를 반환하는 기능
	 */
	public void lunchMenu() {
		System.out.println("점심 메뉴 뭐먹지?");
	}
	
	public void oneToTen() {
		for(int i=1; i<=10; i++)
			System.out.print(i + " ");
		System.out.println();
	}
	
	public void oneToTenCst(int num) {
		for(int i=1; i<=num; i++) {
			System.out.println(i);
		}
	}
	
	public int oneToFiveSum() {
		int sum = 0;
		for(int i=1; i<=5; i++) {
			sum += i;
		}
		return sum;
	}
	
	public String userMsg(Scanner sc) {
		String str = "";
		for(int i=0; i<5; i++) {
			System.out.print("메세지 입력: ");
			str += sc.nextLine() + "\n";
		}
		return str;
	}
	
	public double calc(double a, double b, char op) {
		double result = 0.0;
		switch(op) {
			case '+': result = a+b; break;
			case '-': result = a-b; break;
			case '*': result = a*b; break;
			case '/': result = (double)a/b; break;
//			case '%': result = a%b; break;
		}
		return result;
	}
	
	public boolean overlapping(String str) {
		for(int i=0; i<str.length(); i++) {
			for(int j=i+1; j<str.length(); j++) {
				if(str.charAt(i) == str.charAt(j)) {
					return true;
				}
			}
		}
		return false;
	}
}
