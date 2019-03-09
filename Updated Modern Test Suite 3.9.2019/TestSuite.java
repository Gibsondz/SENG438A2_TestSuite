package org.jfree.data;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;



	@RunWith(Suite.class)

	@Suite.SuiteClasses({
	   RangeTestCentralValue.class,
	   RangeTestContains.class,
	   RangeTestCombine.class,
	   RangeTestExpand.class,
	   RangeTestShift.class,
	   DataUtilitiesTest.class,
	   DataUtilitiesTestSuite.class,
	   IntersectsCoverageTests.class,
	   ConstrainCoverageTests.class,
	   ExpandCoverageTests.class
	})

	public class TestSuite {   
	}  	

	