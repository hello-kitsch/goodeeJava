package com.api.controller;

import java.nio.charset.Charset;
import java.util.StringTokenizer;

public class StringController {
	public static void main(String[] args) {
		/*
		 * 자바에서 문자열 관련된 클래스는 3가지가 있다.
		 * String, StringBuffer, StringBuilder
		 * - String: 기본 자료형처럼 사용하는 클래스, ""라는 리터럴을 =연산으로 저장
		 * - StringBuffer/StringBuilder: 클래스 사용방식으로 사용 -> new 클래스명();
		 * 		->new 클래스명("");
		 * String 불변, StringBuffer/StringBuilder 가변
		 */
		String str = "유병승";
		System.out.println(str);
		StringBuffer sb = new StringBuffer("유병승");
		System.out.println(sb);
		System.out.println("str: " + str.hashCode());
		System.out.println("sb: " + sb.hashCode());
		
		//데이터 변경하기
		str += "짜장면";
		System.out.println("str: " + str + " " + str.hashCode());
		
		//메소드를 이용해서 수정
		sb.append("짬뽕");
		System.out.println("sb: " + sb + " " + sb.hashCode());
		
		/*
		 * 문자열에 대한 변경(수정, 삭제, 추가)이 많이 있는 경우
		 * StringBuffer/StringBuilder를 사용
		 * 원본 그대로 유지하는 값은 String을 사용
		 */
		
		/*
		 * String 클래스가 제공하는 메소드(기능)들...
		 * 1. (문자열변수 || "").concat("합칠 문자") 메소드: 문자열을 합쳐주는 기능
		 * -> +=연산과 동일한 기능
		 */
		String test = "GDJ79";
		test = test.concat("화이팅"); //불변
		System.out.println(test);
		
		test = test.concat("졸면 안돼!").concat("산타할부지가 선물 안줘용!");
		System.out.println(test);
		
		/*
		 * 2. contains() 메소드: 문자열에 특정 문자의 포함여부를 확인해주는 기능
		 * boolean형을 반환해줌
		 */
		boolean result = test.contains("할머니");
		System.out.println(result);
		
		if(test.contains("GDJ79")) {
			System.out.println("나를 버리지마요!");
		}
		if(!test.contains("병승")) {
			test = test.concat("병승");
		}
		System.out.println(test);
		
		/*
		 * 3. indexOf("문자열"): 문자열에서 특정 문자의 인덱스 번호를 반환
		 * int형을 반환해줌.
		 */
		System.out.println(test.indexOf("산타"));
		//값이 없으면 -1을 반환
		System.out.println(test.indexOf("쫄면"));
		
		if(test.indexOf("코딩") == -1) {
			System.out.println("코딩 추가해");
		}
		if(test.indexOf("코딩") >= 0) {
			System.out.println("코딩 있음");
		}
		
		//lastIndexOf(): 오른쪽에서부터 찾음
		test = "banana";
		System.out.println(test.indexOf("a"));
		System.out.println(test.lastIndexOf("a"));
		System.out.println(test.indexOf("a", 2));
		System.out.println(test.indexOf("a", test.indexOf("a")+1));
		
		
		/*
		 * 4. split(): 문자열을 특정 값을 기준으로 배열을 변환해주는 기능
		 * csv: 유병승,19,남,경기도시흥시
		 */
		test = "유병승, 19, 남, 경기도 시흥시\n김명준, 32, 남, 경기도 부천시\n김동훈, 29, 남, 경기도 안양시";
		String[] data = test.split("\n");
		for(String v : data) {
			String[] p = v.split(",");
//			Person p1 = new Person();
//			p1.setName(p[0]);
//			p1.setAge((Integer.parseInt(p[1])));
//			p1.setGender(p[2].charAt(0));
//			p1.setAddress(p[3]);
//			persons[count++] = p1;
//			for(String t : p) {
//				System.out.println(t);
//			}
		}
		
		/*
		 * 5. replace("찾을값", "바꿀값"): 특정 문자열을 지정 문구로 변경하는 기능
		 */
		test = "나는 코딩이 안 안 안맞나봐~";
		test = test.replace("안", "잘");
		System.out.println(test);
		
		/*
		 * 6. static join("구분자", 문자열배열): 배열을 문자열로 변경해주는 기능 
		 */
		String[] hobby = {"은동", "코딩", "게임", "산책"};
		test = String.join("->", hobby);
		
		/*
		 * 7. substring(시작인덱스[, 끝인덱스]) : 문자열의 특정문자를 잘라내는 기능
		 * 시작인덱스는 포함, 끝인덱스는 포함하지 않음
		 */
		test = "오늘 수업 끝";
		test = test.substring(0, test.length()-1);
		System.out.println(test);
		test = test.substring(1);
		System.out.println(test);
		
		String fileName = "test.png";
		//확장자, 파일 이름을 분리해서 출력하기
		String name = fileName.substring(0, fileName.indexOf("."));
		System.out.println(name);
		String ext = fileName.substring(fileName.indexOf(".")+1);
		System.out.println(ext);
		
		/*
		 * 8. toUpperCase(), toLowerCase(): 알파벳문자를 대문자, 소문자로 변경하는 기능
		 */
		test = "AbCdEfgGg";
		System.out.println(test);
		String result1 = test.toUpperCase();
		System.out.println(result1);
		result1 = test.toLowerCase();
		System.out.println(result1);
//		Scanner sc = new Scanner(System.in);
//		System.out.println("계속하시겠습니까?(y/n): ");
//		String choice = sc.next();
//		if(choice.toLowerCase().equals("y")) {
//			System.out.println("실행");
//		}
		
		/*
		 * 9. trim(): 양쪽의 공백을 제거해주는 기능
		 */
		test = "    오늘 참 쉽죠~ 너무너무         ";
		System.out.println(test);
		System.out.println(test.trim());
		
		/*
		 * 10. static valueOf()
		 * : 기본 자료형을 문자열로 변경해주는 기능
		 */
		int num=10;
		double dnum = 64.3;
//		test = (String)num;
		test = String.valueOf(num);
		System.out.println(test);
		test = String.valueOf(dnum);
		System.out.println(test);
		//endsWith와 startWith
		System.out.println(test.endsWith("3"));
		System.out.println(test.startsWith("4"));
		
		/*
		 * 11. getBytes(): 문자열 값을 byte 배열로 반환
		 */
		test = "안녕하세요";
		byte[] barr = test.getBytes(Charset.forName("UTF-8"));
		for(byte b : barr) {
			System.out.println(b);
		}
		result1 = new String(barr);
		System.out.println(result1);
		
		/*
		 * 12. isBlank() / isEmpty()
		 */
		test = ""; //" "는 blank만 해당
		System.out.println(test.isBlank());
		System.out.println(test.isEmpty());
		
		/*
		 * 13. formatted() :
		 * 
		 */
		String test2 = """
				<html>
					<head>
					</head>
					<body>
						<h1>
							안녕 %s님 나이는 %d짤 님아 방가방가
						<h1>
					</body>
				</html>
				""".formatted("김명준", 32);
		System.out.println(test2);
		
		/*
		 * StringBuffer 사용하기
		 * 클래스 이용방식으로 데이터를 수정, 삭제, 삽입을 할때 메소드를 이용
		 * 원본값을 변경함.
		 */
		StringBuffer testsb = new StringBuffer();
		System.out.println("Stringbuffer 이용하기");
		System.out.println(testsb);
		System.out.println(testsb.isEmpty());
		
		/*
		 * 데이터 저장하기
		 * append() 메소드 이용
		 * 문자열의 마지막에 매개변수값을 추가하는 기능
		 */
		testsb.append("여러분 이제 몇 분 안남았어요!");
		System.out.println(testsb);
		testsb.append(" 호호호");
		System.out.println(testsb);
		
		/*
		 * insert() 메소드 이용
		 * 문자열의 원하는 위치에 추가하는 기능
		 */
		testsb.insert(7, "^.~");
		System.out.println(testsb);
		
		/*
		 * 문자열 삭제하기
		 * delete(시작 인덱스, 끝 인덱스)
		 * : 시작 인덱스부터 끝 인덱스 전까지 삭제해주는 기능
		 */
		testsb.delete(0, 3);
		System.out.println(testsb);
		
		/*
		 * deleteCharAt(인덱스번호): 문장려 한개만 삭제하는 기능
		 */
		testsb.deleteCharAt(0);
		System.out.println(testsb);
//		testsb.delete(2, 10);
		testsb.delete(testsb.indexOf(" "), testsb.indexOf("안")+1);
		testsb.insert(2, "많이~~~");
		System.out.println(testsb);
		
		/*
		 * 수정하기
		 * setCharAt(인덱스번호, '문자'): 한글자만 수정
		 */
		testsb.setCharAt(2, ' ');
		System.out.println(testsb);
		
		/*
		 * 문자열을 다루는 메소드
		 * length, indexOf, lastIndexOf, subString, replace
		 */
		System.out.println(testsb.length());
		String test1 = testsb.substring(5);
		System.out.println(test1);
		
		testsb.replace(2, 4, "안 ");
		System.out.println(testsb);
		
		testsb.reverse();
		System.out.println(testsb);
		testsb.reverse();
		System.out.println(testsb);
		
		/*
		 * String, StringBuffer의 호환성
		 */
		test = new String(testsb);
		System.out.println(test);
		
		test = "오늘 수업 끝";
		testsb = new StringBuffer(test);
		System.out.println(testsb);
		
		StringBuilder sb2 = new StringBuilder();
//		sb2.insert("안녕");
		
		StringController.StringTokenizerTest();
	}
	
	public static void StringTokenizerTest() {
		/*
		 * StringTokenizer 클래스를 이용
		 * String을 특정 구분자로 구분해서 처리하는 클래스
		 */
		String test = "유병승,김솔민,김보미,김명준,김동훈";
		test = "java,oracle,html/css,javascript/jquery,servlet";
		StringTokenizer stk = new StringTokenizer(test, ",/");
//		String r = stk.nextToken(); //한번 호출할때마다 스택에서 빠져나가는 식.
//		System.out.println(r);
//		System.out.println(stk.nextToken());
//		System.out.println(stk.nextToken());
//		System.out.println(stk.nextToken());
//		System.out.println(stk.nextToken());
//		System.out.println(stk.nextToken());
//		System.out.println(stk.hasMoreTokens());
		while(stk.hasMoreTokens()) {
			String v = stk.nextToken();
			System.out.println(v+ " " + v.length());
		}
	}
}
