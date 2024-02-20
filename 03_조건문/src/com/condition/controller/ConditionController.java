package com.condition.controller;
import java.util.Scanner;

public class ConditionController {
	public void ifTest() {
		//기본 if문 활용하기
		//if(조건식) { 조건식이 true일 때 실행할 로직(명령어) }
		//if문의 {}안에는 변수 선언, 기능 호출, 연산자, 조건문, 반복문 모두 사용 가능
		if(100 > 10) {
			//if(100>10)
			System.out.println("10은 100보다 크다");
		}
		System.out.println("if문 밖에 있는 코드");
		
		//수를 입력받아 200이면 점심시간 출력 아니면 생략
		Scanner sc = new Scanner(System.in);
		System.out.print("수 입력: ");
		int inputNum = sc.nextInt();
		if(inputNum == 200) {
			System.out.println("점심시간");
		}
		
		//입력받은 수가 100~200 사이의 값이면 정상 데이터 입력을 출력하기
		System.out.print("수 입력: ");
		inputNum = sc.nextInt();
		if(100<=inputNum && inputNum<=200) {
			System.out.println(inputNum);
			int su = 300;
			String inputNum2 = "안녕";
			System.out.println(su);
		}
		//System.out.println(su);
		int su;
		//if문에서 선언한 변수는 if문 내부에서만 사용 가능, if문 전에 선언된 변수는 if내부에서 사용이 가능함.
	}
	
	public void checkNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.print("수 입력: ");
		int num = sc.nextInt();
		if(num % 5 == 0) {
			System.out.println("5의 배수입니다.");
		}
	}
	
	public void testName() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 입력: ");
		String name = sc.nextLine();
		if(name.equals("손지연")) {
			System.out.println("코딩 천재!");
		}
	}
	
	public void loginCheck() {
		Scanner sc = new Scanner(System.in);
		System.out.print("id 입력: ");
		String id = sc.nextLine();
		System.out.print("password 입력: ");
		String password = sc.nextLine();
		if(id.equals("admin") && password.equals("7979")) {
			System.out.println("로그인 성공");
		}
	}
	
	public void ifelseTest() {
		//if~else 문 활용하기
		//if(조건식) {true일 때 실행할 로직} else {false일 때 실행할 로직}
		//조건식? true : false 동일
		//특정 수를 입력받아 음수인지 양수인지 판단하는 기능
		Scanner sc = new Scanner(System.in);
		System.out.print("수 입력: ");
		int num = sc.nextInt();
		if(num > 0) {
			System.out.println("양수");
		} else {
			System.out.println("0 또는 음수");
		}
		
		if(num > 0) {
			num += 100;
		} else {
			num -= 100;
		}
		System.out.println(num);
		
		System.out.print("수 입력: ");
		int num2 = sc.nextInt();
		if(num2 % 2 == 0) {
			System.out.println(num2 + "은 짝수");
		} else {
			System.out.println(num2 + "은 홀수");
		}
	}
	
	public void enrollMember() {
		Scanner sc = new Scanner(System.in);
		System.out.println("==== 회원가입 ====");
		System.out.print("만 나이 입력: ");
		int age = sc.nextInt();
		sc.nextLine();
		if(age >= 19) {
			System.out.println("이름을 입력하세요.");
			String name = sc.nextLine();
			System.out.println("성별(M/F)을 입력하세요.");
			char gender = sc.next().charAt(0);
			System.out.println("키를 입력하세요.");
			double height = sc.nextDouble();
			System.out.println("회원 정보: " + name + "님 " + age + "살 " + gender + " " + height + "cm");
		} else {
			System.out.println("회원가입이 불가능합니다.");
		}
	}
	
	public void ifelseifelseTest() {
		//if ~ else if ~ else 구문 활용하기
		//조건이 여러 개일 때 사용하는 조건문
		//계절 확인 기능
		//1,2,12: 겨울
		//3,4,5: 봄
		//6,7,8: 여름
		//9,10,11: 가을
		Scanner sc = new Scanner(System.in);
		System.out.print("계절을 확인할 달: ");
		int month = sc.nextInt();;
		if (month == 1 || month ==2 || month == 12) {
			System.out.println("겨울엔 붕어빵이지!");
		} else if (month >= 3 && month <= 5) {
			System.out.println("봄엔 springframework!");
		} else if (month >= 6 && month <= 8) {
			System.out.println("여름엔 바다여행~");
		} else if (month >= 9 && month <= 11) {
			System.out.println("가을엔 단풍놀이~");
		} else {
			System.out.println("잠롯 입력하셨습니다\n1~12까지만 입력하세요.");
		}
	}
	
	//성적 등급을 출력하는 프로그램
	public void checkGrade() {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요.");
		int score = sc.nextInt();
		if(score <= 100 && score >= 0) {
			if(score >= 90) {
				System.out.println(score + "점은 A등급입니다.");
			} else if(score >=80) {
				System.out.println(score + "점은 B등급입니다.");
			} else if(score >=70) {
				System.out.println(score + "점은 C등급입니다.");
			} else if(score >=60) {
				System.out.println(score + "점은 D등급입니다.");
			} else {
				System.out.println(score + "점은 F등급입니다.");
			}
		} else {
			System.out.println("0이상 100이하 값을 입력하세요.");
		}
	}
	
	public void choiceMenu( ) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1.소주 2.맥주 3.위스키 4.사케 중 원하는 주종 번호를 입력하세요.");
		int num = sc.nextInt();
		if(num == 1) {
			System.out.println("참이슬 후레쉬가 좋아요.");
		} else if(num == 2) {
			System.out.println("크러쉬가 좋아요.");
		} else if(num == 3) {
			System.out.println("발렌타인 21년산 먹어요!");
		} else if(num == 4) {
			System.out.println("간바레 오또상이 맛있어요!");
		} else {
			System.out.println("1~4 사이의 값을 입력하세요.");
		}
	}
	
	public void switchTest() {
		//switch문 이용하기
		//정해진 값에 대해서 분기 처리할 때 사용하는 조건문
		//메뉴 기능을 설정할 때 많이 사용
		//switch(변수, 변수와 연산결과) {}
		//변수나 연산결과는 타입이 int, char, String만 가능
		Scanner sc = new Scanner(System.in);
		System.out.println("=== 점심 메뉴 추천 ===");
		System.out.println("1. 구내 식당");
		System.out.println("2. 초밥");
		System.out.println("3. 국밥");
		System.out.println("4. 중국집");
		System.out.print("번호 입력: ");
		int choice = sc.nextInt();
		switch(choice) {
			case 1: 
					System.out.println("오른쪽 옆건물 지하 윤쉐프"); 
					break;
			case 2: 
					System.out.println("가디역 앞 sk빌딩 2층 초밥집");
					break;
			case 3: 
					System.out.println("왼쪽 옆건물 2층 순대국밥"); 
					break;
			case 4:	
					System.out.println("BYC 지하 쌍용 중국집"); 
					break;
			default: 
					System.out.println("잘못 입력하셨습니다!"); 
					//break;
		}
		
		System.out.print("몇월: ");
		int month = sc.nextInt();
		switch(month) {
			case 1: case 2: case 12:
				System.out.println("겨울"); break;
			case 3: case 4: case 5:
				System.out.println("봄"); break;
			case 6: case 7: case 8:
				System.out.println("여름"); break;
			case 9: case 10: case 11:
				System.out.println("가을"); break;
		}
		
		//switch문의 인자는 int, char, String
		//char형으로 분기하기
	    System.out.println("==== BS 중국집 ====");
	    System.out.println("가. 짜장면");
	    System.out.println("나. 짬뽕");
	    System.out.println("다. 탕수육");
	    System.out.print("입력: ");
	    char chChoice = sc.next().charAt(0);
	    switch(chChoice) {
	    	case '가' : System.out.println("짜장면 선택"); break;
	    	case '나' : System.out.println("짬뽕 선택"); break;
	    	case '다' : System.out.println("탕수육 선택"); break;
	    	default : System.out.println("가~다 중 한개를 입력하세요.");
	    }
	    
	    //String형으로 분기하기
	    System.out.println("==== 문자열 이용하기 ====");
	    System.out.println("당신의 취미는?(운동, 노래, 영화감상): ");
	    String strChoice = sc.next();
	    switch(strChoice) {
	    	case "운동": System.out.println("운동하면 건강해진다."); break;
	    	case "노래": System.out.println("코인노래방?"); break;
	    	case "영화감상": System.out.println("영화관에 갑니다."); break;
	    	default: System.out.println("보기 중의 선택지를 고르세요.");
	    }
	    
//	    double height = 180.5;
//	    switch(height) {
//	    
//	    }
	    
//	    switch(strChoice.charAt(0)) {
//	    
//	    }
	    
	    int num = sc.nextInt();
	    switch(num % 5) {
		    case 0: 
		    case 1: 
		    case 2: 
		    case 3: 
		    case 4: 
	    }
	    
	    System.out.println("==== BS 분식 주문 프로그램 ====");
	    System.out.println("1. 떡볶이(3000)");
	    System.out.println("2. 순대(2500)");
	    System.out.println("3. 튀김(3000)");
	    System.out.println("4. 김밥(4000)");
	    System.out.println("5. 라면(3500)");
	    int number = sc.nextInt();
	    System.out.println("주문 수량을 입력하세요.");
	    int num2 = sc.nextInt();
	    String menu = "";
	    int price = 0;
	    switch(number) {
	    	case 1: menu = "떡볶이"; price = 3000; break;
	    	case 2: menu = "순대"; price = 2500; break;
	    	case 3: menu = "튀김"; price = 3000; break;
	    	case 4: menu = "김밥"; price = 4000; break;
	    	case 5: menu = "라면"; price = 3500; break;
//	    	default: System.out.println("그런 메뉴는 없습니다. 다시 선택하세요."); return;
	    }
	    if(price > 0 && price <=5) {
	    	System.out.println("그런 메뉴는 없습니다. 다시 선택하세요.");
	    } else {
	    	System.out.println("당신은 " + menu + "를 선택하셨습니다. 결제 금액은 " + (price * num2) + "원입니다.");
	    }
	}	
	
	public void signUp(int age) {
		Scanner sc = new Scanner(System.in);
		System.out.println("회원 가입을 진행합니다.");
		System.out.print("이름: ");
//		sc.nextLine(); //버퍼는 메소드 호출시 비워지나? 아니면 애초에 다른 영역에 속하는 건가?
		String name = sc.nextLine();
		System.out.print("주소: ");
		String address = sc.nextLine();
		System.out.print("키: ");
		double height = sc.nextDouble();
		System.out.print("성별(M/F): ");
		char gender = sc.next().charAt(0);
		System.out.println("회원 정보: " + name + "님 " + age + "살 " + gender + " " + height + "cm 주소: " + address);
	}
	
	public void ex_test() {
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력하세요: ");
		int age = sc.nextInt();
		
		if(age <= 19) {
			System.out.println("회원가입이 불가능합니다.");
		} else {
			System.out.println("국적(1. 내국인/2. 외국인)을 입력하세요");
			int isKor = sc.nextInt();
			switch(isKor) {
				case 1: new ConditionController().signUp(age); break;
				case 2:
					System.out.println("외국인 등록번호가 있나요?(T/F)");
					char tf = sc.next().charAt(0);
					switch(tf) {
						case 'F': System.out.println("회원 가입이 불가능합니다."); break;
						case 'T': new ConditionController().signUp(age); break;
						default: System.out.println("잘못된 값을 입력하셨습니다.");
					} break;
				default: System.out.println("잘못 누르셨습니다.");
			}
		}
	}
}