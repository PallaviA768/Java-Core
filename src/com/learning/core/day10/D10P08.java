package com.learning.core.day10;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class D10P08 
{
	@Test
	public void testMul()
	{
		System.out.println("Testing mul method.");
		assertEquals(20,Calculator.mul(10,2));
	}
	
	@Test
	public void testDiv()
	{
		System.out.println("Testing div method.");
		assertEquals(20,Calculator.div(40,2));
	}
	
	@Test(expected = ArithmeticException.class)
	public void testDivZ()
	{
		System.out.println("Denominator is 0.");
		assertEquals(20,Calculator.div(40,0));
	}
}