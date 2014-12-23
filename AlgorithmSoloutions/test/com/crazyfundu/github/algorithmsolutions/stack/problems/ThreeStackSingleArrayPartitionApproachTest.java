package com.crazyfundu.github.algorithmsolutions.stack.problems;

import org.junit.Test;

public class ThreeStackSingleArrayPartitionApproachTest {
	
	@Test
	public void pushTest(){
		ThreeStackSingleArrayPartitionApproach threeStackSingleArray = new ThreeStackSingleArrayPartitionApproach();
		threeStackSingleArray.push(0,12);
		threeStackSingleArray.push(1, 13);
		threeStackSingleArray.push(2, 14);
		threeStackSingleArray.push(0, 15);
		threeStackSingleArray.push(0, 16);
		System.out.println(threeStackSingleArray);
		
		ThreeStackSingleArrayPartitionApproach threeStackSingleArray2 = new ThreeStackSingleArrayPartitionApproach(9);
		System.out.println(threeStackSingleArray2);
		threeStackSingleArray2.push(0,12);
		threeStackSingleArray2.push(1, 13);
		threeStackSingleArray2.push(2, 14);
		threeStackSingleArray2.push(0, 15);
		threeStackSingleArray2.push(0, 16);
		threeStackSingleArray2.push(0, 18);
		System.out.println(threeStackSingleArray2);
	}
	

}
