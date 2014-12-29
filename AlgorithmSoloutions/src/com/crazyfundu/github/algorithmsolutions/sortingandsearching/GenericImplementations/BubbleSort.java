package com.crazyfundu.github.algorithmsolutions.sortingandsearching.GenericImplementations;

import java.util.ArrayList;
import java.util.List;

public class BubbleSort<E extends Comparable<E>> {
	List<E> list = new ArrayList<E>();
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(5);
		list.add(4);
		list.add(5);
		list.add(2);
		list.add(7);
		list.add(1);
		BubbleSort<Integer> bs = new BubbleSort<Integer>(list);
		bs.sort(list);
	}
	
	public BubbleSort(List<E> list) {
		this.list = list;
	}
	
	public void sort(List<E> list){
		System.out.println("unsorted "+list);
		for (int i = 0; i < list.size(); i++) {
			for (int k = 0; k < list.size()-1; k++) {
                     if(list.get(k).compareTo(list.get(k+1)) == 1){
                             E temp = list.get(k);
                             list.set(k, list.get(k+1));
                             list.set(k+1,temp);
                     }
			}
		}
		System.out.println("sorted "+list);
	}
}
