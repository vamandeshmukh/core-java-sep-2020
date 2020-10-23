package com.core.java.day20;

public class ForLoopDemo {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {

			try {
				Thread.sleep(500);
			} catch (InterruptedException obj) {
				obj.printStackTrace();
			}
			System.out.println(i);
		}
	}

}
