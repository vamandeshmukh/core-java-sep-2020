package com.core.java.day23;

public class App2 {

	public void run() {
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
		App2 obj = new App2();
		obj.run();
		App2 obj2 = new App2();
		obj2.run();
	}
}
