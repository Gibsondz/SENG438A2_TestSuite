package org.jfree.data.test;

import static org.junit.Assert.*;

import org.jfree.data.Range;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ConstrainCoverageTests {

	Range range1;

	@BeforeClass public static void setUpBeforeClass() throws Exception
	{
		
	}
	
	@Before
	public void setUp() throws Exception
	{
		range1 = new Range(1,10);
		
		
	}
	//Coverage Testing for Constrain
	@Test
	public void InsideRange() {
		assertEquals(5, range1.constrain(5), 0.0000001d);
	}
	
	@Test
	public void greaterThanRange()
	{
		assertEquals(10, range1.constrain(52), 0.0000001d);
	}
	
	@Test
	public void lessThanRange()
	{
		assertEquals(1, range1.constrain(-52), 0.0000001d);
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
