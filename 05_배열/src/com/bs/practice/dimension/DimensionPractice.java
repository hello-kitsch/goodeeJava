package com.bs.practice.dimension;

import java.util.Scanner;

public class DimensionPractice {
	public void practice8 () {
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
