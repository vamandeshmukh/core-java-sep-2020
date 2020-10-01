package com.core.java.day25;

public class App2 extends Thread {
	
	@Override
	public void run() {
		
		if (Thread.currentThread().isDaemon()) {
			System.out.println("It is a daemon thread.");
		}
		else {
			System.out.println("It is a user thread.");
		}
	}
	
	public static void main(String[] args) {
		
		int num = 10;
		
		
		App2 obj1 = new App2();
		App2 obj2 = new App2();
		
		obj2.setDaemon(true);
		obj2.isDaemon();

		obj1.start();
		obj2.start();
	}

}
