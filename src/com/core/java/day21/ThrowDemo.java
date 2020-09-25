package com.core.java.day21;

public class ThrowDemo {

	static void sendSms(Long recieverNumber) throws Exception {

		if (recieverNumber.toString().length() < 10) {
			// code ? - Phone SmartPhone Samsung Oppo OnePlus
			throw new Exception("Invalid number");
		} else {
			sendSucccessfully();
		}

	}

	private static void sendSucccessfully() {
		// TODO Auto-generated method stub

	}

	static void checkEligibilty(int age) throws Exception {
		if (age < 18) {
			throw new Exception("Can not vote.");
		} else {
			System.out.println("Vote for India.");
		}
	}
}

class User {

	static void m1() {
		try {
			ThrowDemo.checkEligibilty(17);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}