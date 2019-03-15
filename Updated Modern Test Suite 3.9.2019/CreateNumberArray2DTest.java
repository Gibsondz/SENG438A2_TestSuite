package org.jfree.data.test;

import static org.junit.Assert.*;

import java.security.InvalidParameterException;

import org.jfree.data.DataUtilities;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CreateNumberArray2DTest {
	
	private double [][] doubleArray, doubleArray2 = {
			{1.0, 2.0, 3.0, 4.0},
			{5.0, 6.0, 7.0, 8.0}
			};
	
	private Number [][] numberArray, numberArray2 = {
			{1.0, 2.0, 3.0, 4.0},
			{5.0, 6.0, 7.0, 8.0}
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
		assertArrayEquals("The number 2D array created by the function does not have the same values"
				+ " as the 2D array of doubles", numberArray2, numberArray);
	}

}