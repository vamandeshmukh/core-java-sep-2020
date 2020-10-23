package com.core.java.day15;

//one class extends another class 
//one class implements an interface 
//one interface extends another interface 
//interface can not extend / implement a class 

// for interface / abstract class, object can not be created 
// only for concrete class, object can be created 


// interface can contain mainly abstract methods, static methods, default method 
interface SomeInterFace {
	
}

// abstract class - can contain both abstract and concrete methods 
abstract class MathClass {

	// abstract method - can be defined only within abstract class and interface 
	abstract int multiply(int i, int j); // what

	// concrete method - normal method - can be defined in both abstract and concrete classes 
	int add(int i, int j) { // what
		int k = i + j; // how
		return k;
	}

}

// concrete class - normal class - can contain only concrete methods 
class ClassOne {
	
//	concrete method 
	void m1() {
		// code 
	}

}

public class AbsDemo {

}
