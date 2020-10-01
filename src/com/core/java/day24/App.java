package com.core.java.day24;

public class App implements Runnable {

	public static void main(String[] args) {
		Thread obj = new Thread(new App());
		System.out.println(obj.isAlive()); // false
		obj.start(); // starting
		System.out.println(obj.isAlive()); // true
//		obj.stop(); // obj = null; 
		
	}

	@Override
	public void run() {

		System.out.println(Thread.currentThread().isAlive());
	}

}
