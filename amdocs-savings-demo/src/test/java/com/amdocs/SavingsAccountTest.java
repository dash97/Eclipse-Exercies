package com.amdocs;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyDouble;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class SavingsAccountTest {

	private SavingsAccount account;
	private SavingsAccount accountSpy;
	
	@Before
	public void setUp() {

		account = new SavingsAccount();
		
		//Partial mocking or spying
		accountSpy = spy (account);
	}
	
	@After
	public void tearDown() {
		account = null;
		accountSpy = null;
	}
	
	//use @Ignore instead of commenting a test case
	//@Ignore
	@Test
	public void testWithdrawWhenCurrentBalanceIs5000INR() throws InsufficientBalanceException {
		
		//Stubbing, hard coding the response of getBalance method and updateBalanceIntoDB method
		doReturn (5000.00).when( accountSpy ).getBalance();
		doNothing().when( accountSpy ).updateBalanceIntoDB(anyDouble());
		
		//Code under test, i.e. withdraw method
		double updatedBalance = accountSpy.withdraw (1000.00);
		double expectedBalance = 4000.00;
		
		assertEquals (expectedBalance, updatedBalance, 0.001);
		
		//check if getBalance method was invoked 1 time within withdraw method
		verify ( accountSpy, times(1) ).getBalance();
		
		//check if updateBalanceIntoDB method was invoked 1 time within withdraw method
		verify ( accountSpy, times(1) ).updateBalanceIntoDB(anyDouble());
	}
	
	@Test
	public void testWithdrawWhenCurrentBalanceIsInsufficient() {
		
		boolean exceptionThrown = false;
		
		doReturn (5000.00).when( accountSpy ).getBalance();
		doNothing().when( accountSpy ).updateBalanceIntoDB(anyDouble());
		try {
			accountSpy.withdraw (10000.00);
		} catch (InsufficientBalanceException e) {
			exceptionThrown = true;
		}
		boolean expectedResponse = true;
		
		assertEquals(expectedResponse, exceptionThrown);

		//check if getBalance method was invoked 1 time within withdraw method
		verify ( accountSpy, times(1) ).getBalance();
		//check if updateBalanceIntoDB method was invoked never within withdraw method
		verify ( accountSpy, times(0) ).updateBalanceIntoDB(anyDouble());

		
	}
	

	
}
