package com.core.java.day35;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateOps {
	
	// operations on date 
	// 1. date = date + duration 
	// 2. duration = date - date
	
	public static void main(String[] args) {
		
		LocalDate date = LocalDate.now();
		System.out.println(date); // 2020-10-28
		System.out.println(date.plusDays(30));
		System.out.println(date.plusMonths(1));
		System.out.println(date.plusWeeks(4));
		System.out.println(date.plusYears(2));
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		String dt = "15-Aug-2020";
		LocalDate someDate = LocalDate.parse(dt, formatter);
		System.out.println(someDate);
		System.out.println(someDate.plusDays(30));
		
		System.out.println(date.getDayOfWeek());
		System.out.println(date.getDayOfMonth());
		System.out.println(date.getDayOfYear());
		
		System.out.println(date.isAfter(someDate));
		System.out.println(date.isBefore(someDate));
		System.out.println(date.isEqual(someDate));
		
		
		

	}

}
