package com.crazyfundu.github.algorithmsolutions.oopsdesign.recursion;

/**
 * Given an infiite number of quarters (25 cents), dimes (10 cents), nickels (5 cents) and
 * pennies (1 cent), write code to calculate the number of ways of representing n cents
 * @author AvneeshS1
 *
 *Logic one:-
 *Recurse for each denomination individualy and recurse.
 *
 *Logic 2:-
 *This is a recursive problem, so let’s fiure out how to do makeChange(n) using prior solutions
(i e , sub-problems)  Let’s say n = 100, so we want to compute the number of ways of making
change of 100 cents  What’s the relationship to its sub-problems?
We know that makeChange(100):
= makeChange(100 using 0 quarters) + makeChange(100 using 1 quarter) + makeChange(100
using 2 quarter) + makeChange(100 using 3 quarter) + makeChange(100 using 4 quarter)
Can we reduce this further? Yes!
= makeChange(100 using 0 quarters) + makeChange(75 using 0 quarter) + makeChange(50
using 0 quarters) + makeChange(25 using 0 quarters) + 1
Now what? We’ve used up all our quarters, so now we can start applying our next biggest
denomination: dimes
 *
 */
public class RepresentNCents {
	public RepresentNCents(int n) {
		printAllConbinations(n);
	}
	
	public static void main(String[] args) {
		RepresentNCents r = new RepresentNCents(25);
	}

	private void printAllConbinations(int n) {
		int q = 0;
		int d= 0;
		int ni = 0;
		int p = 0;
		print(q,d,ni,p,n);
	}

	private void print(int q, int d, int ni, int p, int n) {
		if(n>=25){
			print(q+1, d, ni, p, n-25);
		}
		if(n>=10 ){
			print(q,d+1,ni,p,n-10);		
		}
		if(n>=5){
			print(q,d,ni+1,p,n-5);
		}
		if(n>0){
			print(q,d,ni,n,0);
			return;
		}
		if(!(q==0 && d==0 && ni==0 && p==0 ))
			System.out.println(q + " " + d + " " + ni + " "+ p);
	}
}
