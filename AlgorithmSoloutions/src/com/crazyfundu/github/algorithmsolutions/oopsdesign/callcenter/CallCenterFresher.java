package com.crazyfundu.github.algorithmsolutions.oopsdesign.callcenter;

import java.util.ArrayList;

public class CallCenterFresher extends CallCenterEmployee{
	public CallCenterFresher(long employeeId, String name) {
		this.name = name;
		this.employeeID = employeeId;
		this.employeeLevel = EmployeeLevel.FRESHER;
		this.handledCalls = new ArrayList<CallCenterCall>();
	}
}
