package com.crazyfundu.github.algorithmsolutions.sortingandsearching.GenericImplementations.problems;
/**
 *Given a sorted array of n integers that has been rotated an unknown number of
times, give an O(log n) algorithm that fids an element in the array  You may assume
that the array was originally sorted in increasing order 
EXAMPLE:
Input: fid 5 in array (15 16 19 20 25 1 3 4 5 7 10 14)
Output: 8 (the index of 5 in the array)

 Logic:-
 Have used the special type of binary search. Boundaries are determined by this formula
 x(x+1)/2 = length of array, which is basically the sum of the natural numbers which would give the sum equal to the length of the 
 array. Every iteration reduces the boundary width by 1. in this way When it will reach to the end the it will converge to a single value.
 Like - If suppose the length is 9. Then the boundary comes out to be 4 from abve formula.
 Search iterations will be 4,3,2,1 ~ 9. so we will be sure that in worst case we will get our number
 
 
 NOTE: NOT  WORKING AS OF NOW.
 
 * @author AvneeshS1
 *
 */
public class CircularRotatedArray {
	private int[] ar;

	public CircularRotatedArray(int [] ar) {
		this.ar = ar;
		search(ar, 5, 0, ar.length-1);
	}
	
	public static void main(String[] args) {
		int ar[] = new int[]{
				6,7,8,0,1,2,3,4,5
		};
		CircularRotatedArray cr = new CircularRotatedArray(ar);
	}
	
	public void search(int[] ar, int x, int l, int u){
		if(l > ar.length || l < 0 || u < 0 || u >ar.length){
			return;
		}
		int till = (int) ((Math.sqrt(8*(u-l)+1))-1)/2 +1;
		while(x!=ar[l] ) {
			if(x == ar[l+till]){
				System.out.println(l+till);
				return;
			}
			if(x > ar[l] && x < ar[l+till]){
				search(ar,x,l,l+till);
			}else{
				l = l+till;
				till = till -1;
				u = u+till;
				search(ar,x,l,u);
			}
		}
		 System.out.println(l);
	}
}
