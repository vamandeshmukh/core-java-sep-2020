package com.core.java.day17;

//polymorphism - multiple methods with the same name 

//types of polymorphism 

//1. method overloading 
//2. method overriding 

// method overloading - methods with the same name but with different parameters 
//		1. different number of parameters 
//		2. different types of parameters 
// 		3. different order of parameters

// method overloading is possible both in static and non static forms 
// please check this with your own programs 

// non static method overloading is possible both in the same class and super-sub classes 
//static method overloading is possible only in the same class 

public class PolyDemo {

	static int add(int i, int j) {
		return i + j;
	}

//	1. different number of parameters 
	static int add(int i, int j, int k) {
		return i + j + k;
	}

//	2. different types of parameters 
	static int add(int i, byte j) {
		return i + j;
	}

//		3. different order of parameters 
	static int add(byte i, int j) {
		return i + j;
	}
	
	static int add(int i, int j, int k, int l) {
		return i + j + k + l;
	}

	public static void main(String[] args) {
		
		PolyDemo obj = new PolyDemo();
		
		int i = 10, j = 20, k = 30, l = 40;
		byte b = 50;

		System.out.println(PolyDemo.add(i, j));
		System.out.println(PolyDemo.add(i, b));
		System.out.println(PolyDemo.add(b, i));
		System.out.println(PolyDemo.add(i, j, k));
		System.out.println(PolyDemo.add(i, j, k, l));
		

//		System.out.println(PolyDemo.add(10, 20));
//		System.out.println(PolyDemo.add(10, 20, 30));
//		System.out.println(PolyDemo.add(10, 20, 30, 40));
//		int num = 10;
//		System.out.println(num);
//		String name = "Sonu";
//		System.out.println(name);		
	}

}
