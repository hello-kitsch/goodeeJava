package com.obj.run;

import java.util.Scanner;
import com.obj.controller.MyMethod;
import com.obj.model.vo.FieldTest;
import com.obj.model.vo.MethodController;

public class MethodTestMain {

	public static void main(String[] args) {
		/*
		 * 선언된 메소드를 이용하려면 클래스를 생성 후 이용할 수 있다.
		 * 메소드를 호출하는 방식
		 * 생성된 객체의 주소로 접근해서 메소드명([값,값,...]);
		 * 예) obj.testMethod();
		 * 예) obj.testMethod(1,2,3);
		 */
		MethodController mc = new MethodController();
		mc.printMsg();
		int result = mc.plus();
		System.out.println(result);
		System.out.println(mc.plus());
		mc.printSendMsg("여러분 힘내요! 재밌잖아요!????");
//		mc.printSendMsg("10", 50);
		
		result = mc.complexNumber(3, 5);
		System.out.println(result);
		
		MyMethod mm = new MyMethod();
		Scanner sc = new Scanner(System.in);
		mm.lunchMenu();
		mm.oneToTen();
		System.out.print("정수 입력: ");
		int num = sc.nextInt();
		sc.nextLine();
		mm.oneToTenCst(num);
		System.out.println(mm.oneToFiveSum());
		System.out.println(mm.userMsg(sc));
		System.out.println(mm.calc(2, 3.3, '/'));
		System.out.println(mm.overlapping("bankana"));
		
		/*
		 * 특정 배열을 만들어주는 기능
		 */
		int[] intArr = mc.createIntArr();
		for(int v : intArr) {
			System.out.println(v);
		}
		
		/*
		 * 배열을 전달하면 배열에 랜덤값을 채워주는 기능
		 */
		mc.changeRandomData(intArr);
		for(int v : intArr) {
			System.out.print(v + " ");
		}
		System.out.println();
		                 
		String str = "메소드 너무 재미있다"; //얘는 리터럴
		System.out.println(str);
		mc.changeString(str); //str 리터럴의 값을 복사해서 넣는 것.
		System.out.println(str);
		
		FieldTest ft = mc.createFieldTest();
		System.out.println(ft.price); //0
		
		mc.fieldTestUpdate(ft, 100);
		System.out.println(ft.price);//100
		
		mc.fieldTestUpdate(new FieldTest(), 100);
		System.out.println(ft.price); //0
		
		/*
		 * 원하는 크기(와 타입)의 배열을 생성해주는 기능 
		 * -> 타입을 커스터마이징하려면 상속을 이용?
		 */
		
		/*
		 * 필드값 메소드 가져오기
		 */
		int age = mc.age();
		System.out.println("mc.age : " + age);
		mc.increaseAge();
//		mc.increaseAge();
//		mc.increaseAge();
		new MethodController().increaseAge();
		new MethodController().increaseAge();
		System.out.println("mc.age : " + mc.age());
		
		/*
		 * static 메소드 선언 및 이용하기
		 * 클래스명.메소드명();
		 */
		MethodController.printStatic();
		System.out.println(MethodController.codeError("404"));
	}

}
