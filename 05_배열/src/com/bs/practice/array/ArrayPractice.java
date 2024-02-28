package com.bs.practice.array;

import java.util.Scanner;

public class ArrayPractice {
	public void practice1() {
		int[] arr = new int[10];
		for(int i=0; i<10; i++) {
			arr[i] = i+1;
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice2() {
		int[] arr = new int [10];
		for(int i=0; i<10; i++) {
			arr[i] = 10-i;
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("양의 정수: ");
		int num = sc.nextInt();
		int[] arr = new int[num];
		for(int i=0; i<num; i++) {
			arr[i] = i+1;
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice4() {
		String[] fruit = {"사과", "귤", "포도", "복숭아", "참외"};
		System.out.println(fruit[1]);
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열: ");
		String str = sc.nextLine();
		System.out.println("문자: ");
		char ch = sc.nextLine().charAt(0);
		int count = 0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == ch) {
				count++;
				
			}
		}
	}
}
