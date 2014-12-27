package com.crazyfundu.github.algorithmsolutions.oopsdesign.recursion;

import java.util.ArrayList;
import java.util.List;

public class PermutationsOfStrings {
	static String str;
	PermutationsOfStrings(String str){
		this.str = str;
	}
	
	public static void main(String[] args) {
		PermutationsOfStrings p = new PermutationsOfStrings("String");
		System.out.println(getpermutations(str));
	}

	private static List<String> getpermutations(String str) {
		if(str == null || str.length()==0 ) return null;
		List<String> list = new ArrayList<String>(); 
		StringBuilder sbr = new StringBuilder(str);
		if(sbr.length() == 2){
			list.add(new StringBuilder(sbr.substring(0, 1)).append(sbr.subSequence(1, 2)).toString());
			list.add(new StringBuilder(sbr.substring(1,2)).append(sbr.subSequence(0, 1)).toString());
			return list;
		}else{
			String s = str.substring(0,1);
			list = getpermutations(str.substring(1));
			return insertAtAllPositions(list, s);
		}
	}

	private static List<String> insertAtAllPositions(List<String> list, String s) {
		List<String> tempList = new ArrayList<String>();
		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j <= list.get(i).length(); j++) {
			StringBuilder sbr = new StringBuilder(list.get(i));
			sbr.insert(j, s);
			tempList.add(sbr.toString());
			}
		}
		return tempList;
	}
}