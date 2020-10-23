package com.core.java.day19;

import java.util.Scanner;

//What is exception handling? 
// The exception handling in java is a mechanism 
// to handle the runtime errors 
// so that normal flow of the application can be maintained.

// try catch finally throw throws 

//Name of error  java.lang.ArithmeticException:  
//Type of error  / by zero
//Location of error  	at com.core.java.day19.App.main(App.java:24)

public class App {

//	int num;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1");
		int num1 = sc.nextInt();
		System.out.println("Enter num2"); // do not enter zero
		int num2 = sc.nextInt();

		try {
			System.out.println(num1 / num2);
		} catch (ArithmeticException ae) { // unchecked exception - compiler does not force you to handle this exception
			ae.printStackTrace();
		}

		System.out.println("end");
	}
}
