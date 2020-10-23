package com.core.java.day17;

//Hybrid.java 
interface Int1 {
	void m1(); // by default public and abstract
	default void m5() {
		
	}
}

interface Int2 extends Int1 {
	abstract void m2();
}

interface Int3 extends Int1 {
	public abstract void m3();
}

public class Hybrid implements Int2, Int3 {
	public static void main(String[] args) {
		Hybrid obj = new Hybrid();
		obj.m1();
		obj.m2();
		obj.m3();
	}

	public void m1() { // must be public
		System.out.println("--m1()--");
	}

	public void m2() {
		System.out.println("--m2()--");
	}

	public void m3() {
		System.out.println("--m3()--");
	}
}
