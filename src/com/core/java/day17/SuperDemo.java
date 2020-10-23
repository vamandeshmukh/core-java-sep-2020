package com.core.java.day17;

//SuperDemo.java
class Parent {
	int i = 10;
}

public class SuperDemo extends Parent {
	int i = 20;

	public static void main(String[] args) {
		SuperDemo obj = new SuperDemo();
		obj.print();
	}

	void print() {
		System.out.println(this.i);
		System.out.println(super.i);
	}
}
