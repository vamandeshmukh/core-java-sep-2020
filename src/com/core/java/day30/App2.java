package com.core.java.day30;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class App2 {

	public static void main(String[] args) throws IOException {

		String file = "myFile.txt";

		FileInputStream fis = new FileInputStream(file);

		while (fis.available() > 0) {
			System.out.print((char) fis.read());
		}
		
		System.out.println("\nend");
		fis.close();

	}

}
