package com.crazyfundu.github.algorithmsolutions.oopsdesign.recursion;

import java.util.ArrayList;
import java.util.List;

public class Fibonocci {
	int number;
	Fibonocci(int num){
		this.number = num;
	}
	
	public static void main(String[] args) {
		FibonocciRecursive f = new FibonocciRecursive(3);
		FibonocciIterative f2 = new FibonocciIterative(3);
	}
}

class FibonocciIterative{
List<Integer> cache = new ArrayList<Integer>();
	FibonocciIterative(int num){
		cache.add(0);
		cache.add(1);
		System.out.println(printFibonocci(num));
	}
	int printFibonocci(int num1){
		int i;
		if(num1==0){
			return 0;
		}
		if(num1==1){
			return 1;
		}
		for (i = 2; i < num1; i++) {
			cache.add(cache.get(i-1)+cache.get(i-2)); 
		}
		System.out.println(cache);
		return cache.get(num1-1);
	}
}

class FibonocciRecursive{
	public FibonocciRecursive(int num) {
		System.out.println(printFibonocci(num));
	}
	
	public int printFibonocci(int n){
		if(n==0){
			return 0;
		}
		if(n==1){
			return 1;
		}
		
		return (printFibonocci(n-1)+printFibonocci(n-2));
	}
}
