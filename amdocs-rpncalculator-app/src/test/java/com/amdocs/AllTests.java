package com.amdocs;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Categories.class)
//for suite, the line before is @RunWith(Suite.class)
@SuiteClasses({ RPNCalculatorTest.class, TestClass2.class })
@IncludeCategory(SmokeTest.class)//for case of categories use this
public class AllTests {

}
 