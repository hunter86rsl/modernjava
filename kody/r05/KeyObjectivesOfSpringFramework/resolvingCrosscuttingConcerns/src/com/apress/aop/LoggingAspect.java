package com.apress.aop;

public class LoggingAspect {
	long startTime;
	long endTime;
	public void logBefore() {
		 
		System.out.println("Przed wywołaniem metody getAllBooks");
	}

	public void logAfter() {
		System.out.println("Po wywołaniu metody getAllBooks");
	}
}
