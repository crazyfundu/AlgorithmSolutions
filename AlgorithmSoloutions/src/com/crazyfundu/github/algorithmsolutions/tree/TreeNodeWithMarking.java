package com.crazyfundu.github.algorithmsolutions.tree;

public class TreeNodeWithMarking<E> extends TreeNode<E>{
	State state = State.unvisited;
	public TreeNodeWithMarking(E val) {
		super(val);
	}
}

enum State{
	visited, unvisited, visiting;
}

