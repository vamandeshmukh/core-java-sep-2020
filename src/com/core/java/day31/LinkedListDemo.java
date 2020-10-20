package com.core.java.day31;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

// Generics in Java 

public class LinkedListDemo {
	
	public static void main(String[] args) {

		App obj = new App();

		
		// raw collection - accepts any type of data 
		List list = new LinkedList(); 
		list.add(10);
		list.add(obj);
		System.out.println(list);
//		list.add
		// collection with generics - accepts only one type of data 
		List<Integer> marks = new ArrayList<>();
		marks.add(98);
//		marks.add(obj); // does not accept heterogeneous data 
		marks.add(100);
//		marks.add("abc");
		System.out.println(marks);
		
	}

}
