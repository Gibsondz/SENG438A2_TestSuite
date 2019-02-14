

import static org.junit.Assert.*;

import org.jfree.data.Range;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class RangeTestContains {

private Range exampleRange;
	
	@BeforeClass public static void setUpBeforeClass() throws Exception
	{
		
	}
	
	@Before
	public void setUp() throws Exception
	{
		exampleRange = new Range(-10, 10);
	}
	//Equivalence Test in range
	@Test
	public void itDoesContain() {
		assertTrue("contains() returns false when value is in range.", exampleRange.contains(0));
	}
	//Equivalence Class of lower than range
	@Test
	public void lowerThanRange()
	{
		assertFalse("contains() returns true when values is lower than range", exampleRange.contains(-11));
	}
	//Equivalence Class of higher than range
	@Test
	public void higherThanRange()
	{
		assertFalse("contains() returns true when values is higher than range", exampleRange.contains(11));
	}
	//Boundry Value Analysis
	@Test
	public void lowerBoundCheck()
	{
		assertTrue("contains() returns false when value is on lower bound", exampleRange.contains(-10));
	}
	//Boundry Value Analysis
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
