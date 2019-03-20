package org.jfree.data;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class IntersectsCoverageTests {
	
	Range range1;

	@BeforeClass public static void setUpBeforeClass() throws Exception
	{
		
	}
	
	@Before
	public void setUp() throws Exception
	{
		range1 = new Range(1,10);
		
		
	}
	//Coverage Testing for Intersects
	@Test
	public void NonIntersectingHigh() {
		assertFalse("Returned True For Nonintersecting ranges", range1.intersects(25,50));
	}
	
	@Test
	public void IntersectingLow()
	{
		assertTrue("Returned False For Intersecting", range1.intersects(-5,7));
	}
	
	@Test
	public void NonIntersectingLow()
	{
		assertFalse("Returned True For Nonintersecting ranges", range1.intersects(-10,-5));
	}
	
	@Test
	public void IntersectingHigh()
	{
		assertTrue("Returned False For Intersecting", range1.intersects(5,15));
	}
	
	@Test
	public void InvalidRange()
	{
		assertFalse("Return True for Noninterseting ranges", range1.intersects(15,11));
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
