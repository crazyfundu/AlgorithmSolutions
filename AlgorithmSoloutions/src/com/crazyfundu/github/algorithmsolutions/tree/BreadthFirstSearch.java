package com.crazyfundu.github.algorithmsolutions.tree;

import java.util.ArrayList;
import java.util.List;

public class BreadthFirstSearch {
	public TreeNode<Integer> root;
	List<TreeNode<Integer>> list = new ArrayList<TreeNode<Integer>>();
	
	public BreadthFirstSearch(TreeNode<Integer> root){
		this.root = root;
	}
	
	TreeNode<Integer> searchBFS(int val){
		return searchBFS(new TreeNode<Integer>(val));
	}
	
	TreeNode<Integer> searchBFS(TreeNode<Integer> node){
		list.add(root);
		int index = 0;
		System.out.println(root.val);
		while(list.get(index)!= null){
			TreeNode<Integer> left = list.get(index).left;
			TreeNode<Integer> right = list.get(index).right;
			if(left!=null ){
				list.add(left);
				System.out.print(left.val+" ");
				if(left.equals(node)){
					System.out.println("found you !!!");
					return left;
				}
			}
			if(right != null ){
				list.add(right);
				System.out.println(right.val);
				if(right.equals(node)){
					System.out.println("found you !!!");
					return right;
				}
				index++;
			}
		}
		return null;
	}
}
