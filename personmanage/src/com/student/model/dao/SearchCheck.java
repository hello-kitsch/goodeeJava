package com.student.model.dao;

import com.student.model.vo.Person;

@FunctionalInterface
public interface SearchCheck {
	boolean check(Person pp, Object data);
}
