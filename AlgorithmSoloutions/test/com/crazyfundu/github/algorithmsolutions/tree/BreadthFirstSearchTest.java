package com.crazyfundu.github.algorithmsolutions.tree;

import org.junit.Test;

import com.crazyfundu.github.algorithmsolutions.tree.BreadthFirstSearch;

public class BreadthFirstSearchTest {
   @Test
   public void BFSTest(){
	   TreeNode<Integer> root;
	   root = new TreeNode<Integer>(5);
       root.left = new TreeNode<Integer>(6);
       root.right = new TreeNode<Integer>(7);
       root.left.left = new TreeNode<Integer>(8);
       root.left.right = new TreeNode<Integer>(9);
       root.right.left = new TreeNode<Integer>(10);
       root.right.right = new TreeNode<Integer>(11);	
	   BreadthFirstSearch bfs = new BreadthFirstSearch(root);
	   bfs.searchBFS(8);
   }
}
