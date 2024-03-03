package com.bs.example.practice7.run;

import com.bs.example.practice7.model.vo.Employee;

public class Run {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.setEmpNo(3);
		e.setEmpName("손지연");
		e.setJob("학생개발자");
		e.setAge(23);
		e.setGender('여');
		e.setSalary(3500000);
		e.setBonusPoint(0.005);
		e.setPhone("010-8888-5555");
		e.setAddress("경기도 의정부시");
		
		System.out.println(e.getAddress()+" "+e.getAge()+" "+e.getBonusPoint()+" "+
				e.getDept()+" "+e.getEmpName()+" "+e.getEmpNo()+" "+
				e.getGender()+" "+e.getJob()+" "+e.getPhone()+" "+
				e.getSalary());
	}
}
