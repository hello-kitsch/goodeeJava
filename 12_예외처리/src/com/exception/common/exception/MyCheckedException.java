package com.exception.common.exception;

import java.time.LocalDateTime;

public class MyCheckedException extends Exception {
	
	private LocalDateTime triggerTime;
	
	public MyCheckedException() {
		
	}
	
	public MyCheckedException(String msg) {
		super(msg);
		triggerTime = LocalDateTime.now();
	}

	public LocalDateTime getTriggerTime() {
		return triggerTime;
	}
	
}