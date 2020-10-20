package com.core.java.day32;

import java.util.Stack;

public class StackDemo {
	
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		
		stack.add(10);
		System.out.println(stack);
		System.out.println(stack.capacity());
		System.out.println(stack.size());
		
	}

}
