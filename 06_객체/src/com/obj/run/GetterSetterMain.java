package com.obj.run;

import com.obj.model.vo.Animal;
import com.obj.model.vo.Person;

public class GetterSetterMain {
	public static void main(String[] args) {
		Animal pubao = new Animal();
//		pubao.name = "푸바오";
		pubao.setName("푸바오");
//		System.out.println(pubao.name);	
		pubao.setType("자이언트 판다");	
		pubao.setWeight(100);
		pubao.setAge(4);	
		pubao.setFood("초식");
		System.out.println(pubao.getName() + " " +
				pubao.getType() + " " +
				pubao.getWeight() + " " +
				pubao.getAge() + " " +
				pubao.getFood());
		
		Animal simba = new Animal();
		simba.setName("심바");
		simba.setType("사자");
		simba.setWeight(70);
		simba.setAge(3);
		simba.setFood("육식");
		System.out.println(simba.getName() + " " +
				simba.getType() + " " +
				simba.getWeight() + " " + 
				simba.getAge() + " " +
				simba.getFood());
		
		Animal biak = new Animal();
		biak.setName("삐약이");
		biak.setType("닭");
		biak.setWeight(0.8);
		biak.setAge(2);
		biak.setFood("잡식");
		System.out.println(biak.getName() + " " +
				biak.getType() + " " +
				biak.getWeight() + " " + 
				biak.getAge() + " " +
				biak.getFood());
		
		Person ybs = new Person();
		ybs.setName("유병승");
		ybs.setAge(19);
		ybs.setGender('남');
		ybs.setHeight(180.5);
		System.out.println(ybs.infoPerson());
//		ybs.setPersonId("메롱");
//		Person.setCount(0);
		
		Person hgd = new Person();
		hgd.setName("홍길동");
		hgd.setAge(44);
		hgd.setGender('남');
		hgd.setHeight(175.4);
		System.out.println(hgd.infoPerson());
		Person ssid = new Person();
		ssid.setName("신사임당");
		ssid.setAge(38);
		ssid.setGender('여');
		ssid.setHeight(163.2);
		System.out.println(ssid.infoPerson());
	}
}
