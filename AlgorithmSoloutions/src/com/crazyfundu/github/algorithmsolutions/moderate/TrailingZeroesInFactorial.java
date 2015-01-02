package com.crazyfundu.github.algorithmsolutions.moderate;

/**
 * Write an algorithm which computes the number of trailing zeros in n factorial.
 * @author AvneeshS1
 *
 */
public class TrailingZeroesInFactorial {
	public static void main(String[] args) {
		//System.out.println(factorial(25));
		trailingZeroes(25);
	}
	
	public static void trailingZeroes(long n){
		int count = 0;
		for (int i = 5; n/i > 0; i=i*5) {
			count += n/i;
		}
		
		System.out.println(count);
	}
	
	public static long factorial(int n){
		if(n==1){
			return 1;
		}
		return n*factorial(n-1);
	}
}
