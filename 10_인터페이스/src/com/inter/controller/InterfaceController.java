package com.inter.controller;

import com.inter.common.BasicInter;
import com.inter.common.FlyActionAble;
import com.inter.common.ParentInter;
import com.inter.common.SoundActionAble;
import com.inter.model.vo.Animal;
import com.inter.model.vo.BasicInterImpl;
import com.inter.model.vo.BasicInterImpl2;
import com.inter.model.vo.InterTestImpl;

public class InterfaceController {
	public void basicInterface() {
		/*
		 * 기본 인터페이스 선언하기
		 * 추상메소드와 static final 변수를 갖는 독특한 객체
		 * 자체 생성이 불가능하고 클래스에 의해 구현해서 사용
		 * 구현: 인터페이스에 선언된 추상 메소드를 재정의 -> 필수(must)!
		 * 다형성이 적용됨. 인터페이스 타입으로 선언된 변수에 구현체 객체를 저장 가능.
		 * 1. 인터페이스 선언
		 * ex) public interface 인터페이스명(클래스명과 네이밍 규칙 동일) {}
		 * 2. 클래스에서 선언된 인터페이스 구현
		 * ex) public class 클래스명 [extends 클래스명] implements 인터페이스명,... {}
		 */
		
//		new BasicInter();
		BasicInterImpl bii = new BasicInterImpl();
		bii.test();
		System.out.println(bii.calc(10, 20));
		
		/*
		 * 인터페이스는 하나의 자료형으로 사용이 가능
		 * 다형성 가능이 가능
		 */
		BasicInter bi;
//		bi = new BasicInter();
		//인터페이스를 구현한 모든 클래스가 대입 가능
		bi = new BasicInterImpl();
		bi.test();
		System.out.println(bi.calc(10, 20));
		
		bi = new BasicInterImpl2();
		bi.test();
		System.out.println(bi.calc(10, 20));
		
		printMsg(new BasicInterImpl2());
		printMsg(new BasicInterImpl());
		
		/*
		 * 인터페이스 타입에 저장된 객체는 구현체 클래스에 선언된 내용에 접근할 수 없다.
		 */
		BasicInterImpl2 bii2 = new BasicInterImpl2();
		bii2.getTest();
		bii2.test();
//		bi.getTest(); //bi는 업캐스팅 되었기 때문에 접근 불가능. 
		//접근하려면 강제형변환이 필요
		((BasicInterImpl2)bi).getTest();
		BasicInterImpl2 temp = (BasicInterImpl2)bi;
		
		//인터페이스에서 선언된 필드 이용하기
		System.out.println(BasicInter.AGE);
		System.out.println(BasicInter.TEST_MESSAGE);
	}
	
	public void printMsg(BasicInter bi) {
		bi.test();
	}
	
	/*
	 * 인터페이스 추가 활용하기
	 * 인터페이스도 상속이 가능함 -> 인터페이스와 인터페이스!
	 * 다중 상속이 가능!
	 */
	
	/*
	 * 다수의 인터페이스를 구현하는 것이 가능함.
	 */
	
	/*
	 * 익명 클래스를 이용해서 인터페이스를 만드는 것이 가능
	 * -> 람다 표현식으로 표현이 가능! 함수형 인터페이스일 경우!
	 */
	
	public void extraInterface() {
		/*
		 * 인터페이스 상속하기
		 */
		ParentInter pi;
		pi = new BasicInterImpl();
		System.out.println(pi.checkStr("test", 't'));
		pi = new BasicInterImpl2();
		System.out.println(pi.checkStr("test", 't'));
		pi = new InterTestImpl();
		System.out.println(pi.checkStr("test", 't'));
		System.out.println(pi instanceof BasicInterImpl2);
		System.out.println(pi instanceof InterTestImpl);
//		((BasicInterImpl2)pi).getTest();
		
//		TestInter ti;
		
		/*
		 * 익명 클래스를 이용해서 추상 메소드 구현하기 (추상클래스, 인터페이스 모두 적용가능)
		 * java 파일을 만들지 않고 코드 상에만 존재하는 객체 -> 1회용
		 */
		
		// 추상 클래스의 추상 메소드 구현
		Animal a = new Animal() {
			@Override
			public void move() {
				System.out.println("기본 움직임!");
			}
		};
		
		a.move();
		a.setName("test");
		System.out.println(a.getName());
		
		// 인터페이스 익명 클래스로 구현하기
		BasicInter biTest = new BasicInter() {
			@Override
			public void test() {}
			@Override
			public int calc(int s, int s1) { return s+s1; }
			@Override
			public String checkStr(String str, char s) { return str; }
		};
		System.out.println(biTest.calc(10, 30));
		System.out.println(biTest.checkStr("안녕", 'a'));
		
//		biTest = new BasicInter() {
//			
//		};
		
		AnimalController ac = new AnimalController();
		ac.animalBark(new SoundActionAble() {
			@Override
			public void bark() {
				System.out.println("시끌벅적!");
			}
		});
		
		/*
		 * Functional 인터페이스!
		 * 추상메소드가 오직 유일하게 한개만 선언되어 있는 인터페이스
		 * 추상 메소드를 간편하게 표현할 수 있는 표현식을 사용 -> 람다 표현식
		 * (매개변수, 매개변수, ...) -> { 로직 [return;] }
		 * 원리: 추상메소드가 하나뿐이므로 인터페이스명으로 JVM이 매개변수명을 제외한 선언부(반환형,매개변수타입,추상메소드명)의 정보를 갖고 있음.
		 */
		//1
		ParentInter pi1 = new ParentInter() {
			@Override
			public String checkStr(String str, char c) {
				return str + c;
			}
		};
		//2
		pi1 = (s, c) -> {return s+c;};
		//3 
		pi1 = (ss, cc) -> ss+cc;
		//4
		pi1 = (ss, cc) -> {
			if(ss.length() > 3) {
				ss+="G";
			}
			return ss+cc;
		};
		//1~4는 모두 같은 식, 5는 그것의 출력
		System.out.println(pi1.checkStr("흥~! 이노무새끼야님", '쳇'));
		//pi1 = (String s, char c) -> {return s+c;};
		FlyActionAble faa = () -> { System.out.println("여러분 안녕"); };
		faa = () -> System.out.println("안녕");
		
		/*
		 * functional 인터페이스를 확인하기 위해
		 * @FunctionalInterface 설정
		 */
		
		BasicInter bi = new BasicInterImpl();
		bi.addFunc();
		new BasicInterImpl2().addFunc();
	}
}
