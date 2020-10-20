package com.core.java.day28;

@FunctionalInterface
interface FunInter {
	
	public abstract void functionalMethod(int i, int j);
	
}


// lambda expression () -> {}; 
// it is used to override method from functional interface.
// it contains (0 or more arguments) lambda operator -> {method body}; 

public class LambdaDemo {
	
	public static void main(String[] args) {
		
		FunInter funInter = (int i, int j) -> {
		
			System.out.println(i + j);
			
		};

		funInter.functionalMethod(10, 20);
		
	}



}
