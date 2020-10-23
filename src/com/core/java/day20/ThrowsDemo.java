package com.core.java.day20;

public class ThrowsDemo {

	static void getLoop() throws InterruptedException { // your friend's uncle 
		for (int i = 1; i <= 10; i++) {
			Thread.sleep(500); // uncle's car 
			System.out.println(i);
		}
	}
	
	static void m1() {  // your friend 
		try {
			ThrowsDemo.getLoop(); // friend is using car 
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	

	public static void main(String[] args) { // you

		ThrowsDemo.m1(); // you are using car 

	}

}
