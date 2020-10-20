package com.core.java.day30;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class App {
	
	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter data");
		
		String data = sc.nextLine();
		String file = "myFile.txt";
		
		FileOutputStream fos = new FileOutputStream(file);
		
		byte[] bytesArray = data.getBytes();
		fos.write(bytesArray);
		
		System.out.println(data);
		System.out.println("data written");
		fos.close();
		sc.close();

		
	}

}
