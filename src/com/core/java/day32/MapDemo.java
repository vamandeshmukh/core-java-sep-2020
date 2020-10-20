package com.core.java.day32;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
	
	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<>();
		
		map.put(10, "a");
		map.put(20, "b");
		map.put(30, "c");
		map.put(10, "d");
		map.put(50, "c");

		System.out.println(map);
				
	}

}
