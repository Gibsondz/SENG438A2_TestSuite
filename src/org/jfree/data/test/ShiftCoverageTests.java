package org.jfree.data.test;

import static org.junit.Assert.*;

import org.jfree.data.Range;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ShiftCoverageTests {
	
	private Range zeroCross;
	private Range noZeroCross;
	private Range negRange;
	private Range lowerEqual;
	private Range upperEqual;
	private Range bothEqual;
	private Range nullRange;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		zeroCross = new Range(-5,5);
		noZeroCross = new Range(1, 10);
		negRange = new Range(-10,-1);
		lowerEqual = new Range(0,7);
		upperEqual = new Range(-7,0);
		nullRange = null;
		bothEqual = new Range(0,0);
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test  (expected = NullPointerException.class)
	public void nullRangeProvided() throws NullPointerException {
		
		Range.shift(nullRange, 0.0);
	}

/*	@Test
	public void lowBoundLessThan0_NoZeroX() {
		// shift does not allow zero crossing but the result should not cross zero so it should be (5, 15)
		assertEquals("Range returned is incorrect when the lower bound < 0 and delta value doesn't cause zero cross", 
				new Range(5,15), Range.shift(zeroCross, 10)); 
	}
	
	@Test
	public void giveZeroX_causeZeroX() {
		// result should be (-3, 0). Without zero cross it would be (-3, 7)
		assertEquals("Range returned is incorrect when the range provided crosses 0 and delta value cause zero cross in result", 
				new Range(-3,0), Range.shift(zeroCross, 2));
	}
	
	@Test
	public void uprBoundEqual0_causeZeroX() { 
		// result should be (-4, 0) or (0, 3). Without zero cross it would be (-4, 3)
		Range result = Range.shift(upperEqual, 3);
		double resultLower = result.getLowerBound(), resultUpper = result.getUpperBound();
		//System.out.println("lower: " + resultLower + " upper: " + resultUpper);
		assertTrue("Range returned is incorrect when the upper bound = 0 and delta value causes zero cross", 
				((resultLower < 0) && (resultUpper == 0)) || ((resultLower == 0) && (resultUpper > 0))); 
	}
	
	@Test
	public void uprBoundLessThan0_NoZeroX() {
		// shift does not allow zero crossing but the result should not cross zero so it should be (1, 10)
		assertEquals("Range returned is incorrect when the both bounds < 0 and delta value doesn't cause zero cross", 
				new Range(1,10), Range.shift(negRange, 11));  
	}

	
	@Test
	public void lowBoundEqual0_causeZeroX() {
		// result should be (0, 4) or (-3, 0). Without zero cross it would be (-3, 4)
		assertEquals("Range returned is incorrect when the lower bound = 0 and delta value causes zero cross", 
				new Range(-3,0), Range.shift(lowerEqual, -3)); 
	} 
*/
	
	@Test
	public void noZeroX_causeZeroX() {
		// result should be (0, 5). Without zero cross it would be (-4, 5)
		assertEquals("Range returned is incorrect when the range provided doesn't cross 0 and delta value causes zero cross in result", 
				new Range(0,5), Range.shift(noZeroCross, -5));
	}
	
	@Test
	public void allowZeroX() { 
		// result should be (-4, 3)
		assertEquals("Range returned is incorrect when delta value causes zero cross", 
				new Range(-4, 3), Range.shift(upperEqual, 3, true));
	}

}
