package com.core.java.day23;

public class App extends Thread { // step 1

	@Override
	public void run() { // step 2
		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}

	}

	public static void main(String args[]) {
		App obj = new App();
		obj.start(); // step 3
		App obj2 = new App();
		obj2.start();
		App obj3 = new App();
		obj3.start();
		App obj4 = new App();
		obj4.start();
		
	}
}
