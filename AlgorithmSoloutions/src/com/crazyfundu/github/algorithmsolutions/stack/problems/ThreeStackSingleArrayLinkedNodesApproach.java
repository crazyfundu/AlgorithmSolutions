package com.crazyfundu.github.algorithmsolutions.stack.problems;

import java.util.ArrayList;
import java.util.List;

import com.crazyfundu.github.algorithmsolutions.stack.Node;
/**
 * Describe how you could use a single array to implement three stacks 
 * 
 * The data is stored in the node as in a linked list. All the nodes are stored in the list linearly. 
 * @author AvneeshS1
 *
 */

public class ThreeStackSingleArrayLinkedNodesApproach {
	List<Node> nodeList = new ArrayList<Node>();
	Node[] stackTopIndex = new Node[]{null, null, null};
	
	 void push(int stackNum, Node value){
		Node  tempNode  = stackTopIndex[stackNum];
		if(tempNode!=null){
			value.next = tempNode;
		}
		stackTopIndex[stackNum] = value;
		nodeList.add(value);
	}
	 
	 Node peek(int stackNum){
		 return stackTopIndex[stackNum];
	 }
	 
	 Node pop(int stackNum){
		 Node tempNode = stackTopIndex[stackNum];
		 if(tempNode != null){
			 stackTopIndex[stackNum] = tempNode.next;
		 }
		 return tempNode;
	 }
	 
	 public String toString(){
		 StringBuilder stringBuilder = new StringBuilder();
		 Node tempNode = stackTopIndex[0];
		 appendNodes(stringBuilder, tempNode);
		 tempNode = stackTopIndex[1];
		 appendNodes(stringBuilder, tempNode);
		 tempNode = stackTopIndex[2];
		 appendNodes(stringBuilder, tempNode);
		 return stringBuilder.toString();
	 }

	private void appendNodes(StringBuilder stringBuilder, Node tempNode) {
		if(tempNode == null){
			stringBuilder.append("_");
		}
		while(tempNode!=null){
			 stringBuilder.append(tempNode.d+" ");
			 tempNode = tempNode.next;
		 }
		stringBuilder.append("\n");
	}
}


