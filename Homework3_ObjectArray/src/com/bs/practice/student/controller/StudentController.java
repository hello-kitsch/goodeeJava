package com.bs.practice.student.controller;

import com.bs.practice.student.model.vo.Student;

public class StudentController {
	private Student[] sArr = new Student[5];
	public final int CUT_LINE = 60;
	
	public StudentController() {
		sArr[0] = new Student("김길동", "자바", 100);
		sArr[1] = new Student("박길동", "디비", 50);
		sArr[2] = new Student("이길동", "화면", 85);
		sArr[3] = new Student("정길동", "서버", 60);
		sArr[4] = new Student("홍길동", "자바", 20);
	}
	
	public Student[] printStudent() {
		return sArr; //sArr이 가리키는 객체의 접근제한자는? new로 생성된 객체의 접근제한자?
	}
	
	public int sumScore() {
		int sum = 0;
		for(Student s : sArr)
			sum += s.getScore();
		return sum;
	}
	
	public double[] avgScore() {
		double[] dArr = new double[2];
		dArr[0] = sumScore();
		dArr[1] = (double)dArr[0] / sArr.length;
		return dArr;
	}
}
