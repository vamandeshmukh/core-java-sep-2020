package com.core.java.day20;

public class App {

	public static void main(String[] args) {

		System.out.println("One");

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) { // checked exception - compiler forces you to handle this exception 

			System.out.println("Something is wrong!");

		}

		System.out.println("Two");

	}

}
