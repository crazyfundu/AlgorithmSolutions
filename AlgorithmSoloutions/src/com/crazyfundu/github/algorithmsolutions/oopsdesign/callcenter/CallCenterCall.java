package com.crazyfundu.github.algorithmsolutions.oopsdesign.callcenter;

public class CallCenterCall {
	String callMessage;
	String Dept;
	CallCenterCustomer customer;
	boolean isHandled;
	
	public CallCenterCall(CallCenterCustomer customer, String callMessage) {
		this.customer = customer;
		this.callMessage = callMessage;
	}
}
