package com.obj.run;

import com.obj.model.vo.BasicObject;
import com.obj.model.vo.FieldTest;

public class FieldTestMain {
	public static void main(String[] args) {
		/*
		 * 이용할 FieldTest 클래스 생성하기
		 */
		FieldTest ft = new FieldTest(); //ctrl + shift + o
		/*
		 * 생성된 객체의 필드(멤버변수)에 접근하려면 접근연산자를 이용해서 접근
		 * public으로 선언된 변수는 직접 접근이 가능
		 */
		System.out.println(ft.price);
		ft.price = 10000;
		System.out.println(ft.price);

		/*
		 * default로 선언된 변수
		 */
//		System.out.println(ft.name);
		/*
		 * private로 선언된 변수
		 */
//		System.out.println(ft.height);
		
		final String CLASS_NAME;
		System.out.println(ft.CLASS_NAME);
//		ft.CLASS_NAME = "GDJ71";
		
		if(ft.numbers == null) ft.numbers = new int[3];
		
		for(int i=0; i<ft.numbers.length; i++) {
			System.out.println(ft.numbers[i]); //java.lang.NullPointerException(컴파일러는 변수 유무만 확인->런타임에러발생)
		}
		
		ft.obj.age = 20;
		if(ft.obj == null) ft.obj = new BasicObject();
		System.out.println(ft.obj.age);
		
		
	}
}
