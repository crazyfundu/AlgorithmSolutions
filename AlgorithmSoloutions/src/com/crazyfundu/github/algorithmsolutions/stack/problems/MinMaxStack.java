package com.crazyfundu.github.algorithmsolutions.stack.problems;

import com.crazyfundu.github.algorithmsolutions.stack.Stack;

/**
 *  How would you design a stack which, in addition to push and pop, also has a function
 *  min which returns the minimum element? Push, pop and min should all operate in
 *  SO(1) time. 
 */

public class MinMaxStack<E extends Comparable<E>> extends Stack<E>{
	//E[] elements;
	private E min;
	private E max;
	
	public MinMaxStack(){
		this(DEFAULT_CAPACITY);
	}
	
	public MinMaxStack(int size){
		if(size <= 0){
			throw new IllegalArgumentException("Initial capacity cannot be negative or zero");
		}
		elements = new Object[size];
	}
	
	/*
	 * Approach 1:
	 * For push method we can push and update the minimum/maximum value 
	 * For pop method we will be traversing whole stack to find out the new minimum/maximum
	 *
	 */
	@Override
	public void push(E element){
		ensureCapacity();
		if(isEmpty()){
			this.min = element;
			this.max = element;
			elements[top+1] = element;
			size++;
			top++;
		}else{
			if(element.compareTo(min)<0){
				min = element;
			}
			if(element.compareTo(max)>0){
				max = element;
			}
			elements[top+1] = element;
			size++;
			top++;
		}
	}
	
	@Override
	public E pop(){
		if(isEmpty()){
			System.out.println("Stack is empty");
			return null;
		}
		@SuppressWarnings("unchecked")
		E temp = (E) elements[top];
		if(temp == min){
			min = resetNewMin();
		}
		if(temp == max){
			max = resetNewMax();
		}
		return max;
	}
	
	@SuppressWarnings("unchecked")
	private E resetNewMin() {
		E tempMin = (E) elements[0];
		for (int i = 1; i < top-1; i++) {
			if(((Comparable<E>) elements[i]).compareTo(tempMin)<0){
				tempMin = (E) elements[i];
			}
		}
		return tempMin;
	}
	
	@SuppressWarnings("unchecked")
	private E resetNewMax() {
		E tempMax = (E) elements[0];
		for (int i = 1; i < top-1; i++) {
			if(((Comparable<E>) elements[i]).compareTo(tempMax)>0){
				tempMax = (E) elements[i];
			}
		}
		return tempMax;
	}

	public E min() {
		if(isEmpty()){
			System.out.println("The stack is empty");
		}
		return min;
	}

	public E max() {
		return  max;
	}
	
	
}
