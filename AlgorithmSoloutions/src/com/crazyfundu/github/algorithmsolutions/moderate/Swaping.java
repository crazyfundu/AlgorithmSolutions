package com.crazyfundu.github.algorithmsolutions.moderate;
/**
 * Write a function to swap a number in place without temporary variables 
 * @author AvneeshS1
 *
 */
public class Swaping{
	static double first;
	static double second;
	
	Swaping(double f, double s){
		this.first = f;
		this.second = s;
	}
	
	public static void main(String[] args) {
		Swaping s = new Swaping(1, 2);
		s.swap();
		swap_opt(1,2);
	}
	
	public void swap(){
		System.out.println("Before:		first "+ first + ", "+ "second "+ second);
		first = (first+second)/2;
		second = first - second;
		
		second = first + second;
		first = first*2 - second ;
		System.out.println("Before:		first "+ first + ", "+ "second "+ second);
	}
	
	public static void swap_opt(int a, int b) {
		 a = a^b;
		 System.out.println(a);
		 b = a^b;
		 System.out.println(b);
		 a = a^b;
		 System.out.println(a);
		
		System.out.println("a: " + a);
		 System.out.println("b: " + b);
		 }
}
