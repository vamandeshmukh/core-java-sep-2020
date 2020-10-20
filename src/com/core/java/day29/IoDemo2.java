package com.core.java.day29;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

//deserialization - for getting object data and reading it 

public class IoDemo2 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		FileInputStream fis = new FileInputStream("Monu.ser");

		ObjectInputStream ois = new ObjectInputStream(fis);

		Employee emp = (Employee) ois.readObject();

		System.out.println(emp.toString());

	}

}
