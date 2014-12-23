package com.crazyfundu.github.algorithmsolutions.stack.problems;

/**
 * Describe how you could use a single array to implement three stacks 
 * @author AvneeshS1
 * 
 * Approach 1:
 * Assuming we do not have any information about the types of stacks a dn the space they would take 
 * therefore we will divide an array into 1/3 parts for each stack like [0-1/3, 1/3-2/3, 2/3-1]
 *
 */

public class ThreeStackSingleArrayPartitionApproach {
	public static int defaultStackSize = 3; // Have mentioned the default size. 
	public int[] arr = new int[defaultStackSize];
	public int[] stackTopIndexes = new int[] {0,0,0};

	public ThreeStackSingleArrayPartitionApproach(int size) {
		arr = new int[size];
		initializeIndexes();
	}
	public ThreeStackSingleArrayPartitionApproach(){
		this(defaultStackSize);
		initializeIndexes();
	}
	private void initializeIndexes() {
		stackTopIndexes[0] = 0;
		stackTopIndexes[1] = arr.length/3;
		stackTopIndexes[2] = 2*arr.length/3;
	}
	
	void push(int stackNum, int value){
		int top = getRelevantTop(stackNum);
		int endIndex = getEndIndex(stackNum);
		
		if(top == endIndex){
			System.out.println("Sorry man, stack is full!!!");
			return;
		}
		arr[top] = value;
		stackTopIndexes[stackNum]++;
	}
	
	int peek(int stackNum){
		int top = getRelevantTop(stackNum);
		return arr[top];
	}
	
	int pop(int stackNum){
		int top = getRelevantTop(stackNum);
		int temp = arr[top];
		arr[top] = 0;
		return temp;
	}
	
	private int getEndIndex(int stackNum) {
		return (stackNum+1)*arr.length/3;
	}
	
	private int getRelevantTop(int stackNum) {
		return stackTopIndexes[stackNum];
	}
	
	public String toString(){
		StringBuilder str = new StringBuilder();
		str.append("Arrays: \n");
		for (int i = 0; i < arr.length; i++) {
			if(i == arr.length/3 || i== 2*arr.length/3){
				str.append("\n");
			}
			str.append(arr[i]+" ");
		}
		return str.toString();
	}
}










