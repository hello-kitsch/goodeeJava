package com.reapeat.controller;

import java.util.HashMap;
import java.util.Scanner;

public class RepeatController {
	public void basicRepeat() {
		//기본 for문 활용하기
		//특정 코드를 원하는 횟수만큼 반복 실행하게 하는 명령어
		//for(초기식; 조건식; 증감식) { 반복할 코드 }
		//초기식: 변수 선언, 반복 횟수에 대한 정보를 저장하는 저장소
		//조건식: for문의 코드를 실행할 지 결정하는 조건, true면 실행, false면 실행안함 - 일반적으로 초기식에 선언된 변수를 가지고 구성
		//증감식: 초기식에 선언한 변수의 값을 수정하는 연산 -> 조건식의 결과를 변경
		
		//안녕하세요를 10번 출력하기
		for(int i = 0; i < 10; ++i) {
			System.out.println("안녕하세요");
		}
		
		for(int i = 1; i <= 5; ++i) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		String test = "";
		//for문의 {}내부에는 변수 선언, 연산자, 조건문, 기능호출 등 모두 선언이 가능.
		for(int i = 1; i <= 5; i++) {
			int temp = 100 * i;
			temp ++;
			test += temp;
			if(temp > 400) { 
				System.out.println(temp + " " + i);
			}
		}

		for(int i = 0; i < 100; i++) {
			//System.out.print((i+1) + " ");
			if((i+1)%2 ==0) {
				System.out.print((i+1) + " ");
			}
		}

		System.out.println();

		for(int i = 2; i <= 100; i += 2) {
			System.out.print(i + " ");
		}
		
		System.out.println();

		for(int i = 100; i >= 1; i--) {
			System.out.print(i + " ");
		}
		
		//for문 사용시 초기식, 조건식, 증감식을 반드시 써야하나?
//		for(;;) {
//			System.out.println("우왓!");
//		}
//		
//		Scanner sc = new Scanner(System.in);
//		for(; !test.equals("end");) {
//			System.out.println(test);
//			test = sc.next();
//		}
//		System.out.println("이건 언제 실행할래??");
	}
	
	public void inputStudent() {
		Scanner sc = new Scanner(System.in);
		String str = "";
		for(int i = 0; i < 5; i++) {
			System.out.println((i+1) + "번째 반 친구 이름: ");
			String name = sc.nextLine();
			str += name + " ";
			System.out.println((i+1) + "번째 반 친구 이름은 " + name + "입니다.");
		}
		System.out.println(str);
	}

	public void sumNumber() {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		for(int i = 1; i<=5; i++) { 
			System.out.print("숫자를 입력하시오: ");
			sum += sc.nextInt();
		}
		System.out.println(sum);
	}
	
	public void inputMsg() {
		String msg = "", str = "";
		Scanner sc = new Scanner(System.in);
		for(; !str.equals("exit");) {
			System.out.print("메세지 입력: ");
			str = sc.nextLine();
			if(!str.equals("exit")) { msg += str; }
		}
		System.out.println(msg);
	}
	
	public void inputMsg2() {
		String str = "", msg = "";
		Scanner sc = new Scanner(System.in);
		for(msg = ""; !str.equals("exit"); msg += str + " ") {
			System.out.print("메세지 입력: ");
			str = sc.nextLine();
		}
		System.out.println(msg);
	}
	
//	public void inputMsg3() {
//		String str = "", msg = "";
//		Scanner sc = new Scanner(System.in);
//		System.out.print("메세지 입력: ");
//		for(str = sc.nextLine(); !str.equals("exit"); msg += str + " ") {
//			System.out.print("메세지 입력: ");
//		}
//		System.out.println(msg);
//	}
	
	public void forApp() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 하나 입력: ");
		int num = sc.nextInt();
		for(int i = 1; i <= num; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	public void empInputData() {
		Scanner sc = new Scanner(System.in);
		String str = "";
		System.out.print("==== 사원 정보 입력 ===\n사원 수: ");
		int num = sc.nextInt();
		for(int i = 1; i <= num; i++) {
			sc.nextLine();
			System.out.println(i + "번째 사원 입력");
			System.out.print("이름: ");
			String name = sc.nextLine();
			str += name + " ";
			for(int age = 0; age<=18; ) {
				System.out.print("나이: ");
				age = sc.nextInt();
				if(age > 18) { str += age + " "; }
				if(age < 19) { System.out.println("나이제한"); }
			}
			System.out.print("성별(남/여): ");
			char gender = sc.next().charAt(0);
			str += gender + " ";
			System.out.print("급여: ");
			int salary = sc.nextInt();
			str += salary + " ";
			System.out.print("보너스(실수): ");
			Double bonus = sc.nextDouble();
			str += bonus + "\n";
		}
		System.out.println(str);
	}
	
	//for문 응용하기 -> 활용2
	public void forApp2() {
		//숫자에 규칙이 있는 경우 for문을 활용해서 기능 구현 가능
		//String name = "유병승";
		//name.charAt(0); -> 유
		//name.charAt(0); -> 유
		//name.charAt(0); -> 유
		String name = "유병승";
		for(int i=0; i<3; i++) {
			//System.out.println(i);
			char ch = name.charAt(i);
			System.out.println(ch);
		}
		
		String test = "abCDef";
		int count = 0;
		for(int i=0; i<test.length(); ++i) {
			char ch = test.charAt(i);
			if(ch>='A' && ch<='Z') {
				count++;
			}
		} 
		if(count > 0) {
			System.out.println("대문자가 " + count + "개 있다");	
		} else { 
			System.out.println("대문자가 없다");
		}
		
		Scanner sc = new Scanner(System.in);
		String test2 = sc.next();
		String result = "";
		for(int i=0; i<test2.length(); i++) {
			char ch = test2.charAt(i);
			System.out.println(ch);
		}
		
		//숙제1.사용자에게 입력받은 값에 소문자가 있는지 확인+소문자가 몇개있는지 확인
		//숙제2.문자열,문자를 입력받아 문자열에 문자가 있는지 확인+문자가 몇개 있는지 확인

	}
	
	public void forInFor() {
		//중첩 반복문 활용하기
		//for문 안에 for문을 작성하는 로직
		//구구단 출력하기
		for(int i=2; i<10; i++) {
			System.out.println("====" + i + "단 =====");
			for(int j=1; j<10; j++) {
				System.out.println(i+"X"+j+"="+i*j);
			}
		}
		
		//문자열에 중복 문자가 있는지 확인하는 로직
		String test = "apple";
		for(int i=0; i<test.length(); i++) {
			char target = test.charAt(i);
			System.out.println(target);
			for(int j=0; j<test.length(); j++) {
				char compare = test.charAt(j);
				if(i!=j && target == compare) {
					System.out.println(compare + " 중복");
				}
			}
		}
		
		//각 문자별 중복값의 갯수를 출력하기
		String test2 = "apple";
		for(int i=0; i<test2.length(); i++) {
			char target = test2.charAt(i);
			int count = 0;
			for(int j=0; j<test2.length(); j++) {
				char compare = test2.charAt(j);
				if(i!=j && target == compare) {
					//System.out.println(compare + " 중복");
					count++;
				}
			}
			System.out.println(target + "는 중복값 " + count + "개");
		}
		
		//별찍기!
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//*
		//**
		//***
		//****
		//*****
		//****
		//***
		//**
		//*
		
		//    *
		//   **
		//  ***
		// ****
		//*****
		for(int i=0; i<5; i++) {
			for(int j=5; j<5-i; j++) {
				System.out.print(" ");
			}
			System.out.print(false);
		}
	}
	
	public void whileTest() {
		//while문 활용하기
		//반복문을 구현하는 방법 중 하나.
		//while(조건문) { 반복실행할 코드}
		//특정 조건에서 반복을 중지하는 로직에서 많이 사용
		//의도적인 무한 루프를 발생시킬 때 사용
		
		//1~10까지 출력
		for(int i=0; i<10; i++) {
			System.out.print( (i+1) + " ");
		}
		
		int j = 0;
		while(j < 10) {
			System.out.print(j+1 + " ");
			j++;
		}
		
		//사용자가 끝이라고 입력할때까지 입력받는 기능
		Scanner sc = new Scanner(System.in);
		String inputData = "", totalInput = "";
		while(!inputData.equals("끝")) {
			System.out.println("메세지: ");
			inputData = sc.nextLine();
			System.out.println(inputData);
		}
		System.out.println(totalInput);

		//사용자가 지정한 범위의 값을 입력할 때까지 재입력
		System.out.println("종료할 범위의 시작값: ");
		int input1 = sc.nextInt();
		System.out.println("종료할 범위의 끝값: ");
		int input2 = sc.nextInt();
		int inputData2 = 0;
		while(!((inputData2 >= input1) && (inputData2 <= input2))) {
			System.out.println("지정한 범위의 값을 입력하시오. ");
			inputData2 = sc.nextInt();
			System.out.println(inputData2);
		}
		
		//사용자가 3의 배수를 입력할 때까지 숫자를 입력받는 로직
		int num = 1;
		while(num % 3 != 0) {
			System.out.println("3의 배수를 입력: ");
			num = sc.nextInt();
		}
		
		//
		int menu = 0;
		while(menu != 9) {
			
		}
	}
	
	public void bananaTest1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열 하나 입력");
		String test = sc.next();
		
		int count = 0;
		char[] store = new char[test.length()];
		
		for(int i=0; i<test.length(); i++) {
			char ch = test.charAt(i);
			
			for(int j=0; j<test.length(); j++) {
				char target = test.charAt(j);
				if(i != j && ch == target) {
					
					for(int k=0; k<store.length; k++) {
						if(ch == store[k]) {
							continue;
						} else if(!(store[i] == ' ')) {
							count++;
							store[k] = ch;
							break;
						}
					}
					
				}
				
			}
			
		}
		System.out.println("중복된 문자 수: " + count);
		for(int i=0; i<store.length; i++) {
			if(!(store[i] == ' ')) { System.out.println("중복된 문자: " + store[i]); }
		}
	}
	
	public void bananaTest2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열 하나 입력");
		String word = sc.next();
		
		int count;
        HashMap<Character, Integer> dual = new HashMap<>();

        for(int i=0; i<word.length(); i++) {
            char ch = word.charAt(i);
            if(!dual.containsKey(ch)) {
                dual.put(ch, 0);
            }
            dual.put(ch, dual.get(ch)+1);
        }
        
        //Set<Character> kSet = dual.keySet(); 
        for(char c : dual.keySet()) {
            if(dual.get(c) > 1) {
                System.out.println("중복 문자: " + c);
                System.out.println("중복 개수: " + dual.get(c));
            }
        }
	}
}
