

import static org.junit.Assert.assertArrayEquals;

import java.util.Random;

import org.jfree.data.DataUtilities;
import org.jfree.data.Values2D;
import org.jmock.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class DataUtilitiesTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}
	
	@Before
	public void setUp() throws Exception {
		
	}
	
	
	@Test
	public void createNumberArrayForNullArray() {
		// setup
		Mockery mockingContext = new Mockery();
		final Values2D values = mockingContext.mock(Values2D.class);
		mockingContext.checking(new Expectations() {
			{
				one(values).getRowCount();	
				will(returnValue(2));
				one(values).getValue(0, 0);
				will(returnValue(7.5));
				one(values).getValue(1, 0);
				will(returnValue(2.5));
			}
		});
		// exercise 
		double[] data = null;
		Number[] numbers = DataUtilities.createNumberArray(data);
		// verify
		assertArrayEquals("The number array value should be null", 
				null, numbers);
		// tear-down
		numbers = null;
		data = null;
	}
	
	@Test
	public void createNumberArrayForNormalArray() {
		// setup
		Mockery mockingContext = new Mockery();
		final Values2D values = mockingContext.mock(Values2D.class);
		mockingContext.checking(new Expectations() {
			{
				one(values).getRowCount();	
				will(returnValue(2));
				one(values).getValue(0, 0);
				will(returnValue(7.5));
				one(values).getValue(1, 0);
				will(returnValue(2.5));
			}
		});
		// exercise 
		double[] data = {1.0, 2.0, 3.0, 4.0, 5.0};
		Number[] numbers = DataUtilities.createNumberArray(data);
		Number[] expectedResult = {1.0, 2.0, 3.0, 4.0, 5.0};
		for (int i = 0;i  < 5; ++ i) {
			System.out.println(data[i] + " " + numbers[i]);
		}
		// verify
		assertArrayEquals("These two number arrays should be equal", 
				expectedResult, numbers);
		// tear-down
		numbers = null;
		data = null;
		expectedResult = null;
	}
	
	@Test
	public void createNumberArrayForAllZeroArray() {
		// setup
		Mockery mockingContext = new Mockery();
		final Values2D values = mockingContext.mock(Values2D.class);
		mockingContext.checking(new Expectations() {
			{
				one(values).getRowCount();	
				will(returnValue(2));
				one(values).getValue(0, 0);
				will(returnValue(7.5));
				one(values).getValue(1, 0);
				will(returnValue(2.5));
			}
		});
		// exercise 
		double[] data = {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		Number[] numbers = DataUtilities.createNumberArray(data);
		Number[] expectedResult = {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		// verify
		assertArrayEquals("These two number arrays should be equal", 
				expectedResult, numbers);
		// tear-down
		numbers = null;
		data = null;
		expectedResult = null;
	}
	
	
	@Test
	public void createNumberArrayForLargeArray() {
		// setup
		Mockery mockingContext = new Mockery();
		final Values2D values = mockingContext.mock(Values2D.class);
		mockingContext.checking(new Expectations() {
			{
				one(values).getRowCount();	
				will(returnValue(2));
				one(values).getValue(0, 0);
				will(returnValue(7.5));
				one(values).getValue(1, 0);
				will(returnValue(2.5));
			}
		});
		// exercise 
		int len = 20000000;
		double[] data = new double [len];
		Random random = new Random(System.currentTimeMillis());
		for (int i = 0; i < data.length; ++ i) {
			data[i] = random.nextDouble();
		}
		Number[] numbers = DataUtilities.createNumberArray(data);
		Number[] expectedResult = new Number[len];
		for (int i = 0; i < expectedResult.length; ++ i) {
			expectedResult[i] = new Number() {
				
				@Override
				public long longValue() {
					// TODO Auto-generated method stub
					return 0;
				}
				
				@Override
				public int intValue() {
					// TODO Auto-generated method stub
					return 0;
				}
				
				@Override
				public float floatValue() {
					// TODO Auto-generated method stub
					return 0;
				}
				
				@Override
				public double doubleValue() {
					// TODO Auto-generated method stub
					return 0;
				}
			};
			expectedResult[i] = data[i];
		}
		// verify
		assertArrayEquals("These two number arrays should be equal", 
				expectedResult, numbers);
		// tear-down
		numbers = null;
		data = null;
		expectedResult = null;
	}
	
	@Test
	public void createNumberArrayForSingleElementArray() {
		// setup
		Mockery mockingContext = new Mockery();
		final Values2D values = mockingContext.mock(Values2D.class);
		mockingContext.checking(new Expectations() {
			{
				one(values).getRowCount();	
				will(returnValue(2));
				one(values).getValue(0, 0);
				will(returnValue(7.5));
				one(values).getValue(1, 0);
				will(returnValue(2.5));
			}
		});
		// exercise 
		double[] data = {-10.0};
		
		Number[] numbers = DataUtilities.createNumberArray(data);
		Number[] expectedResult = {-10.0};
		// verify
		assertArrayEquals("These two number arrays should be equal", 
				expectedResult, numbers);
		// tear-down
		numbers = null;
		data = null;
		expectedResult = null;
	}
	
	@Test
	public void createNumberArray2DForNullArray() {
		// setup
		Mockery mockingContext = new Mockery();
		final Values2D values = mockingContext.mock(Values2D.class);
		mockingContext.checking(new Expectations() {
			{
				one(values).getRowCount();	
				will(returnValue(2));
				one(values).getValue(0, 0);
				will(returnValue(7.5));
				one(values).getValue(1, 0);
				will(returnValue(2.5));
			}
		});
		// exercise 
		double[][] data = null;
		
		Number[][] numbers = DataUtilities.createNumberArray2D(data);
		// verify
		assertArrayEquals("The number array should be null", 
				null, numbers);
		// tear-down
		numbers = null;
		data = null;
	}
	
	@Test
	public void createNumberArray2DForNormalArray() {
		// setup
		Mockery mockingContext = new Mockery();
		final Values2D values = mockingContext.mock(Values2D.class);
		mockingContext.checking(new Expectations() {
			{
				one(values).getRowCount();	
				will(returnValue(2));
				one(values).getValue(0, 0);
				will(returnValue(7.5));
				one(values).getValue(1, 0);
				will(returnValue(2.5));
			}
		});
		// exercise 
		double[][] data = {{1.0, 2.0, 3.0}, {4.0, 5.0, 6.0}, {7.0, 8.0, 9.0}};
		
		Number[][] numbers = DataUtilities.createNumberArray2D(data);
		
		Number[][] expectedNumbers = {{1.0, 2.0, 3.0}, {4.0, 5.0, 6.0}, {7.0, 8.0, 9.0}};
	
		// verify
		assertArrayEquals("These two number arrays should be equal", 
				expectedNumbers, numbers);
		// tear-down
		numbers = null;
		data = null;
		expectedNumbers = null;
	}

	@Test
	public void createNumberArray2DForAllNagetiveNumberArray() {
		// setup
		Mockery mockingContext = new Mockery();
		final Values2D values = mockingContext.mock(Values2D.class);
		mockingContext.checking(new Expectations() {
			{
				one(values).getRowCount();	
				will(returnValue(2));
				one(values).getValue(0, 0);
				will(returnValue(7.5));
				one(values).getValue(1, 0);
				will(returnValue(2.5));
			}
		});
		// exercise 
		double[][] data = {{-1.0, -2.0, -3.0}, {-4.0, -5.0, -6.0}, {-7.0, -8.0, -9.0}};
		
		Number[][] numbers = DataUtilities.createNumberArray2D(data);
		
		Number[][] expectedNumbers = {{-1.0, -2.0, -3.0}, {-4.0, -5.0, -6.0}, {-7.0, -8.0, -9.0}};
	
		// verify
		assertArrayEquals("These two number arrays should be equal", 
				expectedNumbers, numbers);
		// tear-down
		numbers = null;
		data = null;
		expectedNumbers = null;
	}
	
	@Test
	public void createNumberArray2DForSmallLargeArray() {
		// setup
		Mockery mockingContext = new Mockery();
		final Values2D values = mockingContext.mock(Values2D.class);
		mockingContext.checking(new Expectations() {
			{
				one(values).getRowCount();	
				will(returnValue(2));
				one(values).getValue(0, 0);
				will(returnValue(7.5));
				one(values).getValue(1, 0);
				will(returnValue(2.5));
			}
		});
		// exercise 
		int row = 5, col = 4000000;
		Random random = new Random(System.currentTimeMillis());
		double[][] data = new double [row][col];
		for (int i = 0; i < row; ++ i) {
			for (int j = 0; j < col; ++ j)
				data[i][j] = random.nextDouble();
		}
		
		Number[][] numbers = DataUtilities.createNumberArray2D(data);
		
		Number[][] expectedNumbers = new Number[row][col];
	
		for (int i = 0; i < row; ++ i) {
			for (int j = 0; j < col; ++ j) {
				expectedNumbers[i][j] = new Number() {
					
					@Override
					public long longValue() {
						// TODO Auto-generated method stub
						return 0;
					}
					
					@Override
					public int intValue() {
						// TODO Auto-generated method stub
						return 0;
					}
					
					@Override
					public float floatValue() {
						// TODO Auto-generated method stub
						return 0;
					}
					
					@Override
					public double doubleValue() {
						// TODO Auto-generated method stub
						return 0;
					}
				};
				expectedNumbers[i][j] = data[i][j];
			}
		}
		// verify
		assertArrayEquals("These two number arrays should be equal", 
				expectedNumbers, numbers);
		// tear-down
		numbers = null;
		data = null;
		expectedNumbers = null;
	}
	
	@Test
	public void createNumberArray2DForLargeSmallArray() {
		// setup
		Mockery mockingContext = new Mockery();
		final Values2D values = mockingContext.mock(Values2D.class);
		mockingContext.checking(new Expectations() {
			{
				one(values).getRowCount();	
				will(returnValue(2));
				one(values).getValue(0, 0);
				will(returnValue(7.5));
				one(values).getValue(1, 0);
				will(returnValue(2.5));
			}
		});
		// exercise 
		int row = 4000000, col = 3;
		Random random = new Random(System.currentTimeMillis());
		double[][] data = new double [row][col];
		for (int i = 0; i < row; ++ i) {
			for (int j = 0; j < col; ++ j)
				data[i][j] = random.nextDouble();
		}
		
		Number[][] numbers = DataUtilities.createNumberArray2D(data);
		
		Number[][] expectedNumbers = new Number[row][col];
	
		for (int i = 0; i < row; ++ i) {
			for (int j = 0; j < col; ++ j) {
				expectedNumbers[i][j] = new Number() {
					
					@Override
					public long longValue() {
						// TODO Auto-generated method stub
						return 0;
					}
					
					@Override
					public int intValue() {
						// TODO Auto-generated method stub
						return 0;
					}
					
					@Override
					public float floatValue() {
						// TODO Auto-generated method stub
						return 0;
					}
					
					@Override
					public double doubleValue() {
						// TODO Auto-generated method stub
						return 0;
					}
				};
				expectedNumbers[i][j] = data[i][j];
			}
		}
		// verify
		assertArrayEquals("These two number arrays should be equal", 
				expectedNumbers, numbers);
		// tear-down
		numbers = null;
		data = null;
		expectedNumbers = null;
	}
	
	@Test
	public void createNumberArray2DForLargeLargeArray() {
		// setup
		Mockery mockingContext = new Mockery();
		final Values2D values = mockingContext.mock(Values2D.class);
		mockingContext.checking(new Expectations() {
			{
				one(values).getRowCount();	
				will(returnValue(2));
				one(values).getValue(0, 0);
				will(returnValue(7.5));
				one(values).getValue(1, 0);
				will(returnValue(2.5));
			}
		});
		// exercise 
		int row = 3000, col = 3000;
		Random random = new Random(System.currentTimeMillis());
		double[][] data = new double [row][col];
		for (int i = 0; i < row; ++ i) {
			for (int j = 0; j < col; ++ j)
				data[i][j] = random.nextDouble();
		}
		
		Number[][] numbers = DataUtilities.createNumberArray2D(data);
		
		Number[][] expectedNumbers = new Number[row][col];
	
		for (int i = 0; i < row; ++ i) {
			for (int j = 0; j < col; ++ j) {
				expectedNumbers[i][j] = new Number() {
					
					@Override
					public long longValue() {
						// TODO Auto-generated method stub
						return 0;
					}
					
					@Override
					public int intValue() {
						// TODO Auto-generated method stub
						return 0;
					}
					
					@Override
					public float floatValue() {
						// TODO Auto-generated method stub
						return 0;
					}
					
					@Override
					public double doubleValue() {
						// TODO Auto-generated method stub
						return 0;
					}
				};
				expectedNumbers[i][j] = data[i][j];
			}
		}
		// verify
		assertArrayEquals("These two number arrays should be equal", 
				expectedNumbers, numbers);
		// tear-down
		numbers = null;
		data = null;
		expectedNumbers = null;
	}
	
	@Test
	public void createNumberArray2DForSmallSmallArray() {
		// setup
		Mockery mockingContext = new Mockery();
		final Values2D values = mockingContext.mock(Values2D.class);
		mockingContext.checking(new Expectations() {
			{
				one(values).getRowCount();	
				will(returnValue(2));
				one(values).getValue(0, 0);
				will(returnValue(7.5));
				one(values).getValue(1, 0);
				will(returnValue(2.5));
			}
		});
		// exercise 
		int row = 1, col = 1;
		Random random = new Random(System.currentTimeMillis());
		double[][] data = new double [row][col];
		for (int i = 0; i < row; ++ i) {
			for (int j = 0; j < col; ++ j)
				data[i][j] = random.nextDouble();
		}
		
		Number[][] numbers = DataUtilities.createNumberArray2D(data);
		
		Number[][] expectedNumbers = new Number[row][col];
	
		for (int i = 0; i < row; ++ i) {
			for (int j = 0; j < col; ++ j) {
				expectedNumbers[i][j] = new Number() {
					
					@Override
					public long longValue() {
						// TODO Auto-generated method stub
						return 0;
					}
					
					@Override
					public int intValue() {
						// TODO Auto-generated method stub
						return 0;
					}
					
					@Override
					public float floatValue() {
						// TODO Auto-generated method stub
						return 0;
					}
					
					@Override
					public double doubleValue() {
						// TODO Auto-generated method stub
						return 0;
					}
				};
				expectedNumbers[i][j] = data[i][j];
			}
		}
		// verify
		assertArrayEquals("These two number arrays should be equal", 
				expectedNumbers, numbers);
		// tear-down
		numbers = null;
		data = null;
		expectedNumbers = null;
	}
	
	@After
	public void tearDown() throws Exception {
		
	}
	
	@AfterClass 
	public static void tearDownAfterClass() throws Exception {
		
	}
}
