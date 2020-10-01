package com.core.java.day25;

class Table { // printer class
	
	synchronized void printTable(int n) {// method not synchronized
		for (int i = 1; i <= 10; i++) {
			System.out.println(n * i);
			try {
				Thread.sleep(200);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}

class MyThread1 extends Thread {
	Table t;

	MyThread1(Table t) {
		this.t = t;
	}

	@Override
	public void run() {
		t.printTable(5);
	}
}

class MyThread2 extends Thread {
	Table t;

	MyThread2(Table t) {
		this.t = t;
	}

	@Override
	public void run() {
		t.printTable(12);
	}
}

public class App {

	public static void main(String[] args) {
		Table table = new Table();
		MyThread1 obj1 = new MyThread1(table);
		MyThread2 obj2 = new MyThread2(table);
		obj1.start();
//		obj1.join();
		obj2.start();
	}
}
