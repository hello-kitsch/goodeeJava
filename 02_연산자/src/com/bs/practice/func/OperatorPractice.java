package com.bs.practice.func;

import java.util.Scanner;

public class OperatorPractice {
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수: ");
		int num = sc.nextInt();
		System.out.println("" + (num >= 0 ? "양수다" : "양수가 아니다"));
	}
	public void practice2() {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("정수: ");
	    int num = sc.nextInt();
	    String result2 = "";
	    String result1 = num > 0 ? "양수다" : result2;
	    result1 += num < 0 ? "음수다" : "0이다";
	    System.out.println(result1);
	} 
	
//	public void practice2() {
//	    Scanner sc = new Scanner(System.in);
//	    System.out.print("정수: ");
//	    int num = sc.nextInt();
//	    String result = "";
//	    result = (num > 0 ? "양수다" : (num < 0 ? "음수다" : "0이다"));
//	    System.out.println(result);
//	} 

	public void practice3() {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("정수: ");
	    int num = sc.nextInt();
	    System.out.println((num % 2 == 0) ? "짝수다" : "홀수다");
	}

	public void practice4() {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("인원 수: ");
	    int num1 = sc.nextInt();
	    System.out.print("사탕 개수: ");
	    int num2 = sc.nextInt();
	    System.out.println("1인당 사탕 개수: " + (num2 / num1));
	    System.out.println("남는 사탕 개수: " + (num2 % num1));
	}

	public void practice5() {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("이름: ");
	    String name = sc.nextLine();
	    System.out.print("학년(숫자만): ");
	    int grade = sc.nextInt();
	    System.out.print("반(숫자만): ");
	    int num1 = sc.nextInt();
	    System.out.print("번호(숫자만): ");
	    int num2 = sc.nextInt();
	    System.out.print("성별(M/F): ");
	    char gender = sc.next().charAt(0);
	    String other = "";
	    String gender2 = (gender == 'M') ? "남학생" : other;
	    other = (gender == 'F') ? "여학생" : "제3의 성별";
	    System.out.print("성적(소수점 아래 둘째자리까지): ");
	    double number = sc.nextDouble();
	    System.out.println(grade + "학년 " + num1 + "반 " + num2 + "번 " + name + " "+ gender2 + "의 성적은 " + number + "이다."); 
	}

	public void practice6() {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("나이: ");
	    int age = sc.nextInt();
	    String other = "";
	    String result = (age <= 13) ? "어린이" : other;
	    other = (age <= 19) ? "청소년" : "성인";
	    System.out.println(result);
	}

	public void practice7() {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("국어: ");
	    int kor = sc.nextInt();
	    System.out.print("영어: ");
	    int eng = sc.nextInt();
	    System.out.print("수학: ");
	    int math = sc.nextInt();
	    double mean = (kor+eng+math) / (double)3;
	    String result = (kor >= 40 && eng >= 40 && math >= 40 && mean >= 60) ? "합격" : "불합격";
	    System.out.println("합계: " + (kor+eng+math));
	    System.out.println("평균: " + mean);
	    System.out.println(result);
	}

	public void practice8() {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("주민번호를 입력하세요(-포함): ");
	    String num = sc.nextLine();
	    String result = (num.charAt(7) == '1' || num.charAt(7) == '3') ? "남자" : "여자";
	    System.out.println(result);
	}
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
	    System.out.print("정수1: ");
	    int num1 = sc.nextInt();
	    System.out.print("정수2: ");
	    int num2 = sc.nextInt();
	    System.out.print("입력: ");
	    int num3 = sc.nextInt();
	    boolean result = num3 <= num1 || num3 > num2;
	    System.out.println(result);
	}
	
	public void practice10() {
		Scanner sc = new Scanner(System.in);
	    System.out.print("입력1 : ");
	    int num1 = sc.nextInt();
	    System.out.print("입력2 : ");
	    int num2 = sc.nextInt();
	    System.out.print("입력3 : ");
	    int num3 = sc.nextInt();
	    System.out.println(num1 == num2 && num1 == num3 && num2 == num3);
	}
	
	public void practice11() {
		Scanner sc = new Scanner(System.in);
	    System.out.print("A사원의 연봉: ");
	    int num1 = sc.nextInt();
	    double numInc1 = num1 * (1 + 0.4);
	    String resultA = numInc1 >= 3000 ? "3000 이상" : "3000 미만";
	    System.out.print("B사원의 연봉: ");
	    int num2 = sc.nextInt();
	    double numInc2 = num2 * 1;
	    String resultB = numInc2 >= 3000 ? "3000 이상" : "3000 미만";
	    System.out.print("C사원의 연봉: ");
	    int num3 = sc.nextInt();
	    double numInc3 = num3 * (1 + 0.15);
	    String resultC = numInc3 >= 3000 ? "3000 이상" : "3000 미만";
	    System.out.println("A사원 연봉/연봉+@: " + num1 + "/" + numInc1);
	    System.out.println(resultA);
	    System.out.println("B사원 연봉/연봉+@: " + num2 + "/" + numInc2);
	    System.out.println(resultB);
	    System.out.println("C사원 연봉/연봉+@: " + num3 + "/" + numInc3);
	    System.out.println(resultC);
	}
}
