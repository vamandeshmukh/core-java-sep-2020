package com.core.java.day15.abs;

// one class extends another class 
// one class implements an interface 
// one interface extends another interface 
// interface can not extend / implement a class 

interface FinMin { // finance ministry
	abstract void followRules();
}

interface Rbi {
	abstract void doKyc();
}

class Bank {
	
}

class HdfcBank implements Rbi, FinMin {

	@Override
	public void followRules() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doKyc() {
		// TODO Auto-generated method stub
		
	}
	
}

public class App {
	
	public static void main(String[] args) {
		HdfcBank obj = new HdfcBank();
//		Rbi obj2 = new Rbi(); // not possible 

		
	}

}




