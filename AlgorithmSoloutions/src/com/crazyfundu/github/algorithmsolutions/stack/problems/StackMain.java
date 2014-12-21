package com.crazyfundu.github.algorithmsolutions.stack.problems;

import java.util.Random;

import com.crazyfundu.github.algorithmsolutions.stack.Stack;

public class StackMain {
	public static void main(String[] args) {
		MinMaxStack minMaxStack = new MinMaxStack();
		
		Random ran = new Random();
		for (int k = 0; k < 10; k++) {
			minMaxStack.push(ran.nextInt(100));
		}
		System.out.println(minMaxStack);
	}

}
