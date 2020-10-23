package com.core.java.day17;

//Samsung.java
class Phone {
	void call() {
		System.out.println("Make call.");
	}

	void sms() {
		System.out.println("Send SMS");
	}
}

class FeaturePhone extends Phone { // single inheritance
	private void mms() {
		System.out.println("Send MMS");
	}

	void music() {
		System.out.println("Play music");
	}
}

class SmartPhone extends FeaturePhone { // multilevel inheritance
	
	private void m1() {
		// code 
	}
	void camera() {
		System.out.println("Snap a pic");
	}
	
	@Override
	void music() {
		System.out.println("Play music with Dolby");
	}
}

public class Samsung extends SmartPhone {
	// 
	
	public static void main(String[] args) {
		Samsung obj1 = new Samsung();
		obj1.call();
		obj1.sms();
		obj1.music();
		obj1.camera();
//		obj1.m1();
	}
}
