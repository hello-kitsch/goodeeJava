package com.bs.practice.dimension;

import java.util.Random;
import java.util.Scanner;

public class DimensionPractice {
	public void practice1() {
		String[][] arr = new String[3][3];
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++)
				arr[i][j] = "(" + i +", " + j + ")";
		}
		for(String[] ar: arr) {
			for(String s : ar) {
				System.out.print(s);
			}
			System.out.println();
		}
	}
	
	public void practice2() {
		int[][] arr = new int[4][4];
		int count = 1;
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				arr[i][j] = count++;
			}
		}
		for(int[] ar : arr) {
			for(int a : ar)
				System.out.printf("%3d", a);
			System.out.println();
		}
	}
	
	public void practice3() {
		int[][] arr = new int[4][4];
		int count = 16;
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				arr[i][j] = count--;
			}
		}
		for(int[] ar : arr) {
			for(int a : ar)
				System.out.printf("%3d", a);
			System.out.println();
		}
	}
	
	public void practice4() {
		Random rnd = new Random();
		int[][] arr = new int[4][4];
		int sum2 = 0;
		//0 ~ n-1 행까지
		for(int i=0; i<arr.length-1; i++) {
			int sum1 = 0;
			//0 ~ n-1 열까지
			for(int j=0; j<arr[i].length-1; j++) {
				arr[i][j] = rnd.nextInt(10) + 1;
				sum1 += arr[i][j];
			}
			arr[i][arr[i].length-1] = sum1;
			sum2 += sum1;
		}
		//n행
		int sum4 = 0;
		for(int i=0; i<arr[arr.length-1].length-1; i++) {
			int sum3 = 0;
			for(int j=0; j<arr[arr.length-1].length; j++) {
				sum3 += arr[j][i];
			}
			arr[arr.length-1][i] = sum3;
			sum4 += sum3;
		}
		arr[arr.length-1][arr[arr.length-1].length-1] = sum2 + sum4;
		
		//출력
		for(int[] ar : arr) {
			for(int a : ar)
				System.out.printf("%3d", a);
			System.out.println();
		}
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		int row, column = 0;
		while(true) {
			System.out.print("행 크기: ");
			row = sc.nextInt();
			System.out.print("열 크기: ");
			column = sc.nextInt();
			if(row < 1 || row > 10 || column < 1 || column > 10) {
				System.out.println("반드시 1~10 사이의 정수를 입력해야합니다.");
			} else {
				break;
			}
		}
		char[][] arr = new char[row][column];
		Random rnd = new Random();
		for(int i=0; i<row; i++) {
			for(int j=0; j<column; j++) {
				arr[i][j] = (char) (rnd.nextInt((int)'Z'-(int)'A'+1) + (int)'A');
			}
		}
		for(char[] ch : arr) {
			for(char c : ch) 
				System.out.print(c + " ");
			System.out.println();
		}
	}
	
	public void practice6() {
		String[][] strArr = new String[][] {
			{"이", "까", "왔", "앞", "힘"}, 
			{"차", "지", "습", "으", "냅"}, 
			{"원", "열", "니", "로", "시"}, 
			{"배", "심", "다", "좀", "다"}, 
			{"열", "히", "! ", "더", "!! "}};
		for(int i=0; i<strArr[strArr.length-1].length; i++) {
			for(int j=0; j<strArr.length; j++) {
				System.out.print(strArr[j][i]+ " ");
			}
			System.out.println();
		}
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("행의 크기: ");
		int num = sc.nextInt();
		char[][] strArr = new char[num][];
		for(int i=0; i<num; i++) {
			System.out.print(i + "행의 열 크기: ");
			strArr[i] = new char[sc.nextInt()];
		}
		int start = (int)'a';
		for(int i=0; i<strArr.length; i++) {
			for(int j=0; j<strArr[i].length; j++) {
				strArr[i][j]= (char)start++;
			}
		}
		for(char[] ch : strArr) {
			for(char c : ch)
				System.out.print(c + " ");
		System.out.println();
		}
	}
	
	public void practice8 () { //8번문제+9번 문제
		String[] arr = {"강건강", "남나나", "도대담", "류라라", "문미미", "박보배",
						"송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하"};
		String[][] arr1 = new String[3][2];
		String[][] arr2 = new String[3][2];
		
		for(int i=1; i<=12; i++) {
			int n = i/6, m = 0;
			if(i%6 == 0) {
				n = i/6 - 1;
				m = 6;
			} else {
				n = i/6;
				m = i%6;
			} 
			System.out.print(""+n+m+" ");
			
			int l = (m-1)/2;
			int k = (m-1)%2; 
			System.out.println(""+l+k);
			
			if(n==0) {
				arr1[l][k] = arr[i-1];
			} else if(n==1) {
				arr2[l][k] = arr[i-1];
			}
		}
		
		System.out.println("자리 출력");
		System.out.println("== 1분단 ==");
		for(int i=0; i<3; i++) {
			for(int j=0; j<2; j++) {
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("== 2분단 ==");
		for(int i=0; i<3; i++) {
			for(int j=0; j<2; j++) {
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 학생 이름을 입력하세요: ");
		String student = sc.next();
		int count = 0;
		for(int i=0; i<3; i++) {
			for(int j=0; j<2; j++) {
				if(arr1[i][j].equals(student)) {
					System.out.println("검색하신 " + student + "학생은 1분단의 (" + i + "," + j + ")에 있습니다.");
					count++; break;
				} else if(arr2[i][j].equals(student)) {
					System.out.println("검색하신 " + student + "학생은 2분단의 (" + i + "," + j + ")에 있습니다.");
					count++; break;
				} 
			}
		} if(count == 0) System.out.println("그런 학생은 없습니다.");
	}
}
