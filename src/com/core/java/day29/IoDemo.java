package com.core.java.day29;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;


class Employee implements Serializable { // step 1
	int eid;
	String name;
	// transient - does not participate in serialization process
	// it is used for 'secret' data that will not be sent to external file.
	transient double salary; 
	

	public Employee() {
	}

	public Employee(int eid, String name, double salary) {
		super();
		this.eid = eid;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", salary=" + salary + "]";
	}

}

// serialization - for saving object data and sharing it 
public class IoDemo {

	public static void main(String[] args) throws IOException  {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee details");
		System.out.println("Enter eid");
		int eid = sc.nextInt();
		System.out.println("Enter name");
		String name = sc.next();
		System.out.println("Enter salary");
		double salary = sc.nextDouble();
		Employee employee = new Employee(eid, name, salary);
		String fileName = name + ".ser"; // .ser extension 
		System.out.println(employee.toString());

		
		FileOutputStream fos = new FileOutputStream(fileName); // step 2

		ObjectOutputStream oos = new ObjectOutputStream(fos); // step 3
		
		oos.writeObject(employee); // step 4

		System.out.println("Object serialized.");
		oos.close();
		fos.close();
		sc.close();

	}

}
