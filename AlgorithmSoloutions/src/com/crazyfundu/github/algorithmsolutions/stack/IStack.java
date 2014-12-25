package com.crazyfundu.github.algorithmsolutions.stack;
/**
 * 
 * @author AvneeshS1
 *
 */
public interface IStack<E> {
	/**
	 * Placing the data on top of the stack
	 */
	public void push(E element );

	/**
	 * Returning the data and removing it from the top
	 */
	public E pop();

	/**
	 *Reading the value from the top
	 */

	public E peek();
	/**
	 * Return the current size of the stack
	 */

	public int size();
	
	/**
	 * Check whether the Stack is empty
	 */
	public boolean isEmpty();
}
