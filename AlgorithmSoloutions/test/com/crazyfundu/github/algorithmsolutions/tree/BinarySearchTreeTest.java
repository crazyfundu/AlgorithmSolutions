package com.crazyfundu.github.algorithmsolutions.tree;

import org.junit.Test;

import com.crazyfundu.github.algorithmsolutions.tree.BinarySearchTree;

public class BinarySearchTreeTest {
	@Test
	public void addTest(){
		BinarySearchTree bst = new BinarySearchTree();
		bst.add(5);
		bst.add(6);
		bst.add(9);
		bst.add(7);
		bst.add(10);
		bst.add(4);
		bst.add(1);
		bst.add(3);
		bst.add(2);
		bst.add(-1);
		
		System.out.println(bst);
	}
}
