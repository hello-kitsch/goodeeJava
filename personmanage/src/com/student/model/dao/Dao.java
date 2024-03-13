package com.student.model.dao;

import com.student.model.vo.Person;
import com.student.model.vo.Student;

public interface Dao {
	public final int SIZE = 3;
	
	boolean enroll(Person p);
	String showAll();
	Person[] search(Person[] p, SearchCheck filter, Object data);
	Person[] searchHow(int num, Object obj);
	boolean edit(Person p, int[] arr);
	boolean delete(int num);
	void loadDao();
	void saveDao();
}