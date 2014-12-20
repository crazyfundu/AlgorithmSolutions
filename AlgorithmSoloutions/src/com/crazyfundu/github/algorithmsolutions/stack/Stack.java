package com.crazyfundu.github.algorithmsolutions.stack;

import java.util.Arrays;

public class Stack<E> implements IStack<E> {
	protected E[] elements = null;
	protected int top = -1;
	protected int size= 0;
	private static final int DEFAULT_CAPACITY = 10;

	public Stack(){
		this(DEFAULT_CAPACITY);
	}

	public Stack(int size){
		if(size <0){
			throw new IllegalArgumentException("Initial capacity cannot be negative or zero");
		}
		elements = (E[]) new Object[size];
	}
	
	public void push(E element) {
		ensureCapacity();
		elements[top+1] = element;
		size++;
	}

	public E pop() {
		E element = null;
		if(!isEmpty()){
			element = elements[top];
			//Nullify the reference
			elements[top] = null;
			top--; size --;
			return element;
		}else{
			System.out.println("The stack is empty");
			return null;
		}
	}
	
	public E peep() {
		if(!isEmpty()){
			return elements[top];
		}else{
			System.out.println("Stack is empty");
			return null;
		}
	}

	public int size() {
		return top;
	}

	public boolean isEmpty() {
		return size==0;
	}
	
	// The method to adjust the size of the stack
	private void ensureCapacity() {
		if(size==elements.length){
			//The stack has reached it's size 
			elements = Arrays.copyOf(elements, size * 2);
		}
	}
	
	public String toString(){
		return "The Stack is has:: "+Arrays.toString(elements) + ", size: "+size+", top: "+top;
	}
}
