package com.poly.run;

import com.poly.vo.AbstractChild;
import com.poly.vo.AbstractMethodImpl;
import com.poly.vo.AbstractMethodTest;
import com.poly.vo.AbstractTestObj;

public class AbstractMain {
	public static void main(String[] args) {
//		new AbstractTestObj();
		AbstractChild ac = new AbstractChild();
		System.out.println(ac.getData());
		/*
		 * 추상 클래스 타입으로 활용이 가능함.
		 */
		AbstractTestObj ato; //추상클래스 자신을 제외한 모든 상속받는 객체들을 생성 가능
		ato = new AbstractChild();
		
		AbstractMethodImpl ami = new AbstractMethodImpl();
		ami.test();
		
		AbstractMethodTest amt; //특정 메소드를 구현하게 강제할때 추상클래스의 추상메소드를 사용
	}
	
	public static void execAbstractTest(AbstractMethodTest amt) {
		amt.test();
	}
}
