package com.myobj.run;

import java.util.Scanner;

import com.myobj.vo.Board;
import com.myobj.vo.Employee;
import com.myobj.vo.Member;

public class Main_{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Member community = new Member();
		Board communityBoard = new Board();
		Employee company = new Employee();
		
		new Main_().MemberMethod(community);
		new Main_().BoardMethod(communityBoard);
		new Main_().EmployeeMethod(company);
	}
	
	public void MemberMethod(Member community) {
		Scanner sc = new Scanner(System.in);
		System.out.println("커뮤니티 사이트의 회원 수");
		int communityNumber = sc.nextInt();
		sc.nextLine();
		community.id = new String[communityNumber];
		community.password = new String[communityNumber];
		community.email = new String[communityNumber];
		community.age = new int[communityNumber];
		community.hobby = new String[communityNumber];
		
		System.out.println("커뮤니티 사이트의 회원 정보 입력");
		for(int i=0; i<communityNumber; i++) {
			System.out.println(i+1 + "번째 id 입력");
			community.id[i] = sc.nextLine();
			System.out.println(i+1 + "번째 PassWord 입력");
			community.password[i] = sc.nextLine();
			System.out.println(i+1 + "번째 email 입력");
			community.email[i] = sc.nextLine();
			System.out.println(i+1 + "번째 age 입력");
			community.age[i] = sc.nextInt();
			sc.nextLine();
			System.out.println(i+1 + "번째 hobby 입력");
			community.hobby[i] = sc.nextLine();
		}
		
		System.out.println("커뮤니티 사이트의 회원 정보 출력");
		for(int i=0; i<communityNumber; i++) {
			System.out.print(community.id[i] + " ");
			System.out.print(community.password[i] + " ");
			System.out.print(community.email[i] + " ");
			System.out.print(community.age[i] + " ");
			System.out.print(community.hobby[i] + " ");
			System.out.println();
		}
	}
	
	
	public void BoardMethod(Board communityBoard) {
		Scanner sc = new Scanner(System.in);
		System.out.println("게시판 글 수");
		int boardNumber = sc.nextInt();
		sc.nextLine();
		communityBoard.headline = new String[boardNumber];
		communityBoard.writer = new String[boardNumber];
		communityBoard.contents = new String[boardNumber];
		communityBoard.date = new String[boardNumber];
		
		System.out.println("게시판 정보 입력");
		for(int i=0; i<boardNumber; i++) {
			System.out.println(i+1 + "번째 글 제목 입력");
			communityBoard.headline[i] =  sc.nextLine();
			System.out.println(i+1 + "번째 글 작성자 입력");
			communityBoard.writer[i] = sc.nextLine();
			System.out.println(i+1 + "번째 글 내용 입력");
			communityBoard.contents[i] = sc.nextLine();
			System.out.println(i+1 + "번째 글 작성날짜 입력");
			communityBoard.date[i] = sc.nextLine();
		}
		
		System.out.println("게시판 정보 출력");
		for(int i=0; i<boardNumber; i++) {
			System.out.print(communityBoard.headline[i] + " ");
			System.out.print(communityBoard.writer[i] + " ");
			System.out.print(communityBoard.contents[i] + " ");
			System.out.print(communityBoard.date[i] + " ");
			System.out.println();
		}
	}
	
	public void EmployeeMethod(Employee company) {
		Scanner sc = new Scanner(System.in);
		System.out.println("사원 수");
		int employeeNumber = sc.nextInt();
		sc.nextLine();
		company.name = new String[employeeNumber];
		company.departments = new String[employeeNumber];
		company.salary = new int[employeeNumber];
		company.phoneNum = new String[employeeNumber];
		company.incentive = new double[employeeNumber];
		
		System.out.println("사원 정보 입력");
		for(int i=0; i<employeeNumber; i++) {
			System.out.println(i+1 + "번째 사원 이름 입력");
			company.name[i] = sc.nextLine();
			System.out.println(i+1 + "번째 부서 입력");
			company.departments[i] =sc.nextLine();
			System.out.println(i+1 + "번째 salary 입력");
			company.salary[i] = sc.nextInt();
			System.out.println(i+1 + "번째 전화번호 입력");
			sc.nextLine();
			company.phoneNum[i] = sc.nextLine();
			System.out.println(i+1 + "번째 인센티브 입력");
			company.incentive[i] = sc.nextDouble();
			sc.nextLine();
		}
		
		System.out.println("사원 정보 츨력");
		for(int i=0; i<employeeNumber; i++) {
			System.out.print(company.name[i] + " ");
			System.out.print(company.departments[i] + " ");
			System.out.print(company.salary[i] + " ");
			System.out.print(company.phoneNum[i] + " ");
			System.out.print(company.incentive[i] + " ");
			System.out.println();
		}
	}
}
