package org.jfree.data.test;

import static org.junit.Assert.assertEquals;
import org.jfree.data.Range;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class RangeTestExpand {

	private Range range1;
	
	
	@BeforeClass public static void setUpBeforeClass() throws Exception
	{
		
	}
	
	@Before
	public void setUp() throws Exception
	{
		range1 = new Range(1,10);
		
	}
	//Equivalence Class of less than range
	@Test
	public void lessThanRange() {
		assertEquals("Range returned is incorrect, should be (-1,10)", Range.expandToInclude(range1, -1), new Range(-1,10));
	}
	//Equivalence Class of higher than range
	@Test
	public void greaterThanRange()
	{
		assertEquals("Range returned is incorrect, should be (1,12)", Range.expandToInclude(range1, 12), new Range(1,12));
	}
	//Equivalence Class of inside range
	@Test
	public void insideRange()
	{
		assertEquals("Range returned is incorrect, should be (1,12)", Range.expandToInclude(range1, 5), new Range(1,10));
	}
	//Boundary analysis
	@Test
	public void lowerValueEdge()
	{
		assertEquals("Range returned is incorrect, should be (1,10)", Range.expandToInclude(range1, 1), range1);
	}
	//Boundary analysis
	@Test
	public void higherValueEdge()
	{
		assertEquals("Range returned is incorrect, should be (1,10)", Range.expandToInclude(range1, 10), range1);
	}
	//Equivalence Class of Null
	@Test
	public void nullTest()
	{
		assertEquals("Range returned is incorrect, should be (1,1)", Range.expandToInclude(null, 1), new Range(1,1));
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
