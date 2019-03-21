package org.jfree.data.test;


import static org.junit.Assert.*;

import org.jfree.data.DataUtilities;
import org.junit.*;
import java.security.InvalidParameterException;

public class CreateNumberArray2DTest {
	
	private double [][] doubleArray, doubleArray2 = {
			{1.0, 2.0, 3.0, 4.0},{5.0, 6.0, 7.0, 8.0}
			};
	
	private Number [][] numberArray, numberArray2 = {
			{1.0, 2.0, 3.0, 4.0},{5.0, 6.0, 7.0, 8.0}

		};

	@Test (expected = Exception.class)
	public void createNumberArray2DWithNullTest() throws Exception {
		
		numberArray = DataUtilities.createNumberArray2D(null);
	}
	

	@Test
	public void createNumberArray2DWithValid2DArrayOfDoublesTest() {
		numberArray = DataUtilities.createNumberArray2D(doubleArray2);
		assertArrayEquals("The numberArray2 doest not equal to"
				+ " the doubleArray2", numberArray2, numberArray);
	}

}
