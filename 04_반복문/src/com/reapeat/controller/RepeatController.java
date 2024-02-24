package com.reapeat.controller;

import java.util.Random;
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
	}
	public void forApp3() {
		//숙제1.사용자에게 입력받은 값에 소문자가 있는지 확인+소문자가 몇개있는지 확인
		Scanner sc = new Scanner(System.in);
		System.out.print("입력: ");
		String str = sc.nextLine();
		int count1 = 0;
		for(int i=0; i<str.length(); i++) {
		    char ch = str.charAt(i);
		    if(ch>='a' && ch<='z') {
		        count1++;
		    }
		}
		System.out.println(count1 + " 개");
		
		//숙제2.문자열,문자를 입력받아 문자열에 문자가 있는지 확인+문자가 몇개 있는지 확인
		System.out.print("문자열 입력: ");
		String str2 = sc.nextLine();
		int count2 = 0;
		for(int i=0; i<str2.length(); i++) {
		    char ch = str2.charAt(i);
		    if(ch>='A' && ch<='z') { //if( ((int)ch<=0 && (int)ch<=32) || (int)ch==127 )
		        count2++;
		    }
		}
		System.out.println(count2 + " 개");
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
		
		//메뉴를 출력하는 기능 -> while
		int menu = 0;
		while(menu != 9) {
			System.out.println("==== 점심메뉴 ====");
			System.out.println("1. 구내식당");
			System.out.println("2. 순대국밥");
			System.out.println("3. 감자탕");
			System.out.println("4. 김밥");
			System.out.println("9. 선택 종료");
			System.out.print("선택: ");
			menu = sc.nextInt();
		}
		
		//do~while
		//do{반복할 코드} while(조건식);
		char ch = 'Y';
		while(ch=='N') {
			System.out.println("반복");
		}
		
		do {
			System.out.println("do~while 반복");
		} while (ch == 'N');
	}
	
	public void whileCalculator() {
		Scanner sc = new Scanner(System.in);
		char ch1 = 'Y';
		while(ch1 == 'Y' || ch1 == 'y') {
			System.out.print("피연산자 정수1 입력: ");
			int num1 = sc.nextInt();
			System.out.print("피연산자 정수2 입력: ");
			int num2 = sc.nextInt();
			System.out.print("연산자 입력: ");
			char ch2 = sc.next().charAt(0);
			switch(ch2) {
				case '+': System.out.println(num1 + " + " + num2 + " = " + (num1 + num2)); break;
				case '-': System.out.println(num1 + " - " + num2 + " = " + (num1 - num2)); break;
				case '*': System.out.println(num1 + " * " + num2 + " = " + (num1 * num2)); break;
				case '/': System.out.println(num1 + " / " + num2 + " = " + ((double)num1 / num2)); break;
				default: 
					System.out.println("잘못된 연산자를 입력하셨습니다.");
					ch1 = 'Y';
					continue;
			}
			System.out.println("계속하시겠습니까?(Y/N)");
			ch1 = sc.next().charAt(0);
			if(!(ch1 == 'Y' || ch1 == 'y' || ch1 == 'N' || ch1 == 'n')) {
				System.out.println("잘못된 값을 입력하셨습니다.");
			}
		}
		System.out.println("계산기를 종료합니다!");
	}
	
	public void continueBreakTest() {
		//분기문 활용하기
		//continue: 반복문에서 continue문을 만나면 그 아래 코드를 생략하고 증감식으로 넘어감
		//break: 반복문에서 break문을 만나면 반복문을 종료!
		//분기문은 조건문과 같이 사용을 한다.
		for(int i=0; i<10; i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		for(int i=0; i<10; i++) {
			if(i % 3 == 0) {
				continue;
			}
			System.out.print(i+" ");
		}
		System.out.println();
		
		for(int i=0; i<10; i++) {
			if((i+1)%3 == 0) {
				break;
			}
			System.out.print((i+1) + " ");
		}
		System.out.println();
		
		int count = 0;
		while(true) {
			System.out.println(count++);
			if(count > 9) {
				break;
			}
		}
		
		//중첩 반복문에서 분기문 활용하기 -> break;
		t: //네이밍을 부여해서 break문에 활용
		for(int i=2; i<10; i++) {
			for(int j=1; j<10; j++) {
				System.out.print(i + "X" + j + "=" + i*j + " ");
				if(j==5) {
					break t;
				}
			}
			System.out.println();
		}
	}
	
	//자바에서 랜덤값을 출력하는 방법
	public void randomTest() {
		//임의의 수 출력하는 것
		//1. Math 클래스에서 제공하는 random()기능 이용
		//2. Random 클래스에서 제공하는 nextInt() 기능 이용
		
		//기본적으로 실수로 랜덤 값을 출력(0~1값)
		System.out.println(Math.random());
		//특정 범위의 정수값을 랜덤으로 출력
		//(int)(Math.random() * 정수); -> 0 ~ 정수-1 의 범위 중 랜덤값 출력
		//(int)(Math.random() * 10); -> 0~9 사이의 랜덤값
		for(int i=0; i<5; i++) {
			System.out.println((int)(Math.random() * 10) + 1);
		}
		
		//Random 클래스 이용하기
		Random rnd = new Random();
		//nextInt()
		System.out.println(rnd.nextInt());
		//nextInt(정수) -> 0~정수-1 범위 랜덤값
		//0~9
		for(int i=0; i<10; i++) {
			System.out.println(rnd.nextInt(10));
		}
	}
}
