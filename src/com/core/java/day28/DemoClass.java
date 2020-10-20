package com.core.java.day28;

@FunctionalInterface
interface Phone {

	public abstract void method();

}

public class DemoClass implements Phone {

	@Override
	public void method() {
		System.out.println("method");
	}

	public static void main(String[] args) {
		DemoClass obj = new DemoClass();
		obj.method();
	}

}
