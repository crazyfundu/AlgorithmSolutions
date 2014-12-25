package com.crazyfundu.github.algorithmsolutions.tree;

public interface ITree<E> {
	String preOrderTraverse(TreeNode<E> root);
	String inOderTraverse(TreeNode<E> root);
	String postOrderTraverse(TreeNode<E> root);
	void add(E element);
	TreeNode<E> delete(TreeNode<E> node);
}
