package com.bs.practice.student.view;

import com.bs.practice.student.controller.StudentController;
import com.bs.practice.student.model.vo.Student;

public class StudentMenu {
	StudentController ssm = new StudentController();
	
	public StudentMenu() {
		System.out.println("==== 학생 정보 출력 ====");
		Student[] s = ssm.printStudent();
		for(Student ss : s) {
			System.out.println(ss.inform());
		}
		System.out.println("==== 학생 성적 출력 ====");
		System.out.println("학생 점수 합계: " + ssm.sumScore());
		System.out.println("학생 점수 평균: " + (ssm.avgScore())[1]);
		
		System.out.println("==== 성적 결과 출력 ====");
		for(Student sss : s) {
			String str = (sss.getScore() < ssm.CUT_LINE)?"재시험대상":"통과";
			System.out.println(sss.getName() + "학생은 "
					+ str + "입니다.");
		}
	}
}
