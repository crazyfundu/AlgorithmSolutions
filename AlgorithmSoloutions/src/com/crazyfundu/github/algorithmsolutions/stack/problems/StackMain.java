package com.crazyfundu.github.algorithmsolutions.stack.problems;

import java.util.Random;

public class StackMain {
	public static void main(String[] args) {
		MinMaxStack<Integer> minMaxStack = new MinMaxStack<Integer>();
		Random ran = new Random();
		for (int k = 0; k < 10; k++) {
			minMaxStack.push(ran.nextInt(100));
		}
		System.out.println(minMaxStack);
		
		System.out.println(minMaxStack.max());
		System.out.println(minMaxStack.min());
		
		
		minMaxStack.push(70);
		minMaxStack.push(10);
		System.out.println(minMaxStack.max());
		System.out.println(minMaxStack.min());
	}
}
