package com.exception.controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class ExceptionController {
	public void uncheckedException() {
		//발생하는 예외에 대해 처리구문을 작성하지 않아도 되는 것.
		//RunTimeException을 부모로 가지는 Exception들..
		//ArithmeticException
		//수학적으로 계산이 불가능할 때 발생하는 예외
		int su = 10;
		int su2 = 0;
//		System.out.println(su/su2);
		
		//ArrayIndexOutOfBoundsException
		//배열에 설정된 인덱스보다 큰 값을 입력했을때
		//-> 인덱스 범위를 벗어나서 접근했을때
		int[] intArr = new int[5];
//		System.out.println(intArr[5]);
		
		//ClassCastException
		//형변환을 잘못했을때 발생하는 예외
		Object o = 10;
//		String a = (String)o;
		
		//NullPointerException
		//null 값을 가지고 있는 변수에 접근 연산자를 사용했을때
		String test = null;
//		test.length();
		
		//NumberFormatException
		//숫자로 변경 시 숫자 형태가 아닐때 발생하는 것
		Integer.parseInt("100원".substring(0, "100원".length()-1));
		
		//InputMissMatchException
		//입력값의 타입이 일치하지 않을 때 발생
		Scanner sc = new Scanner(System.in);
		System.out.print("나이: ");
//		int age = sc.nextInt();
		
		if(test == null)
			throw new IllegalArgumentException();
		System.out.println("안나올걸ㅋㅋ");
	}
	
	public void checkedException() {
		//예외가 발생할 때 반드시 처리해야 하는 것
		//처리구문을 작성하지 않으면 컴파일 에러를 발생시킴.
//		FileInputStream fis = new FileInputStream("test");
//		throw new NullPointerException();
//		throw new IOException();
	}
	
	
	//예외 처리하기
	//1. 직접 예외 처리 구문을 작성해서 처리
	/*
	 * try {
	 * 		예외 발생이 예상되는 구문 || 예외 처리해야하는 구문
	 * } catch(Exception클래스명 변수명) {
	 * 		예외가 발생했을 때 실행할 로직
	 * }
	 */
	//발생 가능성이 있는 예외 처리하기 -> UncheckedException
	public void exceptionHandleTest() {
//		String name = null;
		String name = "test";
		int[] intArr = new int[10];
		try {
			name.length();
			System.out.println(intArr[10]);
			System.out.println("예외 발생 구문 다음 로직");
			System.out.print("나이: ");
		} catch(NullPointerException e) {
			System.out.println("Null값으로 접근하면 안됑");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스 범위초과!");
		} catch(Exception e) {
			System.out.println("난 모든걸 처리해~");
		}
		//Exception 계층구조 (클래스 상속의 다형성과 언뜻보면 비슷하지만 다름. 반대임)
		//부모 Exception, 자식 Exception이 있음.
		//부모 Exception이 자식 Exception을 처리할 수 있음.
		System.out.println("다음 코드");
		
		//try ~ catch
		//try{}, catch{} 안에 선언된 변수는 지역변수로 다른 곳에서 사용이 불가능
		String[] names = null;
		String data = "";
		try {
			names[0] = "유병승";
			data = names[10];
		} catch (NullPointerException | ArrayIndexOutOfBoundsException e) {
			
		}
//		} catch (NullPointerException e) {
//			names = new String[5];
//			names[0] = "유병승";
//		} catch (ArrayIndexOutOfBoundsException e) {
//			data = names[names.length-1];
//		}
		
		//catch문에 있는 예외 클래스 변수로 예외 발생에 대한 정보를 확인할 수 있음
		try {
			String n = null;
			n.length();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			StackTraceElement[] stack = e.getStackTrace();
			for(StackTraceElement s : stack) {
				System.out.println(s);
			}
			e.printStackTrace();
		}
		
		System.out.println(Arrays.toString(names));
		
		//무조건 실행해야하는 구문은 finally에 작성
		try {
			int su = 10, su2 = 0;
			System.out.println(su/su2);
			System.out.println("반드시 실행해야 한다!");
		} catch (Exception e) {
			System.out.println("예외 발생함");
			return;
		} finally {
			//무조건 실행해야 하는 구문을 작성
			//자원을 반납하는 로직!
			System.out.println("반드시 실행해야 한다!");
		}
		try {
			assignException();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	//2. 다른 메소드에 예외 처리를 위임하기 -> checkedException
	//메소드 선언부에 설정 -> throws 위임할예외클래스명[,예외클래스명,예외클래스명,...]
	public void assignException() 
//			throws FileNotFoundException, IOException {
			throws IOException {
		FileInputStream fis
				= new FileInputStream("test.txt");
		int a = fis.read();
	}
}
