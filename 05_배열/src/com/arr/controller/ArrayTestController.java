package com.arr.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ArrayTestController {
	public void basicArray() {
		/*
		 * 기본배열 활용하기
		 * 배열은 기본으로 제공되는 저장공간으로 생성해서 사용
		 * 배열의 저장구조는 선형구조
		 * 저장순서가 있고, 저장소를 지칭하는 번호를 가짐(인덱스)
		 * 지칭하는 번호는 0부터 시작함
		 */
		
		/*
		 * 배열 사용해보기
		 * 배열 변수를 선언
		 * 자료형[] 변수명;
		 */
		char[] alpha; //배열 저장소의 주소(*참조형 자료형)
		/*
		 * 반드시 선언된 변수에 배열을 할당해서 사용.
		 * new 자료형[길이];
		 * 한번 할당된 배열은 길이를 변경할 수 없다.
		 */
		alpha = new char[3];
		int[] intArr = new int[7];
		/*
		 * new 연산자로 생성된 배열 저장소는 JVM이 초기값을 설정해줌.
		 * 정수형(byte, short, int, long): 0
		 * 실수형(float, double): 0.0
		 * 문자형(char): ' '
		 * 문자열(String): null
		 */
		
		/*
		 * 할당된 배열 저장소 이용하기
		 */
		System.out.println(alpha); //출력결과가 '   '인 이유는?
		System.out.println(intArr); //출력결과는 해시값
		/*
		 * 배열 저장소에 접근하려면 변수명과 인덱스 번호를 같이 사용
		 */
		System.out.println(alpha[0]);
		System.out.println(alpha[1]);
		System.out.println(alpha[2]);
		
		System.out.println(intArr[0]);
		System.out.println(intArr[1]);
		System.out.println(intArr[2]);
		
		/*
		 * alpha 배열 (char형 3개)
		 * 0~2 -> 3-1
		 * 인덱스 범위를 초과해서 설정을 하면?
		 * java.lang.ArrayIndexOutOfBoundsException 에러 발생
		 */
//		System.out.println(alpha[3]);
		
		/*
		 * alpha 배열에 각 저장소에 A, B, C를 순차적으로 저장
		 */
		alpha[0] = 'A';
		alpha[1] = 'B';
		alpha[2] = 'C';
		
		System.out.println(alpha[0]);
		System.out.println(alpha[1]);
		System.out.println(alpha[2]);
		
		/*
		 * intArr 저장소에 본인 스터디 친구들의 나이를 저장하고 출력
		 */
		intArr[0] = 23;
		intArr[1] = 28;
		intArr[2] = 24;
		intArr[3] = 29;
		intArr[4] = 28;
		intArr[5] = 29;
		intArr[6] = 34;
		
		/*
		 * 반복문(for문)을 이용하여 배열에 저장된 데이터 출력
		 * 
		 */
		for(int i=0; i<7; i++) {
			System.out.println(intArr[i]);
		}
		/*
		 * intArr변수에 1~5까지 값을 저장
		 */
		for(int i=0; i<5; i++) {
			intArr[i] = i+1;
		}
		for(int i=0; i<5; i++) {
			System.out.println(intArr[i]);
		}
		
		/*
		 * 배열의 저장소의 갯수(길이)를 알려주는 변수
		 * 배열명.length
		 */
		System.out.println(intArr.length);
		System.out.println(alpha.length);
		//vs
		String name = "유병승";
		name.length();
		
		for(int i=0; i<intArr.length; i++) {
			System.out.println(intArr[i]);
		}
		
		/*
		 * int형 배열(크기가 10)를 할당하고,
		 * 각 저장소에 10~19까지 저장하기
		 */
		int[] intArr2 = new int[10];
		for(int i=0; i<intArr2.length; i++) {
			intArr2[i] = i+10;
		}
		for(int i=0; i<intArr2.length; i++) {
			System.out.println(intArr2[i]);
		}
		
		/*
		 * 학생 5명의 키를 입력받아 저장하는 기능 구현하기
		 * 저장 후 출력
		 */
		Scanner sc = new Scanner(System.in);
		double[] arrHeight = new double[5];
		for(int i=0; i<5; i++) {
			System.out.print(i+1 + "번째 학생의 키를 입력: ");
			arrHeight[i] = sc.nextDouble();
		}
		for(int i=0; i<5; i++) {
			System.out.println(i+1 + "번째 학생의 키: " + arrHeight[i]);
		}
		
		/*
		 * 배열을 선언할 때, 배열에 저장될 값이 정해져있다면
		 * 배열을 선언과 동시에 초기화
		 */
		char[] chArr = {'가', '나', '다', '라'}; //{}연산자 오버로딩? new연산자와 같은 기능
		System.out.println(chArr);
		for(int i=0; i<chArr.length; i++) {
			System.out.println(chArr[i]);
		}
		/*
		 * chArr = {'A', 'B', 'C'};
		 * 배열 변수가 선언된 이후에 새로운 값으로 설정하려면
		 * new 자료형[] {값, 값, 값}으로 대입해야함.
		 */
		chArr = new char[] {'A', 'B', 'C'};
		System.out.println(chArr);
		
		for(int i=0; i<chArr.length; i++) {
			System.out.println(chArr[i]);
		}
		chArr[0] = '유';
		for(int i=0; i<chArr.length; i++) {
			System.out.println(chArr[i]);
		}
		
		/*
		 * 한번 선언된 배열의 길이는 변경되지 않는다!
		 */
		String[] names = new String[] {"유병승", "유지희", "유승주", "유선정", "손지연"};
//		names[5] = "김주환"; //배열 복사 + 새로운 배열 생성 로직으로 구현 가능
		
		/*
		 * 데이터 조회, 필터(원하는 값을 찾기)
		 */
		int[] numbers2 = {10, 20, 30, 40, 50, 60, 70, 80};
		/*
		 * 저장된 정수 중 50보다 큰 값의 갯수는?
		 */
		int count = 0;
		for(int i=0; i<numbers2.length; i++) {
			if(numbers2[i] > 50) {
				count++;
			}
		}
		System.out.println("저장된 정수 중 50보다 큰 값의 갯수는 " + count);
		
		/*
		 * 1. 저장된 학생 이름 중 김씨 학생의 수를 구하는 기능
		 * 2. 사용자가 원하는 성씨 검색 기능 -> 해당 학생 이름과 총 몇명인지 출력
		 */
		String[] studentName = {"김솔민", "김보미", "김명준", "고재현", "강요한", "박종혁", "박진형", "유지희", "유승주", "윤상빈", "이기수", "이성록"};
		//1. 김씨표류기
		int count1 = 0;
		for(int i=0; i<studentName.length; i++) {
			if(studentName[i].charAt(0)=='김') {
				count1 ++;
			}
		}
		System.out.println("김씨는 " + count1 + "명입니다.");
		System.out.println("원하는 성씨 입력: ");
		char firstName = sc.next().charAt(0);
		int count2 = 0;
		String studentString = "";
		//2. 
		for(int i=0; i<studentName.length; i++) {
			if(studentName[i].charAt(0)==firstName) {
				count2 ++;
				studentString += studentName[i];
			}
		}
		System.out.println(studentString);
		System.out.println(firstName + "씨는 " + count2 + "명입니다.");
		
		/* 
		 * 1. 정수 10개를 랜덤으로 저장하는 기능 만들기
		 * 2. 저장된 10개의 정수에서 최대값, 최소값 출력하기
		 */
		int[] arr = new int[10];
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random() * 100) + 1;
			//arr[i] = Random rnd = new Random(); rnd.nextInt(101);
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		int max=arr[0], min=arr[0];
		for(int i=1; i<arr.length; i++) {
			max = max > arr[i] ? max : arr[i];
			min = min < arr[i] ? min : arr[i];
		}
		System.out.println("최대값: " + max);
		System.out.println("최소값: " + min);
		
		/*
		 * 배열은 선형구조 -> 데이터에 순서가 있음
		 * 0번 인덱스 = 첫번째, (변수명.length - 1)번 인덱스 = 마지막
		 * 정렬할 수 있음(오름차순, 내림차순)
		 */
		int[] testArr = { 4, 3, 6, 2, 7, 5, 1 };
		/*
		 * 0번 인덱스의 값을 1번 인덱스의 값과 바꾸기
		 */
		int temp = 0;
		temp = testArr[0];
		testArr[0] = testArr[1];
		testArr[1] = temp;
		for(int i=0; i<testArr.length; i++) {
			System.out.print(testArr[i] + " ");
		}
		
		for(int i=0; i<testArr.length; i++) {
			int next =testArr[i];
			for(int j=0; j<i; j++) {
				int prev = testArr[j];
				if(prev > next) {
					int t = prev;
					prev = next;
					next = t;
				}
			}
		}
		
		for(int i=0; i<testArr.length; i++) {
			int next =testArr[i];
			for(int j=0; j<i; j++) {
				int prev = testArr[j];
				if(prev < next) {
					int t = prev;
					prev = next;
					next = t;
				}
			}
		}
		
//		List<Integer> numberList = new ArrayList(List.of(4,3,6,2,7,5,1));
//		Collections.sort(numberList, (prev, next)->next-prev);
//		System.out.println(numberList);
	}
	
	public void arrayCopyTest() {
		/*
		 * 배열의 복사
		 * 1. 얕은 복사: 원본 값을 공유하는 방식 (주소값만 복사)
		 * 2. 깊은 복사: 별도의 저장공간을 확보하고 데이터를 복사 (사본)
		 */
		int[] num = {1,2,3,4,5};
		System.out.println(num);
		int[] copyNum = num;
		System.out.println(copyNum);
		
		num[2] = 200;
		for(int i=0; i<num.length; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();
		for(int i=0; i<copyNum.length; i++) {
			System.out.print(copyNum[i] + " ");
		}
		
		/*
		 * 깊은 복사
		 * 1. for문으로 직접 복사
		 * 2. System.arraycopy() 기능 이용
		 * arraycopy() 의 ()안에 다섯개의 값을 설정
		 * 첫번째: 원본 배열명
		 * 두번째: 원본 배열 시작 인덱스 번호
		 * 세번째: 복사될 배열명
		 * 네번째: 복사될 배열의 시작 인덱스 번호
		 * 다섯번째: 길이
		 * 3. Arrays.copyof(원본배열명, 길이) 기능 이용
		 * 4. clone() 기능 이용
		 */
		//1.
		int[] deepCopyArr = new int[num.length];
		for(int i=0; i<num.length; i++) {
			deepCopyArr[i] = num[i];
		}
		System.out.println();
		System.out.println("num: " + Arrays.toString(num));
		System.out.println("deepCopyArr: " + Arrays.toString(deepCopyArr));
		//2.
		String[] names = {"유병승", "홍길동", "김유신"};
		String[] copyName = new String[5];
		System.arraycopy(names, 0, copyName, 3, 2);
		System.out.println("names: " + Arrays.toString(names));
		System.out.println("copyName: " + Arrays.toString(copyName));
		//3.
		String[] copyName2 = Arrays.copyOf(names, 2);
		System.out.println("copyName2: " + Arrays.toString(copyName2));
		//4.
		String[] copyName3 = names.clone();
		System.out.println("copyName3: " + Arrays.toString(copyName3));
	}
	
	public void doubleArray() {
		/*
		 * 2차원 배열
		 * 배열 저장소 두개가 연결되어 있는 저장구조
		 * 바둑판식의 저장 구조를 갖고 있음
		 */
		int[][] intArr;
		intArr = new int[3][3];
		System.out.println(intArr);
		System.out.println(intArr[0]);
		System.out.println(intArr[1]);
		System.out.println(intArr[0][0]);
		System.out.println(intArr[0][1]);
		System.out.println(intArr[0][2]);
		System.out.println(intArr[1][0]);
		System.out.println(intArr[1][1]);
		System.out.println(intArr[1][2]);
		
		for(int i=0; i<intArr.length; i++) {
			for(int j=0; j<intArr[i].length; j++) {
				System.out.print(intArr[i][j] + " ");
			}
			System.out.println();
		}
		
		/*
		 * 이차원 배열에 값 대입하기
		 */
//		intArr[1] = 200;
		intArr[0][1] = 100;
		intArr[1][0] = 200;
		
		
		int[][] intArr2 = new int[5][5];
		for(int i=0; i<intArr2.length; i++) {
			for(int j=0; j<intArr2[i].length; j++) {
				intArr2[i][j] = j+1;
			}
		}
		
		for(int i=0; i<intArr2.length; i++) {
			for(int j=0; j<intArr2[i].length; j++) {
				System.out.print(intArr2[i][j] + " ");
			}
			System.out.println();
		}
		
		int[][] intArr3 = new int[3][4];
		for(int i=0; i<intArr3.length; i++) {
			for(int j=0; j<intArr3[i].length; j++) {
				intArr3[i][j] = 4*i + (j+1);
			}
		}
		
		for(int i=0; i<intArr3.length; i++) {
			for(int j=0; j<intArr3[i].length; j++) {
				System.out.printf("%-3d", intArr3[i][j]); //value++도 가능
			}
			System.out.println();
		}
		
//		Scanner sc = new Scanner(System.in);
//		int k = sc.nextInt();
//		int l = sc.nextInt();
//		
//		for(int i=0; i<intArr.length; i++) {
//			for(int j=0; j<intArr[i].length; j++) {
//				System.out.println("intArr[" + i + "][" + j + "]에 들어갈 숫자를 입력하시오: ");
//				intArr[i][j] = sc.nextInt();
//			}
//		}
		
		/*
		 * 선언과 동시에 초기화
		 */
		String[][] test = {{"가","나","다"}, {"A","B","C"}, {"a","b","c"}};
		/*
		 * 행만 설정할 수 있음
		 */
		String[][] category = new String[3][];
		category[0] = new String[]{"짜장면", "짬뽕", "탕수육"};
		category[1] = new String[5];
		category[2] = new String[2];
		
		for(int i=0; i<category.length; i++) {
			for(int j=0; j<category[i].length; j++) {
				System.out.print(category[i][j] + " ");
			}
			System.out.println();
		}

		String[][] study= {
		        {"손지연","김동훈","김해진","김지연","유선정","유승주","유지희"},
		        {"강요한","김혜정","최헌수","이성록","윤상빈","최선웅"},
		        {"이기수","김명준","김주환","전승우","임성욱","김보미"},
		        {"박진형","김건민","김솔민","박진형","서보민","이우석"},
		        {"고재현","박종혁"}
		        };
		/*
		 * 1. 고재현님의 저장위치를 출력하고 같은 조원의 수를 출력하기(고재현님은 0번째 행, 0번째 열에 있습니다)
		 * 2. 이름을 입력받아 그 사람의 위치와 같은 조원 수를 출력, 없으면 없는 사람입니다를 출력
		 */
		for(int i=0; i<study.length; i++) {
			for(int j=0; j<study[i].length; j++) {
				if(study[i][j].equals("고재현")) {
					System.out.println("고재현님은 " + i + "번째 행, " + j + "번째 열에 있습니다.");
					System.out.println(study[i].length + "명");
				}
			}
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 입력: ");
		String name = sc.next();
		int count = 0;
		for(int i=0; i<study.length; i++) {
			for(int j=0; j<study[i].length; j++) {
				if(study[i][j].equals(name)) {
					System.out.println(name + "님은 " + i + "번째 행, " + j + "번째 열에 있습니다.");
					System.out.println(study[i].length + "명");
					count++;
				}
			}
		}
		if(count == 0) { System.out.println("없는 사람입니다."); }
	}
	
	public void extraTest(){	
		/*
		 * 배열 숞뢰하기
		 */
		int[] intArr = {1,2,3,4,5};
		for(int i=0; i<intArr.length; i++)  {
			System.out.println(intArr[i] + " ");
		}
		/*
		 * forEach문을 이용해서 데이터 순회하기
		 * for(변수 선언: 배열명) { } //배열을 복사해서 씀
		 */
		for(int v : intArr) {
			if(v>=3) {
			System.out.print(v+" ");
			}
		}
		System.out.println();
		
		/*
		 * intArr값에서 4인 값을 찾아서 100으로 변경하기
		 */
		for(int v : intArr) {
			if(v==4) {
				v=100;
			}
		}
		System.out.println(Arrays.toString(intArr));
		
		/*
		 * 정수를 5개 저장할 수 있는 배열에 1~10까지의 랜덤값을 저장
		 * 중복값 없이 저장
		 */
		int[] arr = new int[5];
		for(int i=0; i<5; i++) {
			arr[i] = (int)(Math.random() * 10) + 1;
			for(int j=0; j<i; j++) {
				if(arr[i] == arr[j]) {
					i--; break;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		
		/*
		 * 로또 만들기
		 * 1~45 사이의 랜덤값 6개를 지정
		 * 중복값 없이, 오름차순으로 정렬
		 * 로또 번호 출력
		 */
		int[] lotto = new int[6];
		for(int i=0; i<6; i++) {
			lotto[i] = (int)(Math.random() * 45) + 1;
			for(int j=0; j<i; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				}
				if(lotto[j] > lotto[i]) {
					int t = lotto[j];
					lotto[j] = lotto[i];
					lotto[i] = t;
				}
			}
		}
		System.out.println(Arrays.toString(lotto));
		for(int i=0; i<lotto.length; i++) {
			for(int j=0; j<i; j++) {
				
			}
		}
		System.out.println(Arrays.toString(lotto));
	}
}
