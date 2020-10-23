package com.core.java.day15;

class FinanceMinistry {
	
}

// abstract class 
abstract class RBI {

	// abstract method
	abstract void doKyc();

	// concrete method
	void openAccount() {

	}
}

class HDFC extends RBI {

	@Override
	void doKyc() {
		System.out.println("Aadhaar");
	}

}

class SBI extends RBI {

	@Override
	void doKyc() {
		System.out.println("PAN Card");
	}

}

class Axis {

}

public class BankDemo {

	public static void main(String[] args) {

	}
}
