package com.objarr.common;

import com.objarr.model.vo.Fruit;

@FunctionalInterface
public interface CheckData<E,T> {
//	boolean check(Fruit ori, Object data); //java.util.function의 Predicate 인터페이스의 test() 
	boolean check(E ori, T data);
}
