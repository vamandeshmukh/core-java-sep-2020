package com.core.java.day15;

// abstract class 
abstract class SomeClass {
	// 
}


// concrete class 
class BasicPhone {
	// 
}

class Phone {
	
	void call() {
		System.out.println("Calling...");
	}

	void sms() {
		System.out.println("Sending SMS...");
	}
}

class FeaturePhone extends Phone { // 

	void camera() {
		System.out.println("Taking pics...");
	}
}

class SmartPhone extends FeaturePhone {
	
	void whatsApp() {
		System.out.println("Chatting...");
	}
}

public class InheritanceDemo {
	public static void main(String[] args) {
		
		Phone phone = new  Phone();
		phone.call();
		phone.sms();
		
		FeaturePhone featurePhone = new FeaturePhone();
		featurePhone.call();
		featurePhone.sms();
		featurePhone.camera();
		
		SmartPhone smartPhone = new SmartPhone();
		smartPhone.call();
		smartPhone.sms();
		smartPhone.whatsApp();


	}
}
