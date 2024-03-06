package com.student.view;

import java.util.Arrays;
import java.util.Scanner;

import com.student.model.vo.Person;

public interface MainView {
	public final Scanner sc = new Scanner(System.in);
	
	int mainMenu();
	
	Person inputNewInfo();
	
	Person inputEditInfo();
	
	int searchMetaInfo();
	
	int deleteMetaInfo();
	
	void printObj(Person[] p);
	
	default boolean check() {
		char answer = inputString().charAt(0);
		if(answer == 'y' || answer == 'Y')
			return true;
		else
			return false;
	}
	
	default String inputString() {
		return sc.nextLine();
	}
	
	default int inputInt() {
		int num = sc.nextInt();
		sc.nextLine();
		return num;
	}
	
	default double inputDouble() {
		double num = sc.nextDouble();
		sc.nextLine();
		return num;
	}
	
	default void printEndMsg() {
		System.out.println("프로그램을 종료합니다.");
	}
	
	default void printErrMsg() {
		System.out.println("잘못된 값을 입력했습니다. 다시 입력하세요!");
	}
	
	default void printMsg(String msg) {
		System.out.println(msg);
	}
}
