



import static org.junit.Assert.*;

import java.lang.IllegalArgumentException;

import org.jfree.data.DataUtilities;
import org.jfree.data.Range;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.lang.annotation.*;
import java.security.InvalidParameterException;

public class createNumberArrayTest {

	double [] doubleArray, doubleArray2 = {1.0, 2.0, 3.0, 4.0};
	Number [] numberArray, numberArray2 = {1.0, 2.0, 3.0, 4.0};
	

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
		assertArrayEquals("The number array created by the function does not have the same "
				+ "numbers as the double array", numberArray2, numberArray);
	}


}