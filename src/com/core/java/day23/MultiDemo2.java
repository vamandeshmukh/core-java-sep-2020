package com.core.java.day23;

public class MultiDemo2 extends Thread { // step 1

	@Override
	public void run() { // step 2
		System.out.println("Thread is running.");
	}

	public static void main(String[] args) {
		MultiDemo2 obj = new MultiDemo2();
		obj.start(); // step 3

	}

}
