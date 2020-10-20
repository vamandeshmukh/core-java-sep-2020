package com.core.java.day31;

import java.util.ArrayList;
import java.util.List;

class Employee {
	int eid;
	String name;
	double salary;

	public Employee() {
		super();
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

public class GenericsDemo {

	public static void main(String[] args) {
		
		List<Employee> empList = new ArrayList<>();
		
		Employee emp1 = new Employee(101, "Sonu", 10.5);
		Employee emp2 = new Employee(102, "Monu", 10.6);
		Employee emp3 = new Employee();
		
		App app = new App();
		
		empList.add(emp1); // 0
		empList.add(emp2); // 1
//		empList.add(app); 
		empList.add(null); // 2
		empList.add(emp3); // 3
		empList.add(new Employee(104, "Ponu", 10.9)); // 4
		
		System.out.println(empList);
		System.out.println(empList.get(1));
//		empList
		
		
		
		
		
		
		

	}

}
