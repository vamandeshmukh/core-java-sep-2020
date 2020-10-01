package com.core.java.day24;

public class App3 implements Runnable {

	public static void main(String[] args) {
		Thread obj = new Thread(new App3());
		obj.start();
		System.out.println(obj.getName());
		obj.setName("abc thread");
		System.out.println(obj.getName());
		
		Thread obj2 = new Thread(new App3());
		obj2.start();
		System.out.println(obj2.getName());
	}

	@Override
	public void run() {
		System.out.println("Thread is running...");

	}

}
