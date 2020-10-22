package com.core.java.day33;

//enum SomeEnum {
//	
//	ONE, TWO, THREE
//}

public class EnumDemo {

	public static void main(String[] args) {

//		Day mon = Day.MONDAY;
//		System.out.println(mon);

//		State MH = State.MAHARASHTRA;
//		System.out.println(MH);
		
//		State myState = State.TELANGANA;
//		System.out.println(myState.getStateCode());
		
		for (State state: State.values()) {
			System.out.println(state);
		}

	}

}
