package com.core.java.day24;

public class App2 implements Runnable {

	public static void main(String[] args) {
		Thread obj = new Thread(new App2());
		obj.start();
		try {
			obj.join(); // makes other threads wait
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Thread obj2 = new Thread(new App2());
		obj2.start();
		Thread obj3 = new Thread(new App2());
		obj3.start();
	}

	@Override
	public void run() {
		this.methodname();
	}

	public void methodname() {
		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(250);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}

}
