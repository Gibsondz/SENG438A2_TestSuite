package org.jfree.data.test;

import static org.junit.Assert.*;

import org.jfree.data.Range;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class RangeTest2 {

private Range exampleRange;
	
	@BeforeClass public static void setUpBeforeClass() throws Exception
	{
		
	}
	
	@Before
	public void setUp() throws Exception
	{
		exampleRange = new Range(-10, 10);
	}
	
	@Test
	public void itDoesContain() {
		assertTrue("contains() returns false when value is in range.", exampleRange.contains(0));
	}
	@Test
	public void lowerThanRange()
	{
		assertFalse("contains() returns true when values is lower than range", exampleRange.contains(-11));
	}
	@Test
	public void higherThanRange()
	{
		assertFalse("contains() returns true when values is higher than range", exampleRange.contains(11));
	}
	@Test
	public void lowerBoundCheck()
	{
		assertTrue("contains() returns false when value is on lower bound", exampleRange.contains(-10));
	}
	@Test
	public void upperBoundCheck()
	{
		assertTrue("contains() returns false when value is on upper bound", exampleRange.contains(10));
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
