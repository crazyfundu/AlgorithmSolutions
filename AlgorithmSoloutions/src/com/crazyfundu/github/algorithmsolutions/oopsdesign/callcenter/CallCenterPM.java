package com.crazyfundu.github.algorithmsolutions.oopsdesign.callcenter;

import java.util.ArrayList;

public class CallCenterPM extends CallCenterEmployee{
	public CallCenterPM(long employeeId, String name) {
		this.name = name;
		this.employeeID = employeeId;
		this.employeeLevel = EmployeeLevel.PM;
		this.handledCalls = new ArrayList<CallCenterCall>();
	}
}
