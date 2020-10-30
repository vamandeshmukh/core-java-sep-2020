package com.core.java.day35;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateDemo {
	
	public static void main(String[] args) {
		// before java 8
//		Date date = new Date();
//		System.out.println(date);
		
		// from Java 8 - 
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);
		
		LocalDate myDate = LocalDate.EPOCH;
		System.out.println(myDate);
		
		LocalDate date = LocalDate.of(1947, 8, 15);
		System.out.println(date);
		
		LocalDate rd = LocalDate.parse("1950-01-26");
		System.out.println(rd);
		
		// https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html 
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		
		String dt = "15-Aug-2020";
		LocalDate someDate = LocalDate.parse(dt, formatter);
		System.out.println(someDate);
		
		
		
		
		
	}

}
