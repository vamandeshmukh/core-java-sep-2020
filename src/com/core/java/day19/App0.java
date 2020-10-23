package com.core.java.day19;

import java.util.Scanner;

public class App0 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1");
		int num1 = sc.nextInt();
		System.out.println("Enter num2"); // do not enter zero
		int num2 = sc.nextInt();
		System.out.println(num1 / num2);
		System.out.println("end");
	}
}
