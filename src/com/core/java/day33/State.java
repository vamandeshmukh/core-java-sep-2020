package com.core.java.day33;

public enum State {

	TELANGANA("TS"), MAHARASHTRA("MH"), KARNATAKA("KA"), ANDHRA_PRADESH("AP"), PUNJAB("PB"), OTHER_STATE("OS");

	public final String STATE_CODE;

	State(String stateCode) {
		this.STATE_CODE = stateCode;
	}

	public String getStateCode() {
		return STATE_CODE;
	}

}
