package com.crazyfundu.github.algorithmsolutions.oopsdesign.callcenter;

import java.util.List;

abstract public class CallCenterEmployee {
	private boolean isBusy;
	private CallCenterCall call;
	protected List<CallCenterCall> handledCalls;
	protected EmployeeLevel employeeLevel;
	protected long employeeID;
	protected String name;
	
	public boolean isBusy() {
		return isBusy;
	}
	public void setBusy(boolean isBusy) {
		this.isBusy = isBusy;
	}
	public CallCenterCall getCall() {
		return call;
	}
	public void setCall(CallCenterCall call) {
		this.call = call;
	}
	public List<CallCenterCall> getHandledCalls() {
		return handledCalls;
	}
	public void setHandledCalls(List<CallCenterCall> handledCalls) {
		this.handledCalls = handledCalls;
	}
	public EmployeeLevel getEmployeeLevel() {
		return employeeLevel;
	}
	public void setEmployeeLevel(EmployeeLevel employeeLevel) {
		this.employeeLevel = employeeLevel;
	}
	public long getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(long employeeID) {
		this.employeeID = employeeID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
