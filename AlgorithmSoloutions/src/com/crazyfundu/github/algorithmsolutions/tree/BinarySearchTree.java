package com.crazyfundu.github.algorithmsolutions.tree;

public class BinarySearchTree  implements ITree<Integer>{
	public TreeNode<Integer> root =null;

	public void add(TreeNode<Integer> node) {
		if(root == null){
			root = node;
			return;
		}
		TreeNode<Integer> tempNode = root;
		while(true){
			int vnode= tempNode.val;
			int temp = node.val;
			if(temp > vnode ){
				if(tempNode.right!=null){
					tempNode = tempNode.right;
				}else{
					tempNode.right = node;
					break;
				}
			}else if(temp <= vnode){
				if(tempNode.left != null){
					tempNode = tempNode.left;
				}else{
					tempNode.left = node;
					break;
				}
			}
		}
	}

	public void add(Integer element) {
		TreeNode<Integer> node = new TreeNode<Integer>(element);
		add(node);
	}

	public TreeNode<Integer> delete(TreeNode<Integer> node) {
		/*TreeNode<Integer> tempNode ; 
		if(root != null){
			tempNode = root; 
		}else{
			System.out.println("tree is empty");
			return null;
		}
		find(node, tempNode);*/
		return null;
	}

	public String preOrderTraverse(TreeNode<Integer> node) {
		if(node!=null){
			return ((node.val + " "+preOrderTraverse(node.left)+ " "+ preOrderTraverse(node.right)));
		}
		return "";
	}

	public String inOderTraverse(TreeNode<Integer> root) {
		return null;
	}

	public String postOrderTraverse(TreeNode<Integer> root) {
		return null;
	}
	
	public String toString(){
		return "The tree is as:  "+preOrderTraverse(root);
	}
	
}
