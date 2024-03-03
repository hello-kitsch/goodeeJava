package com.bs.practice.array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayPractice {
	public void practice1() {
		int[] arr = new int[10];
		for(int i=0; i<10; i++) {
			arr[i] = i+1;
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice2() {
		int[] arr = new int [10];
		for(int i=0; i<10; i++) {
			arr[i] = 10-i;
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("양의 정수: ");
		int num = sc.nextInt();
		int[] arr = new int[num];
		for(int i=0; i<num; i++) {
			arr[i] = i+1;
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice4() {
		String[] fruit = {"사과", "귤", "포도", "복숭아", "참외"};
		System.out.println(fruit[1]);
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열: ");
		String str = sc.nextLine();
		System.out.println("문자: ");
		char ch = sc.nextLine().charAt(0);
		int count = 0;
		System.out.print("application에 i가 존재하는 위치(인덱스): ");
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == ch) {
				count++;
				System.out.print(i + " ");
			}
		}
		System.out.println();
		System.out.println(ch +" 개수: " + count);
	}
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		String[] seven = {"월","화","수","목","금","토","일"};
		System.out.print("0~6 사이 숫자 입력: ");
		int num = sc.nextInt();
		if(num >= 0 && num <= 6) 
			System.out.println(seven[num] + "요일");
		else
			System.out.println("잘못 입력하셨습니다.");
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수: ");
		int[] arr = new int[sc.nextInt()];
		for(int i=0; i<arr.length; i++) {
			System.out.print("배열 " + i + "번째 인덱스에 넣을 값: ");
			arr[i] = sc.nextInt();
		}
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
			sum += arr[i];
		}
		System.out.println();
		System.out.println("총합: " + sum);
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		while(true) {
			System.out.print("정수: ");
			num = sc.nextInt();
			if(num >= 3 && num % 2 == 1) 
				break;
			System.out.println("다시 입력하세요");
		}
		int[] arr = new int[num];
		for(int i=0; i<num; i++) {
			arr[i] = (i+1) <= (num/2+1) ? i+1 : num-i;
		}
		for(int i: arr)
			System.out.print(i + " ");
		System.out.println();
	}
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		System.out.print("치킨 이름을 입력하세요: ");
		String str = sc.nextLine();
		String[] strArr = {"후라이드", "마늘", "양념", "간장"};
		for(String s : strArr) {
			if(str.equals(s)) { 
				System.out.println(str + " 치킨 배달 가능");
				return;
			}
		}
		System.out.println(str + "은(는) 없는 메뉴입니다.");
	}
	
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		System.out.print("주민등록번호(-포함): ");
		String str = sc.nextLine();
		char[] strArr1 = new char[str.length()];
		
		for(int i=0; i<str.length(); i++) {
			strArr1[i] = (char)str.charAt(i);
		}
		
		char[] strArr2 = new char[str.length()];
		System.arraycopy(strArr1, 0, strArr2, 0, str.length());
		
		for(int i=8; i<str.length(); i++) {
			strArr2[i] = '*';
		}
		
		for(int i=0; i<str.length(); i++) {
			System.out.print(strArr2[i]);
		}
	}
	
	public void practice11() {
		Random rnd = new Random();
		int[] arr = new int[10];
		for(int i=0; i<10; i++) 
			arr[i] = rnd.nextInt(10) + 1;
		for(int i : arr)
			System.out.print(i + " ");
	}
	
	public void practice12() {
		Random rnd = new Random();
		int[] arr = new int[10];
		for(int i=0; i<10; i++) 
			arr[i] = rnd.nextInt(10) + 1;
		int max = arr[0], min = arr[0];
		for(int i : arr) {
			if(max < i)
				max = i;
			if(min > i)
				min = i;
		}
		for(int i : arr)
			System.out.print(i + " ");
		System.out.println();
		System.out.println("최대값: " + max);
		System.out.println("최소값: " + min);
	}
	
	public void practice13() {
		Random rnd = new Random();
		int[] arr = new int[10];
		for(int i=0; i<10; i++) {
			arr[i] = rnd.nextInt(10) + 1;
			for(int j=0; j<i; j++) {
				if(arr[i] == arr[j]) {
					i--;
					break;
				}
			}
		}
		for(int i : arr)
			System.out.print(i + " ");
	}
	
	public void practice14() {
		Random rnd = new Random();
		int[] arr = new int[6];
		for(int i=0; i<6; i++) {
			arr[i] = rnd.nextInt(45) + 1;
			for(int j=0; j<i; j++) {
				if(arr[i] == arr[j]) {
					i--; break;
				}
				int temp = 0;
				if(arr[j] > arr[i]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int i : arr)
			System.out.print(i + " ");
	}
	
	public void practice15() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열: ");
		String str = sc.nextLine();
		
		//01234567
		//aplicton
		
		//0123456789 10
		//applicatio n  <- str
		char[] charArr = new char[str.length()];
		for(int i=0, count=0; i+count<str.length(); i++) {
			charArr[i] = str.charAt(i+count);
//			System.out.println(Arrays.toString(charArr));
			for(int j=0; j<i; j++) {
				if(charArr[i] == charArr[j]) {
					i--; 
					count++;
					break;
				}
					
			}
		}
		int countChar = 0;
		for(int i=0; i<charArr.length; i++) {
			if(charArr[i] != '\0') {
				countChar++;
				System.out.print(charArr[i] + " ");
			}
		}
		System.out.println();
		System.out.println(countChar);
	}
	
	public void practice16() {
		Scanner sc = new Scanner(System.in);
		int num = 0, sum = 0;
		String[] prevArr = null;
		String[] nextArr = null;
		System.out.print("배열의 길이를 입력하세요: ");
		num = sc.nextInt();
		sum += num;
		sc.nextLine();
		prevArr = new String[num];
		for(int i=0; i<num; i++) {
			System.out.print(i+1 +"번째 문자열: ");
			String str = sc.nextLine();
			prevArr[i] = str;
		}
		while(true) {
			System.out.print("값을 더 입력하시겠습니까?(Y/N): ");
			char ch = sc.next().charAt(0);
			if(ch == 'N' || ch == 'n') {
				System.out.println(Arrays.toString(prevArr));
				break;
			} else if(ch == 'Y' || ch == 'y') {
				System.out.print("더 입력하고 싶은 개수: ");
				num = sc.nextInt();
				sc.nextLine();
				sum += num;
				System.out.println(sum);
				nextArr = new String[sum];
				System.arraycopy(prevArr, 0, nextArr, 0, prevArr.length);
				System.out.println(Arrays.toString(prevArr));
				System.out.println(Arrays.toString(nextArr));
				for(int i=prevArr.length-1; i<sum-1; i++) {
					System.out.print(i+2 +"번째 문자열: ");
					String str = sc.nextLine();
					nextArr[i+1] = str;
				}
				prevArr = nextArr;
			} else {
				System.out.println("잘못된 값을 입력하셨습니다. 프로그램을 종료합니다");
				break;
			}
		}
		
	}
}
