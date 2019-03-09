package org.jfree.data;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.jfree.data.Range;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class RangeTestCombine {
	private Range range1;
	private Range range2;
	private Range range3;
	private Range range4;
	
	@BeforeClass public static void setUpBeforeClass() throws Exception
	{
		
	}
	
	@Before
	public void setUp() throws Exception
	{
		range1 = new Range(1,10);
		range3 = new Range(10,20);
		range4 = new Range(15,30);
		
	}
	//Equivalence Class of intersecting ranges
	@Test
	public void intersectingRange() {
		assertEquals("Range returned is incorrect, should be (10,30)", Range.combine(range3, range4), new Range(10,30));
	}
	//Equivalence Class of separate ranges
	@Test
	public void separateRange()
	{
		assertEquals("Range returned is incorrect, should be (1,30)", Range.combine(range1, range4), new Range(1,30));
	}
	//Equivalence Class of double null
	@Test
	public void doubleNull()
	{
		assertNull("Range returned is incorrect, sould be null", Range.combine(null, null));
	}
	//Equivalence Class of single null
	@Test
	public void singleNull()
	{
		assertEquals("Range returned is incorrect, should be (1,10)", Range.combine(range1, null), range1);
	}
	//Boundry Value Analysis
	@Test
	public void touchingRanges()
	{
		assertEquals("Range returned is incorrect, should be (1,20)", Range.combine(range1, range3), new Range(1,20));
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
