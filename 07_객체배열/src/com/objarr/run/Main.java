package com.objarr.run;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;

import com.objarr.common.CheckData;
import com.objarr.model.vo.Car;
import com.objarr.model.vo.Food;
import com.objarr.model.vo.Fruit;

public class Main {

	public static void main(String[] args) {
		/*
		 * 객체배열 활용하기
		 */
		Food f = new Food();
		Food[] foods = new Food[5];
		System.out.println(foods[0]);
		System.out.println(foods[1]);
		System.out.println(foods[2]);
		
		/*
		 * 생성한 변수에 객체 대입하기
		 */
		foods[0] = new Food();
		foods[1] = new Food("떡볶이", 6000, "한식", 300);
		System.out.println(foods[0]);
		
		f.setName("짜장면");
		foods[0].setName("짬뽕");
		System.out.println(f.getName());
		System.out.println(foods[0].getName());
		
		String data = foods[1].getName() + foods[1].getPrice() + foods[1].getType() + foods[1].getCalorie();
		System.out.println(data);
		
		/*
		 * 반복문과 같이 활용
		 */
		for(int i=0; i<foods.length; i++) {
//			System.out.println(foods[i]);
			if(foods[i] != null)
				System.out.println(foods[i].getName());
		}
		
		/*
		 * Car 클래스를 선언 후
		 * 차종, 색상, 주행거리, 이름
		 * 배열을 이용해서 데이터를 저장
		 * 대형 검정 300 타호
		 * 중형 흰색 500 GV70
		 * 스포츠 노랑 10 카마로
		 * 소형 카키 800 캐스퍼
		 * 대형 파랑 600 타요
		 */
		
		Car[] cars = new Car[5];
		cars[0] = new Car("대형", "검정", 300, "타호");
		cars[1] = new Car("중형", "흰색", 500, "GV70");
		for(int i=2; i<5; i++) {
			if(cars[i] == null) 
				cars[i] = new Car();
		}
		cars[2].setCategory("스포츠카");
		cars[2].setColor("노랑");
		cars[2].setKm(10);
		cars[2].setModel("카마로");

		cars[3].setCategory("소형");
		cars[3].setColor("카키");
		cars[3].setKm(800);
		cars[3].setModel("캐스퍼");
		
		cars[4].setCategory("대형");
		cars[4].setColor("파랑");
		cars[4].setKm(600);
		cars[4].setModel("타요");
		
		for(int i=0; i<cars.length; i++) {
			if(cars[i] != null) {
				System.out.print(cars[i].getCategory() + " ");
				System.out.print(cars[i].getColor() + " ");
				System.out.print(cars[i].getKm() + " ");
				System.out.print(cars[i].getModel() + " ");
			}
			System.out.println();
		}
		
		//cars 저장소에 사용자로부터 입력받은 값으로 car 저장하기
//		cars = new Car[3];
//		Scanner sc = new Scanner(System.in);
//		for(int i=0; i<cars.length; i++) {
//			if(cars[i] == null) {
//				cars[i] = new Car();
//				System.out.print(i+ "번째 차 종류: ");
//				cars[i].setCategory(sc.nextLine());
//				System.out.print(i+ "번째 차 색상: ");
//				cars[i].setColor(sc.nextLine());
//				System.out.print(i+ "번째 차 주행거리: ");
//				cars[i].setKm(sc.nextDouble());
//				sc.nextLine();
//				System.out.print(i+ "번째 차 모델명: ");
//				cars[i].setModel(sc.nextLine());
//			}
//		}
//		
//		for(int i=0; i<cars.length; i++) {
//			if(cars[i] != null) {
//				System.out.println(cars[i].infoCar()) ;
//			}
//		}
		
		/*
		 * 선언과 동시에 초기화하기
		 */
		Food[] food2 = new Food[2];
		food2[0] = new Food();
		food2[1] = new Food();
		Food[] foods2 = { new Food("짜장면", 9000, "중식", 500), 
				new Food("김밥", 4000, "한식", 120),
				new Food() };
		
		for(int i=0; i<foods2.length; i++) {
			System.out.println(foods2[i].getName());
		}
		
		//cars 저장소에 있는 차 중 주행거리가 500을 초과하는 차량 출력하기
		int count = 0;
		for(int i=0; i<cars.length; i++) {
			if(cars[i].getKm() > 500) count++;
		}
		Car[] filterCar = new Car[count];
		
		for(int i=0, j=0; i<cars.length; i++) {
			if(cars[i] != null) {
				if(cars[i].getKm() > 500) {
					System.out.println(cars[i].infoCar());
					filterCar[j++] = cars[i];
				}
			}
		}
		for(int i=0; i<filterCar.length; i++) {
			System.out.println(filterCar[i]);
		}
		
		//foreach문 이용하기 - 객체배열에 접근할때 사용
//		for(int a : intArr) {
//			a=10; //intArr이 바뀌진 않은
//		}		
		for(Car c: cars) {
//			c.setKm(800);
			c = new Car("소형", "노랑", 1000, "레이");
		}
		for(Car c : cars) {
			System.out.println(c.infoCar());
		}
		
	   //과일을 저장할 수 있는 클래스를 만들고
	   //이름, 무게, 색상, 가격
	   //과일을 5개 저장할 수 있는 저장소를 만들자
	   //과일 본인이 좋아하는 과일로 초기화하고 
	   //1. 초기화한 과일들 전체 출력하기
	   //2. 입력된 과일중 무게가 3kg이상인 과일 출력하기
	   //3. 가격이 3000 이상인 과일 출력하기
	   //사과 5 빨강 10000
	   //바나나 3 노랑 8000
	   //딸기 1.5 빨강 2500
	   //키위 2 초록 2800
	   //샤인머스켓 1.3 초록 40000
		Fruit[] fruits = new Fruit[5];
		Scanner sc = new Scanner(System.in);
		fruits[0] = new Fruit("복숭아", 5, "분홍", 8000);
		fruits[1] = new Fruit("딸기", 6, "분홍", 4000);
		fruits[2] = new Fruit("바나나", 4, "분홍", 5000);
		fruits[3] = new Fruit("배", 3, "분홍", 9000);
		fruits[4] = new Fruit("사과", 8, "분홍", 6000);
				
//		for(Fruit f1 : fruits) {
//			System.out.println(f1.infoFruit());
//		}
//		for(Fruit f1 : fruits) {
//			System.out.println("과일 이름 입력: ");
//			f1.setName(sc.nextLine());
//			System.out.println("과일 무게 입력: ");
//			f1.setWeight(sc.nextDouble());
//			System.out.println("과일 색상 입력: ");
//			f1.setColor(sc.nextLine());
//			System.out.println("과일 가격 입력: ");
//			f1.setPrice(sc.nextInt());
//		}
//		for(Fruit f1 : fruits) {
//			if(f1.getWeight() > 3)
//				System.out.println(f1.infoFruit());
//		}
//		for(Fruit f1 : fruits) {
//			if(f1.getPrice() > 3000)
//				System.out.println(f1.infoFruit());
//		}
		
		Fruit[] result = null;
		//무게가 n 이상인 로직
		result = searchFruit(fruits, new CheckData<Fruit, Double>() {
			@Override
			public boolean check(Fruit f, Double d) {
				return f.getWeight() >= (double) d;
			}
		}, 5.0);
		System.out.println(Arrays.toString(result));
		
		//가격이 n이상인 로직
		CheckData<Fruit, Integer> filter = (f1, d) -> f1.getPrice() >= d;
		result = searchFruit(fruits, filter, 6000);
		System.out.println(Arrays.toString(result));
		
		CheckData<Food, String> filter2 = (f1, d) -> f1.getName().contains(d);
	}
	//익명 구현 객체를 잘 쓰는 예시
	public static Fruit[] searchFruit(Fruit[] ori, CheckData filter, Object d) {
		Fruit[] result = new Fruit[ori.length];
		int count = 0;
		for(Fruit f : ori) {
			if(filter.check(f, d)) {
				System.out.println(f);
				result[count++] = f;
			}
		}
		return result;
	}
	
	public static Fruit[] searchFruits2(Fruit[] ori, Object data, Predicate<Fruit> filter) {
		Fruit[] result = new Fruit[ori.length];
		int count = 0;
		for(Fruit f : ori) {
			if(filter.test(f)) {
				System.out.println(f);
				result[count++] = f;
			}
		}
		return result;
	}
	
//	//익명 구현 객체를 잘 쓰는 예시(못쓴 예)
//	public Fruit[] searchWeight(Fruit[] ori, double weight) {
//		Fruit[] resultFruits = new Fruit[ori.length];
//		int count = 0;
//		for(Fruit f : ori) {
//			if(f.getWeight() > weight) {
//				resultFruits[count++] = f;
//			}
//		}
//		return resultFruits;
//	}
//	
//	public Fruit[] searchPrice(Fruit[] ori, int price) {
//		Fruit[] resultFruits = new Fruit[ori.length];
//		int count = 0;
//		for(Fruit f : ori) {
//			if(f.getPrice() > price) {
//				resultFruits[count++] = f;
//			}
//		}
//		return resultFruits;
//	}
}
