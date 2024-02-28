package com.student.model.dao;

import com.student.model.vo.Student;

public class StudentDao_ {
//	private Student[] stdArr = new Student[3];
	private Student s, s1, s2;
	
	public boolean insertStudent(Student s) {
		if(this.s == null) { //this.s.equals(null) ->NullPointerException
			this.s = s;
		} else if(s1 == null) {
			s1 = s;
		} else if(s2 == null) {
			s2 = s;
		} else {
			return false;
		}
		return true;
	}
	
	public String searchStudent() {
		String searchStudent = "";
		if(this.s != null) {
			searchStudent += this.s.infoStudent() + "\n";
		}
		if(this.s1 != null) {
			searchStudent += this.s1.infoStudent() + "\n";
		}
		if(this.s2 != null) {
			searchStudent += this.s2.infoStudent() + "\n";
		}
		return searchStudent;
	}
	
	public String searchStudentName(String name) {
		String str = "";
		if(s != null && s.getName().equals(name)) {
			str += s.infoStudent();
		} 
		if(s1 != null && s1.getName().equals(name)) {
			str += s1.infoStudent();
		} 
		if(s2 != null && s2.getName().equals(name)) {
			str += s2.infoStudent();
		} 
		return null;
	}
	
	public String searchStudentGrade(int grade) {
		String result = "";
		if(s != null && s.getGrade() == grade) {
			result += s.infoStudent() + "\n";
		}
		if(s1 != null && s1.getGrade() == grade) {
			result += s1.infoStudent() + "\n";
		}
		if(s2 != null && s2.getGrade() == grade) {
			result += s2.infoStudent() + "\n";
		}
		return result;
	}
	
	public boolean editStudent(int num, Student std) {
		if(s != null && s.getNumber() == num) {
			if(std.getGrade() != 0) {
				s.setGrade(std.getGrade());
			}
			if(std.getClassNumber() != 0) {
				s.setClassNumber(std.getClassNumber());
			}
			if(std.getAddress() != null) {
				s.setAddress(std.getAddress());
			}
			if(std.getPhone() != null) {
				s.setPhone(std.getPhone());
			}
			return true;
		} else if(s != null && s1.getNumber() == num) {
			if(std.getGrade() != 0) {
				s.setGrade(std.getGrade());
			}
			if(std.getClassNumber() != 0) {
				s.setClassNumber(std.getClassNumber());
			}
			if(std.getAddress() != null) {
				s.setAddress(std.getAddress());
			}
			if(std.getPhone() != null) {
				s.setPhone(std.getPhone());
			}
			return true;
		} else if(s != null && s2.getNumber() == num) {
			if(std.getGrade() != 0) {
				s.setGrade(std.getGrade());
			}
			if(std.getClassNumber() != 0) {
				s.setClassNumber(std.getClassNumber());
			}
			if(std.getAddress() != null) {
				s.setAddress(std.getAddress());
			}
			if(std.getPhone() != null) {
				s.setPhone(std.getPhone());
			}
			return true;
		}
		return false;
	}
	
	public boolean deleteStudent(int num) {
		if(s != null && s.getNumber() == num) {
			s = null;
		} else if(s1 != null && s1.getNumber() == num) {
			s1 = null;
		} else if(s2 != null && s2.getNumber() == num ) {
			s2 = null;
		} else {
			return false;
		}
		return true;
	}
}