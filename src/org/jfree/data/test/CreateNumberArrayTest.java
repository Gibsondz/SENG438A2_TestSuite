package org.jfree.data.test;

import static org.junit.Assert.*;
import org.jfree.data.DataUtilities;
import org.junit.*;

import java.security.InvalidParameterException;

public class CreateNumberArrayTest {

	double [] doubleArray, doubleArray2 = {1.0, 2.0, 3.0};

	Number [] numberArray, numberArray2 = {1.0, 2.0, 3.0};
	

	@Test
	public void createNumberArrayWithNullTest() {
		try {
			numberArray = DataUtilities.createNumberArray(null);
			fail("Cannot use null paramter");
		}
		catch(Exception e) {
			assertEquals("Null does not throw "
					+ "an InvalidParameterException",InvalidParameterException.class,e.getClass());
		}
	}
	@Test 
	public void createNumberArrayWithValidDoubleArrayTest() {
		numberArray = DataUtilities.createNumberArray(doubleArray2);
		assertArrayEquals("The numberarray2 does not equal to "
				+ "the double array", numberArray2, numberArray);
	}


}
