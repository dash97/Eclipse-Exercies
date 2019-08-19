package com.amdocs;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class RPNCalculatorTest{
	
	RPNCalculator rpnCalculator;
	private double actualResult, expectedResult;
	
	@BeforeClass
	//static because it is to be invoked only once
	public static void initOnce() {
		System.out.println("Before Classs method");
	}
	
	@Before
	public void init() {
		System.out.println("Before Method");
		rpnCalculator = new RPNCalculator();
		actualResult = expectedResult = 0.0;
	}
	
	@After
	public void cleanUp() {
		System.out.println("After Method");
		rpnCalculator = null;
	}
	
	@AfterClass
	//Before and After class method can be written anywhere before or after, 'before' and 'after' method
	public static void tearDown() {
		System.out.println("After Classs method");
	}
	
	
	@Test
	public void testSimpleAdiition() {
		System.out.println("Test Addition");
		
		actualResult = rpnCalculator.evaluate("10 15 +");
		expectedResult = 25.0;
		
		assertEquals(expectedResult, actualResult, 0.001);
		
		actualResult = rpnCalculator.evaluate("10 115 +");
		expectedResult = 125.0;
		
		assertEquals(expectedResult, actualResult, 0.001);
		
	}
	
	@Category(SmokeTest.class)

	@Test
	public void testSimpleSubtracion() {
		System.out.println("Test Subtraction");
				
		actualResult = rpnCalculator.evaluate("100 15 -");
		expectedResult = 85.0;
		
		assertEquals(expectedResult, actualResult, 0.001);
		
		actualResult = rpnCalculator.evaluate("10 5 -");
		expectedResult = 5.0;
		
		assertEquals(expectedResult, actualResult, 0.001);
		
	}
	
	@Test
	public void testSimpleMultiplication() {
		System.out.println("Test Multiplication");

				
		actualResult = rpnCalculator.evaluate("10 5 *");
		expectedResult = 50.0;
		
		assertEquals(expectedResult, actualResult, 0.001);
		
		actualResult = rpnCalculator.evaluate("10 15 *");
		expectedResult = 150.0;
		
		assertEquals(expectedResult, actualResult, 0.001);
		
	}
	
	@Test
	public void testSimpleDivision() {
		System.out.println("Test Division");
				
		actualResult = rpnCalculator.evaluate("10 5 /");
		expectedResult = 2.0;
		assertEquals(expectedResult, actualResult, 0.001);
		
		actualResult = rpnCalculator.evaluate("100 10 /");
		expectedResult = 10.0;
		
		assertEquals(expectedResult, actualResult, 0.001);
		
	}
	
	@Test
	
	public void testExpressionEvaluation() {
		System.out.println("Test Expression Evaluation");

		
		actualResult = rpnCalculator.evaluate("10 10 + 100 20 / *");
		expectedResult = 100.0;
		
		assertEquals(expectedResult, actualResult, 0.001);
			
	}

}
