package com.core.java.day31;

import java.util.ArrayList;
import java.util.List;

/** 
 * @Topic Collection Framework in Java - ArrayList 
 * 
 * @author Vaman
 *
 */
public class App {

	public static void main(String[] args) {
		// 		ArrayList list = new ArrayList();
		List list = new ArrayList();
		
		System.out.println(list.size()); // dynamic size 
		list.add(10);
		list.add(20); // accepts homogeneous data 
		list.add(30.5); 
		list.add("abc"); // accepts heterogeneous data 
		System.out.println(list.size()); // dynamic size 
		System.out.println(list);
		list.remove(0);
		System.out.println(list.size()); // dynamic size 
		System.out.println(list);
		list.add(2, 50);
		System.out.println(list); // [20, 30.5, 50, abc]
		
		List list2 = new ArrayList();
		list2.addAll(list);
		System.out.println(list2); // [20, 30.5, 50, abc] 
		
		list2.addAll(2, list);
		System.out.println(list2); // ?? [20, 30.5, 20, 30.5, 50, abc, 50, abc]
		
		
		
		

		
		


	}

}
