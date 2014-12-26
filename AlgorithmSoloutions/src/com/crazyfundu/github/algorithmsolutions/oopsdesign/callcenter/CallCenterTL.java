package com.crazyfundu.github.algorithmsolutions.oopsdesign.callcenter;

import java.util.ArrayList;

public class CallCenterTL extends CallCenterEmployee{
	public CallCenterTL(long employeeId, String name) {
		this.name = name;
		this.employeeID = employeeId;
		this.employeeLevel = EmployeeLevel.TL;
		this.handledCalls = new ArrayList<CallCenterCall>();
	}
}
