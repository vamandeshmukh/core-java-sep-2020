package com.core.java.day22;

final class ClassOne { // final class 

}

class ClassTwo /* extends ClassOne */ { // // final class - can not be extended 

}

class Parent {

	final void m1() { // final method
		System.out.println("Parent m1");
	}
}

class Child extends Parent {

//	@Override
//	void m1() { // CE final method - can not be overridden 
//		System.out.println("Child m1");
//	}

}

public class FinalDemo {

	// real time example of final variable
	final int NUMBER_OF_DAYS_IN_WEEK = 7;

	public static void main(String[] args) {

		// real time example of final variable
		final int BALLS_IN_AN_OVER = 6; // constant

		final int num = 10; // final variable
		System.out.println(num);
//		num = 20; // CE final variable - value can not change 
		System.out.println(num);

		Child child = new Child();
		child.m1();

	}

}
