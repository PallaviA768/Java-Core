package com.learning.core.day10;

	import org.junit.Test;
	import static org.junit.Assert.assertEquals;

	public class D10P09 
	{
		@Test
		public void testFindMax()
		{
			System.out.println("Testing findMax method.");
			int[] arr= {1,2,3,4,5,6};
			assertEquals(6,Calculator.findMax(arr));
		}
		@Test
		public void test2FindMax()
		{
			System.out.println("Testing findMax method.");
			int[] arr= {-1,-2,-3,-4,-5,-6};
			assertEquals(-1,Calculator.findMax(arr));
		}
	}

