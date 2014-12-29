package com.crazyfundu.github.algorithmsolutions.sortingandsearching.GenericImplementations.problems;

public class SearchEmptyStringArray {
	
	private String[] str;

	public SearchEmptyStringArray(String[] str) {
		this.str = str;
	}
	
	public static void main(String[] args) {
		String[] str = new String[]{"a", "", "", "" ,"", "c", ""};
		SearchEmptyStringArray sm = new SearchEmptyStringArray(str);
		sm.search(str, "b", 0, str.length-1);
	}

	private void search(String[] str, String s, int l, int u) {
		if(u < l  ){
			System.out.println(-1);
			return;
		}
		int m  = checkIfEmptyTheMove(str, l, u);
		if(m  == -1){
			System.out.println(-1);
			return;
		}
		if(s.compareTo(str[m]) ==1){
			l = m+1;
			search(str, s, l, u);
		}else if(s.compareTo(str[m]) == -1){
			u = m-1;
			search(str, s, l, u);
		}else{
			System.out.println(m);
		}
	}

	private int checkIfEmptyTheMove(String[] str,int l, int u) {
		int m = (u-l)/2;
		int temp = m;
		while(str[m].equals("") && m < str.length){
			m--;
			if(str[m].equals(str[l])){// We moved in wrong direction, about turn after resetting the original position
				m = temp;
				while(str[m].equals("") && m < str.length){
					m++;
					if(str[m].equals(str[u])){
						return -1;
					}
				}
				return m;
			}
		}
		return m;
		
	}

}
