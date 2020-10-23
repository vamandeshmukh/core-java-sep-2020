package com.core.java.day19;

import java.util.InputMismatchException;
import java.util.Scanner;

//What is exception handling? 
// The exception handling in java is a mechanism 
// to handle the runtime errors 
// so that normal flow of the application can be maintained.

// try catch finally throw throws 

//Name of error  java.lang.ArithmeticException:  
//Type of error  / by zero
//Location of error  	at com.core.java.day19.App.main(App.java:24)

public class App2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = 10, num2 = 5;
		System.out.println("Enter num1");
		try {
			num1 = sc.nextInt();
		} catch (InputMismatchException ime) {
			System.out.println("Enter integer only num1");
		}
		System.out.println("Enter num2"); // do not enter zero
		try {
			num2 = sc.nextInt();
		} catch (InputMismatchException ime) {
			System.out.println("Enter integer only num2");
		}

		try {
			System.out.println(num1 / num2);
		} catch (ArithmeticException ae) {
			System.out.println("Do not divide by zero.");
		}
		finally {
			System.out.println("end");
		}
	}
}
