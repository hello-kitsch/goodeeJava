package com.bs.controller;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		//키보드에 입력한 데이터 가져오기
		//java.util.Scanner 클래스를 이용
		//1. Scanner 클래스 import: import java.util.Scanner
		//2. Scanner 클래스 생성하기: Scanner sc = new Scanner(System.in);
		
		Scanner sc = new Scanner(System.in);
		//3. Scanner 클래스가 제공하는 기능을 이용해 사용자가 입력한 값을 가져옴
		//nextInt() -> 정수형-int-데이터를 가져올때 사용
		//nextDouble() -> 실수형-double-데이터를 가져올때 사용
		//next() -> 문자열-String-데이터를 가져올때 사용 *띄어쓰기가 없는 값
		//nextLine() -> 문자열-String-데이터를 가져올때 사용 *띄어쓰기가 포함된 값
		//nextChar() -> 없음, String에서 뽑아쓰기
		
		System.out.print("창을 클릭하여 당신의 나이를 입력하시오. ");
		int age = sc.nextInt();
		System.out.println(age);
		
		System.out.print("창을 클릭하여 당신의 키를 입력하시오. ");
		double height = sc.nextDouble();
		System.out.println(height);
		
		//nextLine()으로 문자열을 입력받을 때는 위쪽 라인에 nextXXX()이 실행됐는지 확인 후 실행했다면 nextLine()을 실행해서 버퍼 비우기.
		sc.nextLine();
		System.out.print("창을 클릭하여 당신의 이름을 입력하시오. ");
		String name = sc.nextLine();
		System.out.println(name);
		//nextLine()과 그 외의 nextXXX() 메소드의 차이점: \n을 구분인자로 받고 버퍼를 비우느냐, 공백을 구분인자로 받고 버퍼를 남겨두느냐의 차이
		
		//char 데이터 받아오기
		System.out.print("창을 클릭하여 성별(M/F)를 입력하시오. ");
		char gender = sc.next().charAt(0);
		System.out.println(gender);
	
	}

}
