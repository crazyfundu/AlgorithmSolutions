package com.crazyfundu.github.algorithmsolutions.sortingandsearching.GenericImplementations.problems;

import java.util.Arrays;
import java.util.Comparator;

public class SortingAnagramStrings {
	private String[] stringAr;

	public SortingAnagramStrings(String[] stringAr) {
		this.stringAr = stringAr;
	}
	
	public static void main(String[] args) {
		SortingAnagramStrings s = new SortingAnagramStrings(new String[]{"abc","bca","syz", "yzs"});
		System.out.println(Arrays.asList(s.sortString()));
	}
	
	public String[] sortString(){
		Arrays.sort(stringAr, new AnagramCoparator());
		return stringAr;
	}
}


class AnagramCoparator implements Comparator<String>{

	public int compare(String s1, String s2) {
		return sortString(s1).compareTo(s2);
	}

	private String sortString(String s1) {
		char[] ch = s1.toCharArray();
		Arrays.sort(ch);
		return ch.toString();
	}
}