package com.core.java.day32;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {

//		List<Integer> list = new ArrayList<>();
//		System.out.println(list.size());
//		System.out.println(list.capacity());

		Vector<Integer> vector = new Vector<>();
		System.out.println(vector.size());
		System.out.println(vector.capacity());
		System.out.println(vector);
		vector.add(10);
		vector.add(20);
		System.out.println(vector.size());
		System.out.println(vector.capacity());
		System.out.println(vector);

		for (int i = 10; i <= 100; i += 10) {
			vector.add(i);
		}

		System.out.println(vector.size());
		System.out.println(vector.capacity());
		System.out.println(vector);
		
		Vector<Integer> vector2 = new Vector<Integer>(3, 3);
		System.out.println(vector2.size());
		System.out.println(vector2.capacity());
		System.out.println(vector2);
		vector2.add(10);
		vector2.add(20);
		vector2.add(10);
		vector2.add(20);
		System.out.println(vector2.size());
		System.out.println(vector2.capacity());
		System.out.println(vector2);


	}

}
