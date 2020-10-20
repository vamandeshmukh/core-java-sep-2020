package com.core.java.day29;

//functional interface - means - it has only ONE abstract method.  
//this method is called as functional method.  
//Note: functional interface may contain OTHER methods also.

//functional interface can be 'used' (implemented) in three ways - 
//1. with 'implements' (inheritance)
//2. with anonymous inner class 
//3. with lambda expression (java 8 onwards)

@FunctionalInterface
interface MyInter {

	// abstract method - non static method - functional method - does not have body 
	// can be only one in a functional interface
	// can be accessed in the above three ways 
	public abstract void method();

	// static method - concrete method - has body
	// can be accessed with Interface Reference - MyInter.staticMethod();  
	public static void staticMethod() {
		System.out.println("static method from interface");
	}

	public static void anotherStaticMethod() {
		System.out.println("another static method from interface");
	}
	// default method - non static method - concrete method - has body
	// can be accessed  with object reference - obj.defaultMethod();
	public default void defaultMethod() {
		System.out.println("default method from interface");
	}

	public default void anotherDefaultMethod() {
		System.out.println("another default method from interface");
	}

}

public class App {
	public static void main(String[] args) {

		MyInter obj = () -> {
			System.out.println("functional method implemented here");
		};
		obj.method();
		
		MyInter.staticMethod();
		MyInter.anotherStaticMethod();
		
		obj.defaultMethod();
		obj.anotherDefaultMethod();
		

	}
}
