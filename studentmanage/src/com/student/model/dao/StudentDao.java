package com.student.model.dao;

import com.student.model.vo.Student;

public class StudentDao {
//	private Student[] stdArr = new Student[3];
	private Student[] s = new Student[3];
	
	public int getSLength() {
		return s.length;
	}
	
	public int getSIndex(int num) {
		for(int i=0; i<s.length; i++) {
			if(s[i] != null && s[i].getNumber() == num)
				return i;
		}
		return -1;
	}
	
	public boolean insertStudent(Student s) {
		for(int i=0; i<this.s.length; i++) {
			if(this.s[i] == null) {
				this.s[i] = s;
				return true;
			}
		}
		return false;
	}
	
	public String searchStudent() {
		String searchStudent = "";
		for(Student s : this.s) {
			if(s != null) 
				searchStudent += s.infoStudent() + "\n";
		}
		return searchStudent;
	}
	
	public String searchStudentName(String name) {
		String str = "";
		for(Student s : this.s) {
			if(s != null && s.getName().equals(name)) str += s.infoStudent() + "\n";
		}
		return str;
	}
	
	public String searchStudentGrade(int grade) {
		String result = "";
		for(Student s : this.s) {
			if(s != null && s.getGrade() == grade) result += s.infoStudent() + "\n";
		}
		return result;
	}
	
	public boolean editStudent(int num, Student std) {
		for(Student s : this.s) {
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
			}
			return true;
		}
		return false;
	}
	
	public boolean deleteStudent(int num) {
		for(int i=0; i<s.length; i++) {
			if(s[i] != null && s[i].getNumber() == num) {
				s[i] = null;
				return true;
			}
		}
		return false;
	}
}
