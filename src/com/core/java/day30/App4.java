package com.core.java.day30;

import java.io.File;
import java.io.IOException;

public class App4 {
	
	public static void main(String[] args) throws IOException {
		File file = new File("Monu.txt");
		
		File file2 = new File("AnotherFile.txt");
		

		file.renameTo(file2);

		System.out.println("done");
	}

}
