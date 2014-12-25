package com.crazyfundu.github.algorithmsolutions.tree.problems;

import org.junit.Test;

import com.crazyfundu.github.algorithmsolutions.tree.TreeNode;

public class IfBalancedTreeTest {
	@Test
	public void balancedCheck(){
		TreeNode<Integer> root;
       	root = new TreeNode<Integer>(5);
        root.left = new TreeNode<Integer>(6);
        root.right = new TreeNode<Integer>(7);
        root.left.left = new TreeNode<Integer>(8);
        root.left.right = new TreeNode<Integer>(9);
        root.right.left = new TreeNode<Integer>(10);
        root.right.right = new TreeNode<Integer>(11);	
        root.right.right.left = new TreeNode<Integer>(11);	
		IfBalancedTree ifBalancedTree = new IfBalancedTree(root);
		System.out.println(ifBalancedTree.ifABalancedTree());
	}
}
