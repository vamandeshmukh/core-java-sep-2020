package com.core.java.day18;



interface I1 {
	public abstract void m1();
}

abstract class C1 {
	abstract void m1();
	
	void m2() {
		
	}
}


class Student {
	int sid;
	String sname;
	String address;
	double fees;

//	public Student(int sid, String sname, String address, double fees) {
//		super();
//		this.sid = sid;
//		this.sname = sname;
//		this.address = address;
//		this.fees = fees;
//	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", address=" + address + ", fees=" + fees + "]";
	}

//	@Override
//	public boolean equals(Object obj) {
//		return super.equals(obj);
//	}

}

class Employee {
	int id;
	String name;
	double salary;

	public Employee() {

	}

	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

//	@Override
//	public String toString() {
//		return id + " " + name + " " + salary;
//	}

}

public class OverRideDemo {

	public static void main(String[] args) {
		Employee emp = new Employee(101, "Shiva", 10.5);

		System.out.println(emp.toString());

		// com.core.java.day18.Employee@4aa8f0b4
		// 101 Shiva 10.5
		// Employee [id=101, name=Shiva, salary=10.5]

		Student st = new Student();
		st.sid = 101;
		st.sname = "aaa";
		st.address = "Hyd";
		st.fees = 10;

		System.out.println(st.toString());
		System.out.println(st.sid);
		System.out.println(st.sname);

	}

}
