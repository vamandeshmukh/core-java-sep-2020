package com.core.java.day35;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class TimeDemo {

	public static void main(String[] args) {

		// LocalDate used for date only - used often
		// LocalTime used for time only - used often
		// LocalDateTime used for both

		LocalTime time = LocalTime.now();
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(time);
		}

		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
	}

}
