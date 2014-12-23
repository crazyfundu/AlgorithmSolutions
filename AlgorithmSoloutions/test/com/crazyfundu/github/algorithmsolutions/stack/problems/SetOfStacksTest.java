package com.crazyfundu.github.algorithmsolutions.stack.problems;


import static org.junit.Assert.*;

import org.junit.Test;

public class SetOfStacksTest {
	
	@Test
	public void pushTest(){
		SetOfStacks setOfStacks = new SetOfStacks();
		setOfStacks.push(2);
		setOfStacks.push(4);
		setOfStacks.push(6);
		setOfStacks.push(6);
		String expected = "The Stack has:: [2, 4, 6], size: 3, top: 2\nThe Stack has:: [6, null, null], size: 1, top: 0\n";
		assertEquals(expected, setOfStacks.toString());
	}
	
	@Test
	public void popTest(){
		SetOfStacks setOfStacks = new SetOfStacks();	
		setOfStacks.push(2);
		setOfStacks.push(4);
		setOfStacks.push(2);
		setOfStacks.push(4);
		setOfStacks.pop();
		String expected = "The Stack has:: [2, 4, 2], size: 3, top: 2\n";
		assertEquals(expected, setOfStacks.toString());
	}
}







