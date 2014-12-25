package com.crazyfundu.github.algorithmsolutions.stack.problems;

import java.util.ArrayList;
import java.util.List;

import com.crazyfundu.github.algorithmsolutions.stack.Stack;

/**
 * In the classic problem of the Towers of Hanoi, you have 3 rods and N disks of different
   sizes which can slide onto any tower  The puzzle starts with disks sorted in ascending
   order of size from top to bottom (e g , each disk sits on top of an even larger one)  You
   have the following constraints:
   (A) Only one disk can be moved at a time 
   (B) A disk is slid of the top of one rod onto the next rod 
   (C) A disk can only be placed on top of a larger disk 
   Write a program to move the disks from the fist rod to the last using Stacks
 * @author AvneeshS1
 *
 */
public class TowerOfHanoi {
	int numberOfPlates;
	List<Plate> totalPlateList = new ArrayList<Plate>();
	static final int NUMBER_OF_RODS= 3;
	static Rod rod1 = null;
	static Rod rod2 = null;
	static Rod rod3 = null;
	
	public TowerOfHanoi(int numberOfPlates) {
		initialize(NUMBER_OF_RODS,numberOfPlates);
	}
	
	public static void main(String[] args) {
		TowerOfHanoi towerOfHanoi = new TowerOfHanoi(3);
		System.out.println(rod1);
		System.out.println(rod2);
		System.out.println(rod3);
		towerOfHanoi.shiftThePlates(3, towerOfHanoi.rod1,towerOfHanoi.rod2, towerOfHanoi.rod3);
	}

	private void initialize(int numberOfRods, int numberOfPlates2) {
		rod1 = new Rod();
		rod2 = new Rod();
		rod3 = new Rod();
		
		Plate plate1 = new Plate(1);
		Plate plate2 = new Plate(2);
		Plate plate3 = new Plate(3);
		
		rod1.addPlate(plate3);
		rod1.addPlate(plate2); 
		rod1.addPlate(plate1);
		
	}

	private void shiftThePlates(int numberOfPlates2, Rod rod1, Rod rod2, Rod rod3) {
		if(numberOfPlates2==1){
			moveOnTop(rod1, rod2);
		}
		shiftThePlates(numberOfPlates2-1, rod1, rod3, rod2);
		moveOnTop(rod1, rod2);
		shiftThePlates(numberOfPlates2-1, rod3, rod2, rod1);
	}

	private void moveOnTop(Rod rod3, Rod rod2) {
		rod2.plateStack.push(rod2.plateStack.pop());
	}
}

class Plate implements Comparable<Plate>{
	int size ;
	Plate(int size){
		this.size = size;
	}
	public int compareTo(Plate o) {
		int t;
		if(o==null) return -1;

		if(this.size < o.size){
			t = -1;
		}else if(this.size >o.size){
			t = 1;
		}else{
			t = 0;
		}
		return t;
	}
	
	public String toString(){
		return Integer.toString(size);
	}
}

class Rod{
	Stack<Plate> plateStack= new Stack<Plate>(3);

	public void addPlate(Plate plate){
		plateStack.push(plate);
	}
	
	public String toString(){
		return plateStack.toString();
	}
}







