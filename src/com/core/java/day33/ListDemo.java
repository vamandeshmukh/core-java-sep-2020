package com.core.java.day33;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {

	static final int BALLS_IN_A_OVER = 6;
	static final int DAYS_OF_WEEK = 7;

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();

		list.add("Sonu");
		list.add("Monu");
		list.add("Ponu");
		list.add("Tonu");
		list.add("Gonu");
		list.add("Bonu");

		// traditional approach 
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		System.out.println(list);
		
		// preferred approach 
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
//		list.forEach(action);		

	}

}
