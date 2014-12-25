package com.crazyfundu.github.algorithmsolutions.stack.problems;

import java.util.ArrayList;
import java.util.List;

import com.crazyfundu.github.algorithmsolutions.stack.Stack;

/**
 * Imagine a (literal) stack of plates  If the stack gets too high, it might topple  Therefore, in real life, we would likely start a new stack when the previous stack exceeds
   some threshold  Implement a data structure SetOfStacks that mimics this  SetOfStacks should be composed of several stacks, and should create a new stack once
   the previous one exceeds capacity  SetOfStacks push() and SetOfStacks pop() should
   behave identically to a single stack (that is, pop() should return the same values as it
   would if there were just a single stack) 
   FOLLOW UP
   Implement a function popAt(int index) which performs a pop operation on a specific
   sub-stack. 
 * @author AvneeshS1
 *
 */
public class SetOfStacks {
	public static final int THRESHOLD = 3;
	List<Stack<Integer>> listOfStacks;
	int currentStackIndex; 
	
	SetOfStacks(){
		listOfStacks = new ArrayList<Stack<Integer>>();
		currentStackIndex = 0;
	}
	
	public void push(int value){
		Stack<Integer> stack = null;
		if(listOfStacks.isEmpty()){ //means the listofstacks is empty
			stack = new Stack<Integer>(3);
			stack.push(value);
			listOfStacks.add(stack);
		}else {
			stack = listOfStacks.get(currentStackIndex);
            if(stack.size()>=THRESHOLD){
              stack = new Stack<Integer>(3);
              currentStackIndex++;
              stack.push(value);
              listOfStacks.add(stack);
             }else{
               stack.push(value);
             }
		}
	}
	
	public int pop(){
		Stack<Integer> stack = listOfStacks.get(currentStackIndex);
		if(stack.isEmpty()){
			System.out.println("Set of stack is empty");
			return -1;
		}
		return popFromTheStack(stack);
	}

	
	public int popAt(int index){
		Stack<Integer> stack = listOfStacks.get(index);
		if(stack.isEmpty()){
			System.out.println("Stack is empty my lord");
			return -1;
		}
		return popFromTheStack(stack);
	}

	private int popFromTheStack(Stack<Integer> stack) {
		int temp;
		if(stack.size() == 1){
			temp = stack.pop();
			//nullify the reference
			listOfStacks.remove(currentStackIndex);
			currentStackIndex--;
		}else{
			temp = stack.pop();
		}
		return temp;
	}
	
	public String toString(){
		StringBuilder str = new StringBuilder();
		for (Stack<Integer> stack : listOfStacks) {
			str.append(stack.toString()+"\n");
		}
		return str.toString();
	}
}



