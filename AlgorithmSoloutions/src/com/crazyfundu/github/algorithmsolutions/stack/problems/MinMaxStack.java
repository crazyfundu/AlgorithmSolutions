package com.crazyfundu.github.algorithmsolutions.stack.problems;

import com.crazyfundu.github.algorithmsolutions.stack.Stack;

/**
 *  How would you design a stack which, in addition to push and pop, also has a function
 *  min which returns the minimum element? Push, pop and min should all operate in
 *  SO(1) time. 
 */

public class MinMaxStack extends Stack<Integer> implements IMinMaxStack<Integer>{
	
	private int min;
	private int max;
	/*
	 * Approach 1:
	 * For push method we can push and update the minimum/maximum value 
	 * For pop method we will be traversing whole stack to find out the new minimum/maximum
	 *
	 */
	@Override
	public void push(Integer element){
		if(isEmpty()){
			this.min = element;
			this.max = element;
			elements[top+1] = element;
			size++;
		}else{
			if(element < min){
				min = element;
			}
			if(element > max){
				max = element;
			}
			elements[top+1] = element;
			size++;
		}
	}
	
	@Override
	public Integer pop(){
		if(isEmpty()){
			System.out.println("Stack is empty");
			return null;
		}
		Integer temp = elements[top];
		if(temp == min){
			min = resetNewMin();
		}
		if(temp == max){
			max = resetNewMax();
		}
		return max;
	}
	
	private int resetNewMin() {
		int tempMin = elements[0];
		for (int i = 1; i < elements.length-1; i++) {
			if(elements[i]<tempMin){
				tempMin = elements[i];
			}
		}
		return tempMin;
	}
	
	private int resetNewMax() {
		int tempMax = elements[0];
		for (int i = 1; i < elements.length-1; i++) {
			if(elements[i]>tempMax){
				tempMax = elements[i];
			}
		}
		return tempMax;
	}

	public int min() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int max() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
