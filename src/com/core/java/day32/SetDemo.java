package com.core.java.day32;

// https://stackoverflow.com/questions/20116660/hashset-vs-treeset-vs-linkedhashset-on-basis-of-adding-duplicate-value 

import java.util.HashSet;
import java.util.Random;

public class SetDemo {
	
	public static void main(String[] args) {
		
		HashSet<Integer> set = new HashSet<Integer>();
		
//		System.out.println(set.size());
//		set.add(10);
//		set.add(20);
//		set.add(30);
//		set.add(20);
//		System.out.println(set);
//		System.out.println(set.size());
		
		Random random = new Random();
		
		for (int i = 1; i <= 20; i++) {
			int num = random.nextInt(10);
			set.add(num);
			System.out.println(num);
		}

		System.out.println(set);

	}
}

