package com.core.java.day28;

// functional interface - means - it has only ONE abstract method.  
// this method is called as functional method.  
// Note: functional interface may contain OTHER methods also.

// functional interface can be 'used' (implemented) in three ways - 
// 1. with 'implements' (inheritance)
// 2. with anonymous inner class 
// 3. with lambda expression (java 8 onwards)

@FunctionalInterface
interface FunIn {

	public abstract void functionalMethod();

//	public abstract void anotherFunctionalMethod();
}

//1. with 'implements' (inheritance)
class App1 implements FunIn {

	@Override
	public void functionalMethod() {
		System.out.println("implemented 1");
	}
}

//2. with anonymous inner class 
class App2 {

	public static void method() {
//		FunIn obj = new FunIn(); // Cannot instantiate the type FunIn // object can not be created of an interface 
		FunIn obj = new FunIn() {
			public void functionalMethod() {
				System.out.println("implemented 2");
			}
		};
		
		obj.functionalMethod();
	}
}

//3. with lambda expression  (args) -> {} 
// concrete method returnType methodName(args) {}
class App3 {
	
	public static void method() {
//		FunIn obj = new FunIn(); 
		
		FunIn obj = () -> {
			System.out.println("implemented 3");
		};
		obj.functionalMethod();
	}
}

public class FunDemo {

}
