package org.jfree.data.test;

import static org.junit.Assert.*;
import org.jfree.data.DataUtilities;
import org.junit.*;

import java.security.InvalidParameterException;

public class CreateNumberArrayTest {

	double [] doubleArray, doubleArray2 = {1.0, 2.0, 3.0};

	Number [] numberArray, numberArray2 = {1.0, 2.0, 3.0};
	

	@Test (expected = IllegalArgumentException.class)
	public void createNumberArrayWithNullTest() throws IllegalArgumentException {
		
		numberArray = DataUtilities.createNumberArray(null);
	}
	
	
	@Test 
	public void createNumberArrayWithValidDoubleArrayTest() {
		numberArray = DataUtilities.createNumberArray(doubleArray2);
		assertArrayEquals("The numberarray2 does not equal to "
				+ "the double array", numberArray2, numberArray);
	}


}
