package com.crazyfundu.github.algorithmsolutions.stack.problems;

import org.junit.Test;

import com.crazyfundu.github.algorithmsolutions.stack.Node;

public class ThreeStackSingleArrayLinkedNodesApproachTest {
	
	@Test
	public void testStack(){
		ThreeStackSingleArrayLinkedNodesApproach t = new ThreeStackSingleArrayLinkedNodesApproach();
		t.push(0, new Node(4));
		t.push(0, new Node(6));
		t.push(1, new Node(7));
		t.push(1, new Node(7));
		t.push(2, new Node(8));
		t.push(2, new Node(9));
		System.out.println(t);
	}

}
