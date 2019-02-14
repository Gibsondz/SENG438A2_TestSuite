package org.jfree.data.test;

import static org.junit.Assert.assertEquals;

import org.jfree.data.Range;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class RangeTestShift {
private Range range1;
	
	
	@BeforeClass public static void setUpBeforeClass() throws Exception
	{
		
	}
	
	@Before
	public void setUp() throws Exception
	{
		range1 = new Range(1,10);
		
	}
	//Equivalence Class of positive shift
	@Test
	public void positive() {
		assertEquals("Range returned is incorrect, should be (-1,10)", Range.shift(range1, 10), new Range(11,20));
	}
	//Equivalence Class of negative shift
	@Test
	public void negative()
	{
		assertEquals("Range returned is incorrect, should be (1,12)", Range.shift(range1, -10), new Range(-9,0));
	}
	//Edge case
	@Test
	public void zero()
	{
		assertEquals("Range returned is incorrect, should be (1,12)", Range.shift(range1, 0), new Range(1,10));
	}
	
	@After
	public void tearDown() throws Exception
	{
		
	}
	
		
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception
	{
		
	}

}
