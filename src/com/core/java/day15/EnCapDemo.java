package com.core.java.day15;

// Encapsulation 

class Employee {
	private int eid;
	private String name; // Venky -> encryption ->   sE46dA2De34DEswAdfrdderw2 -> decryption -> Venky 
	private double salary;  
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int eid, String name, double salary) {
		super();
		this.eid = eid;
		this.name = name;
		this.salary = salary;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", salary=" + salary + "]";
	}

	// code - methods
	void work() {
		System.out.println("Employee2 works.");
	}

}

public class EnCapDemo {

	public static void main(String[] args) {

		Employee emp = new Employee();
//		emp.salary = 10.5;
//		System.out.println(emp.salary);

		emp.setSalary(10.6);
		System.out.println(emp.getSalary());

	}

}
