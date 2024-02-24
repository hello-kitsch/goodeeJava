package com.bs.practice.chap01;

import java.util.Scanner;

public class ControlPractice {
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 입력\n2. 수정\n3. 조회\n4. 삭제\n5. 종료");
		System.out.print("메뉴 번호를 입력하세요: ");
		int menu = sc.nextInt();
		switch(menu) {
			case 1: System.out.println("입력 메뉴입니다."); break;
			case 2: System.out.println("수정 메뉴입니다."); break;
			case 3: System.out.println("조회 메뉴입니다."); break;
			case 4: System.out.println("삭제 메뉴입니다."); break;
			case 5: System.out.println("프로그램이 종료됩니다."); break;
			default: System.out.println("잘못된 메뉴 번호입니다.");
		}
	}
	
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 한 개 입력하세요: ");
		int num = sc.nextInt();
		if(num > 0) {
			switch(num % 2) {
				case 0: System.out.println("짝수다"); break;
				case 1: System.out.println("홀수다"); break;
			}
		} else {
			System.out.println("양수만 입력해주세요.");
		} 
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어점수: ");
		int kor = sc.nextInt();
		System.out.print("수학점수: ");
		int math = sc.nextInt();
		System.out.print("영어점수: ");
		int eng = sc.nextInt();
		double mean = (double)(kor + math + eng) / 3;
		if(kor >= 40 && math >= 40 && eng >= 40 && mean >= 60) {
			System.out.println("국어: " + kor);
			System.out.println("수학: " + math);
			System.out.println("영어: " + eng);
			System.out.println("합계: " + (kor + math + eng));
			System.out.println("평균: " + mean);
			System.out.println("축하합니다, 합격입니다!");
		} else {
			System.out.println("불합격입니다.");
		}
	}
	
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("몇월?: ");
		int month = sc.nextInt();
		String season = "";
		switch(month) {
			case 1: case 2: case 12: season = "겨울"; break;
			case 3: case 4: case 5: season = "봄"; break;
			case 6: case 7: case 8: season = "여름"; break;
			case 9: case 10: case 11: season = "가울"; break;
			default: season = "잘못 입력된 달";
		}
		System.out.println(month + "월은 " + season + "입니다.");
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디: ");
		String id = sc.nextLine();
		System.out.print("비밀번호: ");
		String password = sc.nextLine();
		boolean isIdTrue = id.equals("myId");
		boolean isPasswordTrue = password.equals("myPassword12");
		if(isIdTrue && isPasswordTrue) {
			System.out.println("로그인 성공");
		} else if (isIdTrue && !isPasswordTrue) {
			System.out.println("비밀번호가 틀렸습니다.");
		} else if (!isIdTrue && isPasswordTrue) {
			System.out.println("아이디가 틀렸습니다.");
		} else {
			System.out.println("아이디가 틀렸습니다.");
			System.out.println("비밀번호가 틀렸습니다.");
		}
	}
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("권한을 확인하고자 하는 회원 등급: ");
		String id = sc.nextLine();
		String result = "";
		switch(id) {
			case "관리자": result = result + "회원 관리, 게시글 관리, "; 
			case "회원": result = result + "게시글 작성, 댓글 작성, ";
			case "비회원": result = result + "게시글 조회"; break;
			default: result = "잘못된 회원 등급을 입력하셨습니다.";
		}
		System.out.println(result);
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("키(m)를 입력해주세요: ");
		double height = sc.nextDouble();
		System.out.print("몸무게(kg)를 입력해주세요: ");
		double weight = sc.nextDouble();
		double bmi = weight / (height * height);
		System.out.println("BMI 지수: " + bmi);
		if(bmi > 0 && bmi < 18.5) {
			System.out.println("저체중");
		} else if(bmi >= 18.5 && bmi < 23) {
			System.out.println("정상체중");
		} else if(bmi >= 23 && bmi < 25) {
			System.out.println("과체중");
		} else if(bmi >= 25 && bmi < 30) {
			System.out.println("비만");
		} else if(bmi >= 30) {
			System.out.println("고도 비만");
		} else {
			System.out.println("음수를 입력하셨습니다.");
		}
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("피연산자1 입력: ");
		int num1 = sc.nextInt();
		System.out.print("피연산자2 입력: ");
		int num2 = sc.nextInt();
		System.out.print("연산자를 입력(+.-.*,/,%): ");
		String op = sc.next();
		if(num1 > 0 && num2 > 0) {
			switch(op) {
				case "+":
					System.out.println(num1 + " " + op + " " + num2 + " = " + (num1 + num2)); break;
				case "-": 
					System.out.println(num1 + " " + op + " " + num2 + " = " + (num1 - num2)); break;
				case "*": 
					System.out.println(num1 + " " + op + " " + num2 + " = " + (num1 * num2)); break;
				case "/": 
					System.out.println(num1 + " " + op + " " + num2 + " = " + ((double)num1 / num2)); break;
				case "%": 
					System.out.println(num1 + " " + op + " " + num2 + " = " + (num1 % num2)); break;
				default: System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
			}
		} else { return; }
	} 
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		System.out.print("중간고사 점수: ");
		int middle = sc.nextInt();
		System.out.print("기말고사 점수: ");
		int fin = sc.nextInt();
		System.out.print("과제 점수: ");
		int problem = sc.nextInt();
		System.out.print("출석 횟수: ");
		int num = sc.nextInt();
		double result = middle*0.2 + fin*0.3 + problem*0.3 + ((double)num/20)*100*0.2;
		System.out.println("==== 결과 ====");
		if(result < 70  || ((double)num/20) < 0.7) {
			String description = "";
			if(((double)num/20) < 0.7) {
				description = "Fail [출석 횟수 부족 (" + num + "/20)]\n";
			} else if(result < 70) {
				description += "Fail [점수 미달]\n";
			}
			System.out.print("Fail" + description);
		} else {
			System.out.println("중간 고사 점수(20): " + middle*0.2);
			System.out.println("기말 고사 점수(30): " + fin*0.3);
			System.out.println("과제 점수(30): " + problem*0.3);
			System.out.println("출석 점수(20): " + ((double)num/20)*100*0.2);
			System.out.println("총점: " + result);
			System.out.println("Pass");
		}
			
	}
	
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		System.out.println("실행할 기능을 선택하세요.");
		System.out.println("1. 메뉴 출력"); 
		System.out.println("2. 짝수/홀수"); 
		System.out.println("3. 합격/불합격"); 
		System.out.println("4. 계절"); 
		System.out.println("5. 로그인"); 
		System.out.println("6. 권한 확인"); 
		System.out.println("7. BMI"); 
		System.out.println("8. 계산기"); 
		System.out.println("9. P/F"); 
		System.out.println("11. 비밀번호 설정"); 
		int choice = sc.nextInt();
		System.out.println("선택: " + choice);
		switch(choice) {
			case 1: practice1(); break;
			case 2: practice2(); break;
			case 3: practice3(); break;
			case 4: practice4(); break;
			case 5: practice5(); break;
			case 6: practice6(); break;
			case 7: practice7(); break;
			case 8: practice8(); break;
			case 9: practice9(); break;
			case 11: practice11(); break;
		}
	}
	
	public void practice11() {
	    Scanner sc = new Scanner(System.in);
	    String word ="";
	    while(true) {
	        System.out.print("4자리 정수를 입력: ");
	        word = sc.nextLine();
	        if(word.length()>4 || word.length()<4) {
	            System.out.println("자리 수 안맞음");
	            continue;
	        }
	        else {
	    	    int count = 0;
	    	    t:
	    	    for(int i=0; i<4; i++) {
	    	        int num1 = (int)word.charAt(i) - 48;
	    	        for(int j=0; j<4; j++) {
	    	            int num2 = (int)word.charAt(j) - 48;
	    	            if(i != j) {
	    	                if(num1 == num2) {
	    	                    count++;
	    	                    System.out.println("중복값 있음");
	    	                    break t;
	    	                }
	    	            }
	    	        }
	    	    }
	    	    if(count == 0) {
	    	        System.out.println("생성 성공");
	    	        break;
	    	    }
	        }
	        
	    }
	}
}
