package com.core.java.day27;

public class App2 {

	// An object can be made unreferenced in two ways
	// 1. make the object null
	// 2. assign the object reference to another object

	public static void main(String[] args) {
		App2 obj = new App2();
		App2 obj2 = new App2();

		obj = obj2;

		System.gc(); // no guarantee
		System.out.println("End");
	}

	@Override
	public void finalize() {
		System.out.println("garbage collected.");
	}

}
