package com.Junit.Exxample;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class QuickBeforeAfterTest {

	@BeforeClass
	public static void beforeClass() {   //Any method use the before class annotation should e a staticmethod.
		System.out.println("Before class");
	}
	@Before
	public void setup() {
		System.out.println("Before Test");
	}
	@Test
	public void test1() {
		System.out.println("Test1 executed");
	}
	
	@Test
	public void test2() {
		System.out.println("Test2 executed");
	}
	
	@After
	public void finalMethod() {
		System.out.println("After Test");
	}
	
	@AfterClass
	public static void afterClass() {   //Any method use the before and after class annotation should e a staticmethod.
		System.out.println("After  class");
	}

}
