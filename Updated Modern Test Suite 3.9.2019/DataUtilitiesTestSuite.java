package org.jfree.data;

import static org.junit.Assert.*;

import java.security.InvalidParameterException;

import org.jfree.data.DataUtilities;
import org.jfree.data.KeyedValues;
import org.jfree.data.Values2D;
import org.jmock.Expectations;
import org.jmock.Mockery;
import org.junit.Test;

public class DataUtilitiesTestSuite extends DataUtilities {
	
	/*
	 * 
	 * Testing calculateColumnTotal()
	 * 
	 */

	@Test
	public void calculateColumnTotalExpectedDataExpectedColumn() {
	// setup
		Mockery mockingContext = new Mockery();
		final Values2D values = mockingContext.mock(Values2D.class);
		mockingContext.checking(new Expectations() {
		{
		oneOf(values).getRowCount();
		will(returnValue(2));
		oneOf(values).getValue(0, 0);
		will(returnValue(7.5));
		oneOf(values).getValue(1, 0);
		will(returnValue(2.5));
		}
		});
		// exercise 
		double result = DataUtilities.calculateColumnTotal(values, 0);
		// verify
		assertEquals(10.0,result, .000000001d);
		// tear-down: NONE in t
	}
	
	@Test
	public void calculateColumnTotalExpectedDataUnexpectedColumn() {
		//Setup
		Mockery mockingContext = new Mockery();
		final Values2D values = mockingContext.mock(Values2D.class);
		mockingContext.checking(new Expectations() {
			{
			oneOf(values).getRowCount();
			will(returnValue(3));
			oneOf(values).getValue(0, 0);
			will(returnValue(7.5));
			oneOf(values).getValue(1, 0);
			will(returnValue(2.5));
			oneOf(values).getValue(2, 0);
			will(returnValue(100.0));
			}
		});
		double result = 1;
		// exercise 
		try {
			result = DataUtilities.calculateColumnTotal(values, (Integer) null);
		// verify
			if(result != 0) {
				fail();
			}		
		} catch (InvalidParameterException e){
			
		} catch (NullPointerException r) {
			if(result != 0) {
				fail();
			}
		}
	}
	
	@Test
	public void calculateColumnTotalUnexpectedDataExpectedColumn() {
		// exercise 
		double result = 1;
		try {
			result = DataUtilities.calculateColumnTotal(null,0);
		// verify
			if(result != 0) {
				fail();
			}
		} catch (InvalidParameterException e){
					
		} catch (NullPointerException r) {
			if(result != 0) {
				fail();
			}
		}
		
	}
	
	@Test
	public void calculateColumnTotalUnexpectedDataUnexpectedColumn() {
		// exercise 
		double result = 1;
		try {
			result = DataUtilities.calculateColumnTotal(null,(Integer) null);
			// verify
			if(result != 0) {
				fail();
			}
		} catch (InvalidParameterException e){
							
		} catch (NullPointerException r) {
			if(result != 0) {
				fail();
			}
		}
				
	}
	
	@Test
	public void calculateColumnTotalOneColumnManyRow() {
		// setup
		Mockery mockingContext = new Mockery();
		final Values2D values = mockingContext.mock(Values2D.class);
		mockingContext.checking(new Expectations() {
			{
			oneOf(values).getRowCount();
			will(returnValue(7));
			oneOf(values).getValue(0, 0);
			will(returnValue(5));
			oneOf(values).getValue(1, 0);
			will(returnValue(5));
			oneOf(values).getValue(2, 0);
			will(returnValue(5));
			oneOf(values).getValue(3, 0);
			will(returnValue(5));
			oneOf(values).getValue(4, 0);
			will(returnValue(5));
			oneOf(values).getValue(5, 0);
			will(returnValue(5));
			oneOf(values).getValue(6, 0);
			will(returnValue(5));
			}
		});
		// exercise 
		double result = DataUtilities.calculateColumnTotal(values, 0);
		// verify
		assertEquals(35.0,result, .000000001d);
		// tear-down: NONE in t
	}
	
	@Test
	public void calculateColumnTotalOneRowOneColumn() {
		// setup
		Mockery mockingContext = new Mockery();
		final Values2D values = mockingContext.mock(Values2D.class);
		mockingContext.checking(new Expectations() {
			{
			oneOf(values).getRowCount();
			will(returnValue(1));
			oneOf(values).getValue(0, 0);
			will(returnValue(4.38));
			}
		});
		// exercise 
		double result = DataUtilities.calculateColumnTotal(values, 0);
		// verify
		assertEquals(4.38,result, .000000001d);
		// tear-down: NONE in t
	}
	
	/*
	 * 
	 * Testing calculateRowTotal()
	 * 
	 */
	
	@Test
	public void calculateRowTotalExpectedDataExpectedColumn() {
	// setup
		Mockery mockingContext = new Mockery();
		final Values2D values = mockingContext.mock(Values2D.class);
		mockingContext.checking(new Expectations() {
		{
		oneOf(values).getColumnCount();
		will(returnValue(3)); //Why is this 3 and not 2?
		oneOf(values).getValue(0, 0);
		will(returnValue(7.5));
		oneOf(values).getValue(0, 1);
		will(returnValue(2.5));
		}
		});
		// exercise 
		double result = DataUtilities.calculateRowTotal(values, 0);
		// verify
		assertEquals(10.0,result, .000000001d);
		// tear-down: NONE in t
	}
	
	@Test
	public void calculateRowTotalExpectedDataUnexpectedColumn() {
		//Setup
		Mockery mockingContext = new Mockery();
		final Values2D values = mockingContext.mock(Values2D.class);
		mockingContext.checking(new Expectations() {
			{
				oneOf(values).getColumnCount();
				will(returnValue(3));
				oneOf(values).getValue(0, 0);
				will(returnValue(7.5));
				oneOf(values).getValue(0, 1);
				will(returnValue(2.5));
				oneOf(values).getValue(0, 2);
				will(returnValue(100.0));
			}
		});
		double result = 1;
		// exercise 
		try {
			result = DataUtilities.calculateRowTotal(values, (Integer) null);
		// verify
			if(result != 0) {
				fail();
			}
		} catch (InvalidParameterException e){
			
		} catch (NullPointerException r) {
			if(result != 0) {
				fail();
			}
		}
	}
	
	@Test
	public void calculateRowTotalUnexpectedDataExpectedColumn() {
		// exercise 
		double result = 1;
		try {
			result = DataUtilities.calculateRowTotal(null,0);
		// verify
			if(result != 0) {
				fail();
			}
		} catch (InvalidParameterException e){
					
		} catch (NullPointerException r) {
			if(result != 0) {
				fail();
			}
		}
		
	}
	
	@Test
	public void calculateRowTotalUnexpectedDataUnexpectedColumn() {
		// exercise 
		double result = 1;
		try {
			result = DataUtilities.calculateRowTotal(null,(Integer) null);
			// verify
			if(result != 0) {
				fail();
			}
		} catch (InvalidParameterException e){
							
		} catch (NullPointerException r) {
			if(result != 0) {
				fail();
			}
		}
				
	}
	
	@Test
	public void calculateRowTotalOneRowManyColumns() {
		// setup
		Mockery mockingContext = new Mockery();
		final Values2D values = mockingContext.mock(Values2D.class);
		mockingContext.checking(new Expectations() {
			{
			oneOf(values).getColumnCount();
			will(returnValue(8)); //Why does this have to be 8?
			oneOf(values).getValue(0, 0);
			will(returnValue(5));
			oneOf(values).getValue(0, 1);
			will(returnValue(5));
			oneOf(values).getValue(0, 2);
			will(returnValue(5));
			oneOf(values).getValue(0, 3);
			will(returnValue(5));
			oneOf(values).getValue(0, 4);
			will(returnValue(5));
			oneOf(values).getValue(0, 5);
			will(returnValue(5));
			oneOf(values).getValue(0, 6);
			will(returnValue(5));
			}
		});
		// exercise 
		double result = DataUtilities.calculateRowTotal(values, 0);
		// verify
		assertEquals(35.0, result, .000000001d);
		// tear-down: NONE in t
	}
	
	@Test
	public void calculateRowTotalOneRowOneColumn() {
		// setup
		Mockery mockingContext = new Mockery();
		final Values2D values = mockingContext.mock(Values2D.class);
		mockingContext.checking(new Expectations() {
			{
			oneOf(values).getColumnCount();
			will(returnValue(2)); //Why does this have to be 2?
			oneOf(values).getValue(0, 0);
			will(returnValue(4.38));
			}
		});
		// exercise 
		double result = DataUtilities.calculateRowTotal(values, 0);
		// verify
		assertEquals(4.38,result, .000000001d);
		// tear-down: NONE in t
	}
	
	/*
	 * 
	 * TESTING getCumulativePercentages()
	 * 
	 */
	@Test
	public void getCumulativePercentagesExpectedInputInteger() {
		// setup
		Mockery mockingContext = new Mockery();
		final KeyedValues values = mockingContext.mock(KeyedValues.class);
		mockingContext.checking(new Expectations() {
			{
			allowing(values).getItemCount();
			will(returnValue(3));
			allowing(values).getValue(0);
			will(returnValue(5));
			allowing(values).getValue(1);
			will(returnValue(9));
			allowing(values).getValue(2);
			will(returnValue(2));
			oneOf(values).getKey(0);
			will(returnValue(0));
			oneOf(values).getKey(1);
			will(returnValue(1));
			oneOf(values).getKey(2);
			will(returnValue(2));
			}
		});
		// exercise 
		KeyedValues result = DataUtilities.getCumulativePercentages(values);
		// verify
		double x = (Double) result.getValue(0);
		assertEquals(0.3125, x, .000000001d);
		x = (Double) result.getValue(1);
		assertEquals(0.875, x, .000000001d);
		x = (Double) result.getValue(2);
		assertEquals(1, x, .000000001d);

		// tear-down: NONE in t
	}
	
	@Test
	public void getCumulativePercentagesExpectedInputDouble() {
		// setup
		Mockery mockingContext = new Mockery();
		final KeyedValues values = mockingContext.mock(KeyedValues.class);
		mockingContext.checking(new Expectations() {
			{
			allowing(values).getItemCount();
			will(returnValue(2));
			allowing(values).getValue(0);
			will(returnValue(2.5));
			allowing(values).getValue(1);
			will(returnValue(2.5));
			oneOf(values).getKey(0);
			will(returnValue(0));
			oneOf(values).getKey(1);
			will(returnValue(1));
			}
		});
		// exercise 
		KeyedValues result = DataUtilities.getCumulativePercentages(values);
		// verify
		double x = (Double) result.getValue(0);
		assertEquals(0.5, x, .000000001d);
		x = (Double) result.getValue(1);
		assertEquals(1, x, .000000001d);
		
		// tear-down: NONE in t
	}
	
	@Test
	public void getCumulativePercentagesUnexpectedInput() {
		// exercise 
				KeyedValues result;
				try {
					result = DataUtilities.getCumulativePercentages(null);
					// verify
				} catch (InvalidParameterException e){
					
				} catch (IllegalArgumentException r) {
						fail();
				}
						
	}
	
	@Test
	public void getCumulativePercentagesUnexpectedInputSmallandLargeNumber() {
		// setup
		Mockery mockingContext = new Mockery();
		final KeyedValues values = mockingContext.mock(KeyedValues.class);
		mockingContext.checking(new Expectations() {
			{
			allowing(values).getItemCount();
			will(returnValue(2));
			allowing(values).getValue(0);
			will(returnValue(1));
			allowing(values).getValue(1);
			will(returnValue(999999));
			oneOf(values).getKey(0);
			will(returnValue(0));
			oneOf(values).getKey(1);
			will(returnValue(1));
			}
		});
		// exercise 
		KeyedValues result = DataUtilities.getCumulativePercentages(values);
		// verify
		double x = (Double) result.getValue(0);
		assertEquals(0.000001, x, .000000001d);
		x = (Double) result.getValue(1);
		assertEquals(1, x, .000000001d);
		
		// tear-down: NONE in t
	}
}