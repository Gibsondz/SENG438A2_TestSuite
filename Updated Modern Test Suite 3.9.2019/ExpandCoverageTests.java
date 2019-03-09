package org.jfree.data;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ExpandCoverageTests {

	Range range1;
	Range nullrange;
	
	@BeforeClass public static void setUpBeforeClass() throws Exception
	{
		
	}
	
	@Before
	public void setUp() throws Exception
	{
		range1 = new Range(2,6);
		
		
	}
	//Coverage Testing for Expand
	@Test
	public void NullRange() {
		try
		{
			Range.expand(nullrange, 1, 2);
			fail();
		}
		catch(IllegalArgumentException e)
		{
			
		}
	}
	
	@Test
	public void expandTest()
	{
		assertEquals(Range.expand(range1, 0.25,0.5), new Range(1,8));
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
