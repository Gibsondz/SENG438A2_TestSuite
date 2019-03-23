package org.jfree.data;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;




	@RunWith(Suite.class)

	@Suite.SuiteClasses({
	   RangeTestCentralValue.class,
	   RangeTestContains.class,
	   RangeTestCombine.class,
	   RangeTestExpand.class,
	   RangeTestEquals.class,
	   RangeTestShift.class,
	   DataUtilitiesTestSuite.class,
	   IntersectsCoverageTests.class,
	   ConstrainCoverageTests.class,
	   ExpandCoverageTests.class,
	   CreateNumberArrayTest.class,
	   CreateNumberArray2DTest.class,
	   ShiftCoverageTests.class,
	   RangeMutationTests.class
	})

	public class TestSuite {   
	}  	

	