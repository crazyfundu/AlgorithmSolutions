package com.crazyfundu.github.algorithmsolutions.oopsdesign.callcenter;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CallCenter {
	List<CallCenterPM> pmList = new ArrayList<CallCenterPM>();
	List<CallCenterTL> tlList = new ArrayList<CallCenterTL>();
	List<CallCenterFresher> fresherList = new ArrayList<CallCenterFresher>();
	Queue<CallCenterCall> callQ = new LinkedList<CallCenterCall>();
	List<CallCenterFresher> freeFresherList = new ArrayList<CallCenterFresher>();
	static CallCenterPM currentPM;
	static CallCenterTL currentTL;

	CallCenter(){
		initialize();
		freeFresherList.addAll(fresherList);
	}
	
	public CallCenterEmployee getCallHandler(CallCenterCall call){
		callQ.add(call);
		if(!freeFresherList.isEmpty()){
			CallCenterFresher assignedFresher = freeFresherList.get(0);
			assignedFresher.setCall(call);
			assignedFresher.setBusy(true);
			freeFresherList.remove(0);
			return assignedFresher;
		}else if(!currentTL.isBusy()){
			currentTL.setBusy(true);
			currentTL.setCall(call);
			return currentTL;
		}else if(!currentPM.isBusy()){
			currentPM.setBusy(true);
			currentPM.setCall(call);
			return currentPM;
		}
		return null;
	}

	private void initialize() {
		addFreshsers();
		addTLs();
		addPMs();
	}

	private void addTLs() {
		CallCenterTL tl1 = new CallCenterTL(4, "pitaji");
		currentTL = tl1;
		tlList.add(tl1);
	}

	private void addPMs() {
		CallCenterPM pm1 = new CallCenterPM(5, "mataji");
		currentPM = pm1;
		pmList.add(pm1);
	}

	private void addFreshsers() {
		CallCenterFresher fresher1 = new CallCenterFresher(1, "Naresh");
		CallCenterFresher fresher2 = new CallCenterFresher(2, "Suresh");	
		CallCenterFresher fresher3 = new CallCenterFresher(3,"Tailor");
		fresherList.add(fresher3);
		fresherList.add(fresher2);
		fresherList.add(fresher1);
	}
}