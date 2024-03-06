package com.object.run;

import com.object.model.vo.Board;
import com.object.model.vo.Member;

public class Run {
	public static void main(String[] args) {
		Member m1 = new Member();
		Member m2 = new Member();
		Member m3 = new Member();
		m1.setId("abc");
		m2.setId("def");
		m3.setId("ghi");
		
		m1.setPassword("abc1");
		m2.setPassword("def2");
		m3.setPassword("ghi3");
		
		m1.setName("가나다");
		m2.setName("라마바");
		m3.setName("사아자");
		
		m1.setAge(1);
		m2.setAge(2);
		m3.setAge(3);
		
		m1.setEmail("abc@com");
		m2.setEmail("def@com");
		m3.setEmail("ghi@com");
		
		System.out.println(m1.getId()+" "+m1.getPassword()+
				" "+m1.getName()+" "+m1.getAge()+" "+m1.getEmail());
		System.out.println(m2.getId()+" "+m2.getPassword()+
				" "+m2.getName()+" "+m2.getAge()+" "+m2.getEmail());
		System.out.println(m3.getId()+" "+m3.getPassword()+
				" "+m3.getName()+" "+m3.getAge()+" "+m3.getEmail());
		
		
		Board b1 = new Board("유병승","2024-03-02","자바합시다","자바화이팅!");
		Board b2 = new Board("손지연","2024-03-03","자바를자바","자바파이팅!");
		System.out.println(b1.getTitle()+" "+b1.getContent()+
				" "+b1.getDate()+" "+b1.getName());
		System.out.println(b2.getTitle()+" "+b2.getContent()+
				" "+b2.getDate()+" "+b2.getName());
	}

}
