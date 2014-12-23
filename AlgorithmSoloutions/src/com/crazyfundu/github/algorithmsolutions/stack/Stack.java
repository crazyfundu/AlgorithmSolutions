package com.crazyfundu.github.algorithmsolutions.stack;

import java.util.Arrays;

public  class Stack<E> implements IStack<E> {
	protected Object[] elements = null;
	protected int top = -1;
	protected int size= 0;
	protected static final int DEFAULT_CAPACITY = 10;

	public Stack(){
		this(DEFAULT_CAPACITY);
	}

	public Stack(int size){
		if(size <0){
			throw new IllegalArgumentException("Initial capacity cannot be negative or zero");
		}
		elements = new Object[size];
	}
	
	public void push(E element) {
		ensureCapacity();
		elements[top+1] = element;
		size++;
		top++;
	}

	@SuppressWarnings("unchecked")
	public E pop() {
		E element = null;
		if(!isEmpty()){
			element = (E) elements[top];
			//Nullify the reference
			elements[top] = null;
			top--; size --;
			return element;
		}else{
			System.out.println("The stack is empty");
			return null;
		}
	}
	
	@SuppressWarnings("unchecked")
	public E peep() {
		if(!isEmpty()){
			return (E) elements[top];
		}else{
			System.out.println("Stack is empty");
			return null;
		}
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size==0;
	}
	
	// The method to adjust the size of the stack
	 protected void ensureCapacity() {
		if(size==elements.length){
			//The stack has reached it's size 
			elements = Arrays.copyOf(elements, size * 2);
		}
	}
	
	public String toString(){
		return "The Stack has:: "+Arrays.toString(elements) + ", size: "+size+", top: "+top;
	}

}
