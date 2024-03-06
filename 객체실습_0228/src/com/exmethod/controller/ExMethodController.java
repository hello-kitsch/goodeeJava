package com.exmethod.controller;

public class ExMethodController {
	public void printMsg(String msg) {
		System.out.println(msg);
	}
	
	public int sumOnetoHundred() {
		int sum = 0;
		for(int i=1; i<=100; i++)
			sum += i;
		return sum;
	}
	
	public String oddOrEven(int num) {
		return (num%2==0) ? "작수" : "홀수";
	}
	
	public boolean checkEngChar(String str) {
		int count = 0;
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(ch > 'A' && ch < 'z')
				count++;
		}
		if(count > 0)
			return true;
		else
			return false;
	}
	
	public void checkStrWithChar(String str, char ch) {
		int count = 0;
		for(int i=0; i<str.length(); i++) {
			if(ch == str.charAt(i)) {
				count++;
			}
		}
		System.out.println(count);
	}
	
	public void gugudanCustom(int num) {
		for(int i=1; i<=9; i++)
			System.out.println(num+"*"+i+"="+(num*i));
	}
}
