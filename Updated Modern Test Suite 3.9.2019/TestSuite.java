package org.jfree.data;
import org.jfree.data.test.CreateNumberArray2DTest;
import org.jfree.data.test.CreateNumberArrayTest;
import org.jfree.data.test.ShiftCoverageTests;
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
	   DataUtilitiesTest.class,
	   DataUtilitiesTestSuite.class,
	   IntersectsCoverageTests.class,
	   ConstrainCoverageTests.class,
	   ExpandCoverageTests.class,
	   CreateNumberArrayTest.class,
	   CreateNumberArray2DTest.class,
	   ShiftCoverageTests.class
	})

	public class TestSuite {   
	}  	

	