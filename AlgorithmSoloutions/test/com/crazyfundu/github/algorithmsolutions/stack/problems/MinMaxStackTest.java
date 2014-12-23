package com.crazyfundu.github.algorithmsolutions.stack.problems;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.crazyfundu.github.algorithmsolutions.stack.problems.MinMaxStack;

public class MinMaxStackTest {
	@Rule public ExpectedException thrown = ExpectedException.none();
	
	@Test
	public void exceptionTest() throws Exception{
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("Initial capacity cannot be negative or zero");
		MinMaxStack<Integer> mms = new MinMaxStack<Integer>(-13);
	}
		@Test
	public void exceptionTest2() throws Exception{
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("Initial capacity cannot be negative or zero");
		MinMaxStack<Integer> mms = new MinMaxStack<Integer>(0);
	}
		
	@Test
	public void minimumTesting(){
		MinMaxStack<Integer> mms = new MinMaxStack<Integer>();
		mms.push(3);
		mms.push(4);
		mms.push(5);
		mms.push(7);
		int a = mms.min();
		assertEquals(3,a);
		mms.push(2);
		a = mms.min();
		assertEquals(2,a);
		mms.push(6);
		mms.push(9);
		mms.push(1);
		a = mms.min();
		assertEquals(1,a);
		mms.pop();
		a = mms.min();
		assertEquals(2,a);
	}
	
	@Test
	public void maximumTesting(){
		MinMaxStack<Integer> mms = new MinMaxStack<Integer>();
		mms.push(3);
		mms.push(4);
		mms.push(5);
		mms.push(7);
		int a = mms.max();
		assertEquals(7,a);
		mms.push(8);
		a = mms.max();
		assertEquals(8,a);
		mms.push(6);
		mms.push(9);
		a = mms.max();
		assertEquals(9,a);
		mms.pop();
		a = mms.max();
		assertEquals(8,a);
	}
}
