package com.core.java.day27;

// method area - classes are loaded, heap area - objects are created, stack area - methods are executed 

public class App {

	// An object can be made unreferenced in two ways
	// 1. make the object null
	// 2. assign the object reference to another object

	public static void main(String[] args) {

		App obj = new App();
		App obj2 = new App();
		App obj3 = new App();
		App obj4 = new App();
		obj = null;
		obj2 = null;
		obj3 = null;

		System.gc(); // no guarantee
		System.out.println("End");
	}

	@Override
	public void finalize() {
		System.out.println("garbage collected.");

	}

}
