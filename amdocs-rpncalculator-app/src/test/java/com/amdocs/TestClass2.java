package com.amdocs;

import org.junit.Test;
import org.junit.experimental.categories.Category;

public class TestClass2 {
	
	
	//fixture methods like before and after can be implemented here also
	@Category(SmokeTest.class)

	@Test
	public void testCase1() {
		System.out.println("Test Class 2 - Test Case 1");
	}
	
	@Test
	public void testCase2() {
		System.out.println("Test Class 2 - Test Case 2");
	}

}
