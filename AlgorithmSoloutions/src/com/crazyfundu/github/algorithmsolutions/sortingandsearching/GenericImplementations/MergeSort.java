package com.crazyfundu.github.algorithmsolutions.sortingandsearching.GenericImplementations;

import java.util.ArrayList;
import java.util.List;

public class MergeSort<E extends Comparable<E>> {
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(5);
		list.add(4);
		list.add(5);
		list.add(2);
		list.add(7);
		list.add(1);
		MergeSort<Integer> bs = new MergeSort<Integer>();
		System.out.println(bs.sort(list));
	}
	
	public List<E> sort(List<E> list){
		if(list!=null && list.size() <=0) return null;
		
		System.out.println("unsorted " + list);
		if(list.size() == 1){
			return list;
		}
		if(list.size() == 2){
			if(list.get(0).compareTo(list.get(1))==1){
				E temp = list.get(0);
				list.set(0, list.get(1));
				list.set(1, temp);
			}
			System.out.println("sorted " + list);
			return list;
		}
		list = merge(sort(list.subList(0, list.size()/2)), sort(list.subList(list.size()/2, list.size())));
		return list;
	}

	private List<E> merge(List<E> sort, List<E> sort2) {
		List<E> list = new ArrayList<E>();
		int i = 0, j = 0;
		for (; i < sort.size() && j < sort2.size(); ) {
			if(sort.get(i).compareTo(sort2.get(j)) == 1){
				list.add(sort2.get(j));
				j++;
			}else if(sort.get(i).compareTo(sort2.get(j)) == -1){
				list.add(sort.get(i));
				i++;
			}else{
				list.add(sort.get(i));
				list.add(sort2.get(j));
				i++;j++;
			}
		}
		if(i != sort.size()){
			for (int j2 = i; j2 < sort.size(); j2++) {
				list.add(sort.get(j2));
			}
		}else if(j != sort2.size()){
			for(int j2 = j; j2 < sort2.size(); j2++){
				list.add(sort2.get(j2));
			}
		}
		return list;
	}
}
