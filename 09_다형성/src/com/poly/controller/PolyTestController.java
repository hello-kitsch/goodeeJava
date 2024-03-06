package com.poly.controller;

import com.poly.vo.Employee;
import com.poly.vo.Idol;
import com.poly.vo.Person;
import com.poly.vo.PolyChild;
import com.poly.vo.PolyOther;
import com.poly.vo.PolyParent;
import com.poly.vo.Student;
import com.poly.vo.Teacher;

public class PolyTestController {
	public void basicTest() {
		/*
		 * 다형성 활용하기
		 * 다형성은 상속 관계에 있는 클래스에 적용된다.
		 */
		PolyParent pp;
		pp = new PolyParent();
		pp = new PolyChild();
		System.out.println(pp);
		
		pp = new PolyOther();
		/*
		 * 부모 클래스의 변수에 자식 객체를 저장했을 때
		 * 부모 클래스에 선언된 내용만 접근이 가능
		 * 자식 객체의 내용에 접근하려면 자식 클래스로 형변환을 해야함.
		 */
		PolyChild pc = new PolyChild();
//		pc.
//		pp.
		char c = ((PolyChild)pp).getAlpha();
		
		/*
		 * Object 클래스는 모든 클래스의 부모
		 * Object 클래스로 선언된 변수는 java에서 사용하는 모든 클래스를 저장할 수 있다.
		 */
		Object o;
		o = new PolyParent();
		o = new PolyChild();
		o = new String("안녕~난 간다~");
		o = new int[10];
		
//		int length = ((int[])o).length;
//		((PolyParent)o).getData(); //컴파일 시점에선 에러x, 런타임에 에러.
		
		/*
		 * 자식 클래스의 변수에 부모 객체를 저장하기 -> 불가능
		 */
//		pc = new PolyParent();
		
		/*
		 * 부모타입의 변수에 어떤 객체가 있는지 확인하는 연산자
		 * instanceof -> 변수에 저장된 실제 객체를 확인할 수 있음
		 * 변수명 instanceof 클래스명 -> true/false 
		 */
		System.out.println(o instanceof int[]);
		System.out.println(o instanceof PolyParent);
		o = new PolyParent("월요일 신나!", 10);
		
		if(o instanceof int[]) {
			System.out.println("o는 배열이다 길이는 " + ((int[])o).length);
		} else if(o instanceof PolyParent) {
			System.out.println("o는 polyparent이다 " + ((PolyParent)o).getData());
		}
		
		printInfo(new Student("유병승",19,1,3));
		printInfo(new Student("김명준",32,3,2));
		printInfo(new Employee("김동훈",29,100,"개발팀"));
		printInfo(new Idol("산다라박",40,"투애니원",4));
		printInfo(new Teacher("유병승",19,"웹프로그래밍",10));
		
		/*
		 * 동적바인딩 (***)
		 * 상속 관계에 있을 때 부모클래스의 메소드를 자식 클래스가 재정의하고
		 * 부모 클래스 타입의 변수에 자식 객체가 대입되어 있을 때 재정의한 메소드를 실행하면
		 * 형변환 없이 자식 클래스에서 재정의한 메소드가 실행됨.
		 */
		
		/*
		 * Object 메소드 재정의 (toString, equals, clone)
		 */
		Object o2 = new Student("김혜정", 26, 2, 1);
		System.out.println(o2);
		o2 = new Employee("김해진", 21, 200, "개발팀");
		System.out.println(o2);
		
		/*
		 * 객체의 동등성 비교를 하기 위해 재정의하는 메소드 equals
		 * public boolean equals(Object o) { }
		 */
		Student s = new Student("유지희",24,1,3);
		Student s2 = new Student("유지희",24,1,3);
		Student s3 = new Student("유승주",29,2,1);
		System.out.println(s.equals(s2)); 
		System.out.println(s.equals(s3));
		
		Object so = s;
		Object so2 = s2;
		System.out.println("Object에서 비교: " + so.equals(so2));
		
		Employee e = new Employee("김보미",30,100,"개발팀");
		Employee e2 = new Employee("김솔민",25,100,"개발팀");
		System.out.println(e.equals(e2));
		
		/*
		 * hashCodce() 메소드 재정의하기
		 * Set컬렉션에서 중복 저장을 허용하지 않는 로직을 만들기 위해서.
		 * equals()로 해결되지 않는 것들을 해결 -> 보통 같이 재정의
		 */
		System.out.println(s.hashCode());
		System.out.println(s2.hashCode());
		
		/*
		 * clone 메소드 재정의하기 -> 깊은 복사
		 * protected Object clone() { }
		 * 그래야 외부(다른객체)에서 접근을 못함. 반드시 재정의해서 사용해야하므로
		 */
//		e.clone();
		Student copyStudent = s.clone();
		System.out.println(copyStudent);
	}
	
	public void printInfo(Person p) {
		if(p instanceof Student) {
			System.out.println(((Student) p).infoPerson());
		} else if(p instanceof Employee) {
			Employee e = (Employee) p ;
			System.out.println(e.infoEmp());
		} else if(p instanceof Idol) {
			System.out.println(((Idol) p).infoIdol());
		} else if(p instanceof Teacher) {
			System.out.println(((Teacher) p).infoTeacher());
		}
	}
	
//	public void printInfo(Student s) {
//		System.out.println(s.infoPerson());
//	}
//	
//	public void printInfo(Employee e) {
//		System.out.println(e.infoEmp());
//	}
//	
//	public void printInfo(Idol i) {
//		System.out.println(i.infoIdol());
//	}
	
	public Person createPerson(int choice) {
		switch(choice) {
			case 1: return new Student();
			case 2: return new Employee();
			case 3: return new Idol();
			case 4: return new Teacher();
			default: return null; //nullpointerException 위험은 커짐
		}
	}
	
	public Student createStudent() {
		return new Student();
	}
	
	public void objArrPolyTest() {
//		Student[] students;
//		Employee[] employees;
//		Idol[] idols;
//		Teacher[] teachers;
		Person[] persons = new Person[10];
		persons[0] = new Student("윤상빈",32,3,1);
		persons[1] = new Student("이기수",28,2,1);
		persons[2] = new Employee("김주환",25,100,"개발팀");
		persons[3] = new Idol("장원영",20,"아이브",6);
		System.out.println(persons[0]);
		Person[] persons2 = new Person[] {
				new Student("윤상빈",32,3,1),
				new Student("이기수",28,2,1),
				new Employee("김주환",25,100,"개발팀"),
				new Idol("장원영",20,"아이브",6),
				new Idol("김채원",25,"르세라핌",5),
				new Idol("카즈하",22,"르세라핌",5),
				new Employee("아이유",26,300,"영업팀"),
				new Employee("홍길동",44,100,"인사팀")
//				new Person(); //자체 생성 불가능, 재정의해서 쓰도록
		};
		
		//저장된 사람의 객체별 수를 구하기
		int sCount = 0, eCount = 0, iCount = 0, tCount = 0, total = 0;
		for(Person p : persons2) {
			if(p instanceof Student)
				sCount++;
			else if(p instanceof Employee)
				eCount++;
			else if(p instanceof Idol)
				iCount++;
			else if(p instanceof Teacher)
				tCount++;
			if(p != null) total++;
			
		}
		System.out.println(sCount + " " + eCount + " " + iCount + " " + tCount + " " + total);
		
		//저장된 사람의 평균 나이 구하기
		int sum = 0;
		for(Person p : persons2) {
			sum += p.getAge();
//			if(p instanceof Student)
//				sum += ((Student)p).getAge();
//			if(p instanceof Employee)
//				sum += ((Employee)p).getAge();
//			if(p instanceof Idol)
//				sum += ((Idol)p).getAge();
//			if(p instanceof Teacher)
//				sum += ((Teacher)p).getAge();
		}
		double avg = (double)sum / total;
		System.out.println(avg);
		
		//20대인 사람 정보 출력하기
		String str = "";
		for(Person p : persons2) {
			if(p instanceof Student) {
				Student s = (Student)p;
				if (s.getAge() >= 20 && s.getAge() <=29) 
					str += s.toString();
			} else if(p instanceof Employee) {
				Employee e = (Employee)p;
				if (e.getAge() >= 20 && e.getAge() <=29) 
					str += e.toString();
			} else if(p instanceof Idol) {
				Idol i = (Idol)p;
				if (i.getAge() >= 20 && i.getAge() <=29)
					str += i.toString();
			} else if(p instanceof Teacher) {
				Teacher t = (Teacher)p;
				if (t.getAge() >= 20 && t.getAge() <=29) 
					str += t.toString();
			}
			str += "\n";
		}
		System.out.println("20대 사람 출력");
		System.out.println(str);
		
		//저장된 아이돌 중 르세라핌 멤버만 출력하기
		String str2 = " ";
		for(Person p : persons2) {
			if(p instanceof Idol && 
			((Idol)p).getTeam().equals("르세라핌"))
				str2 += ((Idol)p).toString() + "\n";
		}
		System.out.println(str2);
		
//		//20대인 사람 정보 출력하기
//		String str = "";
//		System.out.println("20대 사람 출력");
//		for(Person p : persons2) {
//			if(p instanceof Student) {
//				Student s = (Student)p;
//				if (s.getAge() >= 20 && s.getAge() <=29) 
//					System.out.println(s);
//			} else if(p instanceof Employee) {
//				Employee e = (Employee)p;
//				if (e.getAge() >= 20 && e.getAge() <=29) 
//					System.out.println(e);
//			} else if(p instanceof Idol) {
//				Idol i = (Idol)p;
//				if (i.getAge() >= 20 && i.getAge() <=29)
//					System.out.println(i);
//			} else if(p instanceof Teacher) {
//				Teacher t = (Teacher)p;
//				if (t.getAge() >= 20 && t.getAge() <=29) 
//					System.out.println(t);
//			}
//			str += "\n";
//		}
//		
//		//저장된 아이돌 중 르세라핌 멤버만 출력하기
//		String str2 = "";
//		for(Person p : persons2) {
//			if(p instanceof Idol && 
//			((Idol)p).getTeam().equals("르세라핌"))
//				System.out.println((Idol)p);
//		}
	}
}