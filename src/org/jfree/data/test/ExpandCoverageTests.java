package org.jfree.data.test;

import static org.junit.Assert.*;

import org.jfree.data.Range;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ExpandCoverageTests {

	Range range1;
	Range range2;
	Range nullrange;
	
	@BeforeClass public static void setUpBeforeClass() throws Exception
	{
		
	}
	
	@Before
	public void setUp() throws Exception
	{
		range1 = new Range(2,6);
		range2 = new Range(1,1);
		nullrange = null;
		
	}
	
	//Coverage Testing for Expand
	@Test (expected = IllegalArgumentException.class)
	public void nullRange() throws IllegalArgumentException {
		
		Range.expand(nullrange, 1, 2); // not sure about how the two percentage values are interpreted if they're > 1
		
		//fail();
		
	}
	
	@Test
	public void expandTest()
	{
		// length of range is 6-2=4, so 0.25*4=1 and 0.5*4=2,
		// which gives lower=lower-1 and upper=upper+2
		assertEquals(Range.expand(range1, 0.25,0.5), new Range(1,8));
	}
	
	@Test 
	public void negativeMargins() {
		
		// shrinks the range if margin percentage is negative (lower=lower+1 and upper=upper-2)
		assertEquals("Range returned is incorrect when 'expanded' by a negative margin (shrank)",
				Range.expand(range1, -0.25,-0.5), new Range(3,4));
	}
	
	@Test  (expected = IllegalArgumentException.class)
	public void negMarginInvalidLower() throws IllegalArgumentException {
		
		// shrinks the range but lower=lower+4 and upper=upper-2 so lower>upper
		Range.expand(range1, -1.0,-0.5);
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
