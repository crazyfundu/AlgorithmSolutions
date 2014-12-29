package com.crazyfundu.github.algorithmsolutions.sortingandsearching.GenericImplementations;

import java.util.ArrayList;
import java.util.List;

public class QuickSort<E extends Comparable<E>> {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(5);
		list.add(4);
		list.add(5);
		list.add(2);
		list.add(7);
		list.add(1);
		QuickSort<Integer> bs = new QuickSort<Integer>();
		//System.out.println(bs.sort(list));
		bs.sort2(list);
	}
	
	//Complex and implemented by me.
	public List<E> sort(List<E> list){
		int size = list.size();
		if(size == 1){
			System.out.println(list);
			return list;
		}
		int pivot = size/2;
		List<E> tempList = new ArrayList<E>();
		tempList.addAll(list);
		boolean ifreezed = false;
		boolean jfreezed = false;
		for (int i = 0, j=list.size()-1; i!=j && i <= pivot && j >= pivot; ) {
			
			if(list.get(i).compareTo(list.get(pivot)) == -1  || list.get(i).compareTo(list.get(pivot)) == 0 && !ifreezed
					&& i!= pivot){
				i++;
			}else{
				ifreezed = true;
			}
			
			if(list.get(j).compareTo(list.get(pivot)) == 1 || list.get(j).compareTo(list.get(pivot)) == 0 && !jfreezed 
					&& j!=pivot){
				j--;
			}else {
				jfreezed = true;
			}
			
			if(ifreezed && jfreezed){
				E temp = tempList.get(i);
				tempList.set(i, tempList.get(j));
				tempList.set(j, temp);
				if(i!=pivot){
					i++;
					ifreezed = false;
				}
				if(j!=pivot){
					j--;
					jfreezed = false;
				}
			}
			System.out.println(tempList);
		}
		
		List<E> l = new ArrayList<E>();
		List<E> m = new ArrayList<E>();
		l = sort(tempList.subList(0, pivot));
		m = sort(tempList.subList(pivot, tempList.size()));
		l.addAll(m); 
		System.out.println(l);
		return l; 
	}
	
	public void sort2(List<E> list){
		int size = list.size();
		int pivotIndex = size/2;
		
		E pivot = list.get(pivotIndex);
		
		int i = 0;
		int j = list.size()-1;
		
		while(i<j ){
			
			while(list.get(i).compareTo(pivot) == -1 ){
				i++;
			}
			while(list.get(j).compareTo(pivot) ==  1){
				j--;
			}
			
			if(i<j ){
				E temp = list.get(i);
				list.set(i, list.get(j));
				list.set(j, temp);
				j--;i++;
			}
		}

		System.out.println(list);

		if(0 < j )
			sort2(list.subList(0, j));
		if(i < size-1)
			sort2(list.subList(i, size));
		
		System.out.println(list);
		
	}
}















