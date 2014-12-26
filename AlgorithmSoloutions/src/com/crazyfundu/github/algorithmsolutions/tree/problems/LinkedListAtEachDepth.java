package com.crazyfundu.github.algorithmsolutions.tree.problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.crazyfundu.github.algorithmsolutions.tree.TreeNode;

/**
 * Given a binary search tree, design an algorithm which creates a linked list of all the
 *nodes at each depth (i e , if you have a tree with depth D, you’ll have D linked lists) 
 * @author AvneeshS1
 *
 */

public class LinkedListAtEachDepth {
	TreeNode<Integer> root = null;
	Map<Integer, List<TreeNode<Integer>>> levelMap = new HashMap<Integer, List<TreeNode<Integer>>>();
	List<TreeNode<Integer>> list = null;
	int level = 0;		
	public LinkedListAtEachDepth(TreeNode<Integer> root) {
		if(root == null)
			return;
		this.root = root;
		list = new ArrayList<TreeNode<Integer>>();
		list.add(root);
		levelMap.put(level,list );
	}
	
	void makeLayers(){
		for (int i = 0; i < levelMap.size(); i++) {
			List<TreeNode<Integer>> list  = levelMap.get(level);
			List<TreeNode<Integer>> tempList = new ArrayList<TreeNode<Integer>>();
			level++;
			for (TreeNode<Integer> treeNode : list) {
					if(treeNode.left!=null){
						tempList.add(treeNode.left);
					}
					if(treeNode.right!=null){
						tempList.add(treeNode.right);
					}
			}
			if(!tempList.isEmpty()){
				levelMap.put(level, tempList);
			}
		}
		System.out.println(levelMap);
	}
}
