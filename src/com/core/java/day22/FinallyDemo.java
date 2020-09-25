package com.core.java.day22;

import java.util.Scanner;

public class FinallyDemo {

	public static void main(String[] args) {
		int num1 = 0, num2 = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter num1");
		num1 = sc.nextInt();
		System.out.println("Enter num2");
		num2 = sc.nextInt();

		try {
			System.out.println(num1 / num2);
		} catch (ArithmeticException ae) {
			System.out.println("Don't divide by zero");
		} finally { // finally block - used for closing connections 
			sc.close();
			System.out.println("End");
		}

	}
}
