package com.crazyfundu.github.algorithmsolutions.tree.problems;

import com.crazyfundu.github.algorithmsolutions.tree.TreeNode;

/**
 * Implement a function to check if a tree is balanced  For the purposes of this question,
a balanced tree is defied to be a tree such that no two leaf nodes diffr in distance
from the root by more than one 
 * @author AvneeshS1
 *
 */
public class IfBalancedTree {
	public TreeNode<Integer> root = null;
	
	IfBalancedTree(TreeNode<Integer> root){
		this.root = root;
	}
	
	boolean ifABalancedTree(){
		if(getMaxDepth(root)-getMinDepth(root)>1){
			System.out.println("Not Balanced");
			return false;
		}else{
			System.out.println("Balanced");
			return true;
		}
	}
	
	private int getMaxDepth(TreeNode<Integer> tempNode){
		int d;
		if(tempNode==null){
			return 0;
		}
		return 1 + Math.max( getMaxDepth(tempNode.left) , getMaxDepth(tempNode.right));
	}
	
	private int getMinDepth(TreeNode<Integer> tempNode){
		int d ;
		if(tempNode == null){
			return 0;
		}
		return 1 + Math.min(getMinDepth(tempNode.left), getMinDepth(tempNode.right));
	}
}
