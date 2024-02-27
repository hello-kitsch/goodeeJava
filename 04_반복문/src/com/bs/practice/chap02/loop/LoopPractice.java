package com.bs.practice.chap02.loop;

import java.util.Scanner;

public class LoopPractice {
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1 이상의 숫자를 입력하세요: ");
		int num = sc.nextInt();
		if(num < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}
		for(int i=0; i<num; i++) {
			System.out.print(i+1 + " ");
		}
	}
	
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		boolean ctn = true;
		while(ctn) {
			System.out.print("1 이상의 숫자를 입력하세요: ");
			int num = sc.nextInt();
			if(num < 1) {
				System.out.println("1 이상의 숫자를 입력해주세요.");
				continue;
			} else {
				for(int i=0; i<num; i++) {
					System.out.print(i+1 + " ");
				}
				ctn = false;
			}
		}
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1 이상의 숫자를 입력하세요: ");
		int num = sc.nextInt();
		if(num < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}
		for(int i=num; i>0; i--) {
			System.out.print(i + " ");
		}
	}
	
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		boolean ctn = true;
		while(ctn) {
			System.out.print("1 이상의 숫자를 입력하세요: ");
			int num = sc.nextInt();
			if(num < 1) {
				continue;
			} else {
				for(int i=num; i>0; i--) {
					System.out.print(i + " ");
				}
				ctn = false;
			}
		}
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 하나 입력하세요: ");
		int num = sc.nextInt();
		int sum = 0;
		String str = "";
		for(int i=0; i<num; i++) {
			sum += (i+1);
			if(i+1 == num) str += (i+1);
			else str += (i+1) + " + ";
		}
		System.out.println(str + " = " + sum);
	}
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 숫자: ");
		int num1 = sc.nextInt();
		if(num1 < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요"); return;
		}
		System.out.print("두 번째 숫자: ");
		int num2 = sc.nextInt();
		if(num2 < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요"); return;
		}
		for(; num1<num2; num1++) {
			System.out.print(num1 + " ");
		}
		for(; num1>num2; num2++) {
			System.out.print(num2 + " ");
		}
		if(num1 == num2) System.out.println(num1);
	}

	public void practice7() {
		Scanner sc = new Scanner(System.in);
		int num1=0, num2=0;
		while(true) {
			System.out.print("첫 번째 숫자: ");
			num1 = sc.nextInt();
			System.out.print("두 번째 숫자: ");
			num2 = sc.nextInt();
			if(num1 < 1 || num2 < 1) {
				System.out.println("1 이상의 숫자를 입력해주세요");
			} else {
				break;
			}
		}
		for(; num1<num2; num1++) {
			System.out.print(num1 + " ");
		}
		for(; num1>num2; num2++) {
			System.out.print(num2 + " ");
		}
		if(num1 == num2) System.out.println(num1);
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자: ");
		int dan = sc.nextInt();
		System.out.println("==== " + dan + "단 ====");
		for(int i=0; i<9; i++) {
			System.out.println(dan + " * " + (i+1) + " = " + dan*(i+1));
		}
	}
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자: ");
		int dan = sc.nextInt();
		for(; dan<10; dan++) {
			System.out.println("==== " + dan + "단 ====");
			for(int i=0; i<9; i++) {
				System.out.println(dan + " * " + (i+1) + " = " + dan*(i+1));
			}
		}
	}
	
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		int dan = 0;
		while(true) {
			System.out.println("숫자: ");
			dan = sc.nextInt();
			if(dan > 9) {
				System.out.println("9이하의 숫자만 입력해주세요");
			} else {
				break;
			}
		}
		for(; dan<10; dan++) {
			System.out.println("==== " + dan + "단 ====");
			for(int i=0; i<9; i++) {
				System.out.println(dan + " * " + (i+1) + " = " + dan*(i+1));
			}
		}
	}
	
	public void practice11() {
		Scanner sc = new Scanner(System.in);
		System.out.print("시작 숫자: ");
		int start = sc.nextInt();
		System.out.print("공차: ");
		int d = sc.nextInt();
		for(int i=0; i<10; i++) {
			System.out.print((start + d*i) + " ");
		}
	}
	
	public void practice12() {
		Scanner sc = new Scanner(System.in);
		char op = ' ';
		int num1 = 0;
		int num2 = 0;
		boolean ctn = true;
		while(ctn) {
			System.out.print("연산자(+, -, *, /, %): ");
			String str = sc.nextLine();
			if(str.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				ctn = false;
			} else {
				System.out.print("정수1: ");
				num1 = sc.nextInt();
				System.out.print("정수2: ");
				num2 = sc.nextInt();
				sc.nextLine();
				op = str.charAt(0);
				
				if(str.charAt(0)=='/' && num2 == 0) {
					System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
					continue;
				} else if(op != '+' && 
							op != '-' &&
							op != '*' &&
							op != '/' &&
							op != '%') {
					System.out.println("없는 연산자입니다. 다시 입력해주세요."); continue;
				} else {
					switch(op) {
						case '+': System.out.println(num1 + " + " + num2 + " = " + (num1+num2)); break;
						case '-': System.out.println(num1 + " - " + num2 + " = " + (num1-num2)); break;
						case '*': System.out.println(num1 + " * " + num2 + " = " + (num1*num2)); break;
						case '/': System.out.println(num1 + " / " + num2 + " = " + ((double)num1/num2)); break;
						case '%': System.out.println(num1 + " % " + num2 + " = " + (num1%num2)); break;
					}
				}
			}
		}
	}
	
	public void practice13() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력: ");
		int num = sc.nextInt();
		for(int i=1; i<=num; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void practice14() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력: ");
		int num = sc.nextInt();
		for(int i=num; i>0; i--) {
			for(int j=i; j>0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void practice15() {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		System.out.print("숫자: ");
		int num = sc.nextInt();
		if(num < 2) System.out.println("잘못 입력하셨습니다");
		else {
			for(int i=2; i<num; i++) {
				if(num % i == 0) {
					count++;
				}
			}
			if(count == 0) System.out.println("소수입니다.");
			else System.out.println("소수가 아닙니다.");
		}
	}
	
	public void practice16() {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		while(true) {
			System.out.print("숫자: ");
			int num = sc.nextInt();
			if(num < 2) {
				System.out.println("잘못 입력하셨습니다");
				continue;
			}
			else {
				for(int i=2; i<num; i++) {
					if(num % i == 0) {
						count++;
					}
				}
				if(count == 0) { System.out.println("소수입니다."); break; }
				else { System.out.println("소수가 아닙니다."); break; }
			}
		}
	}
	
	public void practice17() {
		Scanner sc = new Scanner(System.in);
		boolean iscon = true;
		while(iscon) {

			System.out.print("숫자: ");
			int num = sc.nextInt();
			if(num < 2) System.out.println("잘못 입력하셨습니다");
			int count = 0;
			
			t:
			for(int i=2; i<=num; i++) { //i=4
				for(int j=2; j<=i ; j++) { //j=2
					if(i != j && i % j == 0) { 
						continue t;
					} else {
						continue;
					}
				}
				System.out.print(i + " ");
				count++;
			}
			
			System.out.println();
			System.out.println(count + "개");
			System.out.println("그만하시려면 N을 누르세요");
			char ch = sc.next().charAt(0);
			if(ch == 'n' || ch == 'N') iscon = false;
		}
	}
	
	public void practice18() {
		Scanner sc = new Scanner(System.in);
		System.out.println("자연수 하나를 입력하세요: ");
		int num = sc.nextInt();
		int count2 = 0;
		for(int i=1; i<=num; i++) {
			int count1 = 0;
			if(i % 2 == 0) {
				count1 ++;
			}
			if(i % 3 == 0) {
				count1 ++;
			}
			if((i % 2 == 0) && (i % 3 == 0)) {
				count1 --;
				count2 ++;
			}
			if(count1 == 1) {
				System.out.print(i+ " ");
			}
		}
		System.out.println();
		System.out.println("count: " + count2);
	}
	
	public void practice19() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력: ");
		int num = sc.nextInt();
		for(int i=1; i<=num; i++) {
			for(int j=num-i; j>0; j--) {
				System.out.print(" ");
			}
			for(int k=i; k>0; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void practice20() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력: ");
		int n = sc.nextInt();
		for(int i=1; i<=2*n-1; i++) {
			int num = (i<=n) ? i : 2*n-i; //i>n 일때 k번 돌릴 반복문의 횟수를 정하는 수식을 구하는게 왜 어려웠을까.
			for(int k=0; k<num; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void practice21() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력: ");
		int n = sc.nextInt();
		for(int i=1; i<=n; i++) {
			for(int k=0; k<n-i; k++)
				System.out.print(" ");
			for(int j=0; j<2*-1; j++) 
				System.out.print("*");
			for(int l=0; l<n-i; l++)
				System.out.print(" ");
			System.out.println();
		}
	}
	
	public void practice22() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력: ");
		int n = sc.nextInt();
		for(int i=0; i<n; i++) {
			if(i==0 || i==n-1) {
				for(int j=0; j<n; j++)
					System.out.print("*");
			} else {
				System.out.print("*");
				for(int l=0; l<n-2; l++)
					System.out.print(" ");
				System.out.print("*");
			}
			System.out.println();
		}
	}
}