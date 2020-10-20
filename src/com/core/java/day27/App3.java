package com.core.java.day27;

public class App3 {
	public static void main(String[] args) {
		App3 obj = new App3();
		App3 obj2 = new App3();
		
//		System.gc(); // use any one 
		Runtime.getRuntime().gc(); // use any one 
		System.out.println("end");
	}
	
	@Override
	public void finalize() {
		System.out.println("Garbage collected.");
	}

}
