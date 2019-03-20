package org.jfree.data.test;

import static org.junit.Assert.*;
import org.jfree.data.Range;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class RangeTestEquals {

	Range nullRange;
	Range rangeLower;
	Range rangeUpper;
	Range rangeNormal;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		nullRange = null;
		rangeLower = new Range(1, 10);
		rangeUpper = new Range(2, 11);
		rangeNormal = new Range(1, 11);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test (expected = Exception.class)
	public void nullRangeTest() throws Exception {
		boolean result = rangeNormal.equals(nullRange);
	}
	
	@Test
	public void sameLower() {
		assertFalse("The objects were determined to be equal even though they dont have the same upper bound",
				rangeNormal.equals(rangeLower));
	}
	
	@Test
	public void sameUpper() {
		assertFalse("The objects were determined to be equal even though they dont have the same lower bound",
				rangeNormal.equals(rangeUpper));
	}
	
	@Test
	public void sameRange() {
		assertTrue("The objects were not determined to be equal even though they have the same bounds",
				rangeNormal.equals(rangeNormal));
	}
	

}
