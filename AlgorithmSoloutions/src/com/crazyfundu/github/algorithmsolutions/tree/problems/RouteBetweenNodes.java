package com.crazyfundu.github.algorithmsolutions.tree.problems;

import com.crazyfundu.github.algorithmsolutions.tree.BinarySearchTree;
import com.crazyfundu.github.algorithmsolutions.tree.TreeNodeWithMarking;
/**
 * Given a directed graph, design an algorithm to fid out whether there is a route between two nodes 
 * @author AvneeshS1
 *
 *
 *Logic:-
 *Basically it is an implementation of DFS or pre order traversal which is already been done. So using that only.
 */

public class RouteBetweenNodes {
	public RouteBetweenNodes(TreeNodeWithMarking<Integer> treeNode1, TreeNodeWithMarking<Integer> treeNode2) {
		BinarySearchTree bst = new BinarySearchTree(treeNode1);
		
		bst.postOrderTraverse(treeNode1);
		
	}
	TreeNodeWithMarking<Integer> treeNode = new TreeNodeWithMarking<Integer>(3);
}


