package com.core.java.day24;

public class App4 implements Runnable {
	

	public static void main(String[] args) {
		
//		String str = "aaaaaa";
//		int num = Integer.parseInt(str);
		

		Thread obj = new Thread(new App4());
		obj.start();
		System.out.println(obj.getPriority());
		obj.setPriority(2);
		System.out.println(obj.getPriority());

		Thread obj2 = new Thread(new App4());
		obj2.start();
		System.out.println(obj2.getPriority());
		obj2.setPriority(7);
		System.out.println(obj2.getPriority());

		Thread obj3 = new Thread(new App4());
		obj3.start();
		System.out.println(obj3.getPriority());
		obj3.setPriority(6);
		System.out.println(obj3.getPriority());

	}

	@Override
	public void run() {
		System.out.println("Thread");
	}

}
