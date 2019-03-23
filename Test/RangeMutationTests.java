package org.jfree.data;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class RangeMutationTests {
	Range range1;
	Range range2;
	Range range3;
	Range range4;
	@BeforeClass public static void setUpBeforeClass() throws Exception
	{
		
	}
	
	@Before
	public void setUp() throws Exception
	{
		range1 = new Range(1,10);
		range2 = new Range(0,10);
		range3 = new Range(-5,0);
		range4 = new Range(-5,-2);
		
		
	}
	//Boundry Tests For Constrain
	@Test
	public void bottomBoundry() {
		assertEquals(1, range1.constrain(1), 0.0000001d);
	}
	
	@Test
	public void greaterBoundry()
	{
		assertEquals(10, range1.constrain(10), 0.0000001d);
	}
	
	@Test
	public void outsideBottomBoundry() {
		assertEquals(1, range1.constrain(0), 0.0000001d);
	}
	
	@Test
	public void outsideGreaterBoundry()
	{
		assertEquals(10, range1.constrain(11), 0.0000001d);
	}
	@Test
	public void singleNull()
	{
		assertEquals("Range returned is incorrect, should be (1,10)", Range.combine(null, range1), range1);
	}
	@Test
	public void shiftWithNoZeroConditionBot()
	{
		assertEquals("Range returned is incorrect, should be (1,10)", Range.shift(range2, -1, false), new Range(-1,9));
	} 
	@Test
	public void shiftWithNoZeroConditionTop()
	{
		assertEquals("Range returned is incorrect, should be (-6,-1)", Range.shift(range3, -1, false), new Range(-6,-1));
	} 
	@Test
	public void shiftWithNoZeroNormalCross()
	{
		assertEquals("Range returned is incorrect, should be (6,15)", Range.shift(range4, 10, false), new Range(0,0));
	} 
	@Test
	public void shiftWithNoZeroNormalNeg()
	{
		assertEquals("Range returned is incorrect, should be (1,10)", Range.shift(range4, 4, false), new Range(-1,0));
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
