package com.core.java.day30;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App3 {

	public static void main(String[] args) throws IOException {

		String fileName = "myFile.txt";

//		File file = new File(fileName);

		FileReader fileReader = new FileReader(fileName);
		
		int data = fileReader.read();
		
		while (data > 0) {
			System.out.println(fileReader.read());
		}
		
		System.out.println(fileReader.read());

	}

}
