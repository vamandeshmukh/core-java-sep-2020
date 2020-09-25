package com.core.java.day22;

public class App {
	public static void main(String[] args) {

		try {
			int[] arr = { 10, 20, 30, 40, 50 };
			System.out.println(arr[4] / 0);
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException someObjectName) {
			System.out.println("Wrong division!");
		}
	}
}
