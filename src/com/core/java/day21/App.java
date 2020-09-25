package com.core.java.day21;

//exception propogation - m1 -> m2 -> m3 ...

public class App {

	static void m1() {
		System.out.println(10 / 0); // 10 / 2
	}

	static void m2() {
		App.m1();
	}

	static void m3() {
		App.m2();
	}

	public static void main(String[] args) {
		App.m3();
	}
}
