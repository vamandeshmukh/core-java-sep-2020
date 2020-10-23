package com.core.java.day20;

public class ExDemo {

	// throws

	static int divide(int i, int j) throws ArithmeticException {

		int k = i / j;

		return k;
	}

	public static void main(String[] args) {

		try {
			System.out.println(ExDemo.divide(10, 0));
		} catch (ArithmeticException ae) {
			System.out.println("Wrong!");
		}
	}
}
