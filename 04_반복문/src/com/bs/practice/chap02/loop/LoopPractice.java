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
	
	public void practice_17() {
        Scanner sc= new Scanner(System.in);
        System.out.println("수를 입력하시오");
        int num = sc.nextInt();
        for(int i=1; i<=num; i++){  // 1부터 n까지;
           int count =1;         // 약수 초기화;
           for(int j=1; j<i; j++) {  // 예시 2이면 
              if((i%j)== 0) {
                 count++;
                 if(count>2) {
                    break;
                 }
              }
           }
         if(count==2) {
            System.out.println(i);
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
	
}