package org.jfree.data;


import static org.junit.Assert.*;

import org.jfree.data.DataUtilities;
import org.junit.*;
import java.security.InvalidParameterException;

public class createNumberArray2DTest {
	
	private double [][] doubleArray, doubleArray2 = {
			{1.0, 2.0, 3.0, 4.0},{5.0, 6.0, 7.0, 8.0}
			};
	
	private Number [][] numberArray, numberArray2 = {
			{1.0, 2.0, 3.0, 4.0},{5.0, 6.0, 7.0, 8.0}

		};

	@Test
	public void createNumberArray2DWithNullTest() {
		try {
			numberArray = DataUtilities.createNumberArray2D(null);
			fail("Cannot use null parameter");
		}
		catch(Exception e) {
			assertEquals("Null does not throw "
					+ "an InvalidParameterException",InvalidParameterException.class,e.getClass());
		}
	}

	@Test
	public void createNumberArray2DWithValid2DArrayOfDoublesTest() {
		numberArray = DataUtilities.createNumberArray2D(doubleArray2);
		assertArrayEquals("The numberArray2 doest not equal to"
				+ " the doubleArray2", numberArray2, numberArray);
	}

}
