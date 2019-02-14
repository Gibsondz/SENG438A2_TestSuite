

import static org.junit.Assert.*;

import org.jfree.data.Range;
import org.junit.*;

public class RangeTestCentralValue {
	private Range exampleRange;
	private Range exampleRange2;
	private Range exampleRange3;
	
	@BeforeClass public static void setUpBeforeClass() throws Exception
	{
		
	}
	
	@Before
	public void setUp() throws Exception
	{
		exampleRange = new Range(-1, 1);
		exampleRange2 = new Range(-20,-10);
		exampleRange3 = new Range(10,20);
	}
	//Equivalence Class for one neg one pos
	@Test
	public void centralValueCorrectTest() {
		assertEquals("The central value of -1, 1 should be 0", 0 , exampleRange.getCentralValue(), .000000001d);
	}
	//Equivalence Class for double neg
	@Test
	public void doubleNegative()
	{
		assertEquals("The central value of -20, -10 should be -15", -15, exampleRange2.getCentralValue(), .000000001d);
	}
	@Test
	//Equivalence Class for double pos
	public void doublePositive()
	{
		assertEquals("The central value of 10, 20 should be 15", 15, exampleRange3.getCentralValue(), .000000001d);
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
