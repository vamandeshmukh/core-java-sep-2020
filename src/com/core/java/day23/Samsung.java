package com.core.java.day23;

class Phone {

}

class SmartPhone extends Phone {
	// call sms camera 

}

public class Samsung extends SmartPhone implements Runnable { // step 1

	@Override
	public void run() { // step 2
		System.out.println("Thread is running.");
	}

	public static void main(String[] args) {
		Thread obj = new Thread(new Samsung()); // important 
		obj.start(); // step 3
	}

}
