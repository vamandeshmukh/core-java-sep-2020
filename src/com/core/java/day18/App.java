package com.core.java.day18;
//polymorphism - multiple methods with the same name 

//types of polymorphism 

//1. method overloading - is also called as compile-time polymorphism 
//2. method overriding - is also called as run-time polymorphism 

//method overloading - methods with the same name but with different parameters 
//		1. different number of parameters 
//		2. different types of parameters 
//		3. different order of parameters

//method overloading is possible both in static and non static forms 
//please check this with your own programs 

//non static method overloading is possible both in the same class and super-sub classes 
//static method overloading is possible only in the same class 

// polymorphism 
// 2. Method Overriding - provide a different implementation to a method from super class in the sub-class 
// name, parameters same, only the body is different 
// Method overriding is possible only in super-class and sub-class 
// It is possible only with non static methods 
// it is possible with (concrete) class, abstract class, interface 

class SmartPhone {

	void music() {
		System.out.println("Play music...");
	}
}

class OnePlus extends SmartPhone {

	@Override
	void music() {
		System.out.println("Play dolby music...");
	}
}

public class App {

	public static void main(String[] args) {
		OnePlus phone = new OnePlus();
		phone.music();
	}
}
