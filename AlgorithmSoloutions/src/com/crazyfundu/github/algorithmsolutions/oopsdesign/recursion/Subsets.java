package com.crazyfundu.github.algorithmsolutions.oopsdesign.recursion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Write a method that returns all subsets of a set.
 * @author AvneeshS1
 *
 */
public class Subsets {
	List<String> finalList = new ArrayList<String>();
	Subsets(Set set){
		ArrayList list = new ArrayList();
		list.addAll(set);
		//printAllsubSets(list);
		System.out.println(getSubsets(list, 1));
	}
	
	public static void main(String[] args) {
		Set<Integer> set1 = new HashSet<Integer>();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		
		Subsets sub = new Subsets(set1);
	}
	/**
	 * []
	 * [] [3]
	 * [] [3] [2] [3 2]
	 * [] [3] [2] [3 2] [1] [3 1] [2 1] [3 2 1]   <== answer
	 * @param set
	 * @param index
	 * @return
	 */
	static ArrayList<ArrayList<Integer>> getSubsets(ArrayList<Integer> set,
			   int index) {
			ArrayList<ArrayList<Integer>> allsubsets;
			 if (set.size() == index) {
			  allsubsets = new ArrayList<ArrayList<Integer>>();
			  allsubsets.add(new ArrayList<Integer>()); // Empty set
			 } else {
			  allsubsets = getSubsets(set, index + 1);
			  int item = set.get(index);
			  ArrayList<ArrayList<Integer>> moresubsets =
			  new ArrayList<ArrayList<Integer>>();
			  for (ArrayList<Integer> subset : allsubsets) {
			  ArrayList<Integer> newsubset = new ArrayList<Integer>();
			  newsubset.addAll(subset); //
			 newsubset.add(item);
			  moresubsets.add(newsubset);
			}
			  allsubsets.addAll(moresubsets);
			}
			 return allsubsets;
			 }
}