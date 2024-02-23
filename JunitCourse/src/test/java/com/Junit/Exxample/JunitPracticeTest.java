package com.Junit.Exxample;

import static org.junit.Assert.*;

import org.junit.Test;

public class JunitPracticeTest {
	JunitPractice obj=new JunitPractice();

	@Test
	public void testTruncateFirst2Positions() {
		//String actual = obj.truncateFirst2Positions("AACD");    //using variable
		//String expected= "CD";
		assertEquals("CD",obj.truncateFirst2Positions("AACD"));  //directly put inside the parameter
	}
	@Test
	public void testTruncateFirst2Positions2() {
		assertEquals("CD",obj.truncateFirst2Positions("ACD")); 
	}
	
	@Test
	public void testAddition() {
		//int additionResult = obj.Addition(10, 20);
		assertEquals(30,obj.Addition(10, 20));
	}
	
	@Test
	public void testcheckFirstLastTwoChar() {
		boolean actual=obj.checkFirstLastTwoChar("ABAB");
		boolean expected=true;
		boolean falseExpected=false;       //For check it is work if we put falseexpected
		
		assertEquals(expected,actual);
		assertEquals(falseExpected,obj.checkFirstLastTwoChar("ABCD"));   //inline code 
		assertEquals(expected,obj.checkFirstLastTwoChar("AB"));
		assertEquals(falseExpected,obj.checkFirstLastTwoChar("A"));
		
	}
	
	@Test
	public void testAssertFalseMethod() {
		//assertFalse("The condition is failed",false);   //if we give true in actual then the test will fail
		assertFalse(obj.checkFirstLastTwoChar("ABCD"));  

	}
	
	@Test
	public void testAssertTrueMethod() {
		assertTrue(obj.checkFirstLastTwoChar("ABAB"));  
	}
	
	@Test
	public void testAssertTrueMethod1() {
		assertTrue(obj.checkFirstLastTwoChar("AB"));  
	}
	@Test
	public void testAssertFalseMethod1() {
		assertFalse(obj.checkFirstLastTwoChar("A"));  
	}
	

}
