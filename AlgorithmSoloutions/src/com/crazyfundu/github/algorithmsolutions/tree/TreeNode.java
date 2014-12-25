package com.crazyfundu.github.algorithmsolutions.tree;

public class TreeNode<V> {
	
	public V val;
	public TreeNode<V> left;
	public TreeNode<V> right;
	
	public TreeNode(V val){
		this.val = val;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public boolean equals(Object o){
		if(this.val==((TreeNode<Integer>)o).val){
			return true;
		}
		return false;
	}
}
