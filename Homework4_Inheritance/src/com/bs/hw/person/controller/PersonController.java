package com.bs.hw.person.controller;

import com.bs.hw.person.model.vo.Employee;
import com.bs.hw.person.model.vo.Student;

public class PersonController {
	private Student[] s = new Student[3];
	private Employee[] e = new Employee[10];
	
	public int[] personCount() {
		int[] arr = new int[2];
		for(Student ss : s) {
			if(ss != null)
				arr[0]++;
		}
		for(Employee ee : e) {
			if(ee != null)
				arr[1]++;
		}
		return arr;
	}
	
	public void insertStudent(String name, int age, double height,
			double weight, int grade, String major) {
		for(int i=0; i<s.length; i++) {
			if(s[i] == null) {
				s[i] = new Student(name, age, height, weight, grade, major);
				return;
			}
		}
	}
	
	public Student[] printStudent() {
		return s;
	}
	
	public void insertEmployee(String name, int age, double height, 
			double weight, int salary, String dept) {
		for(int i=0; i<e.length; i++) {
			if(e[i] == null) {
				e[i] = new Employee(name, age, height, weight, salary, dept);
				return;
			}
		}
	}
	
	public Employee[] printEmployee() {
		return e;
	}
}
